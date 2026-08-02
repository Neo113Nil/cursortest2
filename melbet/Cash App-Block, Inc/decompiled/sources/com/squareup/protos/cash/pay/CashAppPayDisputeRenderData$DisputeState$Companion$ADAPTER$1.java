package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.pay.CashAppPayDisputeRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayDisputeRenderData$DisputeState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayDisputeRenderData.DisputeState.Companion.getClass();
        return Origin.Companion.m3887fromValue(i);
    }
}
