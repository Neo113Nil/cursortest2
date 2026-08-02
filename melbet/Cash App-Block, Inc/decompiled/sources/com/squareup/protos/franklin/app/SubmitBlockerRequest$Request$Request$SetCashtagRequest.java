package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SetCashtagRequest extends zzdh {
    public final SetCashtagRequest value;

    public SubmitBlockerRequest$Request$Request$SetCashtagRequest(SetCashtagRequest setCashtagRequest) {
        setCashtagRequest.getClass();
        this.value = setCashtagRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SetCashtagRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SetCashtagRequest) obj).value);
    }

    public final SetCashtagRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SetCashtagRequest(value=" + this.value + ")";
    }
}
