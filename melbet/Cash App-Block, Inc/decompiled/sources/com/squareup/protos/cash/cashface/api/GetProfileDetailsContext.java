package com.squareup.protos.cash.cashface.api;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum GetProfileDetailsContext implements WireEnum {
    UNKNOWN(1),
    PAYMENT_FLOW(2),
    BTC_PAYMENT_FLOW(3),
    PROFILE_DIRECTORY(4),
    LAUNCHER(5),
    ACTIVITY_PAYMENT_REQUEST_SENDER(6),
    ACTIVITY_PAYMENT_REQUEST_RECEIVER(7),
    ACTIVITY_PAYMENT_PUSH_SENDER(8),
    ACTIVITY_PAYMENT_PUSH_RECEIVER(9),
    ACTIVITY_OTHER(10),
    INVEST_PAYMENT_FLOW(11),
    GIFT_CARD(12),
    GLOBAL_SEARCH(13),
    POOLS(14);

    public final int value;
    public static final WorkCookieJar Companion = new WorkCookieJar(25);
    public static final GetProfileDetailsContext$Companion$ADAPTER$1 ADAPTER = new GetProfileDetailsContext$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(GetProfileDetailsContext.class), Syntax.PROTO_2, null);

    GetProfileDetailsContext(int i) {
        this.value = i;
    }

    public static final GetProfileDetailsContext fromValue(int i) {
        Companion.getClass();
        return WorkCookieJar.m3799fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
