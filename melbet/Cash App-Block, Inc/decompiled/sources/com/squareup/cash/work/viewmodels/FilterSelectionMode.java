package com.squareup.cash.work.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FilterSelectionMode {
    public static final /* synthetic */ FilterSelectionMode[] $VALUES;
    public static final FilterSelectionMode MULTI;

    /* JADX INFO: Fake field, exist only in values array */
    FilterSelectionMode EF0;

    static {
        FilterSelectionMode filterSelectionMode = new FilterSelectionMode("SINGLE", 0);
        FilterSelectionMode filterSelectionMode2 = new FilterSelectionMode("MULTI", 1);
        MULTI = filterSelectionMode2;
        $VALUES = new FilterSelectionMode[]{filterSelectionMode, filterSelectionMode2};
    }

    public static FilterSelectionMode valueOf(String str) {
        return (FilterSelectionMode) Enum.valueOf(FilterSelectionMode.class, str);
    }

    public static FilterSelectionMode[] values() {
        return (FilterSelectionMode[]) $VALUES.clone();
    }
}
