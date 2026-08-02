package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class SyncInvestmentFilterGroup$JoinType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncInvestmentFilterGroup.JoinType.Companion.getClass();
        if (i == 0) {
            return SyncInvestmentFilterGroup.JoinType.DO_NOT_USE_JOIN_TYPE;
        }
        if (i == 1) {
            return SyncInvestmentFilterGroup.JoinType.INTERSECTION;
        }
        if (i != 2) {
            return null;
        }
        return SyncInvestmentFilterGroup.JoinType.UNION;
    }
}
