package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n22 {
    public static final n22 m;
    public static final n22 n;
    public static final n22 o;
    public static final /* synthetic */ n22[] p;

    static {
        n22 n22Var = new n22("Initial", 0);
        m = n22Var;
        n22 n22Var2 = new n22("Main", 1);
        n = n22Var2;
        n22 n22Var3 = new n22("Final", 2);
        o = n22Var3;
        p = new n22[]{n22Var, n22Var2, n22Var3};
    }

    public static n22 valueOf(String str) {
        return (n22) Enum.valueOf(n22.class, str);
    }

    public static n22[] values() {
        return (n22[]) p.clone();
    }
}
