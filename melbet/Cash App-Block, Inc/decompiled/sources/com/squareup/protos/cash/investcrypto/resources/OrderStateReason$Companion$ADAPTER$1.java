package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class OrderStateReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OrderStateReason.Companion.getClass();
        return ContactAliasType.Companion.m3890fromValue(i);
    }
}
