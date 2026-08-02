package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CashAppCard$PhysicalCardOrderState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppCard.PhysicalCardOrderState.Companion.getClass();
        return TextSize.Companion.m3919fromValue(i);
    }
}
