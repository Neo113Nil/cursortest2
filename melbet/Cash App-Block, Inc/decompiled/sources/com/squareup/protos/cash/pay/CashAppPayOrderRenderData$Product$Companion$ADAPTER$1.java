package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayOrderRenderData$Product$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayOrderRenderData.Product.Companion.getClass();
        return ContactAliasType.Companion.m3897fromValue(i);
    }
}
