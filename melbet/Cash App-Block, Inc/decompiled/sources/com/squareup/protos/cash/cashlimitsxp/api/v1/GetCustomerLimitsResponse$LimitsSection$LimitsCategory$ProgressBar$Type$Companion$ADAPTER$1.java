package com.squareup.protos.cash.cashlimitsxp.api.v1;

import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$LimitsSection$LimitsCategory$ProgressBar$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type.Companion.getClass();
        if (i == 0) {
            return GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type.TYPE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type.TYPE_FIAT;
    }
}
