package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class YieldEligibilityStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        YieldEligibilityStatus.Companion.getClass();
        if (i == 0) {
            return YieldEligibilityStatus.YIELD_ELIGIBILITY_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return YieldEligibilityStatus.YIELD_ELIGIBILITY_STATUS_INELIGIBLE;
        }
        if (i != 2) {
            return null;
        }
        return YieldEligibilityStatus.YIELD_ELIGIBILITY_STATUS_ELIGIBLE;
    }
}
