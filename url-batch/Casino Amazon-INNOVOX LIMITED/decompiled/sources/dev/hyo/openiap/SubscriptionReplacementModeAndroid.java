package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, d2 = {"Ldev/hyo/openiap/SubscriptionReplacementModeAndroid;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "UnknownReplacementMode", "WithTimeProration", "ChargeProratedPrice", "ChargeFullPrice", "WithoutProration", "Deferred", "KeepExisting", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionReplacementModeAndroid {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubscriptionReplacementModeAndroid[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final SubscriptionReplacementModeAndroid UnknownReplacementMode = new SubscriptionReplacementModeAndroid("UnknownReplacementMode", 0, "unknown-replacement-mode");
    public static final SubscriptionReplacementModeAndroid WithTimeProration = new SubscriptionReplacementModeAndroid("WithTimeProration", 1, "with-time-proration");
    public static final SubscriptionReplacementModeAndroid ChargeProratedPrice = new SubscriptionReplacementModeAndroid("ChargeProratedPrice", 2, "charge-prorated-price");
    public static final SubscriptionReplacementModeAndroid ChargeFullPrice = new SubscriptionReplacementModeAndroid("ChargeFullPrice", 3, "charge-full-price");
    public static final SubscriptionReplacementModeAndroid WithoutProration = new SubscriptionReplacementModeAndroid("WithoutProration", 4, "without-proration");
    public static final SubscriptionReplacementModeAndroid Deferred = new SubscriptionReplacementModeAndroid("Deferred", 5, "deferred");
    public static final SubscriptionReplacementModeAndroid KeepExisting = new SubscriptionReplacementModeAndroid("KeepExisting", 6, "keep-existing");

    private static final /* synthetic */ SubscriptionReplacementModeAndroid[] $values() {
        return new SubscriptionReplacementModeAndroid[]{UnknownReplacementMode, WithTimeProration, ChargeProratedPrice, ChargeFullPrice, WithoutProration, Deferred, KeepExisting};
    }

    public static EnumEntries<SubscriptionReplacementModeAndroid> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionReplacementModeAndroid valueOf(String str) {
        return (SubscriptionReplacementModeAndroid) Enum.valueOf(SubscriptionReplacementModeAndroid.class, str);
    }

    public static SubscriptionReplacementModeAndroid[] values() {
        return (SubscriptionReplacementModeAndroid[]) $VALUES.clone();
    }

    private SubscriptionReplacementModeAndroid(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        SubscriptionReplacementModeAndroid[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/SubscriptionReplacementModeAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/SubscriptionReplacementModeAndroid;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final SubscriptionReplacementModeAndroid fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1511195317:
                    if (value.equals("UnknownReplacementMode")) {
                        return SubscriptionReplacementModeAndroid.UnknownReplacementMode;
                    }
                    break;
                case -1392871445:
                    if (value.equals("without-proration")) {
                        return SubscriptionReplacementModeAndroid.WithoutProration;
                    }
                    break;
                case -1014709168:
                    if (value.equals("KeepExisting")) {
                        return SubscriptionReplacementModeAndroid.KeepExisting;
                    }
                    break;
                case -388283619:
                    if (value.equals("WithTimeProration")) {
                        return SubscriptionReplacementModeAndroid.WithTimeProration;
                    }
                    break;
                case -373837101:
                    if (value.equals("keep-existing")) {
                        return SubscriptionReplacementModeAndroid.KeepExisting;
                    }
                    break;
                case 283606316:
                    if (value.equals("charge-prorated-price")) {
                        return SubscriptionReplacementModeAndroid.ChargeProratedPrice;
                    }
                    break;
                case 300833822:
                    if (value.equals("ChargeProratedPrice")) {
                        return SubscriptionReplacementModeAndroid.ChargeProratedPrice;
                    }
                    break;
                case 615559912:
                    if (value.equals("WithoutProration")) {
                        return SubscriptionReplacementModeAndroid.WithoutProration;
                    }
                    break;
                case 647890911:
                    if (value.equals("deferred")) {
                        return SubscriptionReplacementModeAndroid.Deferred;
                    }
                    break;
                case 712535039:
                    if (value.equals("Deferred")) {
                        return SubscriptionReplacementModeAndroid.Deferred;
                    }
                    break;
                case 804872087:
                    if (value.equals("with-time-proration")) {
                        return SubscriptionReplacementModeAndroid.WithTimeProration;
                    }
                    break;
                case 833540420:
                    if (value.equals("charge-full-price")) {
                        return SubscriptionReplacementModeAndroid.ChargeFullPrice;
                    }
                    break;
                case 916799393:
                    if (value.equals("unknown-replacement-mode")) {
                        return SubscriptionReplacementModeAndroid.UnknownReplacementMode;
                    }
                    break;
                case 1861115782:
                    if (value.equals("ChargeFullPrice")) {
                        return SubscriptionReplacementModeAndroid.ChargeFullPrice;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown SubscriptionReplacementModeAndroid value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
