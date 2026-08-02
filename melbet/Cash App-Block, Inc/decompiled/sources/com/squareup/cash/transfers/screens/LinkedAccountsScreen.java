package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.wallet.screens.WalletHomeScreen;

/* loaded from: classes.dex */
public final class LinkedAccountsScreen implements TransfersScreens {
    public static final LinkedAccountsScreen INSTANCE = new LinkedAccountsScreen();
    public static final Parcelable.Creator<LinkedAccountsScreen> CREATOR = new WalletHomeScreen.Creator(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LinkedAccountsScreen);
    }

    public final int hashCode() {
        return 1210173386;
    }

    public final String toString() {
        return "LinkedAccountsScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
