package com.squareup.protos.cash.local.client.app.v1.account;

import com.squareup.protos.cash.local.client.app.v1.account.LocalEarningCard;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalEarningCard$Source$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalEarningCard.Source.Companion.getClass();
        if (i == 0) {
            return LocalEarningCard.Source.SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalEarningCard.Source.SOURCE_LINKED_IN_STORE;
        }
        if (i != 2) {
            return null;
        }
        return LocalEarningCard.Source.SOURCE_CASH_APP_WALLET;
    }
}
