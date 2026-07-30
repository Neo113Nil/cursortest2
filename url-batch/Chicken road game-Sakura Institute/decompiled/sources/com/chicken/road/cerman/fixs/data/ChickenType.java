package com.chicken.road.cerman.fixs.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/chicken/road/cerman/fixs/data/ChickenType;", "", "<init>", "(Ljava/lang/String;I)V", "Broiler", "Layer", "DualPurpose", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChickenType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChickenType[] $VALUES;
    public static final ChickenType Broiler = new ChickenType("Broiler", 0);
    public static final ChickenType Layer = new ChickenType("Layer", 1);
    public static final ChickenType DualPurpose = new ChickenType("DualPurpose", 2);

    private static final /* synthetic */ ChickenType[] $values() {
        return new ChickenType[]{Broiler, Layer, DualPurpose};
    }

    public static EnumEntries<ChickenType> getEntries() {
        return $ENTRIES;
    }

    static {
        ChickenType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ChickenType(String str, int i) {
    }

    public static ChickenType valueOf(String str) {
        return (ChickenType) Enum.valueOf(ChickenType.class, str);
    }

    public static ChickenType[] values() {
        return (ChickenType[]) $VALUES.clone();
    }
}
