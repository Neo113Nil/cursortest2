package com.squareup.cash.ui.widget.keypad;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ExtraButton {
    public static final /* synthetic */ ExtraButton[] $VALUES;
    public static final ExtraButton ABC;
    public static final ExtraButton DECIMAL;
    public static final ExtraButton NONE;

    static {
        ExtraButton extraButton = new ExtraButton("NONE", 0);
        NONE = extraButton;
        ExtraButton extraButton2 = new ExtraButton("DECIMAL", 1);
        DECIMAL = extraButton2;
        ExtraButton extraButton3 = new ExtraButton("ABC", 2);
        ABC = extraButton3;
        $VALUES = new ExtraButton[]{extraButton, extraButton2, extraButton3};
    }

    public static ExtraButton valueOf(String str) {
        return (ExtraButton) Enum.valueOf(ExtraButton.class, str);
    }

    public static ExtraButton[] values() {
        return (ExtraButton[]) $VALUES.clone();
    }
}
