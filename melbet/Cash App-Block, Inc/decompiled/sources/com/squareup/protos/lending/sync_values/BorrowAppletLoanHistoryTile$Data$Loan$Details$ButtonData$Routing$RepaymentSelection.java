package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjh;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection extends zzjh {
    public final LoanRepaymentSelectionData value;

    public BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection(LoanRepaymentSelectionData loanRepaymentSelectionData) {
        loanRepaymentSelectionData.getClass();
        this.value = loanRepaymentSelectionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection) && Intrinsics.areEqual(this.value, ((BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RepaymentSelection(value=" + this.value + ")";
    }
}
