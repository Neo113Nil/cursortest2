package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$TotalBalance extends LocalMenuHoursViewKt {
    public final TotalBalanceSection value;

    public AfterpayAppletHomeSection$Section$TotalBalance(TotalBalanceSection totalBalanceSection) {
        totalBalanceSection.getClass();
        this.value = totalBalanceSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$TotalBalance) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$TotalBalance) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TotalBalance(value=" + this.value + ")";
    }
}
