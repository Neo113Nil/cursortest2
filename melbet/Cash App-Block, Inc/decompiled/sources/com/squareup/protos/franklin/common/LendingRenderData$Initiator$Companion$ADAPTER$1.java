package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LendingRenderData$Initiator$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LendingRenderData.Initiator.Companion.getClass();
        return Trigger.Companion.m3950fromValue(i);
    }
}
