package com.squareup.protos.cash.taply.syncvalues;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PhysicalTagOrderState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PhysicalTagOrderState.Companion.getClass();
        return TransactionType.Companion.m3917fromValue(i);
    }
}
