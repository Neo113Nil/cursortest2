package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SyncInvestmentFilterGroup$Subfilter$SubfilterType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncInvestmentFilterGroup.Subfilter.SubfilterType.Companion.getClass();
        if (i == 0) {
            return SyncInvestmentFilterGroup.Subfilter.SubfilterType.DO_NOT_USE_SUBFILTER_TYPE;
        }
        if (i == 1) {
            return SyncInvestmentFilterGroup.Subfilter.SubfilterType.INCREMENTAL;
        }
        if (i != 2) {
            return null;
        }
        return SyncInvestmentFilterGroup.Subfilter.SubfilterType.SELECTION;
    }
}
