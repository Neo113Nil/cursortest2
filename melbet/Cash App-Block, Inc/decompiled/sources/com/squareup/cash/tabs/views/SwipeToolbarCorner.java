package com.squareup.cash.tabs.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class SwipeToolbarCorner {
    public static final /* synthetic */ SwipeToolbarCorner[] $VALUES;
    public static final SwipeToolbarCorner Leading;
    public static final SwipeToolbarCorner Trailing;

    static {
        SwipeToolbarCorner swipeToolbarCorner = new SwipeToolbarCorner("Leading", 0);
        Leading = swipeToolbarCorner;
        SwipeToolbarCorner swipeToolbarCorner2 = new SwipeToolbarCorner("Trailing", 1);
        Trailing = swipeToolbarCorner2;
        $VALUES = new SwipeToolbarCorner[]{swipeToolbarCorner, swipeToolbarCorner2};
    }

    public static SwipeToolbarCorner valueOf(String str) {
        return (SwipeToolbarCorner) Enum.valueOf(SwipeToolbarCorner.class, str);
    }

    public static SwipeToolbarCorner[] values() {
        return (SwipeToolbarCorner[]) $VALUES.clone();
    }
}
