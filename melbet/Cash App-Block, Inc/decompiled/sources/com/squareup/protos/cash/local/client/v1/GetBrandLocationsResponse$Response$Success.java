package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhw;
import com.squareup.protos.cash.local.client.v1.GetBrandLocationsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetBrandLocationsResponse$Response$Success extends zzhw {
    public final GetBrandLocationsResponse.Success value;

    public GetBrandLocationsResponse$Response$Success(GetBrandLocationsResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBrandLocationsResponse$Response$Success) && Intrinsics.areEqual(this.value, ((GetBrandLocationsResponse$Response$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}
