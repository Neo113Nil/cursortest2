package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.work.screens.WorkHomeScreen;

/* loaded from: classes.dex */
public final class ShiftListScreen implements Screen {
    public static final ShiftListScreen INSTANCE = new ShiftListScreen();
    public static final Parcelable.Creator<ShiftListScreen> CREATOR = new WorkHomeScreen.Creator(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ShiftListScreen);
    }

    public final int hashCode() {
        return -1899906598;
    }

    public final String toString() {
        return "ShiftListScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
