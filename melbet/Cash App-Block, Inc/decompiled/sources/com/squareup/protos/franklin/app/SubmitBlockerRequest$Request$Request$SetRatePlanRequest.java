package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SetRatePlanRequest extends zzdh {
    public final SetRatePlanRequest value;

    public SubmitBlockerRequest$Request$Request$SetRatePlanRequest(SetRatePlanRequest setRatePlanRequest) {
        setRatePlanRequest.getClass();
        this.value = setRatePlanRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SetRatePlanRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SetRatePlanRequest) obj).value);
    }

    public final SetRatePlanRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SetRatePlanRequest(value=" + this.value + ")";
    }
}
