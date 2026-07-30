package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o72 {
    public static final o72 m;
    public static final o72 n;
    public static final o72 o;
    public static final o72 p;
    public static final o72 q;
    public static final o72 r;
    public static final /* synthetic */ o72[] s;

    static {
        o72 o72Var = new o72("ShutDown", 0);
        m = o72Var;
        o72 o72Var2 = new o72("ShuttingDown", 1);
        n = o72Var2;
        o72 o72Var3 = new o72("Inactive", 2);
        o = o72Var3;
        o72 o72Var4 = new o72("InactivePendingWork", 3);
        p = o72Var4;
        o72 o72Var5 = new o72("Idle", 4);
        q = o72Var5;
        o72 o72Var6 = new o72("PendingWork", 5);
        r = o72Var6;
        s = new o72[]{o72Var, o72Var2, o72Var3, o72Var4, o72Var5, o72Var6};
    }

    public static o72 valueOf(String str) {
        return (o72) Enum.valueOf(o72.class, str);
    }

    public static o72[] values() {
        return (o72[]) s.clone();
    }
}
