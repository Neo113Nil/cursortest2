package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SubmitBlockerRequest$Request$Request$SetDateRequest extends zzdh {
    public final SetDateRequest value;

    public SubmitBlockerRequest$Request$Request$SetDateRequest(SetDateRequest setDateRequest) {
        setDateRequest.getClass();
        this.value = setDateRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SetDateRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SetDateRequest) obj).value);
    }

    public final SetDateRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SetDateRequest(value=" + this.value + ")";
    }
}
