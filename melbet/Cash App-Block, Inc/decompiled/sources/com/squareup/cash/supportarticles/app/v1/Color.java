package com.squareup.cash.supportarticles.app.v1;

import com.squareup.cash.notifications.Op;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum Color implements WireEnum {
    COLOR_UNSPECIFIED(0),
    COLOR_GREEN(1),
    COLOR_TURQUOISE(2),
    COLOR_SKY(3),
    COLOR_OCEAN(4),
    COLOR_ROYAL(5),
    COLOR_PURPLE(6),
    COLOR_PINK(7),
    COLOR_SCARLET(8),
    COLOR_AMBER(9),
    COLOR_SUNSHINE(10),
    COLOR_GRAY(11),
    COLOR_INVESTING(12),
    COLOR_BITCOIN(13);

    public static final Color$Companion$ADAPTER$1 ADAPTER;
    public static final Op.Companion Companion;
    public final int value;

    static {
        Color color = COLOR_UNSPECIFIED;
        Companion = new Op.Companion();
        ADAPTER = new Color$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Color.class), Syntax.PROTO_3, color);
    }

    Color(int i) {
        this.value = i;
    }

    public static final Color fromValue(int i) {
        Companion.getClass();
        return Op.Companion.m3671fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
