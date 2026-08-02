package com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues;

import app.cash.local.primitives.ComputedOrderSummaryKt;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BalanceBasedAddCashPreference$Preference$Enabled extends ComputedOrderSummaryKt {
    public final BalanceBasedAddCashPreference.Enabled value;

    public BalanceBasedAddCashPreference$Preference$Enabled(BalanceBasedAddCashPreference.Enabled enabled) {
        enabled.getClass();
        this.value = enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BalanceBasedAddCashPreference$Preference$Enabled) && Intrinsics.areEqual(this.value, ((BalanceBasedAddCashPreference$Preference$Enabled) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Enabled(value=" + this.value + ")";
    }
}
