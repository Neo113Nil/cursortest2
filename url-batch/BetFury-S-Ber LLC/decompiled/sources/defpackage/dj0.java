package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class dj0 {
    private static final /* synthetic */ hn $ENTRIES;
    private static final /* synthetic */ dj0[] $VALUES;
    public static final dj0 DEFERRED = new dj0("DEFERRED", 0);
    public static final dj0 IMMEDIATE = new dj0("IMMEDIATE", 1);
    public static final dj0 EXCLUSIVE = new dj0("EXCLUSIVE", 2);

    private static final /* synthetic */ dj0[] $values() {
        return new dj0[]{DEFERRED, IMMEDIATE, EXCLUSIVE};
    }

    static {
        dj0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = n9.k($values);
    }

    private dj0(String str, int i) {
    }

    public static hn getEntries() {
        return $ENTRIES;
    }

    public static dj0 valueOf(String str) {
        return (dj0) Enum.valueOf(dj0.class, str);
    }

    public static dj0[] values() {
        return (dj0[]) $VALUES.clone();
    }
}
