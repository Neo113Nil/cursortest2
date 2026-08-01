package ja;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ od.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b MISSING = new b("MISSING", 0);
    public static final b OUTDATED = new b("OUTDATED", 1);
    public static final b OK = new b("OK", 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{MISSING, OUTDATED, OK};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = i7.a.J($values);
    }

    private b(String str, int i3) {
    }

    public static od.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
