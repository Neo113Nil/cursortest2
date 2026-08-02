package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.pay.CashAppPayRefundRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayRefundRenderData$RefundState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayRefundRenderData.RefundState.Companion.getClass();
        return RetailerType.Companion.m3908fromValue(i);
    }
}
