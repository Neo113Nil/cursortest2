package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$PaymentMgmt extends LocalMenuHoursViewKt {
    public final PaymentMgmtSection value;

    public AfterpayAppletHomeSection$Section$PaymentMgmt(PaymentMgmtSection paymentMgmtSection) {
        paymentMgmtSection.getClass();
        this.value = paymentMgmtSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$PaymentMgmt) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$PaymentMgmt) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PaymentMgmt(value=" + this.value + ")";
    }
}
