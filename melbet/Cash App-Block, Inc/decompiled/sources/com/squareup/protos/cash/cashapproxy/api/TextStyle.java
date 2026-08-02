package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.cash.notifications.Op;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum TextStyle implements WireEnum {
    TEXT_STYLE_BIG_MONEY(1),
    TEXT_STYLE_HEADER_1(2),
    TEXT_STYLE_HEADER_2(3),
    TEXT_STYLE_HEADER_3(4),
    TEXT_STYLE_HEADER_4(5),
    TEXT_STYLE_MAIN_TITLE(6),
    TEXT_STYLE_MAIN_BODY(7),
    TEXT_STYLE_SMALL_TITLE(8),
    TEXT_STYLE_SMALL_BODY(9),
    TEXT_STYLE_STRONG_CAPTION(10),
    TEXT_STYLE_CAPTION(11),
    TEXT_STYLE_IDENTIFIER(12);

    public final int value;
    public static final Op.Companion Companion = new Op.Companion();
    public static final TextStyle$Companion$ADAPTER$1 ADAPTER = new TextStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextStyle.class), Syntax.PROTO_2, null);

    TextStyle(int i) {
        this.value = i;
    }

    public static final TextStyle fromValue(int i) {
        Companion.getClass();
        return Op.Companion.m3673fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
