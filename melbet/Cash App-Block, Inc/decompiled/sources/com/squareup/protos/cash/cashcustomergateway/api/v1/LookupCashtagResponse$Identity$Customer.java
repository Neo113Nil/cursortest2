package com.squareup.protos.cash.cashcustomergateway.api.v1;

import app.cash.local.primitives.ModifierKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LookupCashtagResponse$Identity$Customer extends ModifierKt {
    public final Customer value;

    public LookupCashtagResponse$Identity$Customer(Customer customer) {
        customer.getClass();
        this.value = customer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LookupCashtagResponse$Identity$Customer) && Intrinsics.areEqual(this.value, ((LookupCashtagResponse$Identity$Customer) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Customer(value=" + this.value + ")";
    }
}
