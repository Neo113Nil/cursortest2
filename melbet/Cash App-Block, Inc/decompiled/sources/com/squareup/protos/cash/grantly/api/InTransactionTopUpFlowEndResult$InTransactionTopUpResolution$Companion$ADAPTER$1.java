package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.InTransactionTopUpFlowEndResult;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class InTransactionTopUpFlowEndResult$InTransactionTopUpResolution$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InTransactionTopUpFlowEndResult.InTransactionTopUpResolution.Companion.getClass();
        if (i == 1) {
            return InTransactionTopUpFlowEndResult.InTransactionTopUpResolution.SKIPPED;
        }
        if (i == 2) {
            return InTransactionTopUpFlowEndResult.InTransactionTopUpResolution.CONSUMER_INELIGIBLE;
        }
        if (i == 3) {
            return InTransactionTopUpFlowEndResult.InTransactionTopUpResolution.CONSUMER_APPROVED;
        }
        if (i != 4) {
            return null;
        }
        return InTransactionTopUpFlowEndResult.InTransactionTopUpResolution.CONSUMER_DECLINED;
    }
}
