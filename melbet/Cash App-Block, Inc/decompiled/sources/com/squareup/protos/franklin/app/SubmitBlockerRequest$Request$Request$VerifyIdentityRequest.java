package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$VerifyIdentityRequest extends zzdh {
    public final VerifyIdentityRequest value;

    public SubmitBlockerRequest$Request$Request$VerifyIdentityRequest(VerifyIdentityRequest verifyIdentityRequest) {
        verifyIdentityRequest.getClass();
        this.value = verifyIdentityRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$VerifyIdentityRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$VerifyIdentityRequest) obj).value);
    }

    public final VerifyIdentityRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "VerifyIdentityRequest(value=" + this.value + ")";
    }
}
