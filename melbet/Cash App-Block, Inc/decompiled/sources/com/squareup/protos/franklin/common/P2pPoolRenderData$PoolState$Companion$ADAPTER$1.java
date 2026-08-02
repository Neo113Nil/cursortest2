package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.P2pPoolRenderData;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class P2pPoolRenderData$PoolState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        P2pPoolRenderData.PoolState.Companion.getClass();
        return KeyScope.Companion.m3970fromValue(i);
    }
}
