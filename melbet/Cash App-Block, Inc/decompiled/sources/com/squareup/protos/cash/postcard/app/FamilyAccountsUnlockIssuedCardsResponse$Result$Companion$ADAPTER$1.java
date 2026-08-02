package com.squareup.protos.cash.postcard.app;

import com.squareup.protos.cash.postcard.app.FamilyAccountsUnlockIssuedCardsResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class FamilyAccountsUnlockIssuedCardsResponse$Result$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FamilyAccountsUnlockIssuedCardsResponse.Result.Companion.getClass();
        if (i == 1) {
            return FamilyAccountsUnlockIssuedCardsResponse.Result.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return FamilyAccountsUnlockIssuedCardsResponse.Result.FAILURE;
    }
}
