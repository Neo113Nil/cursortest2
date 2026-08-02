package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum VerticalAlignment implements WireEnum {
    TOP(1),
    BOTTOM(2),
    CENTERED(3);

    public final int value;
    public static final Channel.Companion Companion = new Channel.Companion();
    public static final VerticalAlignment$Companion$ADAPTER$1 ADAPTER = new VerticalAlignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(VerticalAlignment.class), Syntax.PROTO_2, null);

    VerticalAlignment(int i) {
        this.value = i;
    }

    public static final VerticalAlignment fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return TOP;
        }
        if (i == 2) {
            return BOTTOM;
        }
        if (i != 3) {
            return null;
        }
        return CENTERED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
