package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Instrument;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Instrument$InstrumentType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Instrument.InstrumentType.Companion.getClass();
        if (i == 1) {
            return Instrument.InstrumentType.CREDIT_CARD;
        }
        if (i == 2) {
            return Instrument.InstrumentType.DEBIT_CARD;
        }
        if (i == 3) {
            return Instrument.InstrumentType.BANK_ACCOUNT;
        }
        if (i != 4) {
            return null;
        }
        return Instrument.InstrumentType.STORED_VALUE;
    }
}
