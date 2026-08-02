package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.UnlinkInstrumentResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class UnlinkInstrumentResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UnlinkInstrumentResponse.Status.Companion.getClass();
        if (i == 0) {
            return UnlinkInstrumentResponse.Status.SUCCESS;
        }
        if (i != 1) {
            return null;
        }
        return UnlinkInstrumentResponse.Status.INELIGIBLE;
    }
}
