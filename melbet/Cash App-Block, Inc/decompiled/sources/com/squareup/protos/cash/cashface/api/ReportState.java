package com.squareup.protos.cash.cashface.api;

import com.squareup.cash.notifications.Op;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum ReportState implements WireEnum {
    REPORTED(1),
    NOT_REPORTED(2),
    NOT_APPLICABLE(3);

    public final int value;
    public static final Op.Companion Companion = new Op.Companion();
    public static final ReportState$Companion$ADAPTER$1 ADAPTER = new ReportState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ReportState.class), Syntax.PROTO_2, null);

    ReportState(int i) {
        this.value = i;
    }

    public static final ReportState fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return REPORTED;
        }
        if (i == 2) {
            return NOT_REPORTED;
        }
        if (i != 3) {
            return null;
        }
        return NOT_APPLICABLE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
