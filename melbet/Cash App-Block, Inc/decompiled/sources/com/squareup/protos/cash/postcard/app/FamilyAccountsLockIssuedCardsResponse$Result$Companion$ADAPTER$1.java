package com.squareup.protos.cash.postcard.app;

import com.squareup.protos.cash.postcard.app.FamilyAccountsLockIssuedCardsResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class FamilyAccountsLockIssuedCardsResponse$Result$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FamilyAccountsLockIssuedCardsResponse.Result.Companion.getClass();
        if (i == 1) {
            return FamilyAccountsLockIssuedCardsResponse.Result.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return FamilyAccountsLockIssuedCardsResponse.Result.FAILURE;
    }
}
