package com.squareup.protos.cash.paymenttemplate.v1;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CreationChannel$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreationChannel.Companion.getClass();
        return SliceStatus.Companion.m3879fromValue(i);
    }
}
