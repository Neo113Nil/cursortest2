package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayLoanSummaryRenderData$Adjustment$Reason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayLoanSummaryRenderData.Adjustment.Reason.Companion.getClass();
        if (i == 0) {
            return CashAppPayLoanSummaryRenderData.Adjustment.Reason.OTHER;
        }
        if (i != 1) {
            return null;
        }
        return CashAppPayLoanSummaryRenderData.Adjustment.Reason.SUP_BUFFER_RELEASE;
    }
}
