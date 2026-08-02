package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.persistence.SerializerKt;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CreateOrderResponse$Response$UpdatedCartResponse extends SerializerKt {
    public final CreateOrderResponse.UpdatedCartResponse value;

    public CreateOrderResponse$Response$UpdatedCartResponse(CreateOrderResponse.UpdatedCartResponse updatedCartResponse) {
        updatedCartResponse.getClass();
        this.value = updatedCartResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateOrderResponse$Response$UpdatedCartResponse) && Intrinsics.areEqual(this.value, ((CreateOrderResponse$Response$UpdatedCartResponse) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UpdatedCartResponse(value=" + this.value + ")";
    }
}
