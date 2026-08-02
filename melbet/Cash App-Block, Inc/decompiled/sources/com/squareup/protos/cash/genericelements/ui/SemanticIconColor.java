package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum SemanticIconColor implements WireEnum {
    ICON_BRAND(1),
    ICON_DANGER(2),
    ICON_DISABLED(3),
    ICON_EXTRA_SUBTLE(4),
    ICON_INFO(5),
    ICON_INVERSE(6),
    ICON_PROMINENT(7),
    ICON_STANDARD(8),
    ICON_SUBTLE(9),
    ICON_SUCCESS(10),
    ICON_WARNING(11);

    public final int value;
    public static final Action.Type.Companion Companion = new Action.Type.Companion();
    public static final SemanticIconColor$Companion$ADAPTER$1 ADAPTER = new SemanticIconColor$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SemanticIconColor.class), Syntax.PROTO_2, null);

    SemanticIconColor(int i) {
        this.value = i;
    }

    public static final SemanticIconColor fromValue(int i) {
        Companion.getClass();
        return Action.Type.Companion.m3867fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
