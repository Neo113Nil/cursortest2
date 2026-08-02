package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.protos.cash.piggybank.api.v2.GetInterestSettingsResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetInterestSettingsResponse$AdditionalEnablementScope$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetInterestSettingsResponse.AdditionalEnablementScope.Companion.getClass();
        if (i == 0) {
            return GetInterestSettingsResponse.AdditionalEnablementScope.ADDITIONAL_ENABLEMENT_SCOPE_UNSPECIFIED;
        }
        if (i == 1) {
            return GetInterestSettingsResponse.AdditionalEnablementScope.ADDITIONAL_ENABLEMENT_SCOPE_SELF;
        }
        if (i != 2) {
            return null;
        }
        return GetInterestSettingsResponse.AdditionalEnablementScope.ADDITIONAL_ENABLEMENT_SCOPE_FAMILY;
    }
}
