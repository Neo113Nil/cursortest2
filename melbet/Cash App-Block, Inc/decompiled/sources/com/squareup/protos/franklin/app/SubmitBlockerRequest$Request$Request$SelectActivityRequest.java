package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SelectActivityRequest extends zzdh {
    public final SelectActivityRequest value;

    public SubmitBlockerRequest$Request$Request$SelectActivityRequest(SelectActivityRequest selectActivityRequest) {
        selectActivityRequest.getClass();
        this.value = selectActivityRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SelectActivityRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SelectActivityRequest) obj).value);
    }

    public final SelectActivityRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SelectActivityRequest(value=" + this.value + ")";
    }
}
