package com.squareup.cash.taptopay.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.tax.primitives.Id;

/* loaded from: classes.dex */
public final class TapToPayErrorScreen implements Screen {
    public static final Parcelable.Creator<TapToPayErrorScreen> CREATOR = new Id.Close.Creator(8);
    public final TapToPayErrorReason reason;

    public TapToPayErrorScreen(TapToPayErrorReason tapToPayErrorReason) {
        tapToPayErrorReason.getClass();
        this.reason = tapToPayErrorReason;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapToPayErrorScreen) && this.reason == ((TapToPayErrorScreen) obj).reason;
    }

    public final int hashCode() {
        return this.reason.hashCode();
    }

    public final String toString() {
        return "TapToPayErrorScreen(reason=" + this.reason + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.reason.name());
    }
}
