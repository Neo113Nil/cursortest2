package com.squareup.protos.cash.cashcustomergateway.api.v1;

import com.squareup.protos.cash.cashcustomergateway.api.v1.LookupCashtagResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LookupCashtagResponse$MatchType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LookupCashtagResponse.MatchType.Companion.getClass();
        if (i == 0) {
            return LookupCashtagResponse.MatchType.MATCH_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return LookupCashtagResponse.MatchType.MATCH_TYPE_LOCAL_BRAND;
        }
        if (i == 2) {
            return LookupCashtagResponse.MatchType.MATCH_TYPE_CUSTOMER;
        }
        if (i != 3) {
            return null;
        }
        return LookupCashtagResponse.MatchType.MATCH_TYPE_NONE;
    }
}
