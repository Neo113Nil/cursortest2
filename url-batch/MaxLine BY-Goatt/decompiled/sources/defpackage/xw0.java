package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xw0 {
    public static final xw0 m;
    public static final xw0 n;
    public static final xw0 o;
    public static final /* synthetic */ xw0[] p;

    static {
        xw0 xw0Var = new xw0("Cursor", 0);
        m = xw0Var;
        xw0 xw0Var2 = new xw0("SelectionStart", 1);
        n = xw0Var2;
        xw0 xw0Var3 = new xw0("SelectionEnd", 2);
        o = xw0Var3;
        p = new xw0[]{xw0Var, xw0Var2, xw0Var3};
    }

    public static xw0 valueOf(String str) {
        return (xw0) Enum.valueOf(xw0.class, str);
    }

    public static xw0[] values() {
        return (xw0[]) p.clone();
    }
}
