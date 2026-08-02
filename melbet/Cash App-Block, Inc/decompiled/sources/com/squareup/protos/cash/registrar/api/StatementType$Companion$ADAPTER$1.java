package com.squareup.protos.cash.registrar.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class StatementType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        StatementType.Companion.getClass();
        if (i == 1) {
            return StatementType.ACCOUNT_GENERAL_STATEMENT;
        }
        if (i == 2) {
            return StatementType.SAVINGS_STATEMENT;
        }
        if (i == 3) {
            return StatementType.PAY_OVER_TIME_STATEMENT;
        }
        if (i != 4) {
            return null;
        }
        return StatementType.CARD_FEES_SUMMARY_STATEMENT;
    }
}
