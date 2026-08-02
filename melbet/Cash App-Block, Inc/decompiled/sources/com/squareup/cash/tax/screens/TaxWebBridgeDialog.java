package com.squareup.cash.tax.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.screens.MainScreens;
import com.squareup.cash.tax.primitives.TaxDialogDataModel;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TaxWebBridgeDialog extends MainScreens implements DialogScreen {
    public static final Parcelable.Creator<TaxWebBridgeDialog> CREATOR = new TaxMenuSheet.Creator(4);
    public final TaxDialogDataModel taxDialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebBridgeDialog(TaxDialogDataModel taxDialogDataModel) {
        super(3);
        taxDialogDataModel.getClass();
        this.taxDialog = taxDialogDataModel;
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
        return (obj instanceof TaxWebBridgeDialog) && Intrinsics.areEqual(this.taxDialog, ((TaxWebBridgeDialog) obj).taxDialog);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return this.taxDialog.hashCode();
    }

    public final String toString() {
        return "TaxWebBridgeDialog(taxDialog=" + this.taxDialog + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.taxDialog, i);
    }
}
