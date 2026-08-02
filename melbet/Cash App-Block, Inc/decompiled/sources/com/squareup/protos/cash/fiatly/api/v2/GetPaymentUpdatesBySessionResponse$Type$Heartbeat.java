package com.squareup.protos.cash.fiatly.api.v2;

import coil3.intercept.EngineInterceptorKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetPaymentUpdatesBySessionResponse$Type$Heartbeat extends EngineInterceptorKt {
    public final PaymentUpdateHeartbeat value;

    public GetPaymentUpdatesBySessionResponse$Type$Heartbeat(PaymentUpdateHeartbeat paymentUpdateHeartbeat) {
        paymentUpdateHeartbeat.getClass();
        this.value = paymentUpdateHeartbeat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPaymentUpdatesBySessionResponse$Type$Heartbeat) && Intrinsics.areEqual(this.value, ((GetPaymentUpdatesBySessionResponse$Type$Heartbeat) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Heartbeat(value=" + this.value + ")";
    }
}
