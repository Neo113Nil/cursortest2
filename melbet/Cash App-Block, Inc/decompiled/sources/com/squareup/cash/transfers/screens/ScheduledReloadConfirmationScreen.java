package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ScheduledReloadConfirmationScreen implements BlockersScreens {
    public static final Parcelable.Creator<ScheduledReloadConfirmationScreen> CREATOR = new WalletHomeScreen.Creator(15);
    public final BlockersData blockersData;

    public ScheduledReloadConfirmationScreen(BlockersData blockersData) {
        blockersData.getClass();
        this.blockersData = blockersData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScheduledReloadConfirmationScreen) && Intrinsics.areEqual(this.blockersData, ((ScheduledReloadConfirmationScreen) obj).blockersData);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.blockersData.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "ScheduledReloadConfirmationScreen(blockersData=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
    }
}
