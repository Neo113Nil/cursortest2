package com.squareup.protos.lending;

import com.google.android.gms.internal.mlkit_vision_face.zziz;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection extends zziz {
    public final LoanRepaymentSelectionData value;

    public LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection(LoanRepaymentSelectionData loanRepaymentSelectionData) {
        loanRepaymentSelectionData.getClass();
        this.value = loanRepaymentSelectionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection) && Intrinsics.areEqual(this.value, ((LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AdditionalSelection(value=" + this.value + ")";
    }
}
