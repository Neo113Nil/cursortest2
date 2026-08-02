package com.squareup.protos.franklin.investing.resources;

import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum OrderSide implements WireEnum {
    BUY(1),
    SELL(2),
    SELL_ALL(3);

    public final int value;
    public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
    public static final OrderSide$Companion$ADAPTER$1 ADAPTER = new OrderSide$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderSide.class), Syntax.PROTO_2, null);

    OrderSide(int i) {
        this.value = i;
    }

    public static final OrderSide fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return BUY;
        }
        if (i == 2) {
            return SELL;
        }
        if (i != 3) {
            return null;
        }
        return SELL_ALL;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
