package com.squareup.protos.cash.cashinstrumentstore.api.v1.cards.common;

import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum Platform implements WireEnum {
    UNKNOWN(1),
    ANDROID(2),
    IOS(3),
    WEB(4);

    public final int value;
    public static final Alignment.Companion Companion = new Alignment.Companion();
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
