package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$ResolveMergeRequest extends zzdh {
    public final ResolveMergeRequest value;

    public SubmitBlockerRequest$Request$Request$ResolveMergeRequest(ResolveMergeRequest resolveMergeRequest) {
        resolveMergeRequest.getClass();
        this.value = resolveMergeRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$ResolveMergeRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$ResolveMergeRequest) obj).value);
    }

    public final ResolveMergeRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ResolveMergeRequest(value=" + this.value + ")";
    }
}
