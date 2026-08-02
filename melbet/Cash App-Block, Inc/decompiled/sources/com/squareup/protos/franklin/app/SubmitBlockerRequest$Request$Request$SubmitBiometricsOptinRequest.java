package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SubmitBiometricsOptinRequest extends zzdh {
    public final SubmitBiometricsOptinRequest value;

    public SubmitBlockerRequest$Request$Request$SubmitBiometricsOptinRequest(SubmitBiometricsOptinRequest submitBiometricsOptinRequest) {
        submitBiometricsOptinRequest.getClass();
        this.value = submitBiometricsOptinRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SubmitBiometricsOptinRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SubmitBiometricsOptinRequest) obj).value);
    }

    public final SubmitBiometricsOptinRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SubmitBiometricsOptinRequest(value=" + this.value + ")";
    }
}
