package com.squareup.protos.cash.nearby.api.v1;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.nearby.api.v1.NearbyContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class NearbyContext$NearbyIntent$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        NearbyContext.NearbyIntent.Companion.getClass();
        return SliceStatus.Companion.m3877fromValue(i);
    }
}
