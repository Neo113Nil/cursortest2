package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.transfers.screens.RecurringReloadOptionScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RecurringReloadsDismissDialogScreen implements TransfersScreens, DialogScreen {
    public static final Parcelable.Creator<RecurringReloadsDismissDialogScreen> CREATOR = new WalletHomeScreen.Creator(14);
    public final BlockersData blockersData;
    public final Screen exitScreen;
    public final RecurringReloadOptionScreen.ReloadType reloadType;

    public RecurringReloadsDismissDialogScreen(Screen screen, BlockersData blockersData, RecurringReloadOptionScreen.ReloadType reloadType) {
        screen.getClass();
        this.exitScreen = screen;
        this.blockersData = blockersData;
        this.reloadType = reloadType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringReloadsDismissDialogScreen)) {
            return false;
        }
        RecurringReloadsDismissDialogScreen recurringReloadsDismissDialogScreen = (RecurringReloadsDismissDialogScreen) obj;
        return Intrinsics.areEqual(this.exitScreen, recurringReloadsDismissDialogScreen.exitScreen) && Intrinsics.areEqual(this.blockersData, recurringReloadsDismissDialogScreen.blockersData) && this.reloadType == recurringReloadsDismissDialogScreen.reloadType;
    }

    public final int hashCode() {
        int hashCode = this.exitScreen.hashCode() * 31;
        BlockersData blockersData = this.blockersData;
        int hashCode2 = (hashCode + (blockersData == null ? 0 : blockersData.hashCode())) * 31;
        RecurringReloadOptionScreen.ReloadType reloadType = this.reloadType;
        return hashCode2 + (reloadType != null ? reloadType.hashCode() : 0);
    }

    public final String toString() {
        return "RecurringReloadsDismissDialogScreen(exitScreen=" + this.exitScreen + ", blockersData=" + this.blockersData + ", reloadType=" + this.reloadType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.exitScreen, i);
        parcel.writeParcelable(this.blockersData, i);
        RecurringReloadOptionScreen.ReloadType reloadType = this.reloadType;
        if (reloadType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reloadType.name());
        }
    }
}
