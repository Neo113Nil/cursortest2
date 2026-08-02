package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PaymentPlanEligibilityRenderData$Source$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentPlanEligibilityRenderData.Source.Companion.getClass();
        if (i == 1) {
            return PaymentPlanEligibilityRenderData.Source.CASH_CARD;
        }
        if (i == 2) {
            return PaymentPlanEligibilityRenderData.Source.CASH_APP_PAY;
        }
        if (i != 3) {
            return null;
        }
        return PaymentPlanEligibilityRenderData.Source.P2P;
    }
}
