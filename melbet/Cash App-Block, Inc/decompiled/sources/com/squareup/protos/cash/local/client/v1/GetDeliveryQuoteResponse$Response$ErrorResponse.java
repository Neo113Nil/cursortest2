package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzia;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetDeliveryQuoteResponse$Response$ErrorResponse extends zzia {
    public final LocalErrorResponse value;

    public GetDeliveryQuoteResponse$Response$ErrorResponse(LocalErrorResponse localErrorResponse) {
        localErrorResponse.getClass();
        this.value = localErrorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetDeliveryQuoteResponse$Response$ErrorResponse) && Intrinsics.areEqual(this.value, ((GetDeliveryQuoteResponse$Response$ErrorResponse) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SizeMode$EnumUnboxingLocalUtility.m("ErrorResponse(value=", this.value, ")");
    }
}
