package com.squareup.cash.ui.overlays.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AlertBannerScreen {
    public static final /* synthetic */ AlertBannerScreen[] $VALUES;
    public static final AlertBannerScreen ACTIVITY_TAB;
    public static final AlertBannerScreen MONEY_TAB;
    public static final AlertBannerScreen PAYMENT_TAB;

    static {
        AlertBannerScreen alertBannerScreen = new AlertBannerScreen("ACTIVITY_TAB", 0);
        ACTIVITY_TAB = alertBannerScreen;
        AlertBannerScreen alertBannerScreen2 = new AlertBannerScreen("MONEY_TAB", 1);
        MONEY_TAB = alertBannerScreen2;
        AlertBannerScreen alertBannerScreen3 = new AlertBannerScreen("PAYMENT_TAB", 2);
        PAYMENT_TAB = alertBannerScreen3;
        $VALUES = new AlertBannerScreen[]{alertBannerScreen, alertBannerScreen2, alertBannerScreen3};
    }

    public static AlertBannerScreen valueOf(String str) {
        return (AlertBannerScreen) Enum.valueOf(AlertBannerScreen.class, str);
    }

    public static AlertBannerScreen[] values() {
        return (AlertBannerScreen[]) $VALUES.clone();
    }
}
