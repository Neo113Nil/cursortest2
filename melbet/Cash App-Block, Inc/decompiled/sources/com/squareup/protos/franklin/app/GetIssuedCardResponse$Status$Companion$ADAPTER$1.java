package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.GetIssuedCardResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class GetIssuedCardResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetIssuedCardResponse.Status.Companion.getClass();
        if (i == 0) {
            return GetIssuedCardResponse.Status.INVALID;
        }
        if (i == 1) {
            return GetIssuedCardResponse.Status.SUCCESS;
        }
        if (i == 2) {
            return GetIssuedCardResponse.Status.CONCURRENT_MODIFICATION;
        }
        if (i != 3) {
            return null;
        }
        return GetIssuedCardResponse.Status.FAILURE;
    }
}
