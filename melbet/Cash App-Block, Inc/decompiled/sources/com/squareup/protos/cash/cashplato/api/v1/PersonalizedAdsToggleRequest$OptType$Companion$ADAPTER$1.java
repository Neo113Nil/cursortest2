package com.squareup.protos.cash.cashplato.api.v1;

import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsToggleRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PersonalizedAdsToggleRequest$OptType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PersonalizedAdsToggleRequest.OptType.Companion.getClass();
        if (i == 0) {
            return PersonalizedAdsToggleRequest.OptType.OPT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return PersonalizedAdsToggleRequest.OptType.OPT_TYPE_OPT_IN;
        }
        if (i != 2) {
            return null;
        }
        return PersonalizedAdsToggleRequest.OptType.OPT_TYPE_OPT_OUT;
    }
}
