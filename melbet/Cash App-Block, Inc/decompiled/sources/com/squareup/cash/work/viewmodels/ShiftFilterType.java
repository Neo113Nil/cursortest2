package com.squareup.cash.work.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ShiftFilterType {
    public static final /* synthetic */ ShiftFilterType[] $VALUES;
    public static final ShiftFilterType LOCATION;

    static {
        ShiftFilterType shiftFilterType = new ShiftFilterType("LOCATION", 0);
        LOCATION = shiftFilterType;
        $VALUES = new ShiftFilterType[]{shiftFilterType};
    }

    public static ShiftFilterType valueOf(String str) {
        return (ShiftFilterType) Enum.valueOf(ShiftFilterType.class, str);
    }

    public static ShiftFilterType[] values() {
        return (ShiftFilterType[]) $VALUES.clone();
    }
}
