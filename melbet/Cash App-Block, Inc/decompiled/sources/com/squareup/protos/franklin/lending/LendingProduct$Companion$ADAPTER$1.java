package com.squareup.protos.franklin.lending;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LendingProduct$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LendingProduct.Companion.getClass();
        switch (i) {
            case 1:
                return LendingProduct.BORROW;
            case 2:
                return LendingProduct.BNPL;
            case 3:
                return LendingProduct.CF_BNPL;
            case 4:
                return LendingProduct.TAX_REFUND_ADVANCE;
            case 5:
                return LendingProduct.RETROACTIVE_FINANCING;
            case 6:
                return LendingProduct.SINGLE_USE_PAYMENT;
            case 7:
                return LendingProduct.PRE_PURCHASE_FINANCING;
            case 8:
                return LendingProduct.ROYALTY_ADVANCE;
            default:
                return null;
        }
    }
}
