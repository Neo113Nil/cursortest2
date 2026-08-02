package com.squareup.protos.cash.paymenttemplate.v1;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum TransactionCategory implements WireEnum {
    TRANSACTION_CATEGORY_UNSPECIFIED(0),
    TRANSACTION_CATEGORY_FUNDS_TRANSFER(1),
    TRANSACTION_CATEGORY_GOODS_AND_SERVICES(2);

    public static final TransactionCategory$Companion$ADAPTER$1 ADAPTER;
    public static final RetailerType.Companion Companion;
    public final int value;

    static {
        TransactionCategory transactionCategory = TRANSACTION_CATEGORY_UNSPECIFIED;
        Companion = new RetailerType.Companion();
        ADAPTER = new TransactionCategory$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TransactionCategory.class), Syntax.PROTO_2, transactionCategory);
    }

    TransactionCategory(int i) {
        this.value = i;
    }

    public static final TransactionCategory fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return TRANSACTION_CATEGORY_UNSPECIFIED;
        }
        if (i == 1) {
            return TRANSACTION_CATEGORY_FUNDS_TRANSFER;
        }
        if (i != 2) {
            return null;
        }
        return TRANSACTION_CATEGORY_GOODS_AND_SERVICES;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
