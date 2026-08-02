package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum RecipientGroup implements WireEnum {
    NEARBY(1),
    RECENTS(2),
    SUGGESTIONS(3);

    public final int value;
    public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
    public static final RecipientGroup$Companion$ADAPTER$1 ADAPTER = new RecipientGroup$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RecipientGroup.class), Syntax.PROTO_2, null);

    RecipientGroup(int i) {
        this.value = i;
    }

    public static final RecipientGroup fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return NEARBY;
        }
        if (i == 2) {
            return RECENTS;
        }
        if (i != 3) {
            return null;
        }
        return SUGGESTIONS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
