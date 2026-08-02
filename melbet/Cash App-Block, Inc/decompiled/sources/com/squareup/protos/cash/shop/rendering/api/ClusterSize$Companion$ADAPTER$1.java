package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ClusterSize$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ClusterSize.Companion.getClass();
        if (i == 1) {
            return ClusterSize.THREE_OFFERS;
        }
        if (i == 2) {
            return ClusterSize.FOUR_OFFERS;
        }
        if (i != 3) {
            return null;
        }
        return ClusterSize.FIVE_OFFERS;
    }
}
