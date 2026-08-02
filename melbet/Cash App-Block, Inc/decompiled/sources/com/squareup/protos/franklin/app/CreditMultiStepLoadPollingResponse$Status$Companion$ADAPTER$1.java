package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.CreditMultiStepLoadPollingResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CreditMultiStepLoadPollingResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreditMultiStepLoadPollingResponse.Status.Companion.getClass();
        if (i == 1) {
            return CreditMultiStepLoadPollingResponse.Status.IN_PROGRESS;
        }
        if (i != 2) {
            return null;
        }
        return CreditMultiStepLoadPollingResponse.Status.FINISHED;
    }
}
