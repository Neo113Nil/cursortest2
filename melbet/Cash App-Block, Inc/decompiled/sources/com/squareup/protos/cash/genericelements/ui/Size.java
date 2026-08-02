package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum Size implements WireEnum {
    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    public final int value;
    public static final Channel.Companion Companion = new Channel.Companion();
    public static final Size$Companion$ADAPTER$1 ADAPTER = new Size$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Size.class), Syntax.PROTO_2, null);

    Size(int i) {
        this.value = i;
    }

    public static final Size fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return SMALL;
        }
        if (i == 2) {
            return MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return LARGE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
