package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$CreditBalance$RingStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AfterpayAppletEntrypoint.CreditBalance.RingStyle.Companion.getClass();
        if (i == 0) {
            return AfterpayAppletEntrypoint.CreditBalance.RingStyle.SEGMENTED;
        }
        if (i != 1) {
            return null;
        }
        return AfterpayAppletEntrypoint.CreditBalance.RingStyle.COMBINED;
    }
}
