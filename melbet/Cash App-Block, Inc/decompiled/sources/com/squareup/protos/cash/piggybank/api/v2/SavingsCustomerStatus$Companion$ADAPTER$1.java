package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SavingsCustomerStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SavingsCustomerStatus.Companion.getClass();
        if (i == 0) {
            return SavingsCustomerStatus.SAVINGS_CUSTOMER_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return SavingsCustomerStatus.SAVINGS_CUSTOMER_STATUS_INELIGIBLE;
        }
        if (i == 2) {
            return SavingsCustomerStatus.SAVINGS_CUSTOMER_STATUS_ELIGIBLE;
        }
        if (i != 3) {
            return null;
        }
        return SavingsCustomerStatus.SAVINGS_CUSTOMER_STATUS_ADOPTED;
    }
}
