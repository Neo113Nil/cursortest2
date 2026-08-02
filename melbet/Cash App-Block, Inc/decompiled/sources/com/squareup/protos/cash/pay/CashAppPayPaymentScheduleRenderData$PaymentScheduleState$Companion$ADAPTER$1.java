package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.pay.CashAppPayPaymentScheduleRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayPaymentScheduleRenderData$PaymentScheduleState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayPaymentScheduleRenderData.PaymentScheduleState.Companion.getClass();
        return ContactAliasType.Companion.m3898fromValue(i);
    }
}
