package com.squareup.cash.stripe.integration;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;

/* loaded from: classes7.dex */
public final class StripeLinkActivityResult$Failure$InitializationError implements StripeLinkActivityResult {
    public static final StripeLinkActivityResult$Failure$InitializationError INSTANCE = new StripeLinkActivityResult$Failure$InitializationError();
    public static final Parcelable.Creator<StripeLinkActivityResult$Failure$InitializationError> CREATOR = new ErrorScreen.Creator(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof StripeLinkActivityResult$Failure$InitializationError);
    }

    public final int hashCode() {
        return 1157901266;
    }

    public final String toString() {
        return "InitializationError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
