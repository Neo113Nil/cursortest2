package dd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ od.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g EMAIL = new g("EMAIL", 0);
    public static final g SMS = new g("SMS", 1);
    public static final g PUSH = new g("PUSH", 2);

    private static final /* synthetic */ g[] $values() {
        return new g[]{EMAIL, SMS, PUSH};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = i7.a.J($values);
    }

    private g(String str, int i3) {
    }

    public static od.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
