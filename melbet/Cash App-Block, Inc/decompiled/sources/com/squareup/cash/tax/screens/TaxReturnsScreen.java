package com.squareup.cash.tax.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.screens.MainScreens;
import com.squareup.cash.tax.screens.TaxMenuSheet;

/* loaded from: classes.dex */
public final class TaxReturnsScreen extends MainScreens {
    public static final TaxReturnsScreen INSTANCE = new TaxReturnsScreen(3);
    public static final Parcelable.Creator<TaxReturnsScreen> CREATOR = new TaxMenuSheet.Creator(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof TaxReturnsScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return 684835744;
    }

    public final String toString() {
        return "TaxReturnsScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
