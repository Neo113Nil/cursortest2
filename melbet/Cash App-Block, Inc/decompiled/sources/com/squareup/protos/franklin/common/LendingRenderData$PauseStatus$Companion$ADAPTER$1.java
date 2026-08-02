package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LendingRenderData$PauseStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LendingRenderData.PauseStatus.Companion.getClass();
        if (i == 0) {
            return LendingRenderData.PauseStatus.DO_NOT_USE;
        }
        if (i == 1) {
            return LendingRenderData.PauseStatus.PAUSED;
        }
        if (i != 2) {
            return null;
        }
        return LendingRenderData.PauseStatus.RESUMED;
    }
}
