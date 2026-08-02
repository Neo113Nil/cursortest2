package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.GetCashtagStatusRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class GetCashtagStatusRequest$CashtagRestriction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetCashtagStatusRequest.CashtagRestriction.Companion.getClass();
        if (i == 0) {
            return GetCashtagStatusRequest.CashtagRestriction.DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return GetCashtagStatusRequest.CashtagRestriction.NO_CASHTAG_REUSE;
    }
}
