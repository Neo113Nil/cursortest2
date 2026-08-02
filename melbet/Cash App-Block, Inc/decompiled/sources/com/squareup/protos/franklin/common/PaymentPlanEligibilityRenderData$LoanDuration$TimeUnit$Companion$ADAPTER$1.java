package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PaymentPlanEligibilityRenderData$LoanDuration$TimeUnit$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentPlanEligibilityRenderData.LoanDuration.TimeUnit.Companion.getClass();
        if (i == 1) {
            return PaymentPlanEligibilityRenderData.LoanDuration.TimeUnit.WEEK;
        }
        if (i != 2) {
            return null;
        }
        return PaymentPlanEligibilityRenderData.LoanDuration.TimeUnit.BIWEEKLY;
    }
}
