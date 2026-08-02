package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.RegisterDeviceResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class RegisterDeviceResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RegisterDeviceResponse.Status.Companion.getClass();
        if (i == 0) {
            return RegisterDeviceResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return RegisterDeviceResponse.Status.SUCCESS;
    }
}
