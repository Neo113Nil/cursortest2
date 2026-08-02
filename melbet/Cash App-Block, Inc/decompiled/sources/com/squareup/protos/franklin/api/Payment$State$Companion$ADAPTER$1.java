package com.squareup.protos.franklin.api;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Payment$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Payment$State.Companion.getClass();
        return TransactionType.Companion.m3918fromValue(i);
    }
}
