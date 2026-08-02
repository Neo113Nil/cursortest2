package com.squareup.cropview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class HorizontalRegion {
    public static final /* synthetic */ HorizontalRegion[] $VALUES;
    public static final HorizontalRegion CENTER;
    public static final HorizontalRegion LEFT;
    public static final HorizontalRegion RIGHT;

    static {
        HorizontalRegion horizontalRegion = new HorizontalRegion("LEFT", 0);
        LEFT = horizontalRegion;
        HorizontalRegion horizontalRegion2 = new HorizontalRegion("CENTER", 1);
        CENTER = horizontalRegion2;
        HorizontalRegion horizontalRegion3 = new HorizontalRegion("RIGHT", 2);
        RIGHT = horizontalRegion3;
        $VALUES = new HorizontalRegion[]{horizontalRegion, horizontalRegion2, horizontalRegion3};
    }

    public static HorizontalRegion valueOf(String str) {
        return (HorizontalRegion) Enum.valueOf(HorizontalRegion.class, str);
    }

    public static HorizontalRegion[] values() {
        return (HorizontalRegion[]) $VALUES.clone();
    }
}
