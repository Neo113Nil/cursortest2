package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.persistence.SerializerKt;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CreateOrderResponse$Response$Success extends SerializerKt {
    public final CreateOrderResponse.Success value;

    public CreateOrderResponse$Response$Success(CreateOrderResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateOrderResponse$Response$Success) && Intrinsics.areEqual(this.value, ((CreateOrderResponse$Response$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}
