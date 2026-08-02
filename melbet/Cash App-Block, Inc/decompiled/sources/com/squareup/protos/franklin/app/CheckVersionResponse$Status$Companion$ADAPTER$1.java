package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.CheckVersionResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class CheckVersionResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CheckVersionResponse.Status.Companion.getClass();
        if (i == 0) {
            return CheckVersionResponse.Status.INVALID;
        }
        if (i == 1) {
            return CheckVersionResponse.Status.VERSION_OK;
        }
        if (i == 2) {
            return CheckVersionResponse.Status.UPGRADE_SUGGESTED;
        }
        if (i != 3) {
            return null;
        }
        return CheckVersionResponse.Status.UPGRADE_REQUIRED;
    }
}
