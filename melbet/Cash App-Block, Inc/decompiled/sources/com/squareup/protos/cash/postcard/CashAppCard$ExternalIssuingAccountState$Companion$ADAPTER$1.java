package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppCard$ExternalIssuingAccountState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppCard.ExternalIssuingAccountState.Companion.getClass();
        if (i == 0) {
            return CashAppCard.ExternalIssuingAccountState.EXTERNAL_ISSUING_ACCOUNT_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return CashAppCard.ExternalIssuingAccountState.ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return CashAppCard.ExternalIssuingAccountState.SUSPENDED;
    }
}
