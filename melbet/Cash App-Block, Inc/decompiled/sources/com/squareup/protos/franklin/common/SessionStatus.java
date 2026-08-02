package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public enum SessionStatus implements WireEnum {
    PARTIAL(1),
    FULL(2),
    ANONYMOUS(3);

    public final int value;
    public static final UiAlias.Type.Companion Companion = new UiAlias.Type.Companion();
    public static final SessionStatus$Companion$ADAPTER$1 ADAPTER = new SessionStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SessionStatus.class), Syntax.PROTO_2, null);

    SessionStatus(int i) {
        this.value = i;
    }

    public static final SessionStatus fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return PARTIAL;
        }
        if (i == 2) {
            return FULL;
        }
        if (i != 3) {
            return null;
        }
        return ANONYMOUS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
