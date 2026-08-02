package com.squareup.protos.cash.blockly.api;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum AllowlistAction implements WireEnum {
    ADD(1),
    REMOVE(2);

    public final int value;
    public static final WorkCookieJar Companion = new WorkCookieJar(17);
    public static final AllowlistAction$Companion$ADAPTER$1 ADAPTER = new AllowlistAction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AllowlistAction.class), Syntax.PROTO_2, null);

    AllowlistAction(int i) {
        this.value = i;
    }

    public static final AllowlistAction fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return ADD;
        }
        if (i != 2) {
            return null;
        }
        return REMOVE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
