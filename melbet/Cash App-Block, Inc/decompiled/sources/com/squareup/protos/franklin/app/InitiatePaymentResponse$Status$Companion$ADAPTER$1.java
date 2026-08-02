package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.InitiatePaymentResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class InitiatePaymentResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InitiatePaymentResponse.Status.Companion.getClass();
        if (i == 0) {
            return InitiatePaymentResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return InitiatePaymentResponse.Status.SUCCESS;
    }
}
