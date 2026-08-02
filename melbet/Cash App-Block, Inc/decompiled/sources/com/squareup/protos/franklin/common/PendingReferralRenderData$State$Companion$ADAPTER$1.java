package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.PendingReferralRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PendingReferralRenderData$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PendingReferralRenderData.State.Companion.getClass();
        if (i == 1) {
            return PendingReferralRenderData.State.PENDING;
        }
        if (i == 2) {
            return PendingReferralRenderData.State.FAILED;
        }
        if (i != 3) {
            return null;
        }
        return PendingReferralRenderData.State.EXPIRED;
    }
}
