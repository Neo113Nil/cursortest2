package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.DisputedTransactionRenderData;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class DisputedTransactionRenderData$DisputedCapture$DisputeCase$DenialReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.Companion.getClass();
        return LinkResult.Companion.fromValue(i);
    }
}
