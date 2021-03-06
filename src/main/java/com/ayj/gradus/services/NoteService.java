package com.ayj.gradus.services;

import java.util.List;
import java.util.Optional;

import com.ayj.gradus.model.Note;

/**
 * 
 * 
 * 
 * 
 * 
 * 
 */
public interface NoteService {

  List<Note> getNotesByUser(String author);

  Optional<Note> getNoteById(long id);

  /**
   * 
   * 
   * 
   * 
   * @param author
   * @param noteTitle
   * @param note
   * @param isImportant
   */
  void createNote(String author, String noteTitle, String noteDescription, boolean isImportant);

  void deleteNote(long id);

  void saveNote(Note note);

}
