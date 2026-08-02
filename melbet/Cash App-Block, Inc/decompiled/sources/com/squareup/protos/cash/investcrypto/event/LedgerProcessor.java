package com.squareup.protos.cash.investcrypto.event;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum LedgerProcessor implements WireEnum {
    MONEY_MOVER(2),
    BANKLIN(3);

    public final int value;
    public static final Origin.Companion Companion = new Origin.Companion();
    public static final LedgerProcessor$Companion$ADAPTER$1 ADAPTER = new LedgerProcessor$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LedgerProcessor.class), Syntax.PROTO_2, null);

    LedgerProcessor(int i) {
        this.value = i;
    }

    public static final LedgerProcessor fromValue(int i) {
        Companion.getClass();
        if (i == 2) {
            return MONEY_MOVER;
        }
        if (i != 3) {
            return null;
        }
        return BANKLIN;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
