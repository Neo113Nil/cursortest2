package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SetProfilePhotoResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SetProfilePhotoResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetProfilePhotoResponse.Status.Companion.getClass();
        if (i == 0) {
            return SetProfilePhotoResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return SetProfilePhotoResponse.Status.SUCCESS;
    }
}
