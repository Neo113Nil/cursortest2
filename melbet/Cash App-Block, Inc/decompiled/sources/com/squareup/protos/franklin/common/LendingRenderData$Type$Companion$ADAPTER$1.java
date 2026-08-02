package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LendingRenderData$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LendingRenderData.Type.Companion.getClass();
        return LinkResult.Companion.m3958fromValue(i);
    }
}
