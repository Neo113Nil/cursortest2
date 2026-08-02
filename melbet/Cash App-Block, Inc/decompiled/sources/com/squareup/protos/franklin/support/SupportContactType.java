package com.squareup.protos.franklin.support;

import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum SupportContactType implements WireEnum {
    EMAIL(1),
    CALLBACK(2),
    TEXT(3),
    CHAT(4);

    public final int value;
    public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
    public static final SupportContactType$Companion$ADAPTER$1 ADAPTER = new SupportContactType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SupportContactType.class), Syntax.PROTO_2, null);

    SupportContactType(int i) {
        this.value = i;
    }

    public static final SupportContactType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return EMAIL;
        }
        if (i == 2) {
            return CALLBACK;
        }
        if (i == 3) {
            return TEXT;
        }
        if (i != 4) {
            return null;
        }
        return CHAT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
