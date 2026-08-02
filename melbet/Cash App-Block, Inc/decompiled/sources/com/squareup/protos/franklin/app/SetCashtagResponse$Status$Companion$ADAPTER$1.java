package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SetCashtagResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class SetCashtagResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetCashtagResponse.Status.Companion.getClass();
        if (i == 0) {
            return SetCashtagResponse.Status.INVALID;
        }
        if (i == 1) {
            return SetCashtagResponse.Status.SUCCESS;
        }
        if (i == 3) {
            return SetCashtagResponse.Status.CASHTAG_STATUS_FAILURE;
        }
        if (i != 4) {
            return null;
        }
        return SetCashtagResponse.Status.FAILURE;
    }
}
