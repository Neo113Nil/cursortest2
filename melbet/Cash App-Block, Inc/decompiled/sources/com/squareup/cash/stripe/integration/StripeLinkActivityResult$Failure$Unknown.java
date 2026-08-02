package com.squareup.cash.stripe.integration;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;

/* loaded from: classes7.dex */
public final class StripeLinkActivityResult$Failure$Unknown implements StripeLinkActivityResult {
    public static final StripeLinkActivityResult$Failure$Unknown INSTANCE = new StripeLinkActivityResult$Failure$Unknown();
    public static final Parcelable.Creator<StripeLinkActivityResult$Failure$Unknown> CREATOR = new ErrorScreen.Creator(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof StripeLinkActivityResult$Failure$Unknown);
    }

    public final int hashCode() {
        return -850327084;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
