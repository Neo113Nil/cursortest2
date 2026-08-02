package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class RefundReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RefundReason.Companion.getClass();
        return LinkResult.Companion.m3960fromValue(i);
    }
}
