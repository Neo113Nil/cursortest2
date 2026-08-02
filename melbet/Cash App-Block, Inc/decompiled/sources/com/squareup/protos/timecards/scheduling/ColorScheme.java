package com.squareup.protos.timecards.scheduling;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* loaded from: classes9.dex */
public enum ColorScheme implements WireEnum {
    DO_NOT_USE(0),
    LIGHT_LIME(1),
    DARK_LIME(2),
    LIGHT_TEAL(3),
    DARK_TEAL(4),
    LIGHT_BLUE(5),
    DARK_BLUE(6),
    LIGHT_PURPLE(7),
    DARK_PURPLE(8),
    LIGHT_PLUM(9),
    DARK_PLUM(10),
    LIGHT_ROSE(11),
    DARK_ROSE(12),
    LIGHT_ORANGE(13),
    DARK_ORANGE(14);

    public static final ColorScheme$Companion$ADAPTER$1 ADAPTER;
    public static final KClasses$$Lambda$1 Companion;
    public final int value;

    static {
        ColorScheme colorScheme = DO_NOT_USE;
        Companion = new KClasses$$Lambda$1(5);
        ADAPTER = new ColorScheme$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ColorScheme.class), Syntax.PROTO_2, colorScheme);
    }

    ColorScheme(int i) {
        this.value = i;
    }

    public static final ColorScheme fromValue(int i) {
        Companion.getClass();
        return KClasses$$Lambda$1.m4137fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
