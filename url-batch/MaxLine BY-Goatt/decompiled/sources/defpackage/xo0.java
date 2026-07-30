package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xo0 {
    public static final xo0 m;
    public static final xo0 n;
    public static final xo0 o;
    public static final xo0 p;
    public static final /* synthetic */ xo0[] q;

    static {
        xo0 xo0Var = new xo0("Active", 0);
        m = xo0Var;
        xo0 xo0Var2 = new xo0("ActiveParent", 1);
        n = xo0Var2;
        xo0 xo0Var3 = new xo0("Captured", 2);
        o = xo0Var3;
        xo0 xo0Var4 = new xo0("Inactive", 3);
        p = xo0Var4;
        q = new xo0[]{xo0Var, xo0Var2, xo0Var3, xo0Var4};
    }

    public static xo0 valueOf(String str) {
        return (xo0) Enum.valueOf(xo0.class, str);
    }

    public static xo0[] values() {
        return (xo0[]) q.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                a.b();
                return false;
            }
        }
        return true;
    }
}
