package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.work.screens.WorkHomeScreen;

/* loaded from: classes7.dex */
public final class DeclareCashTipResult$Cancelled implements Parcelable {
    public static final DeclareCashTipResult$Cancelled INSTANCE = new DeclareCashTipResult$Cancelled();
    public static final Parcelable.Creator<DeclareCashTipResult$Cancelled> CREATOR = new WorkHomeScreen.Creator(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof DeclareCashTipResult$Cancelled);
    }

    public final int hashCode() {
        return 1124930960;
    }

    public final String toString() {
        return "Cancelled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
