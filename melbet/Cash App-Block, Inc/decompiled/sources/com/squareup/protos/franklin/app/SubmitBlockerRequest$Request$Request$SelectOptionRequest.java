package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SelectOptionRequest extends zzdh {
    public final SelectOptionRequest value;

    public SubmitBlockerRequest$Request$Request$SelectOptionRequest(SelectOptionRequest selectOptionRequest) {
        selectOptionRequest.getClass();
        this.value = selectOptionRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SelectOptionRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SelectOptionRequest) obj).value);
    }

    public final SelectOptionRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SelectOptionRequest(value=" + this.value + ")";
    }
}
