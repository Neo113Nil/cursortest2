package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SubmitProveMobileAuthBlockerRequest extends zzdh {
    public final SubmitProveMobileAuthBlockerRequest value;

    public SubmitBlockerRequest$Request$Request$SubmitProveMobileAuthBlockerRequest(SubmitProveMobileAuthBlockerRequest submitProveMobileAuthBlockerRequest) {
        submitProveMobileAuthBlockerRequest.getClass();
        this.value = submitProveMobileAuthBlockerRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SubmitProveMobileAuthBlockerRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SubmitProveMobileAuthBlockerRequest) obj).value);
    }

    public final SubmitProveMobileAuthBlockerRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SubmitProveMobileAuthBlockerRequest(value=" + this.value + ")";
    }
}
