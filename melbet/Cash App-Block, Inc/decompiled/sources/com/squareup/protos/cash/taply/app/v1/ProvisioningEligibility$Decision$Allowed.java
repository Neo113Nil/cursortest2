package com.squareup.protos.cash.taply.app.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzlr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ProvisioningEligibility$Decision$Allowed extends zzlr {
    public final Allowed value;

    public ProvisioningEligibility$Decision$Allowed(Allowed allowed) {
        allowed.getClass();
        this.value = allowed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProvisioningEligibility$Decision$Allowed) && Intrinsics.areEqual(this.value, ((ProvisioningEligibility$Decision$Allowed) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Allowed(value=" + this.value + ")";
    }
}
