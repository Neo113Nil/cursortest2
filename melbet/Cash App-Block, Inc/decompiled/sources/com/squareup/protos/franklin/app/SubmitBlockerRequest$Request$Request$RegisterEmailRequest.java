package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$RegisterEmailRequest extends zzdh {
    public final RegisterEmailRequest value;

    public SubmitBlockerRequest$Request$Request$RegisterEmailRequest(RegisterEmailRequest registerEmailRequest) {
        registerEmailRequest.getClass();
        this.value = registerEmailRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$RegisterEmailRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$RegisterEmailRequest) obj).value);
    }

    public final RegisterEmailRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RegisterEmailRequest(value=" + this.value + ")";
    }
}
