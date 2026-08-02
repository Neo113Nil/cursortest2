package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.AddCustomersToPoolResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AddCustomersToPoolResponse$FailureReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AddCustomersToPoolResponse.FailureReason.Companion.getClass();
        switch (i) {
            case 0:
                return AddCustomersToPoolResponse.FailureReason.FAILURE_REASON_UNSPECIFIED;
            case 1:
                return AddCustomersToPoolResponse.FailureReason.FAILURE_REASON_FORBIDDEN_POOL_OWNERSHIP;
            case 2:
                return AddCustomersToPoolResponse.FailureReason.FAILURE_REASON_MAX_CAPACITY_REACHED;
            case 3:
                return AddCustomersToPoolResponse.FailureReason.FAILURE_REASON_CLOSED_POOL;
            case 4:
                return AddCustomersToPoolResponse.FailureReason.FAILURE_REASON_INELIGIBLE_CUSTOMER;
            case 5:
                return AddCustomersToPoolResponse.FailureReason.FAILURE_REASON_COUNTERPARTY_BLOCKING;
            case 6:
                return AddCustomersToPoolResponse.FailureReason.FAILURE_REASON_RATE_LIMIT_EXCEEDED;
            default:
                return null;
        }
    }
}
