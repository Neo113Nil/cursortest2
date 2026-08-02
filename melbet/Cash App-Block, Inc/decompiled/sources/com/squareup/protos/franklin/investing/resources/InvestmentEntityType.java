package com.squareup.protos.franklin.investing.resources;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.Path;

/* loaded from: classes.dex */
public enum InvestmentEntityType implements WireEnum {
    CURRENCY(1),
    STOCK(2),
    ETF(3);

    public final int value;
    public static final Path.Companion Companion = new Path.Companion();
    public static final InvestmentEntityType$Companion$ADAPTER$1 ADAPTER = new InvestmentEntityType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InvestmentEntityType.class), Syntax.PROTO_2, null);

    InvestmentEntityType(int i) {
        this.value = i;
    }

    public static final InvestmentEntityType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return CURRENCY;
        }
        if (i == 2) {
            return STOCK;
        }
        if (i != 3) {
            return null;
        }
        return ETF;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
