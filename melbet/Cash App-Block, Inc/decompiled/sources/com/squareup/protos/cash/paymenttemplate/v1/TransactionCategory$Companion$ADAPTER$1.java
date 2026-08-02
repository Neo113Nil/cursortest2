package com.squareup.protos.cash.paymenttemplate.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TransactionCategory$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TransactionCategory.Companion.getClass();
        if (i == 0) {
            return TransactionCategory.TRANSACTION_CATEGORY_UNSPECIFIED;
        }
        if (i == 1) {
            return TransactionCategory.TRANSACTION_CATEGORY_FUNDS_TRANSFER;
        }
        if (i != 2) {
            return null;
        }
        return TransactionCategory.TRANSACTION_CATEGORY_GOODS_AND_SERVICES;
    }
}
