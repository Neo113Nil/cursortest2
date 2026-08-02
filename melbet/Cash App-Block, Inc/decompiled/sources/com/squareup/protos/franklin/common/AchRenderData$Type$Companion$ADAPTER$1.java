package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.AchRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class AchRenderData$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AchRenderData.Type.Companion.getClass();
        if (i == 0) {
            return AchRenderData.Type.UNKNOWN;
        }
        if (i == 1) {
            return AchRenderData.Type.DEBIT;
        }
        if (i != 2) {
            return null;
        }
        return AchRenderData.Type.CREDIT;
    }
}
