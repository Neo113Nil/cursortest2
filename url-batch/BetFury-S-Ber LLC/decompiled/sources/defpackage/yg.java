package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class yg {
    private static final /* synthetic */ hn $ENTRIES;
    private static final /* synthetic */ yg[] $VALUES;
    public static final yg CPU_ACQUIRED = new yg("CPU_ACQUIRED", 0);
    public static final yg BLOCKING = new yg("BLOCKING", 1);
    public static final yg PARKING = new yg("PARKING", 2);
    public static final yg DORMANT = new yg("DORMANT", 3);
    public static final yg TERMINATED = new yg("TERMINATED", 4);

    private static final /* synthetic */ yg[] $values() {
        return new yg[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
    }

    static {
        yg[] $values = $values();
        $VALUES = $values;
        $ENTRIES = n9.k($values);
    }

    private yg(String str, int i) {
    }

    public static hn getEntries() {
        return $ENTRIES;
    }

    public static yg valueOf(String str) {
        return (yg) Enum.valueOf(yg.class, str);
    }

    public static yg[] values() {
        return (yg[]) $VALUES.clone();
    }
}
