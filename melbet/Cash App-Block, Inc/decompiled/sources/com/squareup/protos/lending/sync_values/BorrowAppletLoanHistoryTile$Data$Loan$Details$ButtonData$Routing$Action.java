package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjh;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action extends zzjh {
    public final String value;

    public BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action) && Intrinsics.areEqual(this.value, ((BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Action(value=", this.value, ")");
    }
}
