package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.CreatePoolResponse;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CreatePoolResponse$FailureReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreatePoolResponse.FailureReason.Companion.getClass();
        return PoolVisibility.Companion.fromValue(i);
    }
}
