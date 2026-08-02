package com.squareup.cash.wallet.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class HeroPaymentDevicesRenderingMode {
    public static final /* synthetic */ HeroPaymentDevicesRenderingMode[] $VALUES;
    public static final HeroPaymentDevicesRenderingMode Full;
    public static final HeroPaymentDevicesRenderingMode HeroPortionOnly;
    public static final HeroPaymentDevicesRenderingMode ListPortionOnly;

    static {
        HeroPaymentDevicesRenderingMode heroPaymentDevicesRenderingMode = new HeroPaymentDevicesRenderingMode("Full", 0);
        Full = heroPaymentDevicesRenderingMode;
        HeroPaymentDevicesRenderingMode heroPaymentDevicesRenderingMode2 = new HeroPaymentDevicesRenderingMode("HeroPortionOnly", 1);
        HeroPortionOnly = heroPaymentDevicesRenderingMode2;
        HeroPaymentDevicesRenderingMode heroPaymentDevicesRenderingMode3 = new HeroPaymentDevicesRenderingMode("ListPortionOnly", 2);
        ListPortionOnly = heroPaymentDevicesRenderingMode3;
        $VALUES = new HeroPaymentDevicesRenderingMode[]{heroPaymentDevicesRenderingMode, heroPaymentDevicesRenderingMode2, heroPaymentDevicesRenderingMode3};
    }

    public static HeroPaymentDevicesRenderingMode valueOf(String str) {
        return (HeroPaymentDevicesRenderingMode) Enum.valueOf(HeroPaymentDevicesRenderingMode.class, str);
    }

    public static HeroPaymentDevicesRenderingMode[] values() {
        return (HeroPaymentDevicesRenderingMode[]) $VALUES.clone();
    }
}
