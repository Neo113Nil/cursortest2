package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum TransactionOrchestrator implements WireEnum {
    TRANSACTION_ORCHESTRATOR_UNSPECIFIED(0),
    MONEY_MOVER(1),
    CROW(2),
    INVEST_CRYPTO_ORCHESTRATOR(3);

    public static final TransactionOrchestrator$Companion$ADAPTER$1 ADAPTER;
    public static final ContactAliasType.Companion Companion;
    public final int value;

    static {
        TransactionOrchestrator transactionOrchestrator = TRANSACTION_ORCHESTRATOR_UNSPECIFIED;
        Companion = new ContactAliasType.Companion();
        ADAPTER = new TransactionOrchestrator$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TransactionOrchestrator.class), Syntax.PROTO_2, transactionOrchestrator);
    }

    TransactionOrchestrator(int i) {
        this.value = i;
    }

    public static final TransactionOrchestrator fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return TRANSACTION_ORCHESTRATOR_UNSPECIFIED;
        }
        if (i == 1) {
            return MONEY_MOVER;
        }
        if (i == 2) {
            return CROW;
        }
        if (i != 3) {
            return null;
        }
        return INVEST_CRYPTO_ORCHESTRATOR;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
