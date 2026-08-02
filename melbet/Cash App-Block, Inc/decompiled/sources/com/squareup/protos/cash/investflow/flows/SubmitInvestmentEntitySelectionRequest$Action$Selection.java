package com.squareup.protos.cash.investflow.flows;

import com.google.android.gms.internal.mlkit_vision_common.zzbs;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitInvestmentEntitySelectionRequest$Action$Selection extends zzbs {
    public final SubmitInvestmentEntitySelectionRequest.SelectionAction value;

    public SubmitInvestmentEntitySelectionRequest$Action$Selection(SubmitInvestmentEntitySelectionRequest.SelectionAction selectionAction) {
        selectionAction.getClass();
        this.value = selectionAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitInvestmentEntitySelectionRequest$Action$Selection) && Intrinsics.areEqual(this.value, ((SubmitInvestmentEntitySelectionRequest$Action$Selection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Selection(value=" + this.value + ")";
    }
}
