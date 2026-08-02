package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.ConfirmPaymentResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class ConfirmPaymentResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ConfirmPaymentResponse.Status.Companion.getClass();
        if (i == 0) {
            return ConfirmPaymentResponse.Status.INVALID;
        }
        if (i == 1) {
            return ConfirmPaymentResponse.Status.SUCCESS;
        }
        if (i == 3) {
            return ConfirmPaymentResponse.Status.CONCURRENT_MODIFICATION;
        }
        if (i != 4) {
            return null;
        }
        return ConfirmPaymentResponse.Status.FAILED;
    }
}
