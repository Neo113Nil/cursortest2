package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$FinishCreditMultiStepLoadRequest extends zzdh {
    public final FinishCreditMultiStepLoadRequest value;

    public SubmitBlockerRequest$Request$Request$FinishCreditMultiStepLoadRequest(FinishCreditMultiStepLoadRequest finishCreditMultiStepLoadRequest) {
        finishCreditMultiStepLoadRequest.getClass();
        this.value = finishCreditMultiStepLoadRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$FinishCreditMultiStepLoadRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$FinishCreditMultiStepLoadRequest) obj).value);
    }

    public final FinishCreditMultiStepLoadRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FinishCreditMultiStepLoadRequest(value=" + this.value + ")";
    }
}
