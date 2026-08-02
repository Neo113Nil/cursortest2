package com.squareup.protos.cash.investflow.flows;

import com.google.android.gms.internal.mlkit_vision_common.zzbs;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitInvestmentEntitySelectionRequest$Action$CancelWithDisableIntent extends zzbs {
    public final SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent value;

    public SubmitInvestmentEntitySelectionRequest$Action$CancelWithDisableIntent(SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent cancelWithDisableIntent) {
        cancelWithDisableIntent.getClass();
        this.value = cancelWithDisableIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitInvestmentEntitySelectionRequest$Action$CancelWithDisableIntent) && Intrinsics.areEqual(this.value, ((SubmitInvestmentEntitySelectionRequest$Action$CancelWithDisableIntent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CancelWithDisableIntent(value=" + this.value + ")";
    }
}
