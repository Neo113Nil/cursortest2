package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.AllowanceRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class AllowanceRenderData$AllowanceState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AllowanceRenderData.AllowanceState.Companion.getClass();
        switch (i) {
            case 1:
                return AllowanceRenderData.AllowanceState.SCHEDULED;
            case 2:
                return AllowanceRenderData.AllowanceState.SKIPPED;
            case 3:
                return AllowanceRenderData.AllowanceState.COMPLETED;
            case 4:
                return AllowanceRenderData.AllowanceState.FAILED;
            case 5:
                return AllowanceRenderData.AllowanceState.DECLINED;
            case 6:
                return AllowanceRenderData.AllowanceState.CANCELED;
            default:
                return null;
        }
    }
}
