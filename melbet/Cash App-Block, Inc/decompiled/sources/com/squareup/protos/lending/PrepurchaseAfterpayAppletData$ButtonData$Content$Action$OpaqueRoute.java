package com.squareup.protos.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzjd;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$ButtonData$Content$Action$OpaqueRoute extends zzjd {
    public final OpaqueRoute value;

    public PrepurchaseAfterpayAppletData$ButtonData$Content$Action$OpaqueRoute(OpaqueRoute opaqueRoute) {
        opaqueRoute.getClass();
        this.value = opaqueRoute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseAfterpayAppletData$ButtonData$Content$Action$OpaqueRoute) && Intrinsics.areEqual(this.value, ((PrepurchaseAfterpayAppletData$ButtonData$Content$Action$OpaqueRoute) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OpaqueRoute(value=" + this.value + ")";
    }
}
