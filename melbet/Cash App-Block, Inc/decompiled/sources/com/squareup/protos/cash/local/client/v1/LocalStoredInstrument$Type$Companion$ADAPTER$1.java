package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.local.client.v1.LocalStoredInstrument;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalStoredInstrument$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalStoredInstrument.Type.Companion.getClass();
        return SliceStatus.Companion.m3876fromValue(i);
    }
}
