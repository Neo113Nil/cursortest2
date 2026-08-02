package com.squareup.protos.cash.disputron.core;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TransactionType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TransactionType.Companion.getClass();
        return Action.Type.Companion.m3865fromValue(i);
    }
}
