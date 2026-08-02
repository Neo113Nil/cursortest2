package com.squareup.protos.cash.kgoosememorystore.api.v1;

import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum MemoryType implements WireEnum {
    MEMORY_TYPE_UNSPECIFIED(0),
    MEMORY_TYPE_USER_PREFERENCE(1),
    MEMORY_TYPE_FACTUAL_INFO(2),
    MEMORY_TYPE_CONVERSATION_SUMMARY(3),
    MEMORY_TYPE_BEHAVIORAL_PATTERN(4),
    MEMORY_TYPE_OPEN_LOOP(5);

    public static final MemoryType$Companion$ADAPTER$1 ADAPTER;
    public static final FeeType.Companion Companion;
    public final int value;

    static {
        MemoryType memoryType = MEMORY_TYPE_UNSPECIFIED;
        Companion = new FeeType.Companion();
        ADAPTER = new MemoryType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MemoryType.class), Syntax.PROTO_2, memoryType);
    }

    MemoryType(int i) {
        this.value = i;
    }

    public static final MemoryType fromValue(int i) {
        Companion.getClass();
        return FeeType.Companion.m3910fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
