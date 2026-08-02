package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.CheckDepositRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CheckDepositRenderData$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CheckDepositRenderData.Status.Companion.getClass();
        switch (i) {
            case 1:
                return CheckDepositRenderData.Status.IN_REVIEW;
            case 2:
                return CheckDepositRenderData.Status.PROCESSING;
            case 3:
                return CheckDepositRenderData.Status.ACCEPTED;
            case 4:
                return CheckDepositRenderData.Status.REJECTED;
            case 5:
                return CheckDepositRenderData.Status.BOUNCED;
            case 6:
                return CheckDepositRenderData.Status.WAITING_REVIEW;
            default:
                return null;
        }
    }
}
