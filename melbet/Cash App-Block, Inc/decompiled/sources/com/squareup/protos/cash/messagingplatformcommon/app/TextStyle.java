package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum TextStyle implements WireEnum {
    TEXT_STYLE_UNSPECIFIED(0),
    ARCADE_HEADER(1),
    MAIN_BODY(2);

    public static final TextStyle$Companion$ADAPTER$1 ADAPTER;
    public static final SliceStatus.Companion Companion;
    public final int value;

    static {
        TextStyle textStyle = TEXT_STYLE_UNSPECIFIED;
        Companion = new SliceStatus.Companion();
        ADAPTER = new TextStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextStyle.class), Syntax.PROTO_2, textStyle);
    }

    TextStyle(int i) {
        this.value = i;
    }

    public static final TextStyle fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return TEXT_STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return ARCADE_HEADER;
        }
        if (i != 2) {
            return null;
        }
        return MAIN_BODY;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
