package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LightningInvoiceState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LightningInvoiceState.Companion.getClass();
        return RadioType.Companion.m3850fromValue(i);
    }
}
