package com.squareup.scannerview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class FlashState {
    public static final /* synthetic */ FlashState[] $VALUES;
    public static final FlashState OFF;
    public static final FlashState ON;
    public static final FlashState UNAVAILABLE;

    static {
        FlashState flashState = new FlashState("UNAVAILABLE", 0);
        UNAVAILABLE = flashState;
        FlashState flashState2 = new FlashState("OFF", 1);
        OFF = flashState2;
        FlashState flashState3 = new FlashState("ON", 2);
        ON = flashState3;
        $VALUES = new FlashState[]{flashState, flashState2, flashState3};
    }

    public static FlashState valueOf(String str) {
        return (FlashState) Enum.valueOf(FlashState.class, str);
    }

    public static FlashState[] values() {
        return (FlashState[]) $VALUES.clone();
    }
}
