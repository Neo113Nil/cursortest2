package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatusFilter;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "TRIGGERED_ACTION_STATUS_FILTER_UNSPECIFIED", "TRIGGERED_ACTION_STATUS_FILTER_ALL", "TRIGGERED_ACTION_STATUS_FILTER_PENDING", "TRIGGERED_ACTION_STATUS_FILTER_EXECUTED", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TriggeredActionStatusFilter implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TriggeredActionStatusFilter[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TriggeredActionStatusFilter TRIGGERED_ACTION_STATUS_FILTER_ALL;
    public static final TriggeredActionStatusFilter TRIGGERED_ACTION_STATUS_FILTER_EXECUTED;
    public static final TriggeredActionStatusFilter TRIGGERED_ACTION_STATUS_FILTER_PENDING;
    public static final TriggeredActionStatusFilter TRIGGERED_ACTION_STATUS_FILTER_UNSPECIFIED;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatusFilter$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatusFilter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        TriggeredActionStatusFilter triggeredActionStatusFilter = new TriggeredActionStatusFilter("TRIGGERED_ACTION_STATUS_FILTER_UNSPECIFIED", 0, 0);
        TRIGGERED_ACTION_STATUS_FILTER_UNSPECIFIED = triggeredActionStatusFilter;
        TriggeredActionStatusFilter triggeredActionStatusFilter2 = new TriggeredActionStatusFilter("TRIGGERED_ACTION_STATUS_FILTER_ALL", 1, 1);
        TRIGGERED_ACTION_STATUS_FILTER_ALL = triggeredActionStatusFilter2;
        TriggeredActionStatusFilter triggeredActionStatusFilter3 = new TriggeredActionStatusFilter("TRIGGERED_ACTION_STATUS_FILTER_PENDING", 2, 2);
        TRIGGERED_ACTION_STATUS_FILTER_PENDING = triggeredActionStatusFilter3;
        TriggeredActionStatusFilter triggeredActionStatusFilter4 = new TriggeredActionStatusFilter("TRIGGERED_ACTION_STATUS_FILTER_EXECUTED", 3, 3);
        TRIGGERED_ACTION_STATUS_FILTER_EXECUTED = triggeredActionStatusFilter4;
        TriggeredActionStatusFilter[] triggeredActionStatusFilterArr = {triggeredActionStatusFilter, triggeredActionStatusFilter2, triggeredActionStatusFilter3, triggeredActionStatusFilter4};
        $VALUES = triggeredActionStatusFilterArr;
        $ENTRIES = new EnumEntriesList(triggeredActionStatusFilterArr);
        INSTANCE = new Companion();
        ADAPTER = new TriggeredActionStatusFilter$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TriggeredActionStatusFilter.class), Syntax.PROTO_2, triggeredActionStatusFilter);
    }

    public TriggeredActionStatusFilter(String str, int i, int i2) {
        this.value = i2;
    }

    public static final TriggeredActionStatusFilter fromValue(int i) {
        INSTANCE.getClass();
        if (i == 0) {
            return TRIGGERED_ACTION_STATUS_FILTER_UNSPECIFIED;
        }
        if (i == 1) {
            return TRIGGERED_ACTION_STATUS_FILTER_ALL;
        }
        if (i == 2) {
            return TRIGGERED_ACTION_STATUS_FILTER_PENDING;
        }
        if (i != 3) {
            return null;
        }
        return TRIGGERED_ACTION_STATUS_FILTER_EXECUTED;
    }

    public static TriggeredActionStatusFilter valueOf(String str) {
        return (TriggeredActionStatusFilter) Enum.valueOf(TriggeredActionStatusFilter.class, str);
    }

    public static TriggeredActionStatusFilter[] values() {
        return (TriggeredActionStatusFilter[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
