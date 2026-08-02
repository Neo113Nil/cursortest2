package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.persistence.SerializerKt;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CreateOrderResponse$Response$InputsNotFulfilled extends SerializerKt {
    public final CreateOrderResponse.InputsNotFulfilled value;

    public CreateOrderResponse$Response$InputsNotFulfilled(CreateOrderResponse.InputsNotFulfilled inputsNotFulfilled) {
        inputsNotFulfilled.getClass();
        this.value = inputsNotFulfilled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateOrderResponse$Response$InputsNotFulfilled) && Intrinsics.areEqual(this.value, ((CreateOrderResponse$Response$InputsNotFulfilled) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InputsNotFulfilled(value=" + this.value + ")";
    }
}
