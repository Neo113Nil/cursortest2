package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.Trigger;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum DigitalWalletToken$Issuer implements WireEnum {
    APPLE_PAY(1),
    ANDROID_PAY(2),
    UNKNOWN_ISSUER(3);

    public final int value;
    public static final Trigger.Companion Companion = new Trigger.Companion();
    public static final DigitalWalletToken$Issuer$Companion$ADAPTER$1 ADAPTER = new DigitalWalletToken$Issuer$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DigitalWalletToken$Issuer.class), Syntax.PROTO_2, null);

    DigitalWalletToken$Issuer(int i) {
        this.value = i;
    }

    public static final DigitalWalletToken$Issuer fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return APPLE_PAY;
        }
        if (i == 2) {
            return ANDROID_PAY;
        }
        if (i != 3) {
            return null;
        }
        return UNKNOWN_ISSUER;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
