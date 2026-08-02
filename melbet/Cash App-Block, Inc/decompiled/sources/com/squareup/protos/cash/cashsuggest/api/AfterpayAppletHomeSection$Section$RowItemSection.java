package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$RowItemSection extends LocalMenuHoursViewKt {
    public final com.squareup.protos.cash.shop.rendering.api.RowSection value;

    public AfterpayAppletHomeSection$Section$RowItemSection(com.squareup.protos.cash.shop.rendering.api.RowSection rowSection) {
        rowSection.getClass();
        this.value = rowSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$RowItemSection) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$RowItemSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RowItemSection(value=" + this.value + ")";
    }
}
