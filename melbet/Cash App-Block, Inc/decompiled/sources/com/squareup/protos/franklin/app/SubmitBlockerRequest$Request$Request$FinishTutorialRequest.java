package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$FinishTutorialRequest extends zzdh {
    public final FinishTutorialRequest value;

    public SubmitBlockerRequest$Request$Request$FinishTutorialRequest(FinishTutorialRequest finishTutorialRequest) {
        finishTutorialRequest.getClass();
        this.value = finishTutorialRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$FinishTutorialRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$FinishTutorialRequest) obj).value);
    }

    public final FinishTutorialRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FinishTutorialRequest(value=" + this.value + ")";
    }
}
