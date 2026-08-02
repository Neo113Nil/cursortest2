package com.squareup.protos.cash.messagingplatformcommon.common;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ProductType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ProductType.Companion.getClass();
        return ContactAliasType.Companion.m3894fromValue(i);
    }
}
