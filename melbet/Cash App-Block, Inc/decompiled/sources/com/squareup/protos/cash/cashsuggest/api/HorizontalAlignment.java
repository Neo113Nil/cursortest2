package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum HorizontalAlignment implements WireEnum {
    LEFT(1),
    CENTER(2),
    RIGHT(3);

    public final int value;
    public static final RadioType.Companion Companion = new RadioType.Companion();
    public static final HorizontalAlignment$Companion$ADAPTER$1 ADAPTER = new HorizontalAlignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(HorizontalAlignment.class), Syntax.PROTO_2, null);

    HorizontalAlignment(int i) {
        this.value = i;
    }

    public static final HorizontalAlignment fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return LEFT;
        }
        if (i == 2) {
            return CENTER;
        }
        if (i != 3) {
            return null;
        }
        return RIGHT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
