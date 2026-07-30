package F2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ Y5.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CREATE = new c("CREATE", 0);
    public static final c ALTER = new c("ALTER", 1);
    public static final c NONE = new c("NONE", 2);

    private static final /* synthetic */ c[] $values() {
        return new c[]{CREATE, ALTER, NONE};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = d4.c.o($values);
    }

    private c(String str, int i2) {
    }

    public static Y5.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
