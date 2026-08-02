package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SetFullNameRequest extends zzdh {
    public final SetFullNameRequest value;

    public SubmitBlockerRequest$Request$Request$SetFullNameRequest(SetFullNameRequest setFullNameRequest) {
        setFullNameRequest.getClass();
        this.value = setFullNameRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SetFullNameRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SetFullNameRequest) obj).value);
    }

    public final SetFullNameRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SetFullNameRequest(value=" + this.value + ")";
    }
}
