package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuSelectorKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$SectionHeader$CreditLineHeader extends LocalMenuSelectorKt {
    public final CreditLineSectionHeader value;

    public AfterpayAppletHomeSection$SectionHeader$CreditLineHeader(CreditLineSectionHeader creditLineSectionHeader) {
        creditLineSectionHeader.getClass();
        this.value = creditLineSectionHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$SectionHeader$CreditLineHeader) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$SectionHeader$CreditLineHeader) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CreditLineHeader(value=" + this.value + ")";
    }
}
