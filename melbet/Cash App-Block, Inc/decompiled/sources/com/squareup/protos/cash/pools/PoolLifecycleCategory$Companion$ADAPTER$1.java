package com.squareup.protos.cash.pools;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PoolLifecycleCategory$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PoolLifecycleCategory.Companion.getClass();
        if (i == 0) {
            return PoolLifecycleCategory.POOL_LIFECYCLE_CATEGORY_UNSPECIFIED;
        }
        if (i == 1) {
            return PoolLifecycleCategory.POOL_LIFECYCLE_CATEGORY_ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return PoolLifecycleCategory.POOL_LIFECYCLE_CATEGORY_CLOSED;
    }
}
