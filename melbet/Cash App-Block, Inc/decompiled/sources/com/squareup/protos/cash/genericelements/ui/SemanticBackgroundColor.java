package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum SemanticBackgroundColor implements WireEnum {
    BACKGROUND_APP(1),
    BACKGROUND_BITCOIN(2),
    BACKGROUND_BRAND(3),
    BACKGROUND_DANGER(4),
    BACKGROUND_DIMMER(5),
    BACKGROUND_EXTRA_PROMINENT(6),
    BACKGROUND_NOTIFICATION(7),
    BACKGROUND_PROMINENT(8),
    BACKGROUND_STANDARD(9),
    BACKGROUND_SUBTLE(10),
    BACKGROUND_WARNING(11);

    public final int value;
    public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
    public static final SemanticBackgroundColor$Companion$ADAPTER$1 ADAPTER = new SemanticBackgroundColor$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SemanticBackgroundColor.class), Syntax.PROTO_2, null);

    SemanticBackgroundColor(int i) {
        this.value = i;
    }

    public static final SemanticBackgroundColor fromValue(int i) {
        Companion.getClass();
        return ImageLayout.Companion.m3848fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
