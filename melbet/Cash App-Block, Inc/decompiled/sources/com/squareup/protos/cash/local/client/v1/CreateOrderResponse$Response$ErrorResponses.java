package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.persistence.SerializerKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CreateOrderResponse$Response$ErrorResponses extends SerializerKt {
    public final LocalErrorResponse value;

    public CreateOrderResponse$Response$ErrorResponses(LocalErrorResponse localErrorResponse) {
        localErrorResponse.getClass();
        this.value = localErrorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateOrderResponse$Response$ErrorResponses) && Intrinsics.areEqual(this.value, ((CreateOrderResponse$Response$ErrorResponses) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SizeMode$EnumUnboxingLocalUtility.m("ErrorResponses(value=", this.value, ")");
    }
}
