package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.cash.notifications.Op;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum HalfsheetId implements WireEnum {
    HALFSHEET_ID_AVAILABLE_CREDIT(1),
    HALFSHEET_ID_TOTAL_OWED(2),
    HALFSHEET_ID_UPCOMING_PAYMENT_ROW_NON_CAP(3);

    public final int value;
    public static final Op.Companion Companion = new Op.Companion();
    public static final HalfsheetId$Companion$ADAPTER$1 ADAPTER = new HalfsheetId$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(HalfsheetId.class), Syntax.PROTO_2, null);

    HalfsheetId(int i) {
        this.value = i;
    }

    public static final HalfsheetId fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return HALFSHEET_ID_AVAILABLE_CREDIT;
        }
        if (i == 2) {
            return HALFSHEET_ID_TOTAL_OWED;
        }
        if (i != 3) {
            return null;
        }
        return HALFSHEET_ID_UPCOMING_PAYMENT_ROW_NON_CAP;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
