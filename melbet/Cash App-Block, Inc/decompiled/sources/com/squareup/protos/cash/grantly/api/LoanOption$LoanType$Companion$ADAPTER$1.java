package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LoanOption$LoanType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LoanOption.LoanType.Companion.getClass();
        if (i == 1) {
            return LoanOption.LoanType.PAY_IN_FOUR;
        }
        if (i != 2) {
            return null;
        }
        return LoanOption.LoanType.PAY_IN_TWO;
    }
}
