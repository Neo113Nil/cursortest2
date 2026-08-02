package com.squareup.protos.cash.postcard.app;

import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum KnotEntryPoint implements WireEnum {
    KNOT_ENTRY_POINT_UNSPECIFIED(0),
    CARD_TAB(1),
    CARD_ACTIVATION(2),
    MERCHANT_PROFILE(3),
    BILLS_SUBSCRIPTIONS(4);

    public static final KnotEntryPoint$Companion$ADAPTER$1 ADAPTER;
    public static final TaxEnvironment.Companion Companion;
    public final int value;

    static {
        KnotEntryPoint knotEntryPoint = KNOT_ENTRY_POINT_UNSPECIFIED;
        Companion = new TaxEnvironment.Companion();
        ADAPTER = new KnotEntryPoint$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(KnotEntryPoint.class), Syntax.PROTO_2, knotEntryPoint);
    }

    KnotEntryPoint(int i) {
        this.value = i;
    }

    public static final KnotEntryPoint fromValue(int i) {
        Companion.getClass();
        return TaxEnvironment.Companion.m3924fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
