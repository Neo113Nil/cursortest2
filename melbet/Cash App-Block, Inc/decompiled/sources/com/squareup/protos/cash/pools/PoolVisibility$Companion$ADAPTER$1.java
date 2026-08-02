package com.squareup.protos.cash.pools;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PoolVisibility$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PoolVisibility.Companion.getClass();
        if (i == 0) {
            return PoolVisibility.POOL_VISIBILITY_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return PoolVisibility.POOL_VISIBILITY_TYPE_PUBLIC;
        }
        if (i != 2) {
            return null;
        }
        return PoolVisibility.POOL_VISIBILITY_TYPE_PRIVATE;
    }
}
