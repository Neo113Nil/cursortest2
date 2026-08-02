package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum SheetType implements WireEnum {
    DETAIL_SHEET(1),
    TIMELINE_SHEET(2);

    public final int value;
    public static final Action.Type.Companion Companion = new Action.Type.Companion();
    public static final SheetType$Companion$ADAPTER$1 ADAPTER = new SheetType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SheetType.class), Syntax.PROTO_2, null);

    SheetType(int i) {
        this.value = i;
    }

    public static final SheetType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return DETAIL_SHEET;
        }
        if (i != 2) {
            return null;
        }
        return TIMELINE_SHEET;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
