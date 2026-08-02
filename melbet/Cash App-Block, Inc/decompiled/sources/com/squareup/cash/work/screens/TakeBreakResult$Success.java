package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.work.screens.WorkHomeScreen;

/* loaded from: classes7.dex */
public final class TakeBreakResult$Success implements Parcelable {
    public static final TakeBreakResult$Success INSTANCE = new TakeBreakResult$Success();
    public static final Parcelable.Creator<TakeBreakResult$Success> CREATOR = new WorkHomeScreen.Creator(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof TakeBreakResult$Success);
    }

    public final int hashCode() {
        return -1807799048;
    }

    public final String toString() {
        return "Success";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
