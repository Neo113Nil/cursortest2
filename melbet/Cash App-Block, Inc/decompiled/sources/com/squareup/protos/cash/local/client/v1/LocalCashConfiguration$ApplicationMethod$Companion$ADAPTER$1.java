package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.local.client.v1.LocalCashConfiguration;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalCashConfiguration$ApplicationMethod$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalCashConfiguration.ApplicationMethod.Companion.getClass();
        return ContactAliasType.Companion.m3893fromValue(i);
    }
}
