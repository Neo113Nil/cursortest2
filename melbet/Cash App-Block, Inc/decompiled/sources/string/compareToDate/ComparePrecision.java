package string.compareToDate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ComparePrecision {
    public static final /* synthetic */ ComparePrecision[] $VALUES = {new ComparePrecision("MILLISECOND", 0), new ComparePrecision("SECOND", 1), new ComparePrecision("MINUTE", 2), new ComparePrecision("HOUR", 3), new ComparePrecision("DAY", 4), new ComparePrecision("MONTH", 5), new ComparePrecision("YEAR", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    ComparePrecision EF5;

    public static ComparePrecision valueOf(String str) {
        return (ComparePrecision) Enum.valueOf(ComparePrecision.class, str);
    }

    public static ComparePrecision[] values() {
        return (ComparePrecision[]) $VALUES.clone();
    }
}
