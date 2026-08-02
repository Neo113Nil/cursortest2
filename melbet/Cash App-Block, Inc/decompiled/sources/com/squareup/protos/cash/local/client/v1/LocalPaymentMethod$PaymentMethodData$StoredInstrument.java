package com.squareup.protos.cash.local.client.v1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalPaymentMethod$PaymentMethodData$StoredInstrument {
    public final LocalStoredInstrument value;

    public LocalPaymentMethod$PaymentMethodData$StoredInstrument(LocalStoredInstrument localStoredInstrument) {
        localStoredInstrument.getClass();
        this.value = localStoredInstrument;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalPaymentMethod$PaymentMethodData$StoredInstrument) && Intrinsics.areEqual(this.value, ((LocalPaymentMethod$PaymentMethodData$StoredInstrument) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "StoredInstrument(value=" + this.value + ")";
    }
}
