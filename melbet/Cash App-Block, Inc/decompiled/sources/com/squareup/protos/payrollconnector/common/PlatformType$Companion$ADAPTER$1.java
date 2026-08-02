package com.squareup.protos.payrollconnector.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PlatformType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PlatformType.Companion.getClass();
        if (i == 1) {
            return PlatformType.PAYROLL;
        }
        if (i == 2) {
            return PlatformType.TIME_AND_ATTENDANCE;
        }
        if (i == 3) {
            return PlatformType.TAX;
        }
        if (i != 4) {
            return null;
        }
        return PlatformType.MERCHANT;
    }
}
