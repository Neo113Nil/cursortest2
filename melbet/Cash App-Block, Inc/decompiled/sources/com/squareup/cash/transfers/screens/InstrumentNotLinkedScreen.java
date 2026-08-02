package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.franklin.api.DepositPreference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InstrumentNotLinkedScreen implements TransfersScreens, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<InstrumentNotLinkedScreen> CREATOR = new WalletHomeScreen.Creator(2);
    public final Screen backScreen;
    public final BlockersData blockersData;
    public final DepositPreference depositPreference;
    public final TransferType transferType;

    public InstrumentNotLinkedScreen(BlockersData blockersData, TransferType transferType, DepositPreference depositPreference, Screen screen) {
        blockersData.getClass();
        transferType.getClass();
        screen.getClass();
        this.blockersData = blockersData;
        this.transferType = transferType;
        this.depositPreference = depositPreference;
        this.backScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentNotLinkedScreen)) {
            return false;
        }
        InstrumentNotLinkedScreen instrumentNotLinkedScreen = (InstrumentNotLinkedScreen) obj;
        return Intrinsics.areEqual(this.blockersData, instrumentNotLinkedScreen.blockersData) && this.transferType == instrumentNotLinkedScreen.transferType && this.depositPreference == instrumentNotLinkedScreen.depositPreference && Intrinsics.areEqual(this.backScreen, instrumentNotLinkedScreen.backScreen);
    }

    public final int hashCode() {
        int hashCode = (this.transferType.hashCode() + (this.blockersData.hashCode() * 31)) * 31;
        DepositPreference depositPreference = this.depositPreference;
        return this.backScreen.hashCode() + ((hashCode + (depositPreference == null ? 0 : depositPreference.hashCode())) * 31);
    }

    public final String toString() {
        return "InstrumentNotLinkedScreen(blockersData=" + this.blockersData + ", transferType=" + this.transferType + ", depositPreference=" + this.depositPreference + ", backScreen=" + this.backScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeString(this.transferType.name());
        DepositPreference depositPreference = this.depositPreference;
        if (depositPreference == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(depositPreference.name());
        }
        parcel.writeParcelable(this.backScreen, i);
    }
}
