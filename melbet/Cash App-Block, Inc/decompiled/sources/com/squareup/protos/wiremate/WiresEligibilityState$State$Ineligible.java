package com.squareup.protos.wiremate;

import com.google.android.gms.internal.mlkit_vision_face.zzkp;
import com.squareup.protos.wiremate.WiresEligibilityState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class WiresEligibilityState$State$Ineligible extends zzkp {
    public final WiresEligibilityState.Ineligible value;

    public WiresEligibilityState$State$Ineligible(WiresEligibilityState.Ineligible ineligible) {
        ineligible.getClass();
        this.value = ineligible;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WiresEligibilityState$State$Ineligible) && Intrinsics.areEqual(this.value, ((WiresEligibilityState$State$Ineligible) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Ineligible(value=" + this.value + ")";
    }
}
