package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubscriptionReplacementModeAndroid.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/margelo/nitro/iap/SubscriptionReplacementModeAndroid;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN_REPLACEMENT_MODE", "WITH_TIME_PRORATION", "CHARGE_PRORATED_PRICE", "CHARGE_FULL_PRICE", "WITHOUT_PRORATION", "DEFERRED", "KEEP_EXISTING", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubscriptionReplacementModeAndroid {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubscriptionReplacementModeAndroid[] $VALUES;
    private final int value;
    public static final SubscriptionReplacementModeAndroid UNKNOWN_REPLACEMENT_MODE = new SubscriptionReplacementModeAndroid("UNKNOWN_REPLACEMENT_MODE", 0, 0);
    public static final SubscriptionReplacementModeAndroid WITH_TIME_PRORATION = new SubscriptionReplacementModeAndroid("WITH_TIME_PRORATION", 1, 1);
    public static final SubscriptionReplacementModeAndroid CHARGE_PRORATED_PRICE = new SubscriptionReplacementModeAndroid("CHARGE_PRORATED_PRICE", 2, 2);
    public static final SubscriptionReplacementModeAndroid CHARGE_FULL_PRICE = new SubscriptionReplacementModeAndroid("CHARGE_FULL_PRICE", 3, 3);
    public static final SubscriptionReplacementModeAndroid WITHOUT_PRORATION = new SubscriptionReplacementModeAndroid("WITHOUT_PRORATION", 4, 4);
    public static final SubscriptionReplacementModeAndroid DEFERRED = new SubscriptionReplacementModeAndroid("DEFERRED", 5, 5);
    public static final SubscriptionReplacementModeAndroid KEEP_EXISTING = new SubscriptionReplacementModeAndroid("KEEP_EXISTING", 6, 6);

    private static final /* synthetic */ SubscriptionReplacementModeAndroid[] $values() {
        return new SubscriptionReplacementModeAndroid[]{UNKNOWN_REPLACEMENT_MODE, WITH_TIME_PRORATION, CHARGE_PRORATED_PRICE, CHARGE_FULL_PRICE, WITHOUT_PRORATION, DEFERRED, KEEP_EXISTING};
    }

    public static EnumEntries<SubscriptionReplacementModeAndroid> getEntries() {
        return $ENTRIES;
    }

    private SubscriptionReplacementModeAndroid(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        SubscriptionReplacementModeAndroid[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static SubscriptionReplacementModeAndroid valueOf(String str) {
        return (SubscriptionReplacementModeAndroid) Enum.valueOf(SubscriptionReplacementModeAndroid.class, str);
    }

    public static SubscriptionReplacementModeAndroid[] values() {
        return (SubscriptionReplacementModeAndroid[]) $VALUES.clone();
    }
}
