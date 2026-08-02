package com.squareup.protos.cash.papermate.enums;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ExternalSystem$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ExternalSystem.Companion.getClass();
        return SliceStatus.Companion.m3878fromValue(i);
    }
}
