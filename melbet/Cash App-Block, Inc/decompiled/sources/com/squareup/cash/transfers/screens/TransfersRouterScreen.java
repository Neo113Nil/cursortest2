package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TransfersRouterScreen implements TransfersScreens, NeverInBackStackScreen {
    public static final Parcelable.Creator<TransfersRouterScreen> CREATOR = new WalletHomeScreen.Creator(17);
    public final TransfersScreens exitScreen;

    public TransfersRouterScreen(TransfersScreens transfersScreens) {
        transfersScreens.getClass();
        this.exitScreen = transfersScreens;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransfersRouterScreen) && Intrinsics.areEqual(this.exitScreen, ((TransfersRouterScreen) obj).exitScreen);
    }

    public final int hashCode() {
        return this.exitScreen.hashCode();
    }

    public final String toString() {
        return "TransfersRouterScreen(exitScreen=" + this.exitScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.exitScreen, i);
    }
}
