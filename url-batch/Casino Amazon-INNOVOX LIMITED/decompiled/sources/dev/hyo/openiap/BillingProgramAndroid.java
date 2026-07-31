package dev.hyo.openiap;

import com.google.firebase.ktx.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, d2 = {"Ldev/hyo/openiap/BillingProgramAndroid;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Unspecified", "UserChoiceBilling", "ExternalContentLink", "ExternalOffer", "ExternalPayments", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BillingProgramAndroid {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BillingProgramAndroid[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final BillingProgramAndroid Unspecified = new BillingProgramAndroid("Unspecified", 0, BuildConfig.VERSION_NAME);
    public static final BillingProgramAndroid UserChoiceBilling = new BillingProgramAndroid("UserChoiceBilling", 1, "user-choice-billing");
    public static final BillingProgramAndroid ExternalContentLink = new BillingProgramAndroid("ExternalContentLink", 2, "external-content-link");
    public static final BillingProgramAndroid ExternalOffer = new BillingProgramAndroid("ExternalOffer", 3, "external-offer");
    public static final BillingProgramAndroid ExternalPayments = new BillingProgramAndroid("ExternalPayments", 4, "external-payments");

    private static final /* synthetic */ BillingProgramAndroid[] $values() {
        return new BillingProgramAndroid[]{Unspecified, UserChoiceBilling, ExternalContentLink, ExternalOffer, ExternalPayments};
    }

    public static EnumEntries<BillingProgramAndroid> getEntries() {
        return $ENTRIES;
    }

    public static BillingProgramAndroid valueOf(String str) {
        return (BillingProgramAndroid) Enum.valueOf(BillingProgramAndroid.class, str);
    }

    public static BillingProgramAndroid[] values() {
        return (BillingProgramAndroid[]) $VALUES.clone();
    }

    private BillingProgramAndroid(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        BillingProgramAndroid[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/BillingProgramAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/BillingProgramAndroid;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final BillingProgramAndroid fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1797848176:
                    if (value.equals("external-content-link")) {
                        return BillingProgramAndroid.ExternalContentLink;
                    }
                    break;
                case -1626174665:
                    if (value.equals(BuildConfig.VERSION_NAME)) {
                        return BillingProgramAndroid.Unspecified;
                    }
                    break;
                case -1555411494:
                    if (value.equals("external-offer")) {
                        return BillingProgramAndroid.ExternalOffer;
                    }
                    break;
                case -1005305105:
                    if (value.equals("external-payments")) {
                        return BillingProgramAndroid.ExternalPayments;
                    }
                    break;
                case 41693975:
                    if (value.equals("Unspecified")) {
                        return BillingProgramAndroid.Unspecified;
                    }
                    break;
                case 446743336:
                    if (value.equals("ExternalContentLink")) {
                        return BillingProgramAndroid.ExternalContentLink;
                    }
                    break;
                case 570112879:
                    if (value.equals("UserChoiceBilling")) {
                        return BillingProgramAndroid.UserChoiceBilling;
                    }
                    break;
                case 779918641:
                    if (value.equals("ExternalOffer")) {
                        return BillingProgramAndroid.ExternalOffer;
                    }
                    break;
                case 926254225:
                    if (value.equals("user-choice-billing")) {
                        return BillingProgramAndroid.UserChoiceBilling;
                    }
                    break;
                case 934486072:
                    if (value.equals("ExternalPayments")) {
                        return BillingProgramAndroid.ExternalPayments;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown BillingProgramAndroid value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
