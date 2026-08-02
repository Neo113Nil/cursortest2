package com.squareup.protos.wiremate;

import com.google.android.gms.internal.mlkit_vision_face.zzkp;
import com.squareup.protos.wiremate.WiresEligibilityState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class WiresEligibilityState$State$EligibleValidAccount extends zzkp {
    public final WiresEligibilityState.EligibleValidAccount value;

    public WiresEligibilityState$State$EligibleValidAccount(WiresEligibilityState.EligibleValidAccount eligibleValidAccount) {
        eligibleValidAccount.getClass();
        this.value = eligibleValidAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WiresEligibilityState$State$EligibleValidAccount) && Intrinsics.areEqual(this.value, ((WiresEligibilityState$State$EligibleValidAccount) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EligibleValidAccount(value=" + this.value + ")";
    }
}
