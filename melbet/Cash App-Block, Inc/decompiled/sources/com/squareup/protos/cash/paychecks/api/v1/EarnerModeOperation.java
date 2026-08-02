package com.squareup.protos.cash.paychecks.api.v1;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum EarnerModeOperation implements WireEnum {
    EARNER_MODE_OPERATION_UNSPECIFIED(0),
    EARNER_MODE_OPERATION_ENABLE(1),
    EARNER_MODE_OPERATION_DISABLE(2);

    public static final EarnerModeOperation$Companion$ADAPTER$1 ADAPTER;
    public static final RetailerType.Companion Companion;
    public final int value;

    static {
        EarnerModeOperation earnerModeOperation = EARNER_MODE_OPERATION_UNSPECIFIED;
        Companion = new RetailerType.Companion();
        ADAPTER = new EarnerModeOperation$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EarnerModeOperation.class), Syntax.PROTO_2, earnerModeOperation);
    }

    EarnerModeOperation(int i) {
        this.value = i;
    }

    public static final EarnerModeOperation fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return EARNER_MODE_OPERATION_UNSPECIFIED;
        }
        if (i == 1) {
            return EARNER_MODE_OPERATION_ENABLE;
        }
        if (i != 2) {
            return null;
        }
        return EARNER_MODE_OPERATION_DISABLE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
