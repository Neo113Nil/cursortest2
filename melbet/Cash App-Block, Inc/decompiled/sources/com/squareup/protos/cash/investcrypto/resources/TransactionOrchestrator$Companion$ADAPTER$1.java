package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TransactionOrchestrator$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TransactionOrchestrator.Companion.getClass();
        if (i == 0) {
            return TransactionOrchestrator.TRANSACTION_ORCHESTRATOR_UNSPECIFIED;
        }
        if (i == 1) {
            return TransactionOrchestrator.MONEY_MOVER;
        }
        if (i == 2) {
            return TransactionOrchestrator.CROW;
        }
        if (i != 3) {
            return null;
        }
        return TransactionOrchestrator.INVEST_CRYPTO_ORCHESTRATOR;
    }
}
