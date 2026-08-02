package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SavingsInterestPaymentRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SavingsInterestPaymentRenderData$SavingsInterestPaymentState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SavingsInterestPaymentRenderData.SavingsInterestPaymentState.Companion.getClass();
        if (i == 0) {
            return SavingsInterestPaymentRenderData.SavingsInterestPaymentState.SAVINGS_INTEREST_PAYMENT_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return SavingsInterestPaymentRenderData.SavingsInterestPaymentState.SAVINGS_INTEREST_PAYMENT_STATE_ESTIMATED;
        }
        if (i != 2) {
            return null;
        }
        return SavingsInterestPaymentRenderData.SavingsInterestPaymentState.SAVINGS_INTEREST_PAYMENT_STATE_COMPLETE;
    }
}
