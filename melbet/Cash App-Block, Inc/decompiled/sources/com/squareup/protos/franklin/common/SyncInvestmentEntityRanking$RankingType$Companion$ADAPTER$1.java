package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SyncInvestmentEntityRanking;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SyncInvestmentEntityRanking$RankingType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncInvestmentEntityRanking.RankingType.Companion.getClass();
        if (i == 0) {
            return SyncInvestmentEntityRanking.RankingType.DO_NOT_USE_RANKING_TYPE;
        }
        if (i != 1) {
            return null;
        }
        return SyncInvestmentEntityRanking.RankingType.SEARCH_AND_CATEGORY_VIEWS;
    }
}
