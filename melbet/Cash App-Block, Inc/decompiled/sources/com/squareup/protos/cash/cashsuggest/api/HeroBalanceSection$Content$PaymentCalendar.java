package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.treehouse.TreehouseAppContentKt;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class HeroBalanceSection$Content$PaymentCalendar extends TreehouseAppContentKt {
    public final HeroBalanceSection.PaymentCalendar value;

    public HeroBalanceSection$Content$PaymentCalendar(HeroBalanceSection.PaymentCalendar paymentCalendar) {
        paymentCalendar.getClass();
        this.value = paymentCalendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeroBalanceSection$Content$PaymentCalendar) && Intrinsics.areEqual(this.value, ((HeroBalanceSection$Content$PaymentCalendar) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PaymentCalendar(value=" + this.value + ")";
    }
}
