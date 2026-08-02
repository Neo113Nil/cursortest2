package com.squareup.protos.cash.paychecks.api.v1;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PayerOperation implements WireEnum {
    PAYER_OPERATION_UNSPECIFIED(0),
    PAYER_OPERATION_ADD(1),
    PAYER_OPERATION_REMOVE(2);

    public static final PayerOperation$Companion$ADAPTER$1 ADAPTER;
    public static final Origin.Companion Companion;
    public final int value;

    static {
        PayerOperation payerOperation = PAYER_OPERATION_UNSPECIFIED;
        Companion = new Origin.Companion();
        ADAPTER = new PayerOperation$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PayerOperation.class), Syntax.PROTO_2, payerOperation);
    }

    PayerOperation(int i) {
        this.value = i;
    }

    public static final PayerOperation fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return PAYER_OPERATION_UNSPECIFIED;
        }
        if (i == 1) {
            return PAYER_OPERATION_ADD;
        }
        if (i != 2) {
            return null;
        }
        return PAYER_OPERATION_REMOVE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
