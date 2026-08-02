package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum LocalMenuAvailability implements WireEnum {
    LOCAL_MENU_AVAILABILITY_UNSPECIFIED(0),
    LOCAL_MENU_AVAILABILITY_NORMAL(1),
    LOCAL_MENU_AVAILABILITY_SOLD_OUT(2);

    public static final LocalMenuAvailability$Companion$ADAPTER$1 ADAPTER;
    public static final Origin.Companion Companion;
    public final int value;

    static {
        LocalMenuAvailability localMenuAvailability = LOCAL_MENU_AVAILABILITY_UNSPECIFIED;
        Companion = new Origin.Companion();
        ADAPTER = new LocalMenuAvailability$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LocalMenuAvailability.class), Syntax.PROTO_2, localMenuAvailability);
    }

    LocalMenuAvailability(int i) {
        this.value = i;
    }

    public static final LocalMenuAvailability fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return LOCAL_MENU_AVAILABILITY_UNSPECIFIED;
        }
        if (i == 1) {
            return LOCAL_MENU_AVAILABILITY_NORMAL;
        }
        if (i != 2) {
            return null;
        }
        return LOCAL_MENU_AVAILABILITY_SOLD_OUT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
