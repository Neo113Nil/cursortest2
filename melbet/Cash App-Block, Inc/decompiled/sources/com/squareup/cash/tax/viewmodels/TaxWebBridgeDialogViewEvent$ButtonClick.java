package com.squareup.cash.tax.viewmodels;

import com.squareup.cash.tax.primitives.TaxDialogDataModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TaxWebBridgeDialogViewEvent$ButtonClick {
    public final TaxDialogDataModel.Button button;

    public TaxWebBridgeDialogViewEvent$ButtonClick(TaxDialogDataModel.Button button) {
        button.getClass();
        this.button = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TaxWebBridgeDialogViewEvent$ButtonClick) && Intrinsics.areEqual(this.button, ((TaxWebBridgeDialogViewEvent$ButtonClick) obj).button);
    }

    public final int hashCode() {
        return this.button.hashCode();
    }

    public final String toString() {
        return "ButtonClick(button=" + this.button + ")";
    }
}
