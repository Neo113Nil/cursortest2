package com.squareup.cash.tax.viewmodels;

import com.squareup.cash.tax.primitives.TaxDialogDataModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class TaxWebBridgeDialogViewModel {

    public final class LoadTaxWebBridgeDialog extends TaxWebBridgeDialogViewModel {
        public final TaxDialogDataModel taxDialog;

        public LoadTaxWebBridgeDialog(TaxDialogDataModel taxDialogDataModel) {
            taxDialogDataModel.getClass();
            this.taxDialog = taxDialogDataModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadTaxWebBridgeDialog) && Intrinsics.areEqual(this.taxDialog, ((LoadTaxWebBridgeDialog) obj).taxDialog);
        }

        public final int hashCode() {
            return this.taxDialog.hashCode();
        }

        public final String toString() {
            return "LoadTaxWebBridgeDialog(taxDialog=" + this.taxDialog + ")";
        }
    }
}
