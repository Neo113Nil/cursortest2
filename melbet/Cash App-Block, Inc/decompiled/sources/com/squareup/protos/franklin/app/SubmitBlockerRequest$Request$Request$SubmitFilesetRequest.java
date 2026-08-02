package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SubmitFilesetRequest extends zzdh {
    public final SubmitFilesetRequest value;

    public SubmitBlockerRequest$Request$Request$SubmitFilesetRequest(SubmitFilesetRequest submitFilesetRequest) {
        submitFilesetRequest.getClass();
        this.value = submitFilesetRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SubmitFilesetRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SubmitFilesetRequest) obj).value);
    }

    public final SubmitFilesetRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SubmitFilesetRequest(value=" + this.value + ")";
    }
}
