package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.protocol.host.NodeReuseKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CreditLineSectionHeader$Subtitle$MoneyBar extends NodeReuseKt {
    public final MoneyBar value;

    public CreditLineSectionHeader$Subtitle$MoneyBar(MoneyBar moneyBar) {
        moneyBar.getClass();
        this.value = moneyBar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreditLineSectionHeader$Subtitle$MoneyBar) && Intrinsics.areEqual(this.value, ((CreditLineSectionHeader$Subtitle$MoneyBar) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MoneyBar(value=" + this.value + ")";
    }
}
