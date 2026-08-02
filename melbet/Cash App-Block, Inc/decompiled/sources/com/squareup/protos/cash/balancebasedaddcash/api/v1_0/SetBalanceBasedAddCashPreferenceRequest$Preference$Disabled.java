package com.squareup.protos.cash.balancebasedaddcash.api.v1_0;

import app.cash.local.primitives.CartEntryWithQuantityKt;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SetBalanceBasedAddCashPreferenceRequest$Preference$Disabled extends CartEntryWithQuantityKt {
    public final SetBalanceBasedAddCashPreferenceRequest.Disabled value;

    public SetBalanceBasedAddCashPreferenceRequest$Preference$Disabled(SetBalanceBasedAddCashPreferenceRequest.Disabled disabled) {
        disabled.getClass();
        this.value = disabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetBalanceBasedAddCashPreferenceRequest$Preference$Disabled) && Intrinsics.areEqual(this.value, ((SetBalanceBasedAddCashPreferenceRequest$Preference$Disabled) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Disabled(value=" + this.value + ")";
    }
}
