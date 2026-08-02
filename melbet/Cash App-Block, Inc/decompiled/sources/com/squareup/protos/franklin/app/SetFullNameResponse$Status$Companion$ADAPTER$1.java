package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SetFullNameResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class SetFullNameResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetFullNameResponse.Status.Companion.getClass();
        if (i == 0) {
            return SetFullNameResponse.Status.INVALID;
        }
        if (i == 1) {
            return SetFullNameResponse.Status.SUCCESS;
        }
        if (i != 3) {
            return null;
        }
        return SetFullNameResponse.Status.INVALID_NAME;
    }
}
