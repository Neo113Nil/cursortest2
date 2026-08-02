package com.squareup.cash.work.views.clockin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ClockInSheetMode {
    public static final /* synthetic */ ClockInSheetMode[] $VALUES;
    public static final ClockInSheetMode JobPicker;
    public static final ClockInSheetMode LocationPicker;
    public static final ClockInSheetMode Main;

    static {
        ClockInSheetMode clockInSheetMode = new ClockInSheetMode("Main", 0);
        Main = clockInSheetMode;
        ClockInSheetMode clockInSheetMode2 = new ClockInSheetMode("LocationPicker", 1);
        LocationPicker = clockInSheetMode2;
        ClockInSheetMode clockInSheetMode3 = new ClockInSheetMode("JobPicker", 2);
        JobPicker = clockInSheetMode3;
        $VALUES = new ClockInSheetMode[]{clockInSheetMode, clockInSheetMode2, clockInSheetMode3};
    }

    public static ClockInSheetMode valueOf(String str) {
        return (ClockInSheetMode) Enum.valueOf(ClockInSheetMode.class, str);
    }

    public static ClockInSheetMode[] values() {
        return (ClockInSheetMode[]) $VALUES.clone();
    }
}
