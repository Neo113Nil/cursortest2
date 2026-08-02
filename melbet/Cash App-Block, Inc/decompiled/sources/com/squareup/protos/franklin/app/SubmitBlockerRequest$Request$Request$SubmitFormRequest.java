package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SubmitBlockerRequest$Request$Request$SubmitFormRequest extends zzdh {
    public final SubmitFormRequest value;

    public SubmitBlockerRequest$Request$Request$SubmitFormRequest(SubmitFormRequest submitFormRequest) {
        submitFormRequest.getClass();
        this.value = submitFormRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SubmitFormRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SubmitFormRequest) obj).value);
    }

    public final SubmitFormRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SubmitFormRequest(value=" + this.value + ")";
    }
}
