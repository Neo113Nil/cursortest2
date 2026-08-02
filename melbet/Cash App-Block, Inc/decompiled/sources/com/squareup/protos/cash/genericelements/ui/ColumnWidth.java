package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum ColumnWidth implements WireEnum {
    EVEN(1),
    FIT_LEFT(2),
    FIT_RIGHT(3);

    public final int value;
    public static final Action.Type.Companion Companion = new Action.Type.Companion();
    public static final ColumnWidth$Companion$ADAPTER$1 ADAPTER = new ColumnWidth$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ColumnWidth.class), Syntax.PROTO_2, null);

    ColumnWidth(int i) {
        this.value = i;
    }

    public static final ColumnWidth fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return EVEN;
        }
        if (i == 2) {
            return FIT_LEFT;
        }
        if (i != 3) {
            return null;
        }
        return FIT_RIGHT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
