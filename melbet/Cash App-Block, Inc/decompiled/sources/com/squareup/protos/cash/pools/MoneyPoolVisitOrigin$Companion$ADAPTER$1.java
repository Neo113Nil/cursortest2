package com.squareup.protos.cash.pools;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class MoneyPoolVisitOrigin$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        MoneyPoolVisitOrigin.Companion.getClass();
        switch (i) {
            case 0:
                return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_UNSPECIFIED;
            case 1:
                return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_NOTIFICATION;
            case 2:
                return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_SHARE_LINK;
            case 3:
                return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_ENRICHED_RECEIPT;
            case 4:
                return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_ACTIVITY_FEED;
            case 5:
                return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_PUSH;
            case 6:
                return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_SMS;
            case 7:
                return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_EMAIL;
            default:
                return null;
        }
    }
}
