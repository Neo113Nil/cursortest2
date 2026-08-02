package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum Status implements WireEnum {
    UNKNOWN_STATUS(0),
    ACTIVE(1),
    DELETED(2);

    public static final Status$Companion$ADAPTER$1 ADAPTER;
    public static final RadioType.Companion Companion;
    public final int value;

    static {
        Status status = UNKNOWN_STATUS;
        Companion = new RadioType.Companion();
        ADAPTER = new Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
    }

    Status(int i) {
        this.value = i;
    }

    public static final Status fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return DELETED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
