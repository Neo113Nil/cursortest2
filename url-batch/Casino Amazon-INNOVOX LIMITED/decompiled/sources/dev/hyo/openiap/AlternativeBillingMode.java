package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AlternativeBillingMode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ldev/hyo/openiap/AlternativeBillingMode;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "USER_CHOICE", "ALTERNATIVE_ONLY", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AlternativeBillingMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlternativeBillingMode[] $VALUES;
    public static final AlternativeBillingMode NONE = new AlternativeBillingMode("NONE", 0);
    public static final AlternativeBillingMode USER_CHOICE = new AlternativeBillingMode("USER_CHOICE", 1);
    public static final AlternativeBillingMode ALTERNATIVE_ONLY = new AlternativeBillingMode("ALTERNATIVE_ONLY", 2);

    private static final /* synthetic */ AlternativeBillingMode[] $values() {
        return new AlternativeBillingMode[]{NONE, USER_CHOICE, ALTERNATIVE_ONLY};
    }

    public static EnumEntries<AlternativeBillingMode> getEntries() {
        return $ENTRIES;
    }

    public static AlternativeBillingMode valueOf(String str) {
        return (AlternativeBillingMode) Enum.valueOf(AlternativeBillingMode.class, str);
    }

    public static AlternativeBillingMode[] values() {
        return (AlternativeBillingMode[]) $VALUES.clone();
    }

    private AlternativeBillingMode(String str, int i) {
    }

    static {
        AlternativeBillingMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
