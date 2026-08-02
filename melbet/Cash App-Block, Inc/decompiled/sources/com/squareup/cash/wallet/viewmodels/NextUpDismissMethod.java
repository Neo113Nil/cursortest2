package com.squareup.cash.wallet.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class NextUpDismissMethod {
    public static final /* synthetic */ NextUpDismissMethod[] $VALUES;
    public static final NextUpDismissMethod ACCESSIBILITY_ACTION;
    public static final NextUpDismissMethod SWIPE;

    static {
        NextUpDismissMethod nextUpDismissMethod = new NextUpDismissMethod("SWIPE", 0);
        SWIPE = nextUpDismissMethod;
        NextUpDismissMethod nextUpDismissMethod2 = new NextUpDismissMethod("ACCESSIBILITY_ACTION", 1);
        ACCESSIBILITY_ACTION = nextUpDismissMethod2;
        $VALUES = new NextUpDismissMethod[]{nextUpDismissMethod, nextUpDismissMethod2};
    }

    public static NextUpDismissMethod valueOf(String str) {
        return (NextUpDismissMethod) Enum.valueOf(NextUpDismissMethod.class, str);
    }

    public static NextUpDismissMethod[] values() {
        return (NextUpDismissMethod[]) $VALUES.clone();
    }
}
