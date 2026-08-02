package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum TextDecoration implements WireEnum {
    STRIKETHROUGH(1),
    UNDERLINE(2);

    public final int value;
    public static final RadioType.Companion Companion = new RadioType.Companion();
    public static final TextDecoration$Companion$ADAPTER$1 ADAPTER = new TextDecoration$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextDecoration.class), Syntax.PROTO_2, null);

    TextDecoration(int i) {
        this.value = i;
    }

    public static final TextDecoration fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return STRIKETHROUGH;
        }
        if (i != 2) {
            return null;
        }
        return UNDERLINE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
