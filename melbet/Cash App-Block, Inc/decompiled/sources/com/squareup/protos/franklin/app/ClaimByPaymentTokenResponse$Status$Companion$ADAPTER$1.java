package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.ClaimByPaymentTokenResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class ClaimByPaymentTokenResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ClaimByPaymentTokenResponse.Status.Companion.getClass();
        if (i == 0) {
            return ClaimByPaymentTokenResponse.Status.INVALID;
        }
        if (i == 1) {
            return ClaimByPaymentTokenResponse.Status.SUCCESS;
        }
        if (i == 3) {
            return ClaimByPaymentTokenResponse.Status.ALREADY_CLAIMED;
        }
        if (i != 4) {
            return null;
        }
        return ClaimByPaymentTokenResponse.Status.FAILED;
    }
}
