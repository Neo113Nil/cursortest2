package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$CreditMultiStepPollingRequest extends zzdh {
    public final CreditMultiStepLoadPollingRequest value;

    public SubmitBlockerRequest$Request$Request$CreditMultiStepPollingRequest(CreditMultiStepLoadPollingRequest creditMultiStepLoadPollingRequest) {
        creditMultiStepLoadPollingRequest.getClass();
        this.value = creditMultiStepLoadPollingRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$CreditMultiStepPollingRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$CreditMultiStepPollingRequest) obj).value);
    }

    public final CreditMultiStepLoadPollingRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CreditMultiStepPollingRequest(value=" + this.value + ")";
    }
}
