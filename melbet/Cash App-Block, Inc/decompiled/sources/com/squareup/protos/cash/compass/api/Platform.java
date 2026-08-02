package com.squareup.protos.cash.compass.api;

import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum Platform implements WireEnum {
    PLATFORM_UNSPECIFIED(0),
    PLATFORM_IOS(1),
    PLATFORM_ANDROID(2);

    public static final Platform$Companion$ADAPTER$1 ADAPTER;
    public static final Channel.Companion Companion;
    public final int value;

    static {
        Platform platform = PLATFORM_UNSPECIFIED;
        Companion = new Channel.Companion();
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
            return PLATFORM_IOS;
        }
        if (i != 2) {
            return null;
        }
        return PLATFORM_ANDROID;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
