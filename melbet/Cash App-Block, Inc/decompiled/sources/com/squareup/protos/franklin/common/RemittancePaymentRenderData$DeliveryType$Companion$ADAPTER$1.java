package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.RemittancePaymentRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class RemittancePaymentRenderData$DeliveryType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RemittancePaymentRenderData.DeliveryType.Companion.getClass();
        if (i == 1) {
            return RemittancePaymentRenderData.DeliveryType.BANK_DEPOSIT;
        }
        if (i != 2) {
            return null;
        }
        return RemittancePaymentRenderData.DeliveryType.CASH_PICKUP;
    }
}
