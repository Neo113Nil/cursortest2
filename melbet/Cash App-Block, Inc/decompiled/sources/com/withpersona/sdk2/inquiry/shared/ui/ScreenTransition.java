package com.withpersona.sdk2.inquiry.shared.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ScreenTransition {
    public static final /* synthetic */ ScreenTransition[] $VALUES;
    public static final ScreenTransition NONE;
    public static final ScreenTransition SLIDE_IN;
    public static final ScreenTransition SLIDE_OUT;

    static {
        ScreenTransition screenTransition = new ScreenTransition("SLIDE_IN", 0);
        SLIDE_IN = screenTransition;
        ScreenTransition screenTransition2 = new ScreenTransition("SLIDE_OUT", 1);
        SLIDE_OUT = screenTransition2;
        ScreenTransition screenTransition3 = new ScreenTransition("NONE", 2);
        NONE = screenTransition3;
        $VALUES = new ScreenTransition[]{screenTransition, screenTransition2, screenTransition3};
    }

    public static ScreenTransition valueOf(String str) {
        return (ScreenTransition) Enum.valueOf(ScreenTransition.class, str);
    }

    public static ScreenTransition[] values() {
        return (ScreenTransition[]) $VALUES.clone();
    }
}
