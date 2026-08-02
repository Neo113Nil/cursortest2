package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.AllowanceRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class AllowanceRenderData$AllowanceStateReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AllowanceRenderData.AllowanceStateReason.Companion.getClass();
        if (i == 1) {
            return AllowanceRenderData.AllowanceStateReason.EXCEEDS_RECIPIENT_MONTHLY_RECEIVE_LIMIT;
        }
        if (i == 2) {
            return AllowanceRenderData.AllowanceStateReason.BANK_DECLINE;
        }
        if (i == 3) {
            return AllowanceRenderData.AllowanceStateReason.INSUFFICIENT_FUNDS;
        }
        if (i != 4) {
            return null;
        }
        return AllowanceRenderData.AllowanceStateReason.DEFAULT;
    }
}
