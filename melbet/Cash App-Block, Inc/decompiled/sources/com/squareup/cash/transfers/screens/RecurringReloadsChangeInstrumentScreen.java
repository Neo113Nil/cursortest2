package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;

/* loaded from: classes.dex */
public final class RecurringReloadsChangeInstrumentScreen implements TransfersScreens, Screen, OnlyOneOverlayTreatment {
    public static final RecurringReloadsChangeInstrumentScreen INSTANCE = new RecurringReloadsChangeInstrumentScreen();
    public static final Parcelable.Creator<RecurringReloadsChangeInstrumentScreen> CREATOR = new WalletHomeScreen.Creator(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RecurringReloadsChangeInstrumentScreen);
    }

    public final int hashCode() {
        return 107546463;
    }

    public final String toString() {
        return "RecurringReloadsChangeInstrumentScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
