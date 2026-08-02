package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;

/* loaded from: classes.dex */
public final class LinkedAccountsNuxScreen implements TransfersScreens, NeverInBackStackScreen {
    public static final LinkedAccountsNuxScreen INSTANCE = new LinkedAccountsNuxScreen();
    public static final Parcelable.Creator<LinkedAccountsNuxScreen> CREATOR = new WalletHomeScreen.Creator(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LinkedAccountsNuxScreen);
    }

    public final int hashCode() {
        return -1708852417;
    }

    public final String toString() {
        return "LinkedAccountsNuxScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
