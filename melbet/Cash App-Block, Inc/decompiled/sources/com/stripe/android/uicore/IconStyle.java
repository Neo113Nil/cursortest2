package com.stripe.android.uicore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class IconStyle {
    public static final /* synthetic */ IconStyle[] $VALUES;
    public static final IconStyle Filled;

    static {
        IconStyle iconStyle = new IconStyle("Filled", 0);
        Filled = iconStyle;
        $VALUES = new IconStyle[]{iconStyle, new IconStyle("Outlined", 1)};
    }

    public static IconStyle valueOf(String str) {
        return (IconStyle) Enum.valueOf(IconStyle.class, str);
    }

    public static IconStyle[] values() {
        return (IconStyle[]) $VALUES.clone();
    }
}
