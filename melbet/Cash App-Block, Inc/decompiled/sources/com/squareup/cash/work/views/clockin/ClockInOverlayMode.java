package com.squareup.cash.work.views.clockin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ClockInOverlayMode {
    public static final /* synthetic */ ClockInOverlayMode[] $VALUES;
    public static final ClockInOverlayMode BreakPicker;
    public static final ClockInOverlayMode ClockOutConfirmation;
    public static final ClockInOverlayMode DeclareCashTip;
    public static final ClockInOverlayMode JobPicker;
    public static final ClockInOverlayMode LocationPicker;
    public static final ClockInOverlayMode Main;

    static {
        ClockInOverlayMode clockInOverlayMode = new ClockInOverlayMode("Main", 0);
        Main = clockInOverlayMode;
        ClockInOverlayMode clockInOverlayMode2 = new ClockInOverlayMode("LocationPicker", 1);
        LocationPicker = clockInOverlayMode2;
        ClockInOverlayMode clockInOverlayMode3 = new ClockInOverlayMode("JobPicker", 2);
        JobPicker = clockInOverlayMode3;
        ClockInOverlayMode clockInOverlayMode4 = new ClockInOverlayMode("BreakPicker", 3);
        BreakPicker = clockInOverlayMode4;
        ClockInOverlayMode clockInOverlayMode5 = new ClockInOverlayMode("ClockOutConfirmation", 4);
        ClockOutConfirmation = clockInOverlayMode5;
        ClockInOverlayMode clockInOverlayMode6 = new ClockInOverlayMode("DeclareCashTip", 5);
        DeclareCashTip = clockInOverlayMode6;
        $VALUES = new ClockInOverlayMode[]{clockInOverlayMode, clockInOverlayMode2, clockInOverlayMode3, clockInOverlayMode4, clockInOverlayMode5, clockInOverlayMode6};
    }

    public static ClockInOverlayMode valueOf(String str) {
        return (ClockInOverlayMode) Enum.valueOf(ClockInOverlayMode.class, str);
    }

    public static ClockInOverlayMode[] values() {
        return (ClockInOverlayMode[]) $VALUES.clone();
    }
}
