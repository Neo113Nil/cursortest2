package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.CancelPaymentResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class CancelPaymentResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CancelPaymentResponse.Status.Companion.getClass();
        if (i == 0) {
            return CancelPaymentResponse.Status.INVALID;
        }
        if (i == 1) {
            return CancelPaymentResponse.Status.SUCCESS;
        }
        if (i != 3) {
            return null;
        }
        return CancelPaymentResponse.Status.CONCURRENT_MODIFICATION;
    }
}
