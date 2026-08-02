package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjf;
import com.squareup.protos.lending.OpaqueRoute;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$DirectRouteAction extends zzjf {
    public final OpaqueRoute value;

    public AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$DirectRouteAction(OpaqueRoute opaqueRoute) {
        opaqueRoute.getClass();
        this.value = opaqueRoute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$DirectRouteAction) && Intrinsics.areEqual(this.value, ((AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Action$Action$DirectRouteAction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DirectRouteAction(value=" + this.value + ")";
    }
}
