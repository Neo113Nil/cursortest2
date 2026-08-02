package com.squareup.protos.franklin.investing.resources;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class StatementType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        StatementType.Companion.getClass();
        switch (i) {
            case 3:
                return StatementType.TRADE_CONFIRM;
            case 4:
                return StatementType.STOCK_TAX_FORM;
            case 5:
                return StatementType.STOCK_MONTHLY_STATEMENT;
            case 6:
                return StatementType.BTC_TAX_FORM;
            case 7:
                return StatementType.BORROW;
            case 8:
                return StatementType.LENDING;
            default:
                return null;
        }
    }
}
