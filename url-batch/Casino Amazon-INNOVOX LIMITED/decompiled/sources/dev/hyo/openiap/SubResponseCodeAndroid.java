package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/SubResponseCodeAndroid;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "NoApplicableSubResponseCode", "PaymentDeclinedDueToInsufficientFunds", "UserIneligible", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubResponseCodeAndroid {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubResponseCodeAndroid[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SubResponseCodeAndroid NoApplicableSubResponseCode = new SubResponseCodeAndroid("NoApplicableSubResponseCode", 0, "no-applicable-sub-response-code");
    public static final SubResponseCodeAndroid PaymentDeclinedDueToInsufficientFunds = new SubResponseCodeAndroid("PaymentDeclinedDueToInsufficientFunds", 1, "payment-declined-due-to-insufficient-funds");
    public static final SubResponseCodeAndroid UserIneligible = new SubResponseCodeAndroid("UserIneligible", 2, "user-ineligible");
    private final String rawValue;

    private static final /* synthetic */ SubResponseCodeAndroid[] $values() {
        return new SubResponseCodeAndroid[]{NoApplicableSubResponseCode, PaymentDeclinedDueToInsufficientFunds, UserIneligible};
    }

    public static EnumEntries<SubResponseCodeAndroid> getEntries() {
        return $ENTRIES;
    }

    public static SubResponseCodeAndroid valueOf(String str) {
        return (SubResponseCodeAndroid) Enum.valueOf(SubResponseCodeAndroid.class, str);
    }

    public static SubResponseCodeAndroid[] values() {
        return (SubResponseCodeAndroid[]) $VALUES.clone();
    }

    private SubResponseCodeAndroid(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        SubResponseCodeAndroid[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/SubResponseCodeAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/SubResponseCodeAndroid;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final SubResponseCodeAndroid fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -2107874038:
                    if (value.equals("no-applicable-sub-response-code")) {
                        return SubResponseCodeAndroid.NoApplicableSubResponseCode;
                    }
                    break;
                case -1169878587:
                    if (value.equals("payment-declined-due-to-insufficient-funds")) {
                        return SubResponseCodeAndroid.PaymentDeclinedDueToInsufficientFunds;
                    }
                    break;
                case -557325241:
                    if (value.equals("UserIneligible")) {
                        return SubResponseCodeAndroid.UserIneligible;
                    }
                    break;
                case 678565182:
                    if (value.equals("user-ineligible")) {
                        return SubResponseCodeAndroid.UserIneligible;
                    }
                    break;
                case 1193539502:
                    if (value.equals("NoApplicableSubResponseCode")) {
                        return SubResponseCodeAndroid.NoApplicableSubResponseCode;
                    }
                    break;
                case 1216720272:
                    if (value.equals("PaymentDeclinedDueToInsufficientFunds")) {
                        return SubResponseCodeAndroid.PaymentDeclinedDueToInsufficientFunds;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown SubResponseCodeAndroid value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
