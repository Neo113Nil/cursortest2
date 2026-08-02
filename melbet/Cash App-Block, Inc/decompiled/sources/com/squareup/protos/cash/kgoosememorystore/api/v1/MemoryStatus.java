package com.squareup.protos.cash.kgoosememorystore.api.v1;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum MemoryStatus implements WireEnum {
    MEMORY_STATUS_UNSPECIFIED(0),
    MEMORY_STATUS_ACTIVE(1),
    MEMORY_STATUS_REPLACED(2),
    MEMORY_STATUS_EXPIRED(3);

    public static final MemoryStatus$Companion$ADAPTER$1 ADAPTER;
    public static final Origin.Companion Companion;
    public final int value;

    static {
        MemoryStatus memoryStatus = MEMORY_STATUS_UNSPECIFIED;
        Companion = new Origin.Companion();
        ADAPTER = new MemoryStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MemoryStatus.class), Syntax.PROTO_2, memoryStatus);
    }

    MemoryStatus(int i) {
        this.value = i;
    }

    public static final MemoryStatus fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return MEMORY_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return MEMORY_STATUS_ACTIVE;
        }
        if (i == 2) {
            return MEMORY_STATUS_REPLACED;
        }
        if (i != 3) {
            return null;
        }
        return MEMORY_STATUS_EXPIRED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
