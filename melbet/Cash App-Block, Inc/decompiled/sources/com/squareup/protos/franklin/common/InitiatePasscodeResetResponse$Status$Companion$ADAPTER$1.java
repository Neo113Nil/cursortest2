package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.InitiatePasscodeResetResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class InitiatePasscodeResetResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InitiatePasscodeResetResponse.Status.Companion.getClass();
        if (i == 0) {
            return InitiatePasscodeResetResponse.Status.INVALID;
        }
        if (i == 1) {
            return InitiatePasscodeResetResponse.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return InitiatePasscodeResetResponse.Status.CONCURRENT_MODIFICATION;
    }
}
