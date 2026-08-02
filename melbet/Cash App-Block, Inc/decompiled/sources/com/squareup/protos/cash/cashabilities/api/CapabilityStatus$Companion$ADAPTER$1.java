package com.squareup.protos.cash.cashabilities.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CapabilityStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CapabilityStatus.Companion.getClass();
        if (i == 1) {
            return CapabilityStatus.AVAILABLE;
        }
        if (i != 2) {
            return null;
        }
        return CapabilityStatus.UNAVAILABLE;
    }
}
