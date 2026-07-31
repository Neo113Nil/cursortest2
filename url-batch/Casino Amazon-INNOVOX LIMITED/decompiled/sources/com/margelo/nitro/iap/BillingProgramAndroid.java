package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BillingProgramAndroid.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/margelo/nitro/iap/BillingProgramAndroid;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNSPECIFIED", "USER_CHOICE_BILLING", "EXTERNAL_CONTENT_LINK", "EXTERNAL_OFFER", "EXTERNAL_PAYMENTS", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BillingProgramAndroid {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BillingProgramAndroid[] $VALUES;
    private final int value;
    public static final BillingProgramAndroid UNSPECIFIED = new BillingProgramAndroid("UNSPECIFIED", 0, 0);
    public static final BillingProgramAndroid USER_CHOICE_BILLING = new BillingProgramAndroid("USER_CHOICE_BILLING", 1, 1);
    public static final BillingProgramAndroid EXTERNAL_CONTENT_LINK = new BillingProgramAndroid("EXTERNAL_CONTENT_LINK", 2, 2);
    public static final BillingProgramAndroid EXTERNAL_OFFER = new BillingProgramAndroid("EXTERNAL_OFFER", 3, 3);
    public static final BillingProgramAndroid EXTERNAL_PAYMENTS = new BillingProgramAndroid("EXTERNAL_PAYMENTS", 4, 4);

    private static final /* synthetic */ BillingProgramAndroid[] $values() {
        return new BillingProgramAndroid[]{UNSPECIFIED, USER_CHOICE_BILLING, EXTERNAL_CONTENT_LINK, EXTERNAL_OFFER, EXTERNAL_PAYMENTS};
    }

    public static EnumEntries<BillingProgramAndroid> getEntries() {
        return $ENTRIES;
    }

    private BillingProgramAndroid(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        BillingProgramAndroid[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static BillingProgramAndroid valueOf(String str) {
        return (BillingProgramAndroid) Enum.valueOf(BillingProgramAndroid.class, str);
    }

    public static BillingProgramAndroid[] values() {
        return (BillingProgramAndroid[]) $VALUES.clone();
    }
}
