package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayLoanSummaryRenderData$LoanState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayLoanSummaryRenderData.LoanState.Companion.getClass();
        switch (i) {
            case 0:
                return CashAppPayLoanSummaryRenderData.LoanState.LOAN_STATE_UNKNOWN;
            case 1:
                return CashAppPayLoanSummaryRenderData.LoanState.LOAN_STATE_OFFERED;
            case 2:
                return CashAppPayLoanSummaryRenderData.LoanState.LOAN_STATE_ISSUED;
            case 3:
                return CashAppPayLoanSummaryRenderData.LoanState.LOAN_STATE_PAID_OFF;
            case 4:
                return CashAppPayLoanSummaryRenderData.LoanState.LOAN_STATE_SELECTED;
            case 5:
                return CashAppPayLoanSummaryRenderData.LoanState.LOAN_STATE_DECLINED;
            case 6:
                return CashAppPayLoanSummaryRenderData.LoanState.LOAN_STATE_FAILED;
            default:
                return null;
        }
    }
}
