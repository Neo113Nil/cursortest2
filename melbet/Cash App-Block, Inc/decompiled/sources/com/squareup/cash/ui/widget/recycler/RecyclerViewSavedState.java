package com.squareup.cash.ui.widget.recycler;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecyclerViewSavedState implements Parcelable {
    public static final Parcelable.Creator<RecyclerViewSavedState> CREATOR = new WalletHomeScreen.Creator(26);
    public final Parcelable adapterState;
    public final Parcelable superState;

    public RecyclerViewSavedState(Parcelable parcelable, Parcelable parcelable2) {
        this.superState = parcelable;
        this.adapterState = parcelable2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecyclerViewSavedState)) {
            return false;
        }
        RecyclerViewSavedState recyclerViewSavedState = (RecyclerViewSavedState) obj;
        return Intrinsics.areEqual(this.superState, recyclerViewSavedState.superState) && Intrinsics.areEqual(this.adapterState, recyclerViewSavedState.adapterState);
    }

    public final int hashCode() {
        Parcelable parcelable = this.superState;
        int hashCode = (parcelable == null ? 0 : parcelable.hashCode()) * 31;
        Parcelable parcelable2 = this.adapterState;
        return hashCode + (parcelable2 != null ? parcelable2.hashCode() : 0);
    }

    public final String toString() {
        return "RecyclerViewSavedState(superState=" + this.superState + ", adapterState=" + this.adapterState + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.superState, i);
        parcel.writeParcelable(this.adapterState, i);
    }
}
