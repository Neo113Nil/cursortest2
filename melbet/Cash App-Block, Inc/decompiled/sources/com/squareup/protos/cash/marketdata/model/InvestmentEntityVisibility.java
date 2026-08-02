package com.squareup.protos.cash.marketdata.model;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum InvestmentEntityVisibility implements WireEnum {
    VISIBLE(1),
    INVISIBLE(2),
    DECOMMISSIONED(3);

    public final int value;
    public static final Origin.Companion Companion = new Origin.Companion();
    public static final InvestmentEntityVisibility$Companion$ADAPTER$1 ADAPTER = new InvestmentEntityVisibility$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InvestmentEntityVisibility.class), Syntax.PROTO_2, null);

    InvestmentEntityVisibility(int i) {
        this.value = i;
    }

    public static final InvestmentEntityVisibility fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return VISIBLE;
        }
        if (i == 2) {
            return INVISIBLE;
        }
        if (i != 3) {
            return null;
        }
        return DECOMMISSIONED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
