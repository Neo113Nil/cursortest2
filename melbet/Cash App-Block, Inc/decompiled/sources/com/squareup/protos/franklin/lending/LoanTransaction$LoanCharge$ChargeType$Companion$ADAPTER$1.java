package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.lending.LoanTransaction;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LoanTransaction$LoanCharge$ChargeType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LoanTransaction.LoanCharge.ChargeType.Companion.getClass();
        if (i == 1) {
            return LoanTransaction.LoanCharge.ChargeType.LATE_FEE;
        }
        if (i != 2) {
            return null;
        }
        return LoanTransaction.LoanCharge.ChargeType.INTEREST;
    }
}
