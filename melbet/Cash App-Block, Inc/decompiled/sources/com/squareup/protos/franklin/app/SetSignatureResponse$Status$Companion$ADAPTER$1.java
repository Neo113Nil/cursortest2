package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SetSignatureResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SetSignatureResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetSignatureResponse.Status.Companion.getClass();
        if (i == 0) {
            return SetSignatureResponse.Status.INVALID;
        }
        if (i == 1) {
            return SetSignatureResponse.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return SetSignatureResponse.Status.FAILURE;
    }
}
