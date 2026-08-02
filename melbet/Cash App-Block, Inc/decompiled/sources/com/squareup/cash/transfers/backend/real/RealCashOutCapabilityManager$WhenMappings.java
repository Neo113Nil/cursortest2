package com.squareup.cash.transfers.backend.real;

import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class RealCashOutCapabilityManager$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[InstrumentType.values().length];
        try {
            iArr[InstrumentType.DEBIT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InstrumentType.BANK_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InstrumentType.CREDIT_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
