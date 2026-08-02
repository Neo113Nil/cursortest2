package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LendingRenderData$SkippedPaymentAllocationStrategy$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LendingRenderData.SkippedPaymentAllocationStrategy.Companion.getClass();
        if (i == 0) {
            return LendingRenderData.SkippedPaymentAllocationStrategy.SKIPPED_PAYMENT_ALLOCATION_STRATEGY_UNSPECIFIED;
        }
        if (i == 1) {
            return LendingRenderData.SkippedPaymentAllocationStrategy.ROLL_OVER_TO_NEXT;
        }
        if (i == 2) {
            return LendingRenderData.SkippedPaymentAllocationStrategy.BACKLOAD_TO_FINAL;
        }
        if (i != 3) {
            return null;
        }
        return LendingRenderData.SkippedPaymentAllocationStrategy.SPREAD_ACROSS_REMAINING;
    }
}
