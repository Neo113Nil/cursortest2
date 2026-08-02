package com.squareup.cash.stablecoin.viewmodels.widgets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class StablecoinHomeWidgets {
    public static final /* synthetic */ StablecoinHomeWidgets[] $VALUES;
    public static final StablecoinHomeWidgets BALANCE;
    public static final StablecoinHomeWidgets DISCLOSURE;
    public static final StablecoinHomeWidgets WELCOME;

    static {
        StablecoinHomeWidgets stablecoinHomeWidgets = new StablecoinHomeWidgets("WELCOME", 0);
        WELCOME = stablecoinHomeWidgets;
        StablecoinHomeWidgets stablecoinHomeWidgets2 = new StablecoinHomeWidgets("BALANCE", 1);
        BALANCE = stablecoinHomeWidgets2;
        StablecoinHomeWidgets stablecoinHomeWidgets3 = new StablecoinHomeWidgets("DISCLOSURE", 2);
        DISCLOSURE = stablecoinHomeWidgets3;
        $VALUES = new StablecoinHomeWidgets[]{stablecoinHomeWidgets, stablecoinHomeWidgets2, stablecoinHomeWidgets3};
    }

    public static StablecoinHomeWidgets valueOf(String str) {
        return (StablecoinHomeWidgets) Enum.valueOf(StablecoinHomeWidgets.class, str);
    }

    public static StablecoinHomeWidgets[] values() {
        return (StablecoinHomeWidgets[]) $VALUES.clone();
    }
}
