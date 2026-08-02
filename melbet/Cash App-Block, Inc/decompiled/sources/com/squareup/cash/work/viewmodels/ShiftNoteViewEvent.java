package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public interface ShiftNoteViewEvent {

    public final class AddNoteClicked implements ShiftNoteViewEvent {
        public final String note;

        public AddNoteClicked(String str) {
            this.note = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddNoteClicked) && this.note.equals(((AddNoteClicked) obj).note);
        }

        public final int hashCode() {
            return this.note.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AddNoteClicked(note=", this.note, ")");
        }
    }

    public final class BackClicked implements ShiftNoteViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 2141661543;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class DeleteNoteClicked implements ShiftNoteViewEvent {
        public static final DeleteNoteClicked INSTANCE = new DeleteNoteClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DeleteNoteClicked);
        }

        public final int hashCode() {
            return 1730972689;
        }

        public final String toString() {
            return "DeleteNoteClicked";
        }
    }
}
