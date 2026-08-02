package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.ClearProfilePhotoResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ClearProfilePhotoResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ClearProfilePhotoResponse.Status.Companion.getClass();
        if (i == 0) {
            return ClearProfilePhotoResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return ClearProfilePhotoResponse.Status.SUCCESS;
    }
}
