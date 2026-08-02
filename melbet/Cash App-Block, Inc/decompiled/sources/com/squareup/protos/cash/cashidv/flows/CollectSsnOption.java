package com.squareup.protos.cash.cashidv.flows;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum CollectSsnOption implements WireEnum {
    DEFAULT(1),
    COLLECT_FULL_SSN(2),
    COLLECT_FULL_SSN_OR_COMPARE_SSN(3);

    public final int value;
    public static final WorkCookieJar Companion = new WorkCookieJar(29);
    public static final CollectSsnOption$Companion$ADAPTER$1 ADAPTER = new CollectSsnOption$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CollectSsnOption.class), Syntax.PROTO_2, null);

    CollectSsnOption(int i) {
        this.value = i;
    }

    public static final CollectSsnOption fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return DEFAULT;
        }
        if (i == 2) {
            return COLLECT_FULL_SSN;
        }
        if (i != 3) {
            return null;
        }
        return COLLECT_FULL_SSN_OR_COMPARE_SSN;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
