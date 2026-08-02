package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CardModule$InformationSource$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardModule.InformationSource.Companion.getClass();
        return PoolVisibility.Companion.m3913fromValue(i);
    }
}
