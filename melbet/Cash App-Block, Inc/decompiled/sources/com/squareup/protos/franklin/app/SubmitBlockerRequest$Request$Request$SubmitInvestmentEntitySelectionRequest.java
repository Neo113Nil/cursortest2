package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SubmitBlockerRequest$Request$Request$SubmitInvestmentEntitySelectionRequest extends zzdh {
    public final SubmitInvestmentEntitySelectionRequest value;

    public SubmitBlockerRequest$Request$Request$SubmitInvestmentEntitySelectionRequest(SubmitInvestmentEntitySelectionRequest submitInvestmentEntitySelectionRequest) {
        submitInvestmentEntitySelectionRequest.getClass();
        this.value = submitInvestmentEntitySelectionRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SubmitInvestmentEntitySelectionRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SubmitInvestmentEntitySelectionRequest) obj).value);
    }

    public final SubmitInvestmentEntitySelectionRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SubmitInvestmentEntitySelectionRequest(value=" + this.value + ")";
    }
}
