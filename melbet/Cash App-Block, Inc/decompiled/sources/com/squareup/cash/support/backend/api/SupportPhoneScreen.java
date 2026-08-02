package com.squareup.cash.support.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class SupportPhoneScreen {
    public static final /* synthetic */ SupportPhoneScreen[] $VALUES;
    public static final SupportPhoneScreen ERROR;
    public static final SupportPhoneScreen PHONE_STATUS;
    public static final SupportPhoneScreen REQUEST_PHONE_SUPPORT;

    static {
        SupportPhoneScreen supportPhoneScreen = new SupportPhoneScreen("REQUEST_PHONE_SUPPORT", 0);
        REQUEST_PHONE_SUPPORT = supportPhoneScreen;
        SupportPhoneScreen supportPhoneScreen2 = new SupportPhoneScreen("PHONE_STATUS", 1);
        PHONE_STATUS = supportPhoneScreen2;
        SupportPhoneScreen supportPhoneScreen3 = new SupportPhoneScreen("ERROR", 2);
        ERROR = supportPhoneScreen3;
        $VALUES = new SupportPhoneScreen[]{supportPhoneScreen, supportPhoneScreen2, supportPhoneScreen3};
    }

    public static SupportPhoneScreen valueOf(String str) {
        return (SupportPhoneScreen) Enum.valueOf(SupportPhoneScreen.class, str);
    }

    public static SupportPhoneScreen[] values() {
        return (SupportPhoneScreen[]) $VALUES.clone();
    }
}
