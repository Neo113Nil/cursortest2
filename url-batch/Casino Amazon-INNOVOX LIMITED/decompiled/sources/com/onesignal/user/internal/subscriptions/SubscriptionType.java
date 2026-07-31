package com.onesignal.user.internal.subscriptions;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubscriptionModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/onesignal/user/internal/subscriptions/SubscriptionType;", "", "(Ljava/lang/String;I)V", "EMAIL", "SMS", "PUSH", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubscriptionType[] $VALUES;
    public static final SubscriptionType EMAIL = new SubscriptionType("EMAIL", 0);
    public static final SubscriptionType SMS = new SubscriptionType("SMS", 1);
    public static final SubscriptionType PUSH = new SubscriptionType("PUSH", 2);

    private static final /* synthetic */ SubscriptionType[] $values() {
        return new SubscriptionType[]{EMAIL, SMS, PUSH};
    }

    public static EnumEntries<SubscriptionType> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionType valueOf(String str) {
        return (SubscriptionType) Enum.valueOf(SubscriptionType.class, str);
    }

    public static SubscriptionType[] values() {
        return (SubscriptionType[]) $VALUES.clone();
    }

    private SubscriptionType(String str, int i) {
    }

    static {
        SubscriptionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
