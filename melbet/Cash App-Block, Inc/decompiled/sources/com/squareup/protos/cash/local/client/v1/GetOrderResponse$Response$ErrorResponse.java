package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetOrderResponse$Response$ErrorResponse extends SdkCoreExtKt {
    public final LocalErrorResponse value;

    public GetOrderResponse$Response$ErrorResponse(LocalErrorResponse localErrorResponse) {
        localErrorResponse.getClass();
        this.value = localErrorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetOrderResponse$Response$ErrorResponse) && Intrinsics.areEqual(this.value, ((GetOrderResponse$Response$ErrorResponse) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SizeMode$EnumUnboxingLocalUtility.m("ErrorResponse(value=", this.value, ")");
    }
}
