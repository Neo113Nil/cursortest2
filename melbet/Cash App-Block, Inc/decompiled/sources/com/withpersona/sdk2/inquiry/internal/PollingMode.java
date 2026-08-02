package com.withpersona.sdk2.inquiry.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class PollingMode {
    public static final /* synthetic */ PollingMode[] $VALUES;
    public static final PollingMode Background;
    public static final PollingMode Blocking;

    static {
        PollingMode pollingMode = new PollingMode("Background", 0);
        Background = pollingMode;
        PollingMode pollingMode2 = new PollingMode("Blocking", 1);
        Blocking = pollingMode2;
        $VALUES = new PollingMode[]{pollingMode, pollingMode2};
    }

    public static PollingMode valueOf(String str) {
        return (PollingMode) Enum.valueOf(PollingMode.class, str);
    }

    public static PollingMode[] values() {
        return (PollingMode[]) $VALUES.clone();
    }
}
