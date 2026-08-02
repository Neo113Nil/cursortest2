package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PoolState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PoolState.Companion.getClass();
        return ActionType.Companion.m3931fromValue(i);
    }
}
