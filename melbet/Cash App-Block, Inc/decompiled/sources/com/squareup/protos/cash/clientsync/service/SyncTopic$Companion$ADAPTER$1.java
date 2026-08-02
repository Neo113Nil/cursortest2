package com.squareup.protos.cash.clientsync.service;

import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SyncTopic$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncTopic.Companion.getClass();
        return RadioType.Companion.m3852fromValue(i);
    }
}
