package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class SubmitBlockerRequest$Request$Request$AddMoneyRequest extends zzdh {
    public final AddMoneyRequest value;

    public SubmitBlockerRequest$Request$Request$AddMoneyRequest(AddMoneyRequest addMoneyRequest) {
        addMoneyRequest.getClass();
        this.value = addMoneyRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$AddMoneyRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$AddMoneyRequest) obj).value);
    }

    public final AddMoneyRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AddMoneyRequest(value=" + this.value + ")";
    }
}
