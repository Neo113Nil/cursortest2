package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AccountType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType.Companion.getClass();
        if (i == 1) {
            return Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType.SVB;
        }
        if (i == 2) {
            return Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType.SAVINGS;
        }
        if (i != 3) {
            return null;
        }
        return Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType.BNPL;
    }
}
