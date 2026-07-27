package com.onesignal.user.internal.subscriptions;

import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SubscriptionType {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ SubscriptionType[] $VALUES;
    public static final SubscriptionType EMAIL = new SubscriptionType("EMAIL", 0);
    public static final SubscriptionType SMS = new SubscriptionType("SMS", 1);
    public static final SubscriptionType PUSH = new SubscriptionType("PUSH", 2);

    private static final /* synthetic */ SubscriptionType[] $values() {
        return new SubscriptionType[]{EMAIL, SMS, PUSH};
    }

    static {
        SubscriptionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
    }

    private SubscriptionType(String str, int i2) {
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionType valueOf(String str) {
        return (SubscriptionType) Enum.valueOf(SubscriptionType.class, str);
    }

    public static SubscriptionType[] values() {
        return (SubscriptionType[]) $VALUES.clone();
    }
}
