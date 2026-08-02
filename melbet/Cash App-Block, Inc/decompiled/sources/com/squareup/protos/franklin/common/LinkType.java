package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.Trigger;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum LinkType implements WireEnum {
    NEW_LINK(1),
    REPLACE(2);

    public final int value;
    public static final Trigger.Companion Companion = new Trigger.Companion();
    public static final LinkType$Companion$ADAPTER$1 ADAPTER = new LinkType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LinkType.class), Syntax.PROTO_2, null);

    LinkType(int i) {
        this.value = i;
    }

    public static final LinkType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return NEW_LINK;
        }
        if (i != 2) {
            return null;
        }
        return REPLACE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
