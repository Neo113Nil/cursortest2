package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.pay.CashAppPayRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayRenderData$Dispute$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayRenderData.Dispute.State.Companion.getClass();
        return Origin.Companion.m3888fromValue(i);
    }
}
