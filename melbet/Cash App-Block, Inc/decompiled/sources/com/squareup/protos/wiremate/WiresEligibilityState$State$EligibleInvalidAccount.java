package com.squareup.protos.wiremate;

import com.google.android.gms.internal.mlkit_vision_face.zzkp;
import com.squareup.protos.wiremate.WiresEligibilityState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class WiresEligibilityState$State$EligibleInvalidAccount extends zzkp {
    public final WiresEligibilityState.EligibleInvalidAccount value;

    public WiresEligibilityState$State$EligibleInvalidAccount(WiresEligibilityState.EligibleInvalidAccount eligibleInvalidAccount) {
        eligibleInvalidAccount.getClass();
        this.value = eligibleInvalidAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WiresEligibilityState$State$EligibleInvalidAccount) && Intrinsics.areEqual(this.value, ((WiresEligibilityState$State$EligibleInvalidAccount) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EligibleInvalidAccount(value=" + this.value + ")";
    }
}
