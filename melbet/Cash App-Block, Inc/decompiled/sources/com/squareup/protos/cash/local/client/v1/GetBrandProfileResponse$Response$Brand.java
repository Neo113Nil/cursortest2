package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhx;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetBrandProfileResponse$Response$Brand extends zzhx {
    public final LocalBrand value;

    public GetBrandProfileResponse$Response$Brand(LocalBrand localBrand) {
        localBrand.getClass();
        this.value = localBrand;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBrandProfileResponse$Response$Brand) && Intrinsics.areEqual(this.value, ((GetBrandProfileResponse$Response$Brand) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Brand(value=" + this.value + ")";
    }
}
