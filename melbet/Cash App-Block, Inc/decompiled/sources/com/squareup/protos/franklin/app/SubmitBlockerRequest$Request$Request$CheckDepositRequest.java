package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$CheckDepositRequest extends zzdh {
    public final CheckDepositRequest value;

    public SubmitBlockerRequest$Request$Request$CheckDepositRequest(CheckDepositRequest checkDepositRequest) {
        checkDepositRequest.getClass();
        this.value = checkDepositRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$CheckDepositRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$CheckDepositRequest) obj).value);
    }

    public final CheckDepositRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CheckDepositRequest(value=" + this.value + ")";
    }
}
