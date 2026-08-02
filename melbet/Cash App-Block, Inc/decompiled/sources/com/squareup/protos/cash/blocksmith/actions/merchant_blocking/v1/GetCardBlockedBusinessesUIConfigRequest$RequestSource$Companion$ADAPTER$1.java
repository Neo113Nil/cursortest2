package com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1;

import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.GetCardBlockedBusinessesUIConfigRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetCardBlockedBusinessesUIConfigRequest$RequestSource$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetCardBlockedBusinessesUIConfigRequest.RequestSource.Companion.getClass();
        if (i == 0) {
            return GetCardBlockedBusinessesUIConfigRequest.RequestSource.REQUEST_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return GetCardBlockedBusinessesUIConfigRequest.RequestSource.REQUEST_SOURCE_CARDS_HOME;
        }
        if (i != 2) {
            return null;
        }
        return GetCardBlockedBusinessesUIConfigRequest.RequestSource.REQUEST_SOURCE_FAMILIES_HOME;
    }
}
