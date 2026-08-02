package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.AfterPayRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class AfterPayRenderData$Summary$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AfterPayRenderData.Summary.Status.Companion.getClass();
        if (i == 1) {
            return AfterPayRenderData.Summary.Status.NORMAL;
        }
        if (i == 2) {
            return AfterPayRenderData.Summary.Status.OVERDUE;
        }
        if (i == 3) {
            return AfterPayRenderData.Summary.Status.MULTIPLE_OVERDUE;
        }
        if (i != 4) {
            return null;
        }
        return AfterPayRenderData.Summary.Status.ACCOUNT_ONHOLD;
    }
}
