package com.chicken.road.cerman.fixs.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/chicken/road/cerman/fixs/data/ChickenStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Active", "Sold", "Dead", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChickenStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChickenStatus[] $VALUES;
    public static final ChickenStatus Active = new ChickenStatus("Active", 0);
    public static final ChickenStatus Sold = new ChickenStatus("Sold", 1);
    public static final ChickenStatus Dead = new ChickenStatus("Dead", 2);

    private static final /* synthetic */ ChickenStatus[] $values() {
        return new ChickenStatus[]{Active, Sold, Dead};
    }

    public static EnumEntries<ChickenStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        ChickenStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ChickenStatus(String str, int i) {
    }

    public static ChickenStatus valueOf(String str) {
        return (ChickenStatus) Enum.valueOf(ChickenStatus.class, str);
    }

    public static ChickenStatus[] values() {
        return (ChickenStatus[]) $VALUES.clone();
    }
}
