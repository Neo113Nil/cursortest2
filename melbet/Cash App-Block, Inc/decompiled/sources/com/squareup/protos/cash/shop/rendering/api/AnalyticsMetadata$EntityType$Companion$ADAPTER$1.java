package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.protos.cash.shop.rendering.api.AnalyticsMetadata;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class AnalyticsMetadata$EntityType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AnalyticsMetadata.EntityType.Companion.getClass();
        if (i == 1) {
            return AnalyticsMetadata.EntityType.BUSINESS;
        }
        if (i != 2) {
            return null;
        }
        return AnalyticsMetadata.EntityType.OFFER;
    }
}
