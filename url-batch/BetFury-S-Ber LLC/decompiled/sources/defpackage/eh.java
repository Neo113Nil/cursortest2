package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class eh {
    private static final /* synthetic */ hn $ENTRIES;
    private static final /* synthetic */ eh[] $VALUES;
    public static final eh DEFAULT = new eh("DEFAULT", 0);
    public static final eh LAZY = new eh("LAZY", 1);
    public static final eh ATOMIC = new eh("ATOMIC", 2);
    public static final eh UNDISPATCHED = new eh("UNDISPATCHED", 3);

    private static final /* synthetic */ eh[] $values() {
        return new eh[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        eh[] $values = $values();
        $VALUES = $values;
        $ENTRIES = n9.k($values);
    }

    private eh(String str, int i) {
    }

    public static hn getEntries() {
        return $ENTRIES;
    }

    public static eh valueOf(String str) {
        return (eh) Enum.valueOf(eh.class, str);
    }

    public static eh[] values() {
        return (eh[]) $VALUES.clone();
    }

    public final <R, T> void invoke(xr xrVar, R r, dg dgVar) {
        Object g;
        int i = dh.a[ordinal()];
        sk0 sk0Var = sk0.a;
        if (i == 1) {
            try {
                mv.L(n9.z(n9.i(xrVar, r, dgVar)), sk0Var);
                return;
            } finally {
                dgVar.e(new z90(th));
            }
        }
        if (i == 2) {
            xrVar.getClass();
            dgVar.getClass();
            n9.z(n9.i(xrVar, r, dgVar)).e(sk0Var);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new md();
            }
            return;
        }
        dgVar.getClass();
        try {
            qg d = dgVar.d();
            Object U = gk0.U(d, null);
            try {
                if (xrVar instanceof f8) {
                    gk0.b(xrVar);
                    g = xrVar.g(r, dgVar);
                } else {
                    g = n9.U(xrVar, r, dgVar);
                }
                gk0.J(d, U);
                if (g != bh.COROUTINE_SUSPENDED) {
                    dgVar.e(g);
                }
            } catch (Throwable th) {
                gk0.J(d, U);
                throw th;
            }
        } catch (Throwable th2) {
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
