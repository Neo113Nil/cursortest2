package com.squareup.protos.cash.p2p.profile_directory.ui;

import com.squareup.protos.cash.moneymap.app.RetailerType;
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
    IDENTIFIER(13);

    public final int value;
    public static final RetailerType.Companion Companion = new RetailerType.Companion();
    public static final TextStyle$Companion$ADAPTER$1 ADAPTER = new TextStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextStyle.class), Syntax.PROTO_2, null);

    TextStyle(int i) {
        this.value = i;
    }

    public static final TextStyle fromValue(int i) {
        Companion.getClass();
        return RetailerType.Companion.m3906fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
