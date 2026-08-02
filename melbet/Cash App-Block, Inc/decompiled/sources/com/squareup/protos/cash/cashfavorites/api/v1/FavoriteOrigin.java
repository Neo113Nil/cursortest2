package com.squareup.protos.cash.cashfavorites.api.v1;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum FavoriteOrigin implements WireEnum {
    FAVORITE_ORIGIN_UNSPECIFIED(0),
    FAVORITE_ORIGIN_CUSTOMER_PROFILE(1),
    FAVORITE_ORIGIN_BLOCKED(2),
    FAVORITE_ORIGIN_FAVORITES_MANAGEMENT(3),
    FAVORITE_ORIGIN_BUSINESS_PROFILE(4);

    public static final FavoriteOrigin$Companion$ADAPTER$1 ADAPTER;
    public static final WorkCookieJar Companion;
    public final int value;

    static {
        FavoriteOrigin favoriteOrigin = FAVORITE_ORIGIN_UNSPECIFIED;
        Companion = new WorkCookieJar(27);
        ADAPTER = new FavoriteOrigin$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FavoriteOrigin.class), Syntax.PROTO_2, favoriteOrigin);
    }

    FavoriteOrigin(int i) {
        this.value = i;
    }

    public static final FavoriteOrigin fromValue(int i) {
        Companion.getClass();
        return WorkCookieJar.m3801fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
