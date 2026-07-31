package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, d2 = {"Ldev/hyo/openiap/SubscriptionPeriodIOS;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Day", "Week", "Month", "Year", "Empty", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionPeriodIOS {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubscriptionPeriodIOS[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final SubscriptionPeriodIOS Day = new SubscriptionPeriodIOS("Day", 0, "day");
    public static final SubscriptionPeriodIOS Week = new SubscriptionPeriodIOS("Week", 1, "week");
    public static final SubscriptionPeriodIOS Month = new SubscriptionPeriodIOS("Month", 2, "month");
    public static final SubscriptionPeriodIOS Year = new SubscriptionPeriodIOS("Year", 3, "year");
    public static final SubscriptionPeriodIOS Empty = new SubscriptionPeriodIOS("Empty", 4, "empty");

    private static final /* synthetic */ SubscriptionPeriodIOS[] $values() {
        return new SubscriptionPeriodIOS[]{Day, Week, Month, Year, Empty};
    }

    public static EnumEntries<SubscriptionPeriodIOS> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionPeriodIOS valueOf(String str) {
        return (SubscriptionPeriodIOS) Enum.valueOf(SubscriptionPeriodIOS.class, str);
    }

    public static SubscriptionPeriodIOS[] values() {
        return (SubscriptionPeriodIOS[]) $VALUES.clone();
    }

    private SubscriptionPeriodIOS(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        SubscriptionPeriodIOS[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/SubscriptionPeriodIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/SubscriptionPeriodIOS;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final SubscriptionPeriodIOS fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case 68476:
                    if (value.equals("Day")) {
                        return SubscriptionPeriodIOS.Day;
                    }
                    break;
                case 99228:
                    if (value.equals("day")) {
                        return SubscriptionPeriodIOS.Day;
                    }
                    break;
                case 2692116:
                    if (value.equals("Week")) {
                        return SubscriptionPeriodIOS.Week;
                    }
                    break;
                case 2751581:
                    if (value.equals("Year")) {
                        return SubscriptionPeriodIOS.Year;
                    }
                    break;
                case 3645428:
                    if (value.equals("week")) {
                        return SubscriptionPeriodIOS.Week;
                    }
                    break;
                case 3704893:
                    if (value.equals("year")) {
                        return SubscriptionPeriodIOS.Year;
                    }
                    break;
                case 67081517:
                    if (value.equals("Empty")) {
                        return SubscriptionPeriodIOS.Empty;
                    }
                    break;
                case 74527328:
                    if (value.equals("Month")) {
                        return SubscriptionPeriodIOS.Month;
                    }
                    break;
                case 96634189:
                    if (value.equals("empty")) {
                        return SubscriptionPeriodIOS.Empty;
                    }
                    break;
                case 104080000:
                    if (value.equals("month")) {
                        return SubscriptionPeriodIOS.Month;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown SubscriptionPeriodIOS value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
