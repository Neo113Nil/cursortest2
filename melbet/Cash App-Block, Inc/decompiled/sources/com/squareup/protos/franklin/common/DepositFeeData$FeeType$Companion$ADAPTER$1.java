package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.DepositFeeData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class DepositFeeData$FeeType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DepositFeeData.FeeType.Companion.getClass();
        if (i == 1) {
            return DepositFeeData.FeeType.NONE;
        }
        if (i != 2) {
            return null;
        }
        return DepositFeeData.FeeType.BASIS_POINTS;
    }
}
