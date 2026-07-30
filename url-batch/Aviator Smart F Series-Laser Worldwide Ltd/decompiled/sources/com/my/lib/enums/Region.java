package com.my.lib.enums;

import a6.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Region {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Region[] $VALUES;
    private final int value;
    public static final Region NONE = new Region("NONE", 0, 0);
    public static final Region OVERSEAS = new Region("OVERSEAS", 1, 1);
    public static final Region CHINA = new Region("CHINA", 2, 2);

    private static final /* synthetic */ Region[] $values() {
        return new Region[]{NONE, OVERSEAS, CHINA};
    }

    static {
        Region[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.enumEntries($values);
    }

    private Region(String str, int i8, int i9) {
        this.value = i9;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static Region valueOf(String str) {
        return (Region) Enum.valueOf(Region.class, str);
    }

    public static Region[] values() {
        return (Region[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
