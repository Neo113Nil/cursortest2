package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.PhysicalCardData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PhysicalCardData$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PhysicalCardData.State.Companion.getClass();
        if (i == 1) {
            return PhysicalCardData.State.REQUESTED;
        }
        if (i == 2) {
            return PhysicalCardData.State.READY_TO_ACTIVATE;
        }
        if (i != 3) {
            return null;
        }
        return PhysicalCardData.State.ACTIVATED;
    }
}
