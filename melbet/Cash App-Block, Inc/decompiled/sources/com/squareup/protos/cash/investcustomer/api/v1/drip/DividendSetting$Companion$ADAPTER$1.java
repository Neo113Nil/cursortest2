package com.squareup.protos.cash.investcustomer.api.v1.drip;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DividendSetting$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DividendSetting.Companion.getClass();
        if (i == 1) {
            return DividendSetting.PAYOUT;
        }
        if (i != 2) {
            return null;
        }
        return DividendSetting.REINVEST;
    }
}
