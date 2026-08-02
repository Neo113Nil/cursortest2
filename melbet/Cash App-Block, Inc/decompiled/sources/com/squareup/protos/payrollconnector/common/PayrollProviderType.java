package com.squareup.protos.payrollconnector.common;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* loaded from: classes8.dex */
public enum PayrollProviderType implements WireEnum {
    EMPLOYER(1),
    PLATFORM(2);

    public final int value;
    public static final KClasses$$Lambda$1 Companion = new KClasses$$Lambda$1(1);
    public static final PayrollProviderType$Companion$ADAPTER$1 ADAPTER = new PayrollProviderType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PayrollProviderType.class), Syntax.PROTO_2, null);

    PayrollProviderType(int i) {
        this.value = i;
    }

    public static final PayrollProviderType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return EMPLOYER;
        }
        if (i != 2) {
            return null;
        }
        return PLATFORM;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
