package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.PendingReferralRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PendingReferralRenderData$Role$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PendingReferralRenderData.Role.Companion.getClass();
        if (i == 1) {
            return PendingReferralRenderData.Role.REFERRER;
        }
        if (i != 2) {
            return null;
        }
        return PendingReferralRenderData.Role.REFEREE;
    }
}
