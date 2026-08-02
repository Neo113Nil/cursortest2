package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum TradingModel implements WireEnum {
    PRINCIPAL(1),
    AGENCY(2);

    public final int value;
    public static final FeeType.Companion Companion = new FeeType.Companion();
    public static final TradingModel$Companion$ADAPTER$1 ADAPTER = new TradingModel$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TradingModel.class), Syntax.PROTO_2, null);

    TradingModel(int i) {
        this.value = i;
    }

    public static final TradingModel fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return PRINCIPAL;
        }
        if (i != 2) {
            return null;
        }
        return AGENCY;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
