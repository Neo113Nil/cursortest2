package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.wallet.screens.WalletHomeScreen;

/* loaded from: classes7.dex */
public final class RecurringReloadConfigurationQuestion implements Question {
    public static final RecurringReloadConfigurationQuestion INSTANCE = new RecurringReloadConfigurationQuestion();
    public static final Parcelable.Creator<RecurringReloadConfigurationQuestion> CREATOR = new WalletHomeScreen.Creator(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RecurringReloadConfigurationQuestion);
    }

    public final int hashCode() {
        return -1300446939;
    }

    public final String toString() {
        return "RecurringReloadConfigurationQuestion";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
