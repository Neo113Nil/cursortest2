package com.squareup.protos.cash.appthemes;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum AppThemeName implements WireEnum {
    UNKNOWN_NAME(0),
    PINK(1),
    GLITTER(2),
    TORTOISE(3),
    MOOD(4),
    BRAT(5);

    public static final AppThemeName$Companion$ADAPTER$1 ADAPTER;
    public static final CardProduct.Companion Companion;
    public final int value;

    static {
        AppThemeName appThemeName = UNKNOWN_NAME;
        Companion = new CardProduct.Companion(17);
        ADAPTER = new AppThemeName$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AppThemeName.class), Syntax.PROTO_2, appThemeName);
    }

    AppThemeName(int i) {
        this.value = i;
    }

    public static final AppThemeName fromValue(int i) {
        Companion.getClass();
        return CardProduct.Companion.m3834fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
