package com.squareup.protos.cash.cashcustomerprofile.api.v1;

import com.squareup.cropview.Edge;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum AcceptanceState implements WireEnum {
    UNSPECIFIED(0),
    NOT_PRESENT(1),
    ACCEPTED(2),
    REJECTED(3),
    REVOKED(4);

    public static final AcceptanceState$Companion$ADAPTER$1 ADAPTER;
    public static final Edge.Companion Companion;
    public final int value;

    static {
        AcceptanceState acceptanceState = UNSPECIFIED;
        Companion = new Edge.Companion(24);
        ADAPTER = new AcceptanceState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AcceptanceState.class), Syntax.PROTO_2, acceptanceState);
    }

    AcceptanceState(int i) {
        this.value = i;
    }

    public static final AcceptanceState fromValue(int i) {
        Companion.getClass();
        return Edge.Companion.m3828fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
