package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum DisplayCriteria implements WireEnum {
    ONCE_PER_SECTION(0),
    ALWAYS(1),
    NEVER(2);

    public static final DisplayCriteria$Companion$ADAPTER$1 ADAPTER;
    public static final ImageLayout.Companion Companion;
    public final int value;

    static {
        DisplayCriteria displayCriteria = ONCE_PER_SECTION;
        Companion = new ImageLayout.Companion();
        ADAPTER = new DisplayCriteria$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisplayCriteria.class), Syntax.PROTO_2, displayCriteria);
    }

    DisplayCriteria(int i) {
        this.value = i;
    }

    public static final DisplayCriteria fromValue(int i) {
        Companion.getClass();
        return ImageLayout.Companion.m3845fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
