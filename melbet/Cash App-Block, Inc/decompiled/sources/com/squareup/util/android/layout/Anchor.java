package com.squareup.util.android.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Anchor {
    public static final /* synthetic */ Anchor[] $VALUES;
    public static final Anchor BottomLeft;
    public static final Anchor Center;
    public static final Anchor TopLeft;

    static {
        Anchor anchor = new Anchor("TopLeft", 0);
        TopLeft = anchor;
        Anchor anchor2 = new Anchor("TopRight", 1);
        Anchor anchor3 = new Anchor("BottomLeft", 2);
        BottomLeft = anchor3;
        Anchor anchor4 = new Anchor("Center", 3);
        Center = anchor4;
        $VALUES = new Anchor[]{anchor, anchor2, anchor3, anchor4};
    }

    public static Anchor valueOf(String str) {
        return (Anchor) Enum.valueOf(Anchor.class, str);
    }

    public static Anchor[] values() {
        return (Anchor[]) $VALUES.clone();
    }
}
