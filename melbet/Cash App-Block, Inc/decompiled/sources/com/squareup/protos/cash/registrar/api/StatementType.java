package com.squareup.protos.cash.registrar.api;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public enum StatementType implements WireEnum {
    ACCOUNT_GENERAL_STATEMENT(1),
    SAVINGS_STATEMENT(2),
    PAY_OVER_TIME_STATEMENT(3),
    CARD_FEES_SUMMARY_STATEMENT(4);

    public final int value;
    public static final AsyncTimeout.Companion Companion = new AsyncTimeout.Companion();
    public static final StatementType$Companion$ADAPTER$1 ADAPTER = new StatementType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(StatementType.class), Syntax.PROTO_2, null);

    StatementType(int i) {
        this.value = i;
    }

    public static final StatementType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return ACCOUNT_GENERAL_STATEMENT;
        }
        if (i == 2) {
            return SAVINGS_STATEMENT;
        }
        if (i == 3) {
            return PAY_OVER_TIME_STATEMENT;
        }
        if (i != 4) {
            return null;
        }
        return CARD_FEES_SUMMARY_STATEMENT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
