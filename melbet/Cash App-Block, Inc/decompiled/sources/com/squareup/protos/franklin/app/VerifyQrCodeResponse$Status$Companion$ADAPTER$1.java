package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.VerifyQrCodeResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class VerifyQrCodeResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        VerifyQrCodeResponse.Status.Companion.getClass();
        if (i == 0) {
            return VerifyQrCodeResponse.Status.INVALID;
        }
        if (i == 1) {
            return VerifyQrCodeResponse.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return VerifyQrCodeResponse.Status.FAILURE;
    }
}
