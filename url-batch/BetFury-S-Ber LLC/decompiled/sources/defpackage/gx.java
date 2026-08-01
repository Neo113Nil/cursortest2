package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class gx {
    private static final /* synthetic */ hn $ENTRIES;
    private static final /* synthetic */ gx[] $VALUES;
    public static final gx DESTROYED = new gx("DESTROYED", 0);
    public static final gx INITIALIZED = new gx("INITIALIZED", 1);
    public static final gx CREATED = new gx("CREATED", 2);
    public static final gx STARTED = new gx("STARTED", 3);
    public static final gx RESUMED = new gx("RESUMED", 4);

    private static final /* synthetic */ gx[] $values() {
        return new gx[]{DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED};
    }

    static {
        gx[] $values = $values();
        $VALUES = $values;
        $ENTRIES = n9.k($values);
    }

    private gx(String str, int i) {
    }

    public static hn getEntries() {
        return $ENTRIES;
    }

    public static gx valueOf(String str) {
        return (gx) Enum.valueOf(gx.class, str);
    }

    public static gx[] values() {
        return (gx[]) $VALUES.clone();
    }

    public final boolean isAtLeast(gx gxVar) {
        gxVar.getClass();
        return compareTo(gxVar) >= 0;
    }
}
