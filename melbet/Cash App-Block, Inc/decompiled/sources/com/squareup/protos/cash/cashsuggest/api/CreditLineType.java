package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum CreditLineType implements WireEnum {
    INN(1),
    OON(2),
    ALL(3),
    RETRO(4),
    APCAC(5);

    public final int value;
    public static final Channel.Companion Companion = new Channel.Companion();
    public static final CreditLineType$Companion$ADAPTER$1 ADAPTER = new CreditLineType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CreditLineType.class), Syntax.PROTO_2, null);

    CreditLineType(int i) {
        this.value = i;
    }

    public static final CreditLineType fromValue(int i) {
        Companion.getClass();
        return Channel.Companion.m3870fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
