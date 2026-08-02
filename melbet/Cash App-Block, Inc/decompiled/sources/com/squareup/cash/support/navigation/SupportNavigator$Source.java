package com.squareup.cash.support.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SupportNavigator$Source {
    public static final /* synthetic */ SupportNavigator$Source[] $VALUES;
    public static final SupportNavigator$Source BENEFITS;
    public static final SupportNavigator$Source BLOCKER_FLOW;
    public static final SupportNavigator$Source CARD;
    public static final SupportNavigator$Source DEEP_LINK;
    public static final SupportNavigator$Source MONEY;
    public static final SupportNavigator$Source MONEYBOT;
    public static final SupportNavigator$Source NOTIFICATION;
    public static final SupportNavigator$Source PROFILE;
    public static final SupportNavigator$Source RECEIPT;
    public static final SupportNavigator$Source SCREEN_SHOT;
    public static final SupportNavigator$Source SYNC_VALUE;
    public static final SupportNavigator$Source UNKNOWN;

    static {
        SupportNavigator$Source supportNavigator$Source = new SupportNavigator$Source("PROFILE", 0);
        PROFILE = supportNavigator$Source;
        SupportNavigator$Source supportNavigator$Source2 = new SupportNavigator$Source("NOTIFICATION", 1);
        NOTIFICATION = supportNavigator$Source2;
        SupportNavigator$Source supportNavigator$Source3 = new SupportNavigator$Source("RECEIPT", 2);
        RECEIPT = supportNavigator$Source3;
        SupportNavigator$Source supportNavigator$Source4 = new SupportNavigator$Source("MERCHANT_PROFILE", 3);
        SupportNavigator$Source supportNavigator$Source5 = new SupportNavigator$Source("DEEP_LINK", 4);
        DEEP_LINK = supportNavigator$Source5;
        SupportNavigator$Source supportNavigator$Source6 = new SupportNavigator$Source("SYNC_VALUE", 5);
        SYNC_VALUE = supportNavigator$Source6;
        SupportNavigator$Source supportNavigator$Source7 = new SupportNavigator$Source("SCREEN_SHOT", 6);
        SCREEN_SHOT = supportNavigator$Source7;
        SupportNavigator$Source supportNavigator$Source8 = new SupportNavigator$Source("MONEYBOT", 7);
        MONEYBOT = supportNavigator$Source8;
        SupportNavigator$Source supportNavigator$Source9 = new SupportNavigator$Source("BLOCKER_FLOW", 8);
        BLOCKER_FLOW = supportNavigator$Source9;
        SupportNavigator$Source supportNavigator$Source10 = new SupportNavigator$Source("MONEY", 9);
        MONEY = supportNavigator$Source10;
        SupportNavigator$Source supportNavigator$Source11 = new SupportNavigator$Source("CARD", 10);
        CARD = supportNavigator$Source11;
        SupportNavigator$Source supportNavigator$Source12 = new SupportNavigator$Source("BENEFITS", 11);
        BENEFITS = supportNavigator$Source12;
        SupportNavigator$Source supportNavigator$Source13 = new SupportNavigator$Source("UNKNOWN", 12);
        UNKNOWN = supportNavigator$Source13;
        $VALUES = new SupportNavigator$Source[]{supportNavigator$Source, supportNavigator$Source2, supportNavigator$Source3, supportNavigator$Source4, supportNavigator$Source5, supportNavigator$Source6, supportNavigator$Source7, supportNavigator$Source8, supportNavigator$Source9, supportNavigator$Source10, supportNavigator$Source11, supportNavigator$Source12, supportNavigator$Source13};
    }

    public static SupportNavigator$Source valueOf(String str) {
        return (SupportNavigator$Source) Enum.valueOf(SupportNavigator$Source.class, str);
    }

    public static SupportNavigator$Source[] values() {
        return (SupportNavigator$Source[]) $VALUES.clone();
    }
}
