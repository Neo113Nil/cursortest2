package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum LocalMenuHoursState implements WireEnum {
    LOCAL_MENU_HOURS_STATE_UNSPECIFIED(0),
    LOCAL_MENU_HOURS_STATE_ALWAYS_AVAILABLE(1),
    LOCAL_MENU_HOURS_STATE_AVAILABLE_NOW(2),
    LOCAL_MENU_HOURS_STATE_AVAILABLE_LATER(3);

    public static final LocalMenuHoursState$Companion$ADAPTER$1 ADAPTER;
    public static final FeeType.Companion Companion;
    public final int value;

    static {
        LocalMenuHoursState localMenuHoursState = LOCAL_MENU_HOURS_STATE_UNSPECIFIED;
        Companion = new FeeType.Companion();
        ADAPTER = new LocalMenuHoursState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LocalMenuHoursState.class), Syntax.PROTO_2, localMenuHoursState);
    }

    LocalMenuHoursState(int i) {
        this.value = i;
    }

    public static final LocalMenuHoursState fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return LOCAL_MENU_HOURS_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return LOCAL_MENU_HOURS_STATE_ALWAYS_AVAILABLE;
        }
        if (i == 2) {
            return LOCAL_MENU_HOURS_STATE_AVAILABLE_NOW;
        }
        if (i != 3) {
            return null;
        }
        return LOCAL_MENU_HOURS_STATE_AVAILABLE_LATER;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
