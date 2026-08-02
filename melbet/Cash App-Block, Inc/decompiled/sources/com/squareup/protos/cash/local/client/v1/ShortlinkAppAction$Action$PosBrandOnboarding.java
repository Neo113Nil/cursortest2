package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzje;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShortlinkAppAction$Action$PosBrandOnboarding extends zzje {
    public final POSBrandOnboarding value;

    public ShortlinkAppAction$Action$PosBrandOnboarding(POSBrandOnboarding pOSBrandOnboarding) {
        pOSBrandOnboarding.getClass();
        this.value = pOSBrandOnboarding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortlinkAppAction$Action$PosBrandOnboarding) && Intrinsics.areEqual(this.value, ((ShortlinkAppAction$Action$PosBrandOnboarding) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PosBrandOnboarding(value=" + this.value + ")";
    }
}
