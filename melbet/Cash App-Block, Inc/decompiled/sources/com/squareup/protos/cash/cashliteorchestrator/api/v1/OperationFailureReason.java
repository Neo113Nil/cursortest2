package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum OperationFailureReason implements WireEnum {
    OPERATION_FAILURE_REASON_UNSPECIFIED(0),
    OPERATION_FAILURE_REASON_USEROP_REVERTED(1),
    OPERATION_FAILURE_REASON_RELAY_TIMEOUT(2),
    OPERATION_FAILURE_REASON_ATTESTATION_FAILED(3),
    OPERATION_FAILURE_REASON_BRIDGE_UNAVAILABLE(4),
    OPERATION_FAILURE_REASON_EXPIRED(5),
    OPERATION_FAILURE_REASON_USEROP_TIMEOUT(6),
    OPERATION_FAILURE_REASON_RELAY_REVERTED(7),
    OPERATION_FAILURE_REASON_RELAY_SUBMISSION_FAILED(8),
    OPERATION_FAILURE_REASON_SWAP_FAILED(9),
    OPERATION_FAILURE_REASON_SWAP_REFUNDED(10);

    public static final OperationFailureReason$Companion$ADAPTER$1 ADAPTER;
    public static final ImageLayout.Companion Companion;
    public final int value;

    static {
        OperationFailureReason operationFailureReason = OPERATION_FAILURE_REASON_UNSPECIFIED;
        Companion = new ImageLayout.Companion();
        ADAPTER = new OperationFailureReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OperationFailureReason.class), Syntax.PROTO_2, operationFailureReason);
    }

    OperationFailureReason(int i) {
        this.value = i;
    }

    public static final OperationFailureReason fromValue(int i) {
        Companion.getClass();
        return ImageLayout.Companion.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
