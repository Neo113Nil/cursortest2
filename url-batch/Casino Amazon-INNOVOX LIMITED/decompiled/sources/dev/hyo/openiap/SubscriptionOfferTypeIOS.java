package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/SubscriptionOfferTypeIOS;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Introductory", "Promotional", "WinBack", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionOfferTypeIOS {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubscriptionOfferTypeIOS[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SubscriptionOfferTypeIOS Introductory = new SubscriptionOfferTypeIOS("Introductory", 0, "introductory");
    public static final SubscriptionOfferTypeIOS Promotional = new SubscriptionOfferTypeIOS("Promotional", 1, "promotional");
    public static final SubscriptionOfferTypeIOS WinBack = new SubscriptionOfferTypeIOS("WinBack", 2, "win-back");
    private final String rawValue;

    private static final /* synthetic */ SubscriptionOfferTypeIOS[] $values() {
        return new SubscriptionOfferTypeIOS[]{Introductory, Promotional, WinBack};
    }

    public static EnumEntries<SubscriptionOfferTypeIOS> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionOfferTypeIOS valueOf(String str) {
        return (SubscriptionOfferTypeIOS) Enum.valueOf(SubscriptionOfferTypeIOS.class, str);
    }

    public static SubscriptionOfferTypeIOS[] values() {
        return (SubscriptionOfferTypeIOS[]) $VALUES.clone();
    }

    private SubscriptionOfferTypeIOS(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        SubscriptionOfferTypeIOS[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/SubscriptionOfferTypeIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/SubscriptionOfferTypeIOS;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final SubscriptionOfferTypeIOS fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1871047698:
                    if (value.equals("Promotional")) {
                        return SubscriptionOfferTypeIOS.Promotional;
                    }
                    break;
                case -1281847613:
                    if (value.equals("WinBack")) {
                        return SubscriptionOfferTypeIOS.WinBack;
                    }
                    break;
                case -1166580680:
                    if (value.equals("win-back")) {
                        return SubscriptionOfferTypeIOS.WinBack;
                    }
                    break;
                case 756050958:
                    if (value.equals("promotional")) {
                        return SubscriptionOfferTypeIOS.Promotional;
                    }
                    break;
                case 1539600136:
                    if (value.equals("introductory")) {
                        return SubscriptionOfferTypeIOS.Introductory;
                    }
                    break;
                case 1703920424:
                    if (value.equals("Introductory")) {
                        return SubscriptionOfferTypeIOS.Introductory;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown SubscriptionOfferTypeIOS value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
