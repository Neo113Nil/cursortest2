package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class u9 {
    private static final /* synthetic */ hn $ENTRIES;
    private static final /* synthetic */ u9[] $VALUES;
    public static final u9 SUSPEND = new u9("SUSPEND", 0);
    public static final u9 DROP_OLDEST = new u9("DROP_OLDEST", 1);
    public static final u9 DROP_LATEST = new u9("DROP_LATEST", 2);

    private static final /* synthetic */ u9[] $values() {
        return new u9[]{SUSPEND, DROP_OLDEST, DROP_LATEST};
    }

    static {
        u9[] $values = $values();
        $VALUES = $values;
        $ENTRIES = n9.k($values);
    }

    private u9(String str, int i) {
    }

    public static hn getEntries() {
        return $ENTRIES;
    }

    public static u9 valueOf(String str) {
        return (u9) Enum.valueOf(u9.class, str);
    }

    public static u9[] values() {
        return (u9[]) $VALUES.clone();
    }
}
