package com.squareup.protos.cash.clientsync.service;

import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum SyncTopic implements WireEnum {
    UNKNOWN(-1),
    FRANKLIN_PRIMARY(0),
    CLIENTSYNC_PRIMARY(1),
    SYNC_VALUES(2),
    P2P_PAYMENTS(3),
    P2P_PAYMENTS_MIGRATION(4),
    TRANSACTION(5),
    LENDING(6),
    INVESTMENT_ENTITIES(8),
    INVITATIONS(9),
    RECURRING_PREFERENCES(10),
    INVESTMENT_CATEGORIES(11),
    ATM_PICKERS(12),
    SPECIAL_CUSTOMERS(13),
    TRANSACTION_V2(14),
    INVESTMENT_CATEGORIES_ADVANCED(15),
    INVESTMENT_INCENTIVES(16),
    LOYALTY(17),
    TRANSACTION_TIDB(18),
    CLIENTSYNC_GLOBAL(19),
    LOYALTY_ACTIVITIES(20),
    COMPUTED_SYNC_VALUES(22),
    REFERENCES(23),
    ACTIVITY(24),
    CASH_LOCAL(25),
    NOTIFICATION_SETTINGS(26),
    SUPPORT(27),
    BITCOIN_PERFORMANCE(28),
    ELIGIBILITY_REFRESH(29),
    CASH_APP_CARD(31),
    CASH_SHOPPING(32),
    CASH_O_CLOCK(33),
    PAYCHECKS(34),
    CASH_GREEN(35),
    LYNX_INSTRUMENTS(36),
    CASH_CREDIT_SCORE(37),
    CLIENT_SYNC_CONFIG(38),
    ACCOUNT_SUSPENSION(39),
    BADGING(40),
    MONEYBOT(41),
    CARD_UI_CONFIG(42),
    RESTRICTIONS(43),
    ADVERSITY_BANNER(44),
    CASH_DDA(45),
    CASH_APP_TAG(46),
    RECIPIENT_SUGGESTIONS(47),
    EARNINGS(48),
    CASH_FOR_WORK_APPLET(49),
    CASH_LITE_CARD_UI_CONFIG(50);

    public static final SyncTopic$Companion$ADAPTER$1 ADAPTER;
    public static final RadioType.Companion Companion;
    public final int value;

    static {
        SyncTopic syncTopic = FRANKLIN_PRIMARY;
        Companion = new RadioType.Companion();
        ADAPTER = new SyncTopic$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SyncTopic.class), Syntax.PROTO_2, syncTopic);
    }

    SyncTopic(int i) {
        this.value = i;
    }

    public static final SyncTopic fromValue(int i) {
        Companion.getClass();
        return RadioType.Companion.m3852fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
