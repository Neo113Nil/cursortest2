package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum Platform implements WireEnum {
    PLATFORM_UNSPECIFIED(0),
    PLATFORM_ANDROID(1),
    PLATFORM_IOS(2);

    public static final Platform$Companion$ADAPTER$1 ADAPTER;
    public static final CardProduct.Companion Companion;
    public final int value;

    static {
        Platform platform = PLATFORM_UNSPECIFIED;
        Companion = new CardProduct.Companion(21);
        ADAPTER = new Platform$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Platform.class), Syntax.PROTO_2, platform);
    }

    Platform(int i) {
        this.value = i;
    }

    public static final Platform fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i == 1) {
            return PLATFORM_ANDROID;
        }
        if (i != 2) {
            return null;
        }
        return PLATFORM_IOS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
