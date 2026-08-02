package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$CheckEligibilityRow extends LocalMenuHoursViewKt {
    public final com.squareup.protos.cash.shop.rendering.api.RowSection value;

    public AfterpayAppletHomeSection$Section$CheckEligibilityRow(com.squareup.protos.cash.shop.rendering.api.RowSection rowSection) {
        rowSection.getClass();
        this.value = rowSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$CheckEligibilityRow) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$CheckEligibilityRow) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CheckEligibilityRow(value=" + this.value + ")";
    }
}
