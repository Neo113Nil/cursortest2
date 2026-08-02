package com.squareup.protos.cash.kgoosememorystore.api.v1;

import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class MemoryType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        MemoryType.Companion.getClass();
        return FeeType.Companion.m3910fromValue(i);
    }
}
