package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum OrderState implements WireEnum {
    QUOTED(1),
    ABANDONED(2),
    PLACED(3),
    FILLED(4),
    CANCELED(5),
    REJECTED(6),
    EXPIRED(7),
    NEW(8);

    public final int value;
    public static final FeeType.Companion Companion = new FeeType.Companion();
    public static final OrderState$Companion$ADAPTER$1 ADAPTER = new OrderState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderState.class), Syntax.PROTO_2, null);

    OrderState(int i) {
        this.value = i;
    }

    public static final OrderState fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 1:
                return QUOTED;
            case 2:
                return ABANDONED;
            case 3:
                return PLACED;
            case 4:
                return FILLED;
            case 5:
                return CANCELED;
            case 6:
                return REJECTED;
            case 7:
                return EXPIRED;
            case 8:
                return NEW;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
