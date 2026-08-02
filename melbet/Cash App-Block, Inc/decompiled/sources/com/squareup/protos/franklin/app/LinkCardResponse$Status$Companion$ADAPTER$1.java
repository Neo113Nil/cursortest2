package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.LinkCardResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class LinkCardResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LinkCardResponse.Status.Companion.getClass();
        if (i == 0) {
            return LinkCardResponse.Status.INVALID;
        }
        if (i == 1) {
            return LinkCardResponse.Status.SUCCESS;
        }
        if (i == 3) {
            return LinkCardResponse.Status.FAILURE;
        }
        if (i != 4) {
            return null;
        }
        return LinkCardResponse.Status.INSTRUMENT_TYPE_MISMATCH;
    }
}
