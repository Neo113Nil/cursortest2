package com.stripe.android.uicore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class SectionStyle {
    public static final /* synthetic */ SectionStyle[] $VALUES;
    public static final SectionStyle Bordered;

    static {
        SectionStyle sectionStyle = new SectionStyle("Bordered", 0);
        Bordered = sectionStyle;
        $VALUES = new SectionStyle[]{sectionStyle, new SectionStyle("Borderless", 1)};
    }

    public static SectionStyle valueOf(String str) {
        return (SectionStyle) Enum.valueOf(SectionStyle.class, str);
    }

    public static SectionStyle[] values() {
        return (SectionStyle[]) $VALUES.clone();
    }
}
