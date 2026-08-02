package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayOrderRenderData$RetroEligibility$UiState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayOrderRenderData.RetroEligibility.UiState.Companion.getClass();
        if (i == 0) {
            return CashAppPayOrderRenderData.RetroEligibility.UiState.UNKNOWN;
        }
        if (i == 1) {
            return CashAppPayOrderRenderData.RetroEligibility.UiState.ELIGIBLE;
        }
        if (i == 2) {
            return CashAppPayOrderRenderData.RetroEligibility.UiState.NOT_ELIGIBLE;
        }
        if (i != 3) {
            return null;
        }
        return CashAppPayOrderRenderData.RetroEligibility.UiState.CONVERTED_TO_PAYMENT_PLAN;
    }
}
