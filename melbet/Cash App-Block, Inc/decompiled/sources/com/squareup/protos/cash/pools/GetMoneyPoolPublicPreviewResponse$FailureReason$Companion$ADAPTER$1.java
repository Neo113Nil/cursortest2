package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.GetMoneyPoolPublicPreviewResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetMoneyPoolPublicPreviewResponse$FailureReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetMoneyPoolPublicPreviewResponse.FailureReason.Companion.getClass();
        if (i == 0) {
            return GetMoneyPoolPublicPreviewResponse.FailureReason.FAILURE_REASON_DEFAULT_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return GetMoneyPoolPublicPreviewResponse.FailureReason.FAILURE_REASON_FORBIDDEN_TO_VIEW_POOL;
    }
}
