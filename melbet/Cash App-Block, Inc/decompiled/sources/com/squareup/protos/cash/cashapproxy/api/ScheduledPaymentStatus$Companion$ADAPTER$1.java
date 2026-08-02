package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ScheduledPaymentStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ScheduledPaymentStatus.Companion.getClass();
        return Error.Code.Companion.m3841fromValue(i);
    }
}
