package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SubmitBlockerRequest$Request$Request$SubmitFidesmoProvisioningBlockerRequest extends zzdh {
    public final SubmitFidesmoProvisioningBlockerRequest value;

    public SubmitBlockerRequest$Request$Request$SubmitFidesmoProvisioningBlockerRequest(SubmitFidesmoProvisioningBlockerRequest submitFidesmoProvisioningBlockerRequest) {
        submitFidesmoProvisioningBlockerRequest.getClass();
        this.value = submitFidesmoProvisioningBlockerRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SubmitFidesmoProvisioningBlockerRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SubmitFidesmoProvisioningBlockerRequest) obj).value);
    }

    public final SubmitFidesmoProvisioningBlockerRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SubmitFidesmoProvisioningBlockerRequest(value=" + this.value + ")";
    }
}
