package com.squareup.protos.cash.blockuserjourneys.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public final class JourneyTerminationReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        JourneyTerminationReason.Companion.getClass();
        return AsyncTimeout.Companion.fromValue(i);
    }
}
