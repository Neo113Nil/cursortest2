package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xj1 {
    public static final xj1 m;
    public static final xj1 n;
    public static final /* synthetic */ xj1[] o;

    static {
        xj1 xj1Var = new xj1("Width", 0);
        m = xj1Var;
        xj1 xj1Var2 = new xj1("Height", 1);
        n = xj1Var2;
        o = new xj1[]{xj1Var, xj1Var2};
    }

    public static xj1 valueOf(String str) {
        return (xj1) Enum.valueOf(xj1.class, str);
    }

    public static xj1[] values() {
        return (xj1[]) o.clone();
    }
}
