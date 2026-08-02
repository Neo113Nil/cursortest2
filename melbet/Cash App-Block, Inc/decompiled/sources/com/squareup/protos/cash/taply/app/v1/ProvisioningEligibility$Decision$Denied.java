package com.squareup.protos.cash.taply.app.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzlr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ProvisioningEligibility$Decision$Denied extends zzlr {
    public final Denied value;

    public ProvisioningEligibility$Decision$Denied(Denied denied) {
        denied.getClass();
        this.value = denied;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProvisioningEligibility$Decision$Denied) && Intrinsics.areEqual(this.value, ((ProvisioningEligibility$Decision$Denied) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Denied(value=" + this.value + ")";
    }
}
