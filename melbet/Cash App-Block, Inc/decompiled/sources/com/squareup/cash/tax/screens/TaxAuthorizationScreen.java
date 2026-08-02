package com.squareup.cash.tax.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.screens.MainScreens;
import com.squareup.cash.tax.primitives.TaxLocation;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TaxAuthorizationScreen extends MainScreens {
    public static final Parcelable.Creator<TaxAuthorizationScreen> CREATOR = new TaxMenuSheet.Creator(1);
    public final Screen exitScreen;
    public final TaxLocation taxLocation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxAuthorizationScreen(TaxLocation taxLocation, Screen screen) {
        super(3);
        taxLocation.getClass();
        screen.getClass();
        this.taxLocation = taxLocation;
        this.exitScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxAuthorizationScreen)) {
            return false;
        }
        TaxAuthorizationScreen taxAuthorizationScreen = (TaxAuthorizationScreen) obj;
        return Intrinsics.areEqual(this.taxLocation, taxAuthorizationScreen.taxLocation) && Intrinsics.areEqual(this.exitScreen, taxAuthorizationScreen.exitScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return this.exitScreen.hashCode() + (this.taxLocation.hashCode() * 31);
    }

    public final String toString() {
        return "TaxAuthorizationScreen(taxLocation=" + this.taxLocation + ", exitScreen=" + this.exitScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.taxLocation, i);
        parcel.writeParcelable(this.exitScreen, i);
    }
}
