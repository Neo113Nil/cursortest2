package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum OrderType implements WireEnum {
    MARKET(1),
    CUSTOM(2);

    public final int value;
    public static final RetailerType.Companion Companion = new RetailerType.Companion();
    public static final OrderType$Companion$ADAPTER$1 ADAPTER = new OrderType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderType.class), Syntax.PROTO_2, null);

    OrderType(int i) {
        this.value = i;
    }

    public static final OrderType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return MARKET;
        }
        if (i != 2) {
            return null;
        }
        return CUSTOM;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
