package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.pay.CashAppPayDisputeRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayDisputeRenderData$DisputeReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayDisputeRenderData.DisputeReason.Companion.getClass();
        return RetailerType.Companion.m3907fromValue(i);
    }
}
