package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardRenderingInfo;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CardRenderingInfo$ExpirationState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardRenderingInfo.ExpirationState.Companion.getClass();
        if (i == 0) {
            return CardRenderingInfo.ExpirationState.EXPIRATION_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return CardRenderingInfo.ExpirationState.NOT_EXPIRED;
        }
        if (i != 2) {
            return null;
        }
        return CardRenderingInfo.ExpirationState.EXPIRED;
    }
}
