package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum HorizontalAlignment implements WireEnum {
    LEFT(1),
    CENTER(2),
    RIGHT(3);

    public final int value;
    public static final Alignment.Companion Companion = new Alignment.Companion();
    public static final HorizontalAlignment$Companion$ADAPTER$1 ADAPTER = new HorizontalAlignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(HorizontalAlignment.class), Syntax.PROTO_2, null);

    HorizontalAlignment(int i) {
        this.value = i;
    }

    public static final HorizontalAlignment fromValue(int i) {
        Companion.getClass();
        return Alignment.Companion.m3859fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
