package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayRenderData$EntityType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayRenderData.EntityType.Companion.getClass();
        if (i == 0) {
            return CashAppPayRenderData.EntityType.UNKNOWN;
        }
        if (i == 1) {
            return CashAppPayRenderData.EntityType.PAYMENT;
        }
        if (i != 2) {
            return null;
        }
        return CashAppPayRenderData.EntityType.DEPOSIT;
    }
}
