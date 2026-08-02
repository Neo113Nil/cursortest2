package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.lending.LoanTransaction;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LoanTransaction$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LoanTransaction.Type.Companion.getClass();
        switch (i) {
            case 1:
                return LoanTransaction.Type.PAYMENT;
            case 2:
                return LoanTransaction.Type.DRAWDOWN;
            case 3:
                return LoanTransaction.Type.CHARGE;
            case 4:
                return LoanTransaction.Type.REFUND;
            case 5:
                return LoanTransaction.Type.ADJUSTMENT;
            case 6:
                return LoanTransaction.Type.OVERDUE_PAYMENT_PLAN_PAYMENT;
            default:
                return null;
        }
    }
}
