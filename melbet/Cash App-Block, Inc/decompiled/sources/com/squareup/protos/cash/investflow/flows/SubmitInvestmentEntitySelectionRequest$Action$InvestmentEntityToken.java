package com.squareup.protos.cash.investflow.flows;

import com.google.android.gms.internal.mlkit_vision_common.zzbs;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitInvestmentEntitySelectionRequest$Action$InvestmentEntityToken extends zzbs {
    public final String value;

    public SubmitInvestmentEntitySelectionRequest$Action$InvestmentEntityToken(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitInvestmentEntitySelectionRequest$Action$InvestmentEntityToken) && Intrinsics.areEqual(this.value, ((SubmitInvestmentEntitySelectionRequest$Action$InvestmentEntityToken) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InvestmentEntityToken(value=", this.value, ")");
    }
}
