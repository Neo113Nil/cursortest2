package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum LendingProduct implements WireEnum {
    BORROW(1),
    BNPL(2),
    CF_BNPL(3),
    TAX_REFUND_ADVANCE(4),
    RETROACTIVE_FINANCING(5),
    SINGLE_USE_PAYMENT(6),
    PRE_PURCHASE_FINANCING(7),
    ROYALTY_ADVANCE(8);

    public final int value;
    public static final LinkResult.Companion Companion = new LinkResult.Companion();
    public static final LendingProduct$Companion$ADAPTER$1 ADAPTER = new LendingProduct$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LendingProduct.class), Syntax.PROTO_2, null);

    LendingProduct(int i) {
        this.value = i;
    }

    public static final LendingProduct fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 1:
                return BORROW;
            case 2:
                return BNPL;
            case 3:
                return CF_BNPL;
            case 4:
                return TAX_REFUND_ADVANCE;
            case 5:
                return RETROACTIVE_FINANCING;
            case 6:
                return SINGLE_USE_PAYMENT;
            case 7:
                return PRE_PURCHASE_FINANCING;
            case 8:
                return ROYALTY_ADVANCE;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
