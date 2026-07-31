package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AlternativeBillingModeAndroid.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/margelo/nitro/iap/AlternativeBillingModeAndroid;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "USER_CHOICE", "ALTERNATIVE_ONLY", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AlternativeBillingModeAndroid {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlternativeBillingModeAndroid[] $VALUES;
    private final int value;
    public static final AlternativeBillingModeAndroid NONE = new AlternativeBillingModeAndroid("NONE", 0, 0);
    public static final AlternativeBillingModeAndroid USER_CHOICE = new AlternativeBillingModeAndroid("USER_CHOICE", 1, 1);
    public static final AlternativeBillingModeAndroid ALTERNATIVE_ONLY = new AlternativeBillingModeAndroid("ALTERNATIVE_ONLY", 2, 2);

    private static final /* synthetic */ AlternativeBillingModeAndroid[] $values() {
        return new AlternativeBillingModeAndroid[]{NONE, USER_CHOICE, ALTERNATIVE_ONLY};
    }

    public static EnumEntries<AlternativeBillingModeAndroid> getEntries() {
        return $ENTRIES;
    }

    private AlternativeBillingModeAndroid(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        AlternativeBillingModeAndroid[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static AlternativeBillingModeAndroid valueOf(String str) {
        return (AlternativeBillingModeAndroid) Enum.valueOf(AlternativeBillingModeAndroid.class, str);
    }

    public static AlternativeBillingModeAndroid[] values() {
        return (AlternativeBillingModeAndroid[]) $VALUES.clone();
    }
}
