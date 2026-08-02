package com.squareup.protos.cash.kgoosememorystore.api.v1;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class MemoryOrigin$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        MemoryOrigin.Companion.getClass();
        return RetailerType.Companion.m3901fromValue(i);
    }
}
