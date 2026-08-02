package com.squareup.protos.payrollconnector.common;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.Plane;

/* loaded from: classes8.dex */
public enum PlatformType implements WireEnum {
    PAYROLL(1),
    TIME_AND_ATTENDANCE(2),
    TAX(3),
    MERCHANT(4);

    public final int value;
    public static final Plane Companion = new Plane(2);
    public static final PlatformType$Companion$ADAPTER$1 ADAPTER = new PlatformType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PlatformType.class), Syntax.PROTO_2, null);

    PlatformType(int i) {
        this.value = i;
    }

    public static final PlatformType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return PAYROLL;
        }
        if (i == 2) {
            return TIME_AND_ATTENDANCE;
        }
        if (i == 3) {
            return TAX;
        }
        if (i != 4) {
            return null;
        }
        return MERCHANT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
