package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum CashInInstrumentType implements WireEnum {
    INSTRUMENT_TYPE_UNSPECIFIED(0),
    DEBIT_CARD(1),
    BANK_ACCOUNT(2);

    public static final CashInInstrumentType$Companion$ADAPTER$1 ADAPTER;
    public static final SliceStatus.Companion Companion;
    public final int value;

    static {
        CashInInstrumentType cashInInstrumentType = INSTRUMENT_TYPE_UNSPECIFIED;
        Companion = new SliceStatus.Companion();
        ADAPTER = new CashInInstrumentType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CashInInstrumentType.class), Syntax.PROTO_2, cashInInstrumentType);
    }

    CashInInstrumentType(int i) {
        this.value = i;
    }

    public static final CashInInstrumentType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return INSTRUMENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return DEBIT_CARD;
        }
        if (i != 2) {
            return null;
        }
        return BANK_ACCOUNT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
