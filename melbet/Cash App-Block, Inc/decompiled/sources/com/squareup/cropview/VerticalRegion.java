package com.squareup.cropview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class VerticalRegion {
    public static final /* synthetic */ VerticalRegion[] $VALUES;
    public static final VerticalRegion BOTTOM;
    public static final VerticalRegion CENTER;
    public static final VerticalRegion TOP;

    static {
        VerticalRegion verticalRegion = new VerticalRegion("TOP", 0);
        TOP = verticalRegion;
        VerticalRegion verticalRegion2 = new VerticalRegion("CENTER", 1);
        CENTER = verticalRegion2;
        VerticalRegion verticalRegion3 = new VerticalRegion("BOTTOM", 2);
        BOTTOM = verticalRegion3;
        $VALUES = new VerticalRegion[]{verticalRegion, verticalRegion2, verticalRegion3};
    }

    public static VerticalRegion valueOf(String str) {
        return (VerticalRegion) Enum.valueOf(VerticalRegion.class, str);
    }

    public static VerticalRegion[] values() {
        return (VerticalRegion[]) $VALUES.clone();
    }
}
