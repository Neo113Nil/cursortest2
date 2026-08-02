package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayOrderRenderData$RetroEligibility$EligibleData$LoanDuration$TimeUnit$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.TimeUnit.Companion.getClass();
        if (i == 0) {
            return CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.TimeUnit.UNSPECIFIED_TIME_UNIT;
        }
        if (i == 1) {
            return CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.TimeUnit.WEEKS;
        }
        if (i != 2) {
            return null;
        }
        return CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.TimeUnit.BIWEEKLY;
    }
}
