package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum DecisionMethod implements WireEnum {
    MOBILE_REDIRECT(1),
    CASH_QR_CODE_SCAN(2),
    NATIVE_QR_CODE_SCAN(3),
    QR_CODE_PRESENT(4),
    INTERNAL_API(5),
    WEB_CHECKOUT(6),
    NATIVE_MOBILE_CASH_APP(7),
    ANDROID_ACTIVITY(8),
    WEB_LOGIN(9),
    PUBLIC_API(10);

    public final int value;
    public static final RadioType.Companion Companion = new RadioType.Companion();
    public static final DecisionMethod$Companion$ADAPTER$1 ADAPTER = new DecisionMethod$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DecisionMethod.class), Syntax.PROTO_2, null);

    DecisionMethod(int i) {
        this.value = i;
    }

    public static final DecisionMethod fromValue(int i) {
        Companion.getClass();
        return RadioType.Companion.m3856fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
