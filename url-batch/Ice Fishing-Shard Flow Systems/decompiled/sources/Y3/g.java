package Y3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ Y5.a $ENTRIES;
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
        $ENTRIES = d4.c.o($values);
    }

    private g(String str, int i2) {
    }

    public static Y5.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
