package com.squareup.protos.cash.fiatly.api.v2;

import coil3.intercept.EngineInterceptorKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetPaymentUpdatesBySessionResponse$Type$Update extends EngineInterceptorKt {
    public final PaymentUpdate value;

    public GetPaymentUpdatesBySessionResponse$Type$Update(PaymentUpdate paymentUpdate) {
        paymentUpdate.getClass();
        this.value = paymentUpdate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPaymentUpdatesBySessionResponse$Type$Update) && Intrinsics.areEqual(this.value, ((GetPaymentUpdatesBySessionResponse$Type$Update) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Update(value=" + this.value + ")";
    }
}
