package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PoolLifecycleCategory implements WireEnum {
    POOL_LIFECYCLE_CATEGORY_UNSPECIFIED(0),
    POOL_LIFECYCLE_CATEGORY_ACTIVE(1),
    POOL_LIFECYCLE_CATEGORY_CLOSED(2);

    public static final PoolLifecycleCategory$Companion$ADAPTER$1 ADAPTER;
    public static final TextSize.Companion Companion;
    public final int value;

    static {
        PoolLifecycleCategory poolLifecycleCategory = POOL_LIFECYCLE_CATEGORY_UNSPECIFIED;
        Companion = new TextSize.Companion();
        ADAPTER = new PoolLifecycleCategory$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PoolLifecycleCategory.class), Syntax.PROTO_2, poolLifecycleCategory);
    }

    PoolLifecycleCategory(int i) {
        this.value = i;
    }

    public static final PoolLifecycleCategory fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return POOL_LIFECYCLE_CATEGORY_UNSPECIFIED;
        }
        if (i == 1) {
            return POOL_LIFECYCLE_CATEGORY_ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return POOL_LIFECYCLE_CATEGORY_CLOSED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
