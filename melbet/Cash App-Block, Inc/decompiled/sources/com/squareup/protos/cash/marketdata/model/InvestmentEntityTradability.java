package com.squareup.protos.cash.marketdata.model;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum InvestmentEntityTradability implements WireEnum {
    UNTRADABLE(1),
    TRADABLE(2),
    SELLABLE(3);

    public final int value;
    public static final RetailerType.Companion Companion = new RetailerType.Companion();
    public static final InvestmentEntityTradability$Companion$ADAPTER$1 ADAPTER = new InvestmentEntityTradability$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InvestmentEntityTradability.class), Syntax.PROTO_2, null);

    InvestmentEntityTradability(int i) {
        this.value = i;
    }

    public static final InvestmentEntityTradability fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return UNTRADABLE;
        }
        if (i == 2) {
            return TRADABLE;
        }
        if (i != 3) {
            return null;
        }
        return SELLABLE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
