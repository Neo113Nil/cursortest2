package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum Feature implements WireEnum {
    UNKNOWN_FEATURE(0),
    AFTERPAY_APP(2),
    CASH_APP_PAY_OFFER(3),
    CASH_CARD_BOOST(4),
    SQ_LOYALTY_PROGRAM(5),
    SQ_COUPON(6),
    AFTERPAY_APP_SUP(7),
    AFTERPAY_APP_IN_STORE(9),
    AFTERPAY_APP_GIFT_CARD(10),
    CASH_AP_INN(12),
    CASH_AP_OON(13),
    CASH_APP_PAY_LATER(1),
    CASH_APP_SUP(8),
    CASH_APP_PAY(11);

    public static final Feature$Companion$ADAPTER$1 ADAPTER;
    public static final Channel.Companion Companion;
    public final int value;

    static {
        Feature feature = UNKNOWN_FEATURE;
        Companion = new Channel.Companion();
        ADAPTER = new Feature$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Feature.class), Syntax.PROTO_2, feature);
    }

    Feature(int i) {
        this.value = i;
    }

    public static final Feature fromValue(int i) {
        Companion.getClass();
        return Channel.Companion.m3869fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
