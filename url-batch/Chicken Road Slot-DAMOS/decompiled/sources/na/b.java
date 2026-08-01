package na;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ od.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b SUCCESS = new b("SUCCESS", 0);
    public static final b SUCCESS_STARTING_ONLY = new b("SUCCESS_STARTING_ONLY", 1);
    public static final b FAIL_RETRY = new b("FAIL_RETRY", 2);
    public static final b FAIL_NORETRY = new b("FAIL_NORETRY", 3);
    public static final b FAIL_UNAUTHORIZED = new b("FAIL_UNAUTHORIZED", 4);
    public static final b FAIL_CONFLICT = new b("FAIL_CONFLICT", 5);
    public static final b FAIL_PAUSE_OPREPO = new b("FAIL_PAUSE_OPREPO", 6);

    private static final /* synthetic */ b[] $values() {
        return new b[]{SUCCESS, SUCCESS_STARTING_ONLY, FAIL_RETRY, FAIL_NORETRY, FAIL_UNAUTHORIZED, FAIL_CONFLICT, FAIL_PAUSE_OPREPO};
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
