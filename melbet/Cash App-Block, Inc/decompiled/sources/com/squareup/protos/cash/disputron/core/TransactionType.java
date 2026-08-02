package com.squareup.protos.cash.disputron.core;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum TransactionType implements WireEnum {
    UNKNOWN(0),
    CASH_CARD(1),
    PAY_WITH_CASH(2),
    P2P_PAYMENT(3),
    ACH_TRANSFER(4),
    ATO_GROUP(5),
    PAPER_MONEY_DEPOSIT(6),
    CASH_IN(7),
    CASH_OUT(8),
    BITCOIN(9),
    STABLECOIN(10),
    PAYOUT(11),
    P2P_STABLECOIN(12),
    AFTERPAY_PSP(13),
    MISSING_DEPOSIT(14);

    public static final TransactionType$Companion$ADAPTER$1 ADAPTER;
    public static final Action.Type.Companion Companion;
    public final int value;

    static {
        TransactionType transactionType = UNKNOWN;
        Companion = new Action.Type.Companion();
        ADAPTER = new TransactionType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TransactionType.class), Syntax.PROTO_3, transactionType);
    }

    TransactionType(int i) {
        this.value = i;
    }

    public static final TransactionType fromValue(int i) {
        Companion.getClass();
        return Action.Type.Companion.m3865fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
