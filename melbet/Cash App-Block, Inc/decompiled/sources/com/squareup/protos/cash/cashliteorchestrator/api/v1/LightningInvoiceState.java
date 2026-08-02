package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum LightningInvoiceState implements WireEnum {
    LIGHTNING_INVOICE_STATE_UNSPECIFIED(0),
    LIGHTNING_INVOICE_STATE_REQUESTED(1),
    LIGHTNING_INVOICE_STATE_CREATED(2),
    LIGHTNING_INVOICE_STATE_FAILED(3),
    LIGHTNING_INVOICE_STATE_EXPIRED(4);

    public static final LightningInvoiceState$Companion$ADAPTER$1 ADAPTER;
    public static final RadioType.Companion Companion;
    public final int value;

    static {
        LightningInvoiceState lightningInvoiceState = LIGHTNING_INVOICE_STATE_UNSPECIFIED;
        Companion = new RadioType.Companion();
        ADAPTER = new LightningInvoiceState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LightningInvoiceState.class), Syntax.PROTO_2, lightningInvoiceState);
    }

    LightningInvoiceState(int i) {
        this.value = i;
    }

    public static final LightningInvoiceState fromValue(int i) {
        Companion.getClass();
        return RadioType.Companion.m3850fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
