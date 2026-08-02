package com.squareup.protos.cash.kgoosememorystore.api.v1;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum MemoryTopicTag implements WireEnum {
    MEMORY_TOPIC_TAG_UNSPECIFIED(0),
    MEMORY_TOPIC_TAG_HOUSEHOLD_AND_CONTEXT(1),
    MEMORY_TOPIC_TAG_GOALS_AND_TIMELINES(2),
    MEMORY_TOPIC_TAG_RISK_TOLERANCE(3),
    MEMORY_TOPIC_TAG_CASHFLOW_AND_SPENDING(4),
    MEMORY_TOPIC_TAG_COMMUNICATION_PREFERENCES(5),
    MEMORY_TOPIC_TAG_FINANCIAL_PLANNING(6),
    MEMORY_TOPIC_TAG_OTHER(7);

    public static final MemoryTopicTag$Companion$ADAPTER$1 ADAPTER;
    public static final SliceStatus.Companion Companion;
    public final int value;

    static {
        MemoryTopicTag memoryTopicTag = MEMORY_TOPIC_TAG_UNSPECIFIED;
        Companion = new SliceStatus.Companion();
        ADAPTER = new MemoryTopicTag$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MemoryTopicTag.class), Syntax.PROTO_2, memoryTopicTag);
    }

    MemoryTopicTag(int i) {
        this.value = i;
    }

    public static final MemoryTopicTag fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return MEMORY_TOPIC_TAG_UNSPECIFIED;
            case 1:
                return MEMORY_TOPIC_TAG_HOUSEHOLD_AND_CONTEXT;
            case 2:
                return MEMORY_TOPIC_TAG_GOALS_AND_TIMELINES;
            case 3:
                return MEMORY_TOPIC_TAG_RISK_TOLERANCE;
            case 4:
                return MEMORY_TOPIC_TAG_CASHFLOW_AND_SPENDING;
            case 5:
                return MEMORY_TOPIC_TAG_COMMUNICATION_PREFERENCES;
            case 6:
                return MEMORY_TOPIC_TAG_FINANCIAL_PLANNING;
            case 7:
                return MEMORY_TOPIC_TAG_OTHER;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
