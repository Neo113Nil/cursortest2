package com.squareup.protos.cash.paychecks.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PayerOperation$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PayerOperation.Companion.getClass();
        if (i == 0) {
            return PayerOperation.PAYER_OPERATION_UNSPECIFIED;
        }
        if (i == 1) {
            return PayerOperation.PAYER_OPERATION_ADD;
        }
        if (i != 2) {
            return null;
        }
        return PayerOperation.PAYER_OPERATION_REMOVE;
    }
}
