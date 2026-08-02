package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum TextStyle implements WireEnum {
    BIG_MONEY(1),
    HEADER_1(2),
    HEADER_2(3),
    HEADER_3(4),
    HEADER_4(5),
    INPUT(6),
    MAIN_TITLE(7),
    MAIN_BODY(8),
    SMALL_TITLE(9),
    SMALL_BODY(10),
    STRONG_CAPTION(11),
    CAPTION(12),
    IDENTIFIER(13),
    ARCADE_KEYPAD_TOTAL(14),
    ARCADE_HERO_NUMERICS(15),
    ARCADE_HERO(16),
    ARCADE_HEADER(17),
    ARCADE_KEYPAD_NUMBERS(18),
    ARCADE_LARGE_LABEL(19),
    ARCADE_TAB_TITLE(20),
    ARCADE_SECTION_TITLE(21),
    ARCADE_PAGE_TITLE(22),
    ARCADE_LABEL(23),
    ARCADE_BODY(24),
    ARCADE_INPUT(25),
    ARCADE_BUTTON(26),
    ARCADE_COMPACT_BUTTON(27),
    ARCADE_CELL_BODY(28),
    ARCADE_HELP_TEXT(29),
    ARCADE_DISCLAIMER(30),
    ARCADE_META_TEXT(31);

    public final int value;
    public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
    public static final TextStyle$Companion$ADAPTER$1 ADAPTER = new TextStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextStyle.class), Syntax.PROTO_2, null);

    TextStyle(int i) {
        this.value = i;
    }

    public static final TextStyle fromValue(int i) {
        Companion.getClass();
        return ImageLayout.Companion.m3846fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
