package com.squareup.protos.payrollconnector.common;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public enum PayrollVendor implements WireEnum {
    UNKNOWN(1),
    PINWHEEL(2);

    public final int value;
    public static final POPMatchingFactory Companion = new POPMatchingFactory(2);
    public static final PayrollVendor$Companion$ADAPTER$1 ADAPTER = new PayrollVendor$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PayrollVendor.class), Syntax.PROTO_2, null);

    PayrollVendor(int i) {
        this.value = i;
    }

    public static final PayrollVendor fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return UNKNOWN;
        }
        if (i != 2) {
            return null;
        }
        return PINWHEEL;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
