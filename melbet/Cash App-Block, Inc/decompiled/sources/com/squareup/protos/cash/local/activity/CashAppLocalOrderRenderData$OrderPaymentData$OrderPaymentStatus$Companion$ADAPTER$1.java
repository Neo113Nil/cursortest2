package com.squareup.protos.cash.local.activity;

import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$OrderPaymentData$OrderPaymentStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppLocalOrderRenderData.OrderPaymentData.OrderPaymentStatus.Companion.getClass();
        if (i == 0) {
            return CashAppLocalOrderRenderData.OrderPaymentData.OrderPaymentStatus.ORDER_PAYMENT_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return CashAppLocalOrderRenderData.OrderPaymentData.OrderPaymentStatus.ORDER_PAYMENT_STATUS_IN_PROGRESS;
        }
        if (i != 2) {
            return null;
        }
        return CashAppLocalOrderRenderData.OrderPaymentData.OrderPaymentStatus.ORDER_PAYMENT_STATUS_COMPLETED;
    }
}
