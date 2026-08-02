package com.squareup.protos.cash.cashplato.api.v1;

import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsError;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PersonalizedAdsError$ErrorType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PersonalizedAdsError.ErrorType.Companion.getClass();
        switch (i) {
            case 0:
                return PersonalizedAdsError.ErrorType.ERROR_TYPE_UNSPECIFIED;
            case 1:
                return PersonalizedAdsError.ErrorType.ERROR_TYPE_CATCHALL;
            case 2:
                return PersonalizedAdsError.ErrorType.ERROR_TYPE_INVALID_COPY_PARAMETERS;
            case 3:
                return PersonalizedAdsError.ErrorType.ERROR_TYPE_INVALID_CUSTOMER_TOKEN;
            case 4:
                return PersonalizedAdsError.ErrorType.ERROR_TYPE_CONSENTSYS_FAILED;
            case 5:
                return PersonalizedAdsError.ErrorType.ERROR_TYPE_DISABLED;
            case 6:
                return PersonalizedAdsError.ErrorType.ERROR_TYPE_CAPS_FAILED;
            case 7:
                return PersonalizedAdsError.ErrorType.ERROR_TYPE_CANNOT_DETERMINE_REGION;
            default:
                return null;
        }
    }
}
