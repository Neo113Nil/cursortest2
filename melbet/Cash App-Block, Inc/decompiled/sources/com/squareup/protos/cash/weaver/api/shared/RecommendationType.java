package com.squareup.protos.cash.weaver.api.shared;

import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum RecommendationType implements WireEnum {
    DO_NOT_USE_RECOMMENDATION_TYPE(0),
    CUSTOMER_AFTERPAY_CATEGORY(2),
    CONTACT(3),
    BOOST_CAROUSEL(4),
    OFFERS_TAB_MERCHANT(10),
    APPLETS(11),
    DISCOVER_MORE_IN_CASHAPP_SECTION(12),
    DISCOVER_YOUR_NETWORK_SECTION_GROUP(14),
    AP_PERSONALIZATION_RECOMMENDED_FOR_YOU(17),
    AP_PERSONALIZATION_GIFT_CARDS(18),
    STAGING_TEST_TYPE(20),
    AP_PERSONALIZATION_RECOMMENDED_STORES_WITHIN_CATEGORY(21),
    LOAD_TEST_TYPE(22),
    FAMILY_BLOCKLIST_NULL_STATE(24),
    CARD_NUX(25),
    PRODUCT_DISCOVERY_CASH_IN_SUCCESS(26),
    LOCAL_BRAND(28),
    P2P_NULL_STATE(31),
    AP_STORE_SEMANTIC_SEARCH(32),
    PRODUCT_DISCOVERY_RECEIPTS(33),
    COURIER_MARKETING(34),
    AP_APPLET_PERSONALIZATION(36),
    DISCOVER_GLOBAL_SEARCH_SECTIONS(37),
    PROMOTER_MESSAGING(38),
    EARNER_UPSELL(39),
    GENERIC_RECOMMENDATION(9999);

    public static final RecommendationType$Companion$ADAPTER$1 ADAPTER;
    public static final TextSize.Companion Companion;
    public final int value;

    static {
        RecommendationType recommendationType = DO_NOT_USE_RECOMMENDATION_TYPE;
        Companion = new TextSize.Companion();
        ADAPTER = new RecommendationType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RecommendationType.class), Syntax.PROTO_2, recommendationType);
    }

    RecommendationType(int i) {
        this.value = i;
    }

    public static final RecommendationType fromValue(int i) {
        Companion.getClass();
        return TextSize.Companion.m3921fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
