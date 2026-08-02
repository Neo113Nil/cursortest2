package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LendingRenderData$RelatedTransaction$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LendingRenderData.RelatedTransaction.Type.Companion.getClass();
        if (i == 1) {
            return LendingRenderData.RelatedTransaction.Type.PEER_TO_PEER;
        }
        if (i != 2) {
            return null;
        }
        return LendingRenderData.RelatedTransaction.Type.DIRECT_DEPOSIT;
    }
}
