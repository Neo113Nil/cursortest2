package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum TargetApp implements WireEnum {
    TARGET_CASH_APP(1),
    TARGET_AFTERPAY(2);

    public final int value;
    public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
    public static final TargetApp$Companion$ADAPTER$1 ADAPTER = new TargetApp$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TargetApp.class), Syntax.PROTO_2, null);

    TargetApp(int i) {
        this.value = i;
    }

    public static final TargetApp fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return TARGET_CASH_APP;
        }
        if (i != 2) {
            return null;
        }
        return TARGET_AFTERPAY;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
