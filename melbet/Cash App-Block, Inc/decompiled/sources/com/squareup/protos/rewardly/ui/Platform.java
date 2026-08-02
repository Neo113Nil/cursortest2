package com.squareup.protos.rewardly.ui;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public enum Platform implements WireEnum {
    UNKNOWN(1),
    ANDROID(2),
    IOS(3),
    WEB(4);

    public final int value;
    public static final POPMatchingFactory Companion = new POPMatchingFactory(3);
    public static final Platform$Companion$ADAPTER$1 ADAPTER = new Platform$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Platform.class), Syntax.PROTO_2, null);

    Platform(int i) {
        this.value = i;
    }

    public static final Platform fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return UNKNOWN;
        }
        if (i == 2) {
            return ANDROID;
        }
        if (i == 3) {
            return IOS;
        }
        if (i != 4) {
            return null;
        }
        return WEB;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
