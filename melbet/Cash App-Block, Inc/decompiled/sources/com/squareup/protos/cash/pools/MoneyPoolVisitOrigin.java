package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum MoneyPoolVisitOrigin implements WireEnum {
    MONEY_POOL_VISIT_ORIGIN_UNSPECIFIED(0),
    MONEY_POOL_VISIT_ORIGIN_NOTIFICATION(1),
    MONEY_POOL_VISIT_ORIGIN_SHARE_LINK(2),
    MONEY_POOL_VISIT_ORIGIN_ENRICHED_RECEIPT(3),
    MONEY_POOL_VISIT_ORIGIN_ACTIVITY_FEED(4),
    MONEY_POOL_VISIT_ORIGIN_PUSH(5),
    MONEY_POOL_VISIT_ORIGIN_SMS(6),
    MONEY_POOL_VISIT_ORIGIN_EMAIL(7);

    public static final MoneyPoolVisitOrigin$Companion$ADAPTER$1 ADAPTER;
    public static final ActionType.Companion Companion;
    public final int value;

    static {
        MoneyPoolVisitOrigin moneyPoolVisitOrigin = MONEY_POOL_VISIT_ORIGIN_UNSPECIFIED;
        Companion = new ActionType.Companion();
        ADAPTER = new MoneyPoolVisitOrigin$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MoneyPoolVisitOrigin.class), Syntax.PROTO_2, moneyPoolVisitOrigin);
    }

    MoneyPoolVisitOrigin(int i) {
        this.value = i;
    }

    public static final MoneyPoolVisitOrigin fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return MONEY_POOL_VISIT_ORIGIN_UNSPECIFIED;
            case 1:
                return MONEY_POOL_VISIT_ORIGIN_NOTIFICATION;
            case 2:
                return MONEY_POOL_VISIT_ORIGIN_SHARE_LINK;
            case 3:
                return MONEY_POOL_VISIT_ORIGIN_ENRICHED_RECEIPT;
            case 4:
                return MONEY_POOL_VISIT_ORIGIN_ACTIVITY_FEED;
            case 5:
                return MONEY_POOL_VISIT_ORIGIN_PUSH;
            case 6:
                return MONEY_POOL_VISIT_ORIGIN_SMS;
            case 7:
                return MONEY_POOL_VISIT_ORIGIN_EMAIL;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
