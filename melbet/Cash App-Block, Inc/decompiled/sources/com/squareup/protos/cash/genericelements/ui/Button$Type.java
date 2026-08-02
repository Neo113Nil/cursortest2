package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum Button$Type implements WireEnum {
    PRIMARY(1),
    SECONDARY(2),
    TERTIARY(3),
    OUTLINE(4);

    public final int value;
    public static final Channel.Companion Companion = new Channel.Companion();
    public static final Button$Type$Companion$ADAPTER$1 ADAPTER = new Button$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Button$Type.class), Syntax.PROTO_2, null);

    Button$Type(int i) {
        this.value = i;
    }

    public static final Button$Type fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return PRIMARY;
        }
        if (i == 2) {
            return SECONDARY;
        }
        if (i == 3) {
            return TERTIARY;
        }
        if (i != 4) {
            return null;
        }
        return OUTLINE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
