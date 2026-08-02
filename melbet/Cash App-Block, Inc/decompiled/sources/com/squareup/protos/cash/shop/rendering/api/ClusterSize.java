package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum ClusterSize implements WireEnum {
    THREE_OFFERS(1),
    FOUR_OFFERS(2),
    FIVE_OFFERS(3);

    public final int value;
    public static final PoolVisibility.Companion Companion = new PoolVisibility.Companion();
    public static final ClusterSize$Companion$ADAPTER$1 ADAPTER = new ClusterSize$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ClusterSize.class), Syntax.PROTO_2, null);

    ClusterSize(int i) {
        this.value = i;
    }

    public static final ClusterSize fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return THREE_OFFERS;
        }
        if (i == 2) {
            return FOUR_OFFERS;
        }
        if (i != 3) {
            return null;
        }
        return FIVE_OFFERS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
