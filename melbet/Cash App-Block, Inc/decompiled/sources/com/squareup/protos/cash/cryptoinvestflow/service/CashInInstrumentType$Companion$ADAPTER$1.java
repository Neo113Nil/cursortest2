package com.squareup.protos.cash.cryptoinvestflow.service;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashInInstrumentType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashInInstrumentType.Companion.getClass();
        if (i == 0) {
            return CashInInstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CashInInstrumentType.DEBIT_CARD;
        }
        if (i != 2) {
            return null;
        }
        return CashInInstrumentType.BANK_ACCOUNT;
    }
}
