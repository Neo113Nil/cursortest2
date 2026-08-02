package com.squareup.protos.payrollconnector.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PayrollVendor$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PayrollVendor.Companion.getClass();
        if (i == 1) {
            return PayrollVendor.UNKNOWN;
        }
        if (i != 2) {
            return null;
        }
        return PayrollVendor.PINWHEEL;
    }
}
