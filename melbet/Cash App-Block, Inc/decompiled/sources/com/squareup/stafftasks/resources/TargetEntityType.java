package com.squareup.stafftasks.resources;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.internal.y0;

/* loaded from: classes8.dex */
public enum TargetEntityType implements WireEnum {
    DO_NOT_USE_TARGET_ENTITY_TYPE(0),
    TEAM_MEMBER(1);

    public static final TargetEntityType$Companion$ADAPTER$1 ADAPTER;
    public static final y0 Companion;
    public final int value;

    static {
        TargetEntityType targetEntityType = DO_NOT_USE_TARGET_ENTITY_TYPE;
        Companion = new y0();
        ADAPTER = new TargetEntityType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TargetEntityType.class), Syntax.PROTO_2, targetEntityType);
    }

    TargetEntityType(int i) {
        this.value = i;
    }

    public static final TargetEntityType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return DO_NOT_USE_TARGET_ENTITY_TYPE;
        }
        if (i != 1) {
            return null;
        }
        return TEAM_MEMBER;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
