package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SubmitBlockerRequest$Request$Request$EndFlowRequest extends zzdh {
    public final EndFlowRequest value;

    public SubmitBlockerRequest$Request$Request$EndFlowRequest(EndFlowRequest endFlowRequest) {
        endFlowRequest.getClass();
        this.value = endFlowRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$EndFlowRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$EndFlowRequest) obj).value);
    }

    public final EndFlowRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EndFlowRequest(value=" + this.value + ")";
    }
}
