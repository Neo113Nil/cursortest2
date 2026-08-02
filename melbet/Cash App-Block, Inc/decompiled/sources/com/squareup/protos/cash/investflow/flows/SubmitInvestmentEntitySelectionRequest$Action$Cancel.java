package com.squareup.protos.cash.investflow.flows;

import com.google.android.gms.internal.mlkit_vision_common.zzbs;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitInvestmentEntitySelectionRequest$Action$Cancel extends zzbs {
    public final SubmitInvestmentEntitySelectionRequest.CancelAction value;

    public SubmitInvestmentEntitySelectionRequest$Action$Cancel(SubmitInvestmentEntitySelectionRequest.CancelAction cancelAction) {
        cancelAction.getClass();
        this.value = cancelAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitInvestmentEntitySelectionRequest$Action$Cancel) && Intrinsics.areEqual(this.value, ((SubmitInvestmentEntitySelectionRequest$Action$Cancel) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Cancel(value=" + this.value + ")";
    }
}
