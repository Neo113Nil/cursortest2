package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetShortlinkResponse$Action$PosBrandOnboarding extends ViewUtilsKt {
    public final POSBrandOnboarding value;

    public GetShortlinkResponse$Action$PosBrandOnboarding(POSBrandOnboarding pOSBrandOnboarding) {
        pOSBrandOnboarding.getClass();
        this.value = pOSBrandOnboarding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetShortlinkResponse$Action$PosBrandOnboarding) && Intrinsics.areEqual(this.value, ((GetShortlinkResponse$Action$PosBrandOnboarding) obj).value);
    }

    public final POSBrandOnboarding getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PosBrandOnboarding(value=" + this.value + ")";
    }
}
