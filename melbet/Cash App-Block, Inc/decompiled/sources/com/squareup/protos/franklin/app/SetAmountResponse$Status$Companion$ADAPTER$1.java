package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SetAmountResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SetAmountResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetAmountResponse.Status.Companion.getClass();
        if (i == 0) {
            return SetAmountResponse.Status.INVALID;
        }
        if (i == 1) {
            return SetAmountResponse.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return SetAmountResponse.Status.FAILURE;
    }
}
