package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.cash.pay.CashAppPayPaymentRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayPaymentRenderData$PaymentState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayPaymentRenderData.PaymentState.Companion.getClass();
        return FeeType.Companion.m3912fromValue(i);
    }
}
