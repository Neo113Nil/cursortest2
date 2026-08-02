package com.squareup.cash.taptopay.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.tax.primitives.Id;

/* loaded from: classes.dex */
public final class TapToPayOnboardingCompleteScreen implements Screen, NeverInBackStackScreen {
    public static final TapToPayOnboardingCompleteScreen INSTANCE = new TapToPayOnboardingCompleteScreen();
    public static final Parcelable.Creator<TapToPayOnboardingCompleteScreen> CREATOR = new Id.Close.Creator(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof TapToPayOnboardingCompleteScreen);
    }

    public final int hashCode() {
        return 2060742851;
    }

    public final String toString() {
        return "TapToPayOnboardingCompleteScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
