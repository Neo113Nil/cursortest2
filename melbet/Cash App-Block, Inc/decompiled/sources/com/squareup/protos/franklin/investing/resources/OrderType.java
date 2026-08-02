package com.squareup.protos.franklin.investing.resources;

import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum OrderType implements WireEnum {
    MARKET(1),
    MARKET_WHEN_TOUCHED(2);

    public final int value;
    public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
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
        return MARKET_WHEN_TOUCHED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
