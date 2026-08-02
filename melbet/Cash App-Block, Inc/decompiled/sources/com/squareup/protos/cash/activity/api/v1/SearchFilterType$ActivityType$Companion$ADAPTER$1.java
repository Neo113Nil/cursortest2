package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.cash.activity.api.v1.SearchFilterType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/SearchFilterType$ActivityType$Companion$ADAPTER$1", "Lcom/squareup/wire/EnumAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterType$ActivityType;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFilterType$ActivityType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SearchFilterType.ActivityType.INSTANCE.getClass();
        switch (i) {
            case 1:
                return SearchFilterType.ActivityType.PAYMENTS;
            case 2:
                return SearchFilterType.ActivityType.CASH_CARD;
            case 3:
                return SearchFilterType.ActivityType.BITCOIN;
            case 4:
                return SearchFilterType.ActivityType.TRANSFERS;
            case 5:
                return SearchFilterType.ActivityType.BORROW;
            case 6:
                return SearchFilterType.ActivityType.STOCK;
            case 7:
                return SearchFilterType.ActivityType.SAVINGS;
            default:
                return null;
        }
    }
}
