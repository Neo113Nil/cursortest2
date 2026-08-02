package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzib;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetDiscountDetailResponse$Response$Detail extends zzib {
    public final LocalMenuDiscountDetail value;

    public GetDiscountDetailResponse$Response$Detail(LocalMenuDiscountDetail localMenuDiscountDetail) {
        localMenuDiscountDetail.getClass();
        this.value = localMenuDiscountDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetDiscountDetailResponse$Response$Detail) && Intrinsics.areEqual(this.value, ((GetDiscountDetailResponse$Response$Detail) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Detail(value=" + this.value + ")";
    }
}
