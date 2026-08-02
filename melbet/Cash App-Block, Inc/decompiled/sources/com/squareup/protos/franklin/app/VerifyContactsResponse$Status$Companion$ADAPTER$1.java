package com.squareup.protos.franklin.app;

import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.franklin.app.VerifyContactsResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class VerifyContactsResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        VerifyContactsResponse.Status.Companion.getClass();
        return PoolVisibility.Companion.m3915fromValue(i);
    }
}
