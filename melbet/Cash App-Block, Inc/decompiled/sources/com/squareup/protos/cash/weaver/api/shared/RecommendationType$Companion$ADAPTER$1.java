package com.squareup.protos.cash.weaver.api.shared;

import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class RecommendationType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RecommendationType.Companion.getClass();
        return TextSize.Companion.m3921fromValue(i);
    }
}
