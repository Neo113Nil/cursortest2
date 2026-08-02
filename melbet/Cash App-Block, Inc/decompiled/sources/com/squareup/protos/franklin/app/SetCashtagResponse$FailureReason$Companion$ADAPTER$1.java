package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SetCashtagResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SetCashtagResponse$FailureReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetCashtagResponse.FailureReason.Companion.getClass();
        if (i == 1) {
            return SetCashtagResponse.FailureReason.TOO_MANY_CASHTAGS;
        }
        if (i != 2) {
            return null;
        }
        return SetCashtagResponse.FailureReason.ACCOUNT_DENYLISTED;
    }
}
