package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.squareup.protos.cash.security.VerifyPasswordRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitBlockerRequest$Request$Request$VerifyPasswordRequest extends zzdh {
    public final VerifyPasswordRequest value;

    public SubmitBlockerRequest$Request$Request$VerifyPasswordRequest(VerifyPasswordRequest verifyPasswordRequest) {
        verifyPasswordRequest.getClass();
        this.value = verifyPasswordRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$VerifyPasswordRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$VerifyPasswordRequest) obj).value);
    }

    public final VerifyPasswordRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "VerifyPasswordRequest(value=" + this.value + ")";
    }
}
