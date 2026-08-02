package com.squareup.protos.cash.local.client.app.v1.account;

import com.squareup.protos.cash.local.client.app.v1.account.LocalEarningCard;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalEarningCard$EarningState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalEarningCard.EarningState.Companion.getClass();
        if (i == 0) {
            return LocalEarningCard.EarningState.EARNING_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalEarningCard.EarningState.EARNING_STATE_ENABLED_FOR_EARNING;
        }
        if (i != 2) {
            return null;
        }
        return LocalEarningCard.EarningState.EARNING_STATE_DISABLED_FOR_EARNING;
    }
}
