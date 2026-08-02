package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.cropview.Edge;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum TextAlignment implements WireEnum {
    TEXT_ALIGNMENT_LEADING(1),
    TEXT_ALIGNMENT_TRAILING(2),
    TEXT_ALIGNMENT_CENTERED(3);

    public final int value;
    public static final Edge.Companion Companion = new Edge.Companion(20);
    public static final TextAlignment$Companion$ADAPTER$1 ADAPTER = new TextAlignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextAlignment.class), Syntax.PROTO_2, null);

    TextAlignment(int i) {
        this.value = i;
    }

    public static final TextAlignment fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return TEXT_ALIGNMENT_LEADING;
        }
        if (i == 2) {
            return TEXT_ALIGNMENT_TRAILING;
        }
        if (i != 3) {
            return null;
        }
        return TEXT_ALIGNMENT_CENTERED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
