package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$VerifyEmailRequest extends zzdh {
    public final VerifyEmailRequest value;

    public SubmitBlockerRequest$Request$Request$VerifyEmailRequest(VerifyEmailRequest verifyEmailRequest) {
        verifyEmailRequest.getClass();
        this.value = verifyEmailRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$VerifyEmailRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$VerifyEmailRequest) obj).value);
    }

    public final VerifyEmailRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "VerifyEmailRequest(value=" + this.value + ")";
    }
}
