package com.squareup.protos.franklin.accounts;

import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AddressSource$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AddressSource.Companion.getClass();
        return PoolVisibility.Companion.m3914fromValue(i);
    }
}
