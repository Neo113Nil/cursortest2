package com.squareup.protos.franklin.api;

import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Payment$CancellationReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Payment$CancellationReason.Companion.getClass();
        return TextSize.Companion.m3923fromValue(i);
    }
}
