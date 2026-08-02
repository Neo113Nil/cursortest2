package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.RecurringPaymentRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class RecurringPaymentRenderData$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RecurringPaymentRenderData.State.Companion.getClass();
        if (i == 0) {
            return RecurringPaymentRenderData.State.STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return RecurringPaymentRenderData.State.UPCOMING;
        }
        if (i == 2) {
            return RecurringPaymentRenderData.State.FAILED;
        }
        if (i != 3) {
            return null;
        }
        return RecurringPaymentRenderData.State.SKIPPED;
    }
}
