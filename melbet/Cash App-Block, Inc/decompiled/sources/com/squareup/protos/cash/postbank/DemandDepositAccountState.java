package com.squareup.protos.cash.postbank;

import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum DemandDepositAccountState implements WireEnum {
    DDA_STATE_UNSPECIFIED(0),
    DDA_STATE_OPEN(1),
    DDA_STATE_CLOSED(2),
    DDA_STATE_LOCKED(3);

    public static final DemandDepositAccountState$Companion$ADAPTER$1 ADAPTER;
    public static final TaxEnvironment.Companion Companion;
    public final int value;

    static {
        DemandDepositAccountState demandDepositAccountState = DDA_STATE_UNSPECIFIED;
        Companion = new TaxEnvironment.Companion();
        ADAPTER = new DemandDepositAccountState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DemandDepositAccountState.class), Syntax.PROTO_2, demandDepositAccountState);
    }

    DemandDepositAccountState(int i) {
        this.value = i;
    }

    public static final DemandDepositAccountState fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return DDA_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return DDA_STATE_OPEN;
        }
        if (i == 2) {
            return DDA_STATE_CLOSED;
        }
        if (i != 3) {
            return null;
        }
        return DDA_STATE_LOCKED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
