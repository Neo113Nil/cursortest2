package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$RegisterSmsRequest extends zzdh {
    public final RegisterSmsRequest value;

    public SubmitBlockerRequest$Request$Request$RegisterSmsRequest(RegisterSmsRequest registerSmsRequest) {
        registerSmsRequest.getClass();
        this.value = registerSmsRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$RegisterSmsRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$RegisterSmsRequest) obj).value);
    }

    public final RegisterSmsRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RegisterSmsRequest(value=" + this.value + ")";
    }
}
