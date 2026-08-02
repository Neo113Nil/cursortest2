package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$CreditRing extends LocalMenuHoursViewKt {
    public final CreditRingSection value;

    public AfterpayAppletHomeSection$Section$CreditRing(CreditRingSection creditRingSection) {
        creditRingSection.getClass();
        this.value = creditRingSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$CreditRing) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$CreditRing) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CreditRing(value=" + this.value + ")";
    }
}
