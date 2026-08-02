package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum IconId implements WireEnum {
    CARD_BASIC(1),
    TIME_STOPWATCH(2),
    TIME_HOURGLASS(3),
    LIMITS_FILL(4),
    DISCOUNT_MINIMUM(5),
    CASH_APP_PAY(6),
    TIME(7),
    CASH_APP_CUSTOMER(8),
    CARD_NEW(9);

    public final int value;
    public static final ActionType.Companion Companion = new ActionType.Companion();
    public static final IconId$Companion$ADAPTER$1 ADAPTER = new IconId$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(IconId.class), Syntax.PROTO_2, null);

    IconId(int i) {
        this.value = i;
    }

    public static final IconId fromValue(int i) {
        Companion.getClass();
        return ActionType.Companion.m3934fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
