package na;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ od.a $ENTRIES;
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
        $ENTRIES = i7.a.J($values);
    }

    private c(String str, int i3) {
    }

    public static od.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
