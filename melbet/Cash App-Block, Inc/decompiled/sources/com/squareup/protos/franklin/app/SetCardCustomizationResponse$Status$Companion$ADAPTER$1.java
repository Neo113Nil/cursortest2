package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SetCardCustomizationResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class SetCardCustomizationResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetCardCustomizationResponse.Status.Companion.getClass();
        if (i == 0) {
            return SetCardCustomizationResponse.Status.INVALID;
        }
        if (i == 1) {
            return SetCardCustomizationResponse.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return SetCardCustomizationResponse.Status.FAILURE;
    }
}
