package com.squareup.protos.cash.postcard.app;

import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum KnotSessionType implements WireEnum {
    KNOT_SESSION_TYPE_UNSPECIFIED(0),
    CARD_SWITCHER(1),
    LINK(2);

    public static final KnotSessionType$Companion$ADAPTER$1 ADAPTER;
    public static final TextSize.Companion Companion;
    public final int value;

    static {
        KnotSessionType knotSessionType = KNOT_SESSION_TYPE_UNSPECIFIED;
        Companion = new TextSize.Companion();
        ADAPTER = new KnotSessionType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(KnotSessionType.class), Syntax.PROTO_2, knotSessionType);
    }

    KnotSessionType(int i) {
        this.value = i;
    }

    public static final KnotSessionType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return KNOT_SESSION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CARD_SWITCHER;
        }
        if (i != 2) {
            return null;
        }
        return LINK;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
