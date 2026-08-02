package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.NewDeviceLoginRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class NewDeviceLoginRenderData$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        NewDeviceLoginRenderData.Status.Companion.getClass();
        if (i == 1) {
            return NewDeviceLoginRenderData.Status.UNREVIEWED;
        }
        if (i == 2) {
            return NewDeviceLoginRenderData.Status.VERIFIED;
        }
        if (i != 3) {
            return null;
        }
        return NewDeviceLoginRenderData.Status.LOGGED_OUT;
    }
}
