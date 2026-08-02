package com.squareup.protos.cash.investcustomer.api.v1;

import com.squareup.protos.cash.investcustomer.api.v1.CustomerLimit;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CustomerLimit$Frequency$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CustomerLimit.Frequency.Companion.getClass();
        if (i == 0) {
            return CustomerLimit.Frequency.FREQUENCY_UNSPECIFIED;
        }
        if (i == 1) {
            return CustomerLimit.Frequency.FREQUENCY_WEEKLY;
        }
        if (i != 2) {
            return null;
        }
        return CustomerLimit.Frequency.FREQUENCY_MONTHLY;
    }
}
