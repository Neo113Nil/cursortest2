package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayLoanSummaryRenderData$Fee$FeeType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayLoanSummaryRenderData.Fee.FeeType.Companion.getClass();
        if (i == 0) {
            return CashAppPayLoanSummaryRenderData.Fee.FeeType.UNKNOWN_FEE_TYPE;
        }
        if (i == 1) {
            return CashAppPayLoanSummaryRenderData.Fee.FeeType.SERVICE_FEE_TYPE;
        }
        if (i == 2) {
            return CashAppPayLoanSummaryRenderData.Fee.FeeType.LATE_FEE_TYPE;
        }
        if (i != 3) {
            return null;
        }
        return CashAppPayLoanSummaryRenderData.Fee.FeeType.FINANCE_FEE_TYPE;
    }
}
