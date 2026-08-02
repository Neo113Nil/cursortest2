package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SetAddressResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class SetAddressResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetAddressResponse.Status.Companion.getClass();
        if (i == 0) {
            return SetAddressResponse.Status.INVALID;
        }
        if (i == 1) {
            return SetAddressResponse.Status.SUCCESS;
        }
        if (i == 2) {
            return SetAddressResponse.Status.CONCURRENT_MODIFICATION;
        }
        if (i != 3) {
            return null;
        }
        return SetAddressResponse.Status.FAILURE;
    }
}
