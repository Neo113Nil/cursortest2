package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzib;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetDiscountDetailResponse$Response$ErrorResponse extends zzib {
    public final LocalErrorResponse value;

    public GetDiscountDetailResponse$Response$ErrorResponse(LocalErrorResponse localErrorResponse) {
        localErrorResponse.getClass();
        this.value = localErrorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetDiscountDetailResponse$Response$ErrorResponse) && Intrinsics.areEqual(this.value, ((GetDiscountDetailResponse$Response$ErrorResponse) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SizeMode$EnumUnboxingLocalUtility.m("ErrorResponse(value=", this.value, ")");
    }
}
