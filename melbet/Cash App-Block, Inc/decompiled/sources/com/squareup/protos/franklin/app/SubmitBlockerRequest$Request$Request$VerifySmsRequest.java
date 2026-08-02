package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$VerifySmsRequest extends zzdh {
    public final VerifySmsRequest value;

    public SubmitBlockerRequest$Request$Request$VerifySmsRequest(VerifySmsRequest verifySmsRequest) {
        verifySmsRequest.getClass();
        this.value = verifySmsRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$VerifySmsRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$VerifySmsRequest) obj).value);
    }

    public final VerifySmsRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "VerifySmsRequest(value=" + this.value + ")";
    }
}
