package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class OperationStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OperationStatus.Companion.getClass();
        switch (i) {
            case 0:
                return OperationStatus.OPERATION_STATUS_UNSPECIFIED;
            case 1:
                return OperationStatus.OPERATION_STATUS_PREPARED;
            case 2:
                return OperationStatus.OPERATION_STATUS_SUBMITTED;
            case 3:
                return OperationStatus.OPERATION_STATUS_CONFIRMED;
            case 4:
                return OperationStatus.OPERATION_STATUS_COMPLETE;
            case 5:
                return OperationStatus.OPERATION_STATUS_EXPIRED;
            case 6:
                return OperationStatus.OPERATION_STATUS_FAILED;
            case 7:
                return OperationStatus.OPERATION_STATUS_OBSERVED;
            default:
                return null;
        }
    }
}
