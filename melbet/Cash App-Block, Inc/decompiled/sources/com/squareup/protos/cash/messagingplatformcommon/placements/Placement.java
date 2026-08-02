package com.squareup.protos.cash.messagingplatformcommon.placements;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public enum Placement implements WireEnum {
    PLACEMENT_UNSPECIFIED(0),
    TEST_PLACEMENT(1),
    BOOST_CAROUSEL(2),
    BOTTOM_NAV_MONEY_TAB(3),
    BOTTOM_NAV_ACTIVITY_TAB(4),
    BOTTOM_NAV_DISCOVER_TAB(5),
    BOTTOM_NAV_WALLET_TAB(6),
    TOOLBAR_NAV_QR_TAB(7),
    TOOLBAR_NAV_GLOBE_TAB(8),
    TOOLBAR_NAV_SETTING_TAB(9),
    TOOLBAR_NAV_PROFILE_TAB(10),
    RECIPIENT_SELECTOR_PERSONALIZE_PAYMENT_BUTTON(11),
    TOOLBAR_NAV_DISCOVER_TAB(12),
    BALANCE_APPLET_TILE(13),
    KEYPAD_TAB_PAY_BUTTON(14),
    KEYPAD_TAB_TAP_TO_PAY_BUTTON(15),
    KEYPAD_TAB_REQUEST_BUTTON(16),
    ACCOUNT_SETTINGS_CASHTAG_DROPDOWN(17),
    KEYPAD_TAB_POOL_BUTTON(18),
    KEYPAD_TAB_QR_BUTTON(34),
    KEYPAD_TAB_NEARBY_BUTTON(42),
    MONEYBOT_SAVED_TO_MEMORY_LABEL(33),
    CARD_HOME_DESIGN_UPSELL(19),
    DISCOVER_HERO_SECTION(20),
    MONEYBOT_CHAT(21),
    MANUAL_SAVINGS_CASH_IN_SUCCESS(22),
    MANUAL_CASH_IN_SUCCESS(23),
    MANUAL_CASH_IN_FAILURE(24),
    CASH_CARD_TRANSACTION_FAILURE_RECEIPT(25),
    ATM_WITHDRAWAL_SUCCESS_RECEIPT(26),
    PAPER_MONEY_DEPOSIT_SUCCESS_RECEIPT(27),
    SAVINGS_INTEREST_PAYMENT_SUCCESS_RECEIPT(28),
    P2P_SUCCESS_RECEIPT(43),
    FAMILY_APPLET(29),
    SPONSOR_APPROVAL_FLOW(30),
    SPONSOR_ALLOWANCES_COMPLETION_FLOW(31),
    SEND_P2P_FIAT_SUCCESS(32),
    REQUEST_P2P_FIAT_SUCCESS(44),
    MONEY_TAB(35),
    CARD_APPLET(36),
    PAYMENT_PAD_TAB(37),
    INVESTING_APPLET(38),
    ACTIVITY_TAB(39),
    BITCOIN_APPLET(40),
    PROFILE_SCREEN(41);

    public static final Placement$Companion$ADAPTER$1 ADAPTER;
    public static final ResourceFileSystem.Companion Companion;
    public final int value;

    static {
        Placement placement = PLACEMENT_UNSPECIFIED;
        Companion = new ResourceFileSystem.Companion();
        ADAPTER = new Placement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Placement.class), Syntax.PROTO_2, placement);
    }

    Placement(int i) {
        this.value = i;
    }

    public static final Placement fromValue(int i) {
        Companion.getClass();
        return ResourceFileSystem.Companion.m4352fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
