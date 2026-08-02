package com.withpersona.sdk2.inquiry.steps.ui.styling;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class TextStyleElements {
    public static final /* synthetic */ TextStyleElements[] $VALUES;
    public static final TextStyleElements Justification;
    public static final TextStyleElements LineHeight;
    public static final TextStyleElements Margin;

    static {
        TextStyleElements textStyleElements = new TextStyleElements("LineHeight", 0);
        LineHeight = textStyleElements;
        TextStyleElements textStyleElements2 = new TextStyleElements("Justification", 1);
        Justification = textStyleElements2;
        TextStyleElements textStyleElements3 = new TextStyleElements("Margin", 2);
        Margin = textStyleElements3;
        $VALUES = new TextStyleElements[]{textStyleElements, textStyleElements2, textStyleElements3};
    }

    public static TextStyleElements valueOf(String str) {
        return (TextStyleElements) Enum.valueOf(TextStyleElements.class, str);
    }

    public static TextStyleElements[] values() {
        return (TextStyleElements[]) $VALUES.clone();
    }
}
