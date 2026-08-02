package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class AnalyticsEvent$ParamType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AnalyticsEvent.ParamType.Companion.getClass();
        return TaxEnvironment.Companion.m3927fromValue(i);
    }
}
