package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.Trigger;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum SignInType implements WireEnum {
    UNKNOWN_SIGN_IN_TYPE(0),
    SIGN_UP(1),
    LOGIN(2);

    public static final SignInType$Companion$ADAPTER$1 ADAPTER;
    public static final Trigger.Companion Companion;
    public final int value;

    static {
        SignInType signInType = UNKNOWN_SIGN_IN_TYPE;
        Companion = new Trigger.Companion();
        ADAPTER = new SignInType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SignInType.class), Syntax.PROTO_2, signInType);
    }

    SignInType(int i) {
        this.value = i;
    }

    public static final SignInType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return UNKNOWN_SIGN_IN_TYPE;
        }
        if (i == 1) {
            return SIGN_UP;
        }
        if (i != 2) {
            return null;
        }
        return LOGIN;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
