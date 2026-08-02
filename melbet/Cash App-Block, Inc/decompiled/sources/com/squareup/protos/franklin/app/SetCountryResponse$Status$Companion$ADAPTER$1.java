package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SetCountryResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SetCountryResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetCountryResponse.Status.Companion.getClass();
        if (i == 0) {
            return SetCountryResponse.Status.INVALID;
        }
        if (i == 1) {
            return SetCountryResponse.Status.SUCCESS;
        }
        if (i == 2) {
            return SetCountryResponse.Status.TOO_LATE_TO_CHANGE;
        }
        if (i != 3) {
            return null;
        }
        return SetCountryResponse.Status.COUNTRY_NOT_SUPPORTED;
    }
}
