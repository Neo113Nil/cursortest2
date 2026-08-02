package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.TransactionAuthRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class TransactionAuthRenderData$TransactionAuthRequestStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TransactionAuthRenderData.TransactionAuthRequestStatus.Companion.getClass();
        if (i == 1) {
            return TransactionAuthRenderData.TransactionAuthRequestStatus.PENDING;
        }
        if (i != 2) {
            return null;
        }
        return TransactionAuthRenderData.TransactionAuthRequestStatus.RESPONDED;
    }
}
