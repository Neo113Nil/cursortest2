package com.squareup.protos.cash.janus.api.trusthub;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum StatusIndicator implements WireEnum {
    UNSPECIFIED(0),
    OK(1),
    WARNING(2),
    CRITICAL(3);

    public static final StatusIndicator$Companion$ADAPTER$1 ADAPTER;
    public static final SliceStatus.Companion Companion;
    public final int value;

    static {
        StatusIndicator statusIndicator = UNSPECIFIED;
        Companion = new SliceStatus.Companion();
        ADAPTER = new StatusIndicator$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(StatusIndicator.class), Syntax.PROTO_2, statusIndicator);
    }

    StatusIndicator(int i) {
        this.value = i;
    }

    public static final StatusIndicator fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return OK;
        }
        if (i == 2) {
            return WARNING;
        }
        if (i != 3) {
            return null;
        }
        return CRITICAL;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
