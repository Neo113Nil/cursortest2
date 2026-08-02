package com.squareup.protos.franklin.investing.resources;

import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum StatementType implements WireEnum {
    TRADE_CONFIRM(3),
    STOCK_TAX_FORM(4),
    STOCK_MONTHLY_STATEMENT(5),
    BTC_TAX_FORM(6),
    BORROW(7),
    LENDING(8);

    public static final LinkResult.Companion Companion = new LinkResult.Companion();
    public final int value;

    static {
        new StatementType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(StatementType.class), Syntax.PROTO_2, null);
    }

    StatementType(int i) {
        this.value = i;
    }

    public static final StatementType fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 3:
                return TRADE_CONFIRM;
            case 4:
                return STOCK_TAX_FORM;
            case 5:
                return STOCK_MONTHLY_STATEMENT;
            case 6:
                return BTC_TAX_FORM;
            case 7:
                return BORROW;
            case 8:
                return LENDING;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
