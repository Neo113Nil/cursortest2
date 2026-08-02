package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Action$OAuth$Permission$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Action.OAuth.Permission.Companion.getClass();
        if (i == 1) {
            return Action.OAuth.Permission.CUSTOMER_CASHTAG_READ;
        }
        if (i != 2) {
            return null;
        }
        return Action.OAuth.Permission.ACCOUNT_BAL_READ;
    }
}
