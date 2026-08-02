package com.squareup.cash.work.views.clockin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class DisabledClockInReason {
    public static final /* synthetic */ DisabledClockInReason[] $VALUES;
    public static final DisabledClockInReason NoJob;
    public static final DisabledClockInReason NoLocation;

    static {
        DisabledClockInReason disabledClockInReason = new DisabledClockInReason("NoLocation", 0);
        NoLocation = disabledClockInReason;
        DisabledClockInReason disabledClockInReason2 = new DisabledClockInReason("NoJob", 1);
        NoJob = disabledClockInReason2;
        $VALUES = new DisabledClockInReason[]{disabledClockInReason, disabledClockInReason2};
    }

    public static DisabledClockInReason valueOf(String str) {
        return (DisabledClockInReason) Enum.valueOf(DisabledClockInReason.class, str);
    }

    public static DisabledClockInReason[] values() {
        return (DisabledClockInReason[]) $VALUES.clone();
    }
}
