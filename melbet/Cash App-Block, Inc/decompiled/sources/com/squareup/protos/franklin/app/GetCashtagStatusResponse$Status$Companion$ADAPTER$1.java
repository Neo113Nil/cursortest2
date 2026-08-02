package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.GetCashtagStatusResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class GetCashtagStatusResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetCashtagStatusResponse.Status.Companion.getClass();
        if (i == 0) {
            return GetCashtagStatusResponse.Status.INVALID;
        }
        if (i == 1) {
            return GetCashtagStatusResponse.Status.SUCCESS;
        }
        if (i != 3) {
            return null;
        }
        return GetCashtagStatusResponse.Status.TOO_MANY_REQUESTS;
    }
}
