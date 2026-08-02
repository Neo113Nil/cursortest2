package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.work.screens.WorkHomeScreen;

/* loaded from: classes7.dex */
public final class DeclareCashTipResult$Success implements Parcelable {
    public static final DeclareCashTipResult$Success INSTANCE = new DeclareCashTipResult$Success();
    public static final Parcelable.Creator<DeclareCashTipResult$Success> CREATOR = new WorkHomeScreen.Creator(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof DeclareCashTipResult$Success);
    }

    public final int hashCode() {
        return -69849086;
    }

    public final String toString() {
        return "Success";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
