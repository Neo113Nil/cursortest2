package com.squareup.protos.cash.cashabilities.api;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum CapabilityStatus implements WireEnum {
    AVAILABLE(1),
    UNAVAILABLE(2);

    public final int value;
    public static final WorkCookieJar Companion = new WorkCookieJar(19);
    public static final CapabilityStatus$Companion$ADAPTER$1 ADAPTER = new CapabilityStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CapabilityStatus.class), Syntax.PROTO_2, null);

    CapabilityStatus(int i) {
        this.value = i;
    }

    public static final CapabilityStatus fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return AVAILABLE;
        }
        if (i != 2) {
            return null;
        }
        return UNAVAILABLE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
