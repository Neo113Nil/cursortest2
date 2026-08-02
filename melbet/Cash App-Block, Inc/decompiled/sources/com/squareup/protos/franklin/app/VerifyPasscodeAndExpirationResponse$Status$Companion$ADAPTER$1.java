package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.VerifyPasscodeAndExpirationResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class VerifyPasscodeAndExpirationResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        VerifyPasscodeAndExpirationResponse.Status.Companion.getClass();
        if (i == 0) {
            return VerifyPasscodeAndExpirationResponse.Status.INVALID;
        }
        if (i == 1) {
            return VerifyPasscodeAndExpirationResponse.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return VerifyPasscodeAndExpirationResponse.Status.FAILURE;
    }
}
