package com.squareup.cash.taptopay.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.tax.primitives.Id;

/* loaded from: classes.dex */
public final class TapToPayInitiatorNotesScreen implements Screen, NeverInBackStackScreen {
    public static final TapToPayInitiatorNotesScreen INSTANCE = new TapToPayInitiatorNotesScreen();
    public static final Parcelable.Creator<TapToPayInitiatorNotesScreen> CREATOR = new Id.Close.Creator(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof TapToPayInitiatorNotesScreen);
    }

    public final int hashCode() {
        return 541289761;
    }

    public final String toString() {
        return "TapToPayInitiatorNotesScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
