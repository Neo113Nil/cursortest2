package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SetDefaultInstrumentScreen implements TransfersScreens, NeverInBackStackScreen {
    public static final Parcelable.Creator<SetDefaultInstrumentScreen> CREATOR = new WalletHomeScreen.Creator(16);
    public final BlockersData blockersData;
    public final String instrumentToken;

    public SetDefaultInstrumentScreen(BlockersData blockersData, String str) {
        blockersData.getClass();
        str.getClass();
        this.blockersData = blockersData;
        this.instrumentToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetDefaultInstrumentScreen)) {
            return false;
        }
        SetDefaultInstrumentScreen setDefaultInstrumentScreen = (SetDefaultInstrumentScreen) obj;
        return Intrinsics.areEqual(this.blockersData, setDefaultInstrumentScreen.blockersData) && Intrinsics.areEqual(this.instrumentToken, setDefaultInstrumentScreen.instrumentToken);
    }

    public final int hashCode() {
        return this.instrumentToken.hashCode() + (this.blockersData.hashCode() * 31);
    }

    public final String toString() {
        return "SetDefaultInstrumentScreen(blockersData=" + this.blockersData + ", instrumentToken=" + this.instrumentToken + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeString(this.instrumentToken);
    }
}
