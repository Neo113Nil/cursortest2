package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Ldev/hyo/openiap/PaymentMode;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "FreeTrial", "PayAsYouGo", "PayUpFront", "Unknown", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentMode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PaymentMode FreeTrial = new PaymentMode("FreeTrial", 0, "free-trial");
    public static final PaymentMode PayAsYouGo = new PaymentMode("PayAsYouGo", 1, "pay-as-you-go");
    public static final PaymentMode PayUpFront = new PaymentMode("PayUpFront", 2, "pay-up-front");
    public static final PaymentMode Unknown = new PaymentMode("Unknown", 3, "unknown");
    private final String rawValue;

    private static final /* synthetic */ PaymentMode[] $values() {
        return new PaymentMode[]{FreeTrial, PayAsYouGo, PayUpFront, Unknown};
    }

    public static EnumEntries<PaymentMode> getEntries() {
        return $ENTRIES;
    }

    public static PaymentMode valueOf(String str) {
        return (PaymentMode) Enum.valueOf(PaymentMode.class, str);
    }

    public static PaymentMode[] values() {
        return (PaymentMode[]) $VALUES.clone();
    }

    private PaymentMode(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        PaymentMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/PaymentMode$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/PaymentMode;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final PaymentMode fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1983203211:
                    if (value.equals("free-trial")) {
                        return PaymentMode.FreeTrial;
                    }
                    break;
                case -1912734612:
                    if (value.equals("pay-as-you-go")) {
                        return PaymentMode.PayAsYouGo;
                    }
                    break;
                case -702784851:
                    if (value.equals("PayAsYouGo")) {
                        return PaymentMode.PayAsYouGo;
                    }
                    break;
                case -284840886:
                    if (value.equals("unknown")) {
                        return PaymentMode.Unknown;
                    }
                    break;
                case -235929946:
                    if (value.equals("PayUpFront")) {
                        return PaymentMode.PayUpFront;
                    }
                    break;
                case 1079930876:
                    if (value.equals("pay-up-front")) {
                        return PaymentMode.PayUpFront;
                    }
                    break;
                case 1379812394:
                    if (value.equals("Unknown")) {
                        return PaymentMode.Unknown;
                    }
                    break;
                case 1560300522:
                    if (value.equals("FreeTrial")) {
                        return PaymentMode.FreeTrial;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown PaymentMode value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
