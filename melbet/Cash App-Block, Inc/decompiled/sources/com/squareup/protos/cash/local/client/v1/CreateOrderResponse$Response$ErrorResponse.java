package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.persistence.SerializerKt;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CreateOrderResponse$Response$ErrorResponse extends SerializerKt {
    public final CreateOrderResponse.ErrorResponse value;

    public CreateOrderResponse$Response$ErrorResponse(CreateOrderResponse.ErrorResponse errorResponse) {
        errorResponse.getClass();
        this.value = errorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateOrderResponse$Response$ErrorResponse) && Intrinsics.areEqual(this.value, ((CreateOrderResponse$Response$ErrorResponse) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ErrorResponse(value=" + this.value + ")";
    }
}
