package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.DisputedTransactionRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class DisputedTransactionRenderData$DisputedCapture$DisputeCase$WithdrawalReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.WithdrawalReason.Companion.getClass();
        if (i == 1) {
            return DisputedTransactionRenderData.DisputedCapture.DisputeCase.WithdrawalReason.AGENT_REMOVED_TRANSACTION;
        }
        if (i == 2) {
            return DisputedTransactionRenderData.DisputedCapture.DisputeCase.WithdrawalReason.SKIPPED_IN_PARTIAL_DISPUTE;
        }
        if (i != 3) {
            return null;
        }
        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.WithdrawalReason.CUSTOMER_REQUESTED_WITHDRAWAL;
    }
}
