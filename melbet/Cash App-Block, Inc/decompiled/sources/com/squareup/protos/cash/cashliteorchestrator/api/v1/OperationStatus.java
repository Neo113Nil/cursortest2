package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum OperationStatus implements WireEnum {
    OPERATION_STATUS_UNSPECIFIED(0),
    OPERATION_STATUS_PREPARED(1),
    OPERATION_STATUS_SUBMITTED(2),
    OPERATION_STATUS_CONFIRMED(3),
    OPERATION_STATUS_COMPLETE(4),
    OPERATION_STATUS_EXPIRED(5),
    OPERATION_STATUS_FAILED(6),
    OPERATION_STATUS_OBSERVED(7);

    public static final OperationStatus$Companion$ADAPTER$1 ADAPTER;
    public static final Action.Type.Companion Companion;
    public final int value;

    static {
        OperationStatus operationStatus = OPERATION_STATUS_UNSPECIFIED;
        Companion = new Action.Type.Companion();
        ADAPTER = new OperationStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OperationStatus.class), Syntax.PROTO_2, operationStatus);
    }

    OperationStatus(int i) {
        this.value = i;
    }

    public static final OperationStatus fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return OPERATION_STATUS_UNSPECIFIED;
            case 1:
                return OPERATION_STATUS_PREPARED;
            case 2:
                return OPERATION_STATUS_SUBMITTED;
            case 3:
                return OPERATION_STATUS_CONFIRMED;
            case 4:
                return OPERATION_STATUS_COMPLETE;
            case 5:
                return OPERATION_STATUS_EXPIRED;
            case 6:
                return OPERATION_STATUS_FAILED;
            case 7:
                return OPERATION_STATUS_OBSERVED;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
