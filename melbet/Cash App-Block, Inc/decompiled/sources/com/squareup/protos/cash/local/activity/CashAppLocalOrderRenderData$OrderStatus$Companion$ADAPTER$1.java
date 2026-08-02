package com.squareup.protos.cash.local.activity;

import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$OrderStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppLocalOrderRenderData.OrderStatus.Companion.getClass();
        if (i == 0) {
            return CashAppLocalOrderRenderData.OrderStatus.ORDER_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return CashAppLocalOrderRenderData.OrderStatus.ORDER_STATUS_IN_PROGRESS;
        }
        if (i == 2) {
            return CashAppLocalOrderRenderData.OrderStatus.ORDER_STATUS_READY_FOR_PICKUP;
        }
        if (i != 3) {
            return null;
        }
        return CashAppLocalOrderRenderData.OrderStatus.ORDER_STATUS_ORDER_COMPLETED;
    }
}
