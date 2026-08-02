package com.squareup.protos.cash.kgoosememorystore.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class MemoryStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        MemoryStatus.Companion.getClass();
        if (i == 0) {
            return MemoryStatus.MEMORY_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return MemoryStatus.MEMORY_STATUS_ACTIVE;
        }
        if (i == 2) {
            return MemoryStatus.MEMORY_STATUS_REPLACED;
        }
        if (i != 3) {
            return null;
        }
        return MemoryStatus.MEMORY_STATUS_EXPIRED;
    }
}
