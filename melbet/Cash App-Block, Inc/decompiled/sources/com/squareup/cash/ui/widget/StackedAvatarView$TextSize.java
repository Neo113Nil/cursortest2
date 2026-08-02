package com.squareup.cash.ui.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class StackedAvatarView$TextSize {
    public static final /* synthetic */ StackedAvatarView$TextSize[] $VALUES;
    public static final StackedAvatarView$TextSize LARGE;
    public static final StackedAvatarView$TextSize SMALL;

    static {
        StackedAvatarView$TextSize stackedAvatarView$TextSize = new StackedAvatarView$TextSize("SMALL", 0);
        SMALL = stackedAvatarView$TextSize;
        StackedAvatarView$TextSize stackedAvatarView$TextSize2 = new StackedAvatarView$TextSize("LARGE", 1);
        LARGE = stackedAvatarView$TextSize2;
        $VALUES = new StackedAvatarView$TextSize[]{stackedAvatarView$TextSize, stackedAvatarView$TextSize2};
    }

    public static StackedAvatarView$TextSize valueOf(String str) {
        return (StackedAvatarView$TextSize) Enum.valueOf(StackedAvatarView$TextSize.class, str);
    }

    public static StackedAvatarView$TextSize[] values() {
        return (StackedAvatarView$TextSize[]) $VALUES.clone();
    }
}
