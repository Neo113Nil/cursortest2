package com.squareup.cash.work.tinygraph;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class EntityOperationType {
    public static final /* synthetic */ EntityOperationType[] $VALUES;
    public static final EntityOperationType UPSERT;

    static {
        EntityOperationType entityOperationType = new EntityOperationType("UPSERT", 0);
        UPSERT = entityOperationType;
        $VALUES = new EntityOperationType[]{entityOperationType, new EntityOperationType("DELETE", 1)};
    }

    public static EntityOperationType valueOf(String str) {
        return (EntityOperationType) Enum.valueOf(EntityOperationType.class, str);
    }

    public static EntityOperationType[] values() {
        return (EntityOperationType[]) $VALUES.clone();
    }
}
