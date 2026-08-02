package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayLoanSummaryRenderData$AutoPayState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayLoanSummaryRenderData.AutoPayState.Companion.getClass();
        if (i == 0) {
            return CashAppPayLoanSummaryRenderData.AutoPayState.AUTO_PAY_UNKNOWN;
        }
        if (i == 1) {
            return CashAppPayLoanSummaryRenderData.AutoPayState.AUTO_PAY_ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return CashAppPayLoanSummaryRenderData.AutoPayState.AUTO_PAY_DISABLED;
    }
}
