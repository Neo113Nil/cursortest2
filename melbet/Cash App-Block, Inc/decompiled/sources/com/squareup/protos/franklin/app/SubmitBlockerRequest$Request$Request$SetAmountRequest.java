package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitBlockerRequest$Request$Request$SetAmountRequest extends zzdh {
    public final SetAmountRequest value;

    public SubmitBlockerRequest$Request$Request$SetAmountRequest(SetAmountRequest setAmountRequest) {
        setAmountRequest.getClass();
        this.value = setAmountRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SetAmountRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SetAmountRequest) obj).value);
    }

    public final SetAmountRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SetAmountRequest(value=" + this.value + ")";
    }
}
