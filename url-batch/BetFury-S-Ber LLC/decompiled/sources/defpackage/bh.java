package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class bh {
    private static final /* synthetic */ hn $ENTRIES;
    private static final /* synthetic */ bh[] $VALUES;
    public static final bh COROUTINE_SUSPENDED = new bh("COROUTINE_SUSPENDED", 0);
    public static final bh UNDECIDED = new bh("UNDECIDED", 1);
    public static final bh RESUMED = new bh("RESUMED", 2);

    private static final /* synthetic */ bh[] $values() {
        return new bh[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    static {
        bh[] $values = $values();
        $VALUES = $values;
        $ENTRIES = n9.k($values);
    }

    private bh(String str, int i) {
    }

    public static hn getEntries() {
        return $ENTRIES;
    }

    public static bh valueOf(String str) {
        return (bh) Enum.valueOf(bh.class, str);
    }

    public static bh[] values() {
        return (bh[]) $VALUES.clone();
    }
}
