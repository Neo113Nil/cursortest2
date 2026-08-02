package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.CheckDepositRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CheckDepositRenderData$ReviewResult$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CheckDepositRenderData.ReviewResult.Companion.getClass();
        if (i == 1) {
            return CheckDepositRenderData.ReviewResult.APPROVED;
        }
        if (i != 2) {
            return null;
        }
        return CheckDepositRenderData.ReviewResult.APPROVED_WITH_FUNDS_HOLD;
    }
}
