package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SyncBusinessGrant;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SyncBusinessGrant$ActionType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncBusinessGrant.ActionType.Companion.getClass();
        return ByteString.Companion.m4341fromValue(i);
    }
}
