package com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues;

import app.cash.local.primitives.ComputedOrderSummaryKt;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BalanceBasedAddCashPreference$Preference$Disabled extends ComputedOrderSummaryKt {
    public final BalanceBasedAddCashPreference.Disabled value;

    public BalanceBasedAddCashPreference$Preference$Disabled(BalanceBasedAddCashPreference.Disabled disabled) {
        disabled.getClass();
        this.value = disabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BalanceBasedAddCashPreference$Preference$Disabled) && Intrinsics.areEqual(this.value, ((BalanceBasedAddCashPreference$Preference$Disabled) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Disabled(value=" + this.value + ")";
    }
}
