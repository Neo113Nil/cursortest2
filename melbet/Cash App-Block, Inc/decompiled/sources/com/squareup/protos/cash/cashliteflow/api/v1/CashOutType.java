package com.squareup.protos.cash.cashliteflow.api.v1;

import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum CashOutType implements WireEnum {
    CASH_OUT_TYPE_UNSPECIFIED(0),
    CASH_OUT_TYPE_CLABE(1),
    CASH_OUT_TYPE_ACH(2);

    public static final CashOutType$Companion$ADAPTER$1 ADAPTER;
    public static final ImageLayout.Companion Companion;
    public final int value;

    static {
        CashOutType cashOutType = CASH_OUT_TYPE_UNSPECIFIED;
        Companion = new ImageLayout.Companion();
        ADAPTER = new CashOutType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CashOutType.class), Syntax.PROTO_2, cashOutType);
    }

    CashOutType(int i) {
        this.value = i;
    }

    public static final CashOutType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return CASH_OUT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CASH_OUT_TYPE_CLABE;
        }
        if (i != 2) {
            return null;
        }
        return CASH_OUT_TYPE_ACH;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
