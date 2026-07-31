package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/DiscountOfferType;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Introductory", "Promotional", "OneTime", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiscountOfferType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DiscountOfferType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final DiscountOfferType Introductory = new DiscountOfferType("Introductory", 0, "introductory");
    public static final DiscountOfferType Promotional = new DiscountOfferType("Promotional", 1, "promotional");
    public static final DiscountOfferType OneTime = new DiscountOfferType("OneTime", 2, "one-time");

    private static final /* synthetic */ DiscountOfferType[] $values() {
        return new DiscountOfferType[]{Introductory, Promotional, OneTime};
    }

    public static EnumEntries<DiscountOfferType> getEntries() {
        return $ENTRIES;
    }

    public static DiscountOfferType valueOf(String str) {
        return (DiscountOfferType) Enum.valueOf(DiscountOfferType.class, str);
    }

    public static DiscountOfferType[] values() {
        return (DiscountOfferType[]) $VALUES.clone();
    }

    private DiscountOfferType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        DiscountOfferType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/DiscountOfferType$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/DiscountOfferType;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final DiscountOfferType fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1871047698:
                    if (value.equals("Promotional")) {
                        return DiscountOfferType.Promotional;
                    }
                    break;
                case 343435827:
                    if (value.equals("OneTime")) {
                        return DiscountOfferType.OneTime;
                    }
                    break;
                case 756050958:
                    if (value.equals("promotional")) {
                        return DiscountOfferType.Promotional;
                    }
                    break;
                case 1539600136:
                    if (value.equals("introductory")) {
                        return DiscountOfferType.Introductory;
                    }
                    break;
                case 1703920424:
                    if (value.equals("Introductory")) {
                        return DiscountOfferType.Introductory;
                    }
                    break;
                case 1956238804:
                    if (value.equals("one-time")) {
                        return DiscountOfferType.OneTime;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown DiscountOfferType value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
