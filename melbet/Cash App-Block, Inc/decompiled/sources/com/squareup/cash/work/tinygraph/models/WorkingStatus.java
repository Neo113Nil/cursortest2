package com.squareup.cash.work.tinygraph.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class WorkingStatus {
    public static final /* synthetic */ WorkingStatus[] $VALUES = {new WorkingStatus("WORKING", 0), new WorkingStatus("NOT_WORKING", 1), new WorkingStatus("UNKNOWN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    WorkingStatus EF5;

    public static WorkingStatus valueOf(String str) {
        return (WorkingStatus) Enum.valueOf(WorkingStatus.class, str);
    }

    public static WorkingStatus[] values() {
        return (WorkingStatus[]) $VALUES.clone();
    }
}
