package com.squareup.cash.work.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ShiftNoteViewModel {
    public final InputSection inputSection;
    public final ShiftNoteSection shiftNoteSection;
    public final String title;
    public final ToastState toastState;

    /* loaded from: classes8.dex */
    public final class InputSection {
        public final String initialNote;
        public final boolean isEditMode;

        public InputSection(String str, boolean z) {
            this.initialNote = str;
            this.isEditMode = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputSection)) {
                return false;
            }
            InputSection inputSection = (InputSection) obj;
            return this.initialNote.equals(inputSection.initialNote) && this.isEditMode == inputSection.isEditMode;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isEditMode) + (this.initialNote.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("InputSection(initialNote=", this.initialNote, ", isEditMode=", ")", this.isEditMode);
        }
    }

    /* loaded from: classes7.dex */
    public final class ShiftNoteSection {
        public final String dateText;
        public final String noteText;

        public ShiftNoteSection(String str, String str2) {
            str.getClass();
            this.noteText = str;
            this.dateText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShiftNoteSection)) {
                return false;
            }
            ShiftNoteSection shiftNoteSection = (ShiftNoteSection) obj;
            return Intrinsics.areEqual(this.noteText, shiftNoteSection.noteText) && this.dateText.equals(shiftNoteSection.dateText);
        }

        public final int hashCode() {
            return this.dateText.hashCode() + (this.noteText.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ShiftNoteSection(noteText=", this.noteText, ", dateText=", this.dateText, ")");
        }
    }

    public ShiftNoteViewModel(String str, ShiftNoteSection shiftNoteSection, InputSection inputSection, ToastState toastState) {
        str.getClass();
        this.title = str;
        this.shiftNoteSection = shiftNoteSection;
        this.inputSection = inputSection;
        this.toastState = toastState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftNoteViewModel)) {
            return false;
        }
        ShiftNoteViewModel shiftNoteViewModel = (ShiftNoteViewModel) obj;
        return Intrinsics.areEqual(this.title, shiftNoteViewModel.title) && Intrinsics.areEqual(this.shiftNoteSection, shiftNoteViewModel.shiftNoteSection) && Intrinsics.areEqual(this.inputSection, shiftNoteViewModel.inputSection) && Intrinsics.areEqual(this.toastState, shiftNoteViewModel.toastState);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ShiftNoteSection shiftNoteSection = this.shiftNoteSection;
        int hashCode2 = (hashCode + (shiftNoteSection == null ? 0 : shiftNoteSection.hashCode())) * 31;
        InputSection inputSection = this.inputSection;
        int hashCode3 = (hashCode2 + (inputSection == null ? 0 : inputSection.hashCode())) * 31;
        ToastState toastState = this.toastState;
        return hashCode3 + (toastState != null ? toastState.hashCode() : 0);
    }

    public final String toString() {
        return "ShiftNoteViewModel(title=" + this.title + ", shiftNoteSection=" + this.shiftNoteSection + ", inputSection=" + this.inputSection + ", toastState=" + this.toastState + ")";
    }
}
