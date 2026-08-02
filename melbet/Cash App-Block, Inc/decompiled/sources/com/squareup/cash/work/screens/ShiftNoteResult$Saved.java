package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.work.screens.WorkHomeScreen;

/* loaded from: classes7.dex */
public final class ShiftNoteResult$Saved implements Parcelable {
    public static final ShiftNoteResult$Saved INSTANCE = new ShiftNoteResult$Saved();
    public static final Parcelable.Creator<ShiftNoteResult$Saved> CREATOR = new WorkHomeScreen.Creator(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ShiftNoteResult$Saved);
    }

    public final int hashCode() {
        return -1345439336;
    }

    public final String toString() {
        return "Saved";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
