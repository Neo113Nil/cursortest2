package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalErrorResponse$Error$Reason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalErrorResponse.Error.Reason.Companion.getClass();
        return SliceStatus.Companion.m3875fromValue(i);
    }
}
