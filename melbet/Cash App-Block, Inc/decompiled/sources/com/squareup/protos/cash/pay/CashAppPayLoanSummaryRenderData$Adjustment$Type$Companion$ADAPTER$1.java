package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayLoanSummaryRenderData$Adjustment$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayLoanSummaryRenderData.Adjustment.Type.Companion.getClass();
        if (i == 1) {
            return CashAppPayLoanSummaryRenderData.Adjustment.Type.DEBIT;
        }
        if (i != 2) {
            return null;
        }
        return CashAppPayLoanSummaryRenderData.Adjustment.Type.CREDIT;
    }
}
