package com.squareup.protos.cash.balancebasedaddcash.api.v1_0;

import app.cash.local.primitives.CartEntryWithQuantityKt;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SetBalanceBasedAddCashPreferenceRequest$Preference$Enabled extends CartEntryWithQuantityKt {
    public final SetBalanceBasedAddCashPreferenceRequest.Enabled value;

    public SetBalanceBasedAddCashPreferenceRequest$Preference$Enabled(SetBalanceBasedAddCashPreferenceRequest.Enabled enabled) {
        enabled.getClass();
        this.value = enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetBalanceBasedAddCashPreferenceRequest$Preference$Enabled) && Intrinsics.areEqual(this.value, ((SetBalanceBasedAddCashPreferenceRequest$Preference$Enabled) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Enabled(value=" + this.value + ")";
    }
}
