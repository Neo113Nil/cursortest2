package com.squareup.protos.cash.cashcustomergateway.api.v1;

import app.cash.local.primitives.ModifierKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LookupCashtagResponse$Identity$LocalBrand extends ModifierKt {
    public final LocalBrand value;

    public LookupCashtagResponse$Identity$LocalBrand(LocalBrand localBrand) {
        localBrand.getClass();
        this.value = localBrand;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LookupCashtagResponse$Identity$LocalBrand) && Intrinsics.areEqual(this.value, ((LookupCashtagResponse$Identity$LocalBrand) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalBrand(value=" + this.value + ")";
    }
}
