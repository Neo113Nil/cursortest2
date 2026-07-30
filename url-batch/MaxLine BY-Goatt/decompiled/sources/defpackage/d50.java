package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d50 {
    public static final d50 m;
    public static final d50 n;
    public static final d50 o;
    public static final d50 p;
    public static final /* synthetic */ d50[] q;

    static {
        d50 d50Var = new d50("DEFAULT", 0);
        m = d50Var;
        d50 d50Var2 = new d50("LAZY", 1);
        n = d50Var2;
        d50 d50Var3 = new d50("ATOMIC", 2);
        o = d50Var3;
        d50 d50Var4 = new d50("UNDISPATCHED", 3);
        p = d50Var4;
        q = new d50[]{d50Var, d50Var2, d50Var3, d50Var4};
    }

    public static d50 valueOf(String str) {
        return (d50) Enum.valueOf(d50.class, str);
    }

    public static d50[] values() {
        return (d50[]) q.clone();
    }
}
