package com.squareup.protos.cash.kgoosememorystore.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class MemoryTopicTag$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        MemoryTopicTag.Companion.getClass();
        switch (i) {
            case 0:
                return MemoryTopicTag.MEMORY_TOPIC_TAG_UNSPECIFIED;
            case 1:
                return MemoryTopicTag.MEMORY_TOPIC_TAG_HOUSEHOLD_AND_CONTEXT;
            case 2:
                return MemoryTopicTag.MEMORY_TOPIC_TAG_GOALS_AND_TIMELINES;
            case 3:
                return MemoryTopicTag.MEMORY_TOPIC_TAG_RISK_TOLERANCE;
            case 4:
                return MemoryTopicTag.MEMORY_TOPIC_TAG_CASHFLOW_AND_SPENDING;
            case 5:
                return MemoryTopicTag.MEMORY_TOPIC_TAG_COMMUNICATION_PREFERENCES;
            case 6:
                return MemoryTopicTag.MEMORY_TOPIC_TAG_FINANCIAL_PLANNING;
            case 7:
                return MemoryTopicTag.MEMORY_TOPIC_TAG_OTHER;
            default:
                return null;
        }
    }
}
