package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum OrderSide implements WireEnum {
    BUY(1),
    SELL(2);

    public final int value;
    public static final SliceStatus.Companion Companion = new SliceStatus.Companion();
    public static final OrderSide$Companion$ADAPTER$1 ADAPTER = new OrderSide$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderSide.class), Syntax.PROTO_2, null);

    OrderSide(int i) {
        this.value = i;
    }

    public static final OrderSide fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return BUY;
        }
        if (i != 2) {
            return null;
        }
        return SELL;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
