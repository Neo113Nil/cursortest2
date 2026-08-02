package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SetSignatureRequest extends zzdh {
    public final SetSignatureRequest value;

    public SubmitBlockerRequest$Request$Request$SetSignatureRequest(SetSignatureRequest setSignatureRequest) {
        setSignatureRequest.getClass();
        this.value = setSignatureRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SetSignatureRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SetSignatureRequest) obj).value);
    }

    public final SetSignatureRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SetSignatureRequest(value=" + this.value + ")";
    }
}
