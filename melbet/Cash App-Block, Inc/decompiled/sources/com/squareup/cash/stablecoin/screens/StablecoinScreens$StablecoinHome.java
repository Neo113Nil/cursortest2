package com.squareup.cash.stablecoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;

/* loaded from: classes.dex */
public final class StablecoinScreens$StablecoinHome implements Screen {
    public static final StablecoinScreens$StablecoinHome INSTANCE = new StablecoinScreens$StablecoinHome();
    public static final Parcelable.Creator<StablecoinScreens$StablecoinHome> CREATOR = new ErrorScreen.Creator(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof StablecoinScreens$StablecoinHome);
    }

    public final int hashCode() {
        return -1845117579;
    }

    public final String toString() {
        return "StablecoinHome";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
