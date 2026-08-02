package com.squareup.cash.tax.viewmodels;

import com.squareup.cash.tax.primitives.TaxMenuItem;

/* loaded from: classes7.dex */
public final class TaxMenuSheetViewEvent$MenuClick {
    public final TaxMenuItem taxMenuItem;

    public TaxMenuSheetViewEvent$MenuClick(TaxMenuItem taxMenuItem) {
        this.taxMenuItem = taxMenuItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TaxMenuSheetViewEvent$MenuClick) && this.taxMenuItem.equals(((TaxMenuSheetViewEvent$MenuClick) obj).taxMenuItem);
    }

    public final int hashCode() {
        return this.taxMenuItem.hashCode();
    }

    public final String toString() {
        return "MenuClick(taxMenuItem=" + this.taxMenuItem + ")";
    }
}
