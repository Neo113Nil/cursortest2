package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.work.screens.WorkHomeScreen;

/* loaded from: classes7.dex */
public final class ShiftNoteResult$Deleted implements Parcelable {
    public static final ShiftNoteResult$Deleted INSTANCE = new ShiftNoteResult$Deleted();
    public static final Parcelable.Creator<ShiftNoteResult$Deleted> CREATOR = new WorkHomeScreen.Creator(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ShiftNoteResult$Deleted);
    }

    public final int hashCode() {
        return -504399126;
    }

    public final String toString() {
        return "Deleted";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
