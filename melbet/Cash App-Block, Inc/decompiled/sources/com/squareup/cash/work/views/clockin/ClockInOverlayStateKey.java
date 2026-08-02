package com.squareup.cash.work.views.clockin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ClockInOverlayStateKey {
    public static final /* synthetic */ ClockInOverlayStateKey[] $VALUES;
    public static final ClockInOverlayStateKey ClockedIn;
    public static final ClockInOverlayStateKey ClockedOut;
    public static final ClockInOverlayStateKey ClockedOutSummary;
    public static final ClockInOverlayStateKey OnBreak;

    static {
        ClockInOverlayStateKey clockInOverlayStateKey = new ClockInOverlayStateKey("ClockedOut", 0);
        ClockedOut = clockInOverlayStateKey;
        ClockInOverlayStateKey clockInOverlayStateKey2 = new ClockInOverlayStateKey("ClockedIn", 1);
        ClockedIn = clockInOverlayStateKey2;
        ClockInOverlayStateKey clockInOverlayStateKey3 = new ClockInOverlayStateKey("OnBreak", 2);
        OnBreak = clockInOverlayStateKey3;
        ClockInOverlayStateKey clockInOverlayStateKey4 = new ClockInOverlayStateKey("ClockedOutSummary", 3);
        ClockedOutSummary = clockInOverlayStateKey4;
        $VALUES = new ClockInOverlayStateKey[]{clockInOverlayStateKey, clockInOverlayStateKey2, clockInOverlayStateKey3, clockInOverlayStateKey4};
    }

    public static ClockInOverlayStateKey valueOf(String str) {
        return (ClockInOverlayStateKey) Enum.valueOf(ClockInOverlayStateKey.class, str);
    }

    public static ClockInOverlayStateKey[] values() {
        return (ClockInOverlayStateKey[]) $VALUES.clone();
    }
}
