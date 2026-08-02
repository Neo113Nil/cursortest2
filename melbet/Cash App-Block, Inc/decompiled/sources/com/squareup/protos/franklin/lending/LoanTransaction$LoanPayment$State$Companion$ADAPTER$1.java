package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.lending.LoanTransaction;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LoanTransaction$LoanPayment$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LoanTransaction.LoanPayment.State.Companion.getClass();
        switch (i) {
            case 1:
                return LoanTransaction.LoanPayment.State.SCHEDULED;
            case 2:
                return LoanTransaction.LoanPayment.State.COMPLETED;
            case 3:
                return LoanTransaction.LoanPayment.State.SKIPPED;
            case 4:
                return LoanTransaction.LoanPayment.State.MISSED;
            case 5:
                return LoanTransaction.LoanPayment.State.OVERDUE;
            case 6:
                return LoanTransaction.LoanPayment.State.CANCELLED;
            default:
                return null;
        }
    }
}
