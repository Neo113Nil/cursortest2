package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PaymentPlanEligibilityRenderData$UiState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentPlanEligibilityRenderData.UiState.Companion.getClass();
        if (i == 1) {
            return PaymentPlanEligibilityRenderData.UiState.ELIGIBLE;
        }
        if (i == 2) {
            return PaymentPlanEligibilityRenderData.UiState.NOT_ELIGIBLE;
        }
        if (i != 3) {
            return null;
        }
        return PaymentPlanEligibilityRenderData.UiState.CONVERTED_TO_PAYMENT_PLAN;
    }
}
