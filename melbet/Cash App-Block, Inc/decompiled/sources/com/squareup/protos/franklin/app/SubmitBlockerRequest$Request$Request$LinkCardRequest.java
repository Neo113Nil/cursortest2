package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$LinkCardRequest extends zzdh {
    public final LinkCardRequest value;

    public SubmitBlockerRequest$Request$Request$LinkCardRequest(LinkCardRequest linkCardRequest) {
        linkCardRequest.getClass();
        this.value = linkCardRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$LinkCardRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$LinkCardRequest) obj).value);
    }

    public final LinkCardRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LinkCardRequest(value=" + this.value + ")";
    }
}
