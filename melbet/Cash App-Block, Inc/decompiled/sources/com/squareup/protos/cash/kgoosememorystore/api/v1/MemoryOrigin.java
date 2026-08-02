package com.squareup.protos.cash.kgoosememorystore.api.v1;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum MemoryOrigin implements WireEnum {
    MEMORY_ORIGIN_UNSPECIFIED(0),
    MEMORY_ORIGIN_SESSION_EXTRACTION(1),
    MEMORY_ORIGIN_MCP(2),
    MEMORY_ORIGIN_TOOLBOX(3),
    MEMORY_ORIGIN_USER_EDIT(4);

    public static final MemoryOrigin$Companion$ADAPTER$1 ADAPTER;
    public static final RetailerType.Companion Companion;
    public final int value;

    static {
        MemoryOrigin memoryOrigin = MEMORY_ORIGIN_UNSPECIFIED;
        Companion = new RetailerType.Companion();
        ADAPTER = new MemoryOrigin$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MemoryOrigin.class), Syntax.PROTO_2, memoryOrigin);
    }

    MemoryOrigin(int i) {
        this.value = i;
    }

    public static final MemoryOrigin fromValue(int i) {
        Companion.getClass();
        return RetailerType.Companion.m3901fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
