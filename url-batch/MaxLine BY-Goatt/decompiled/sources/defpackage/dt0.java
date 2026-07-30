package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dt0 {
    public static final dt0 m;
    public static final dt0 n;
    public static final dt0 o;
    public static final dt0 p;
    public static final dt0 q;
    public static final /* synthetic */ dt0[] r;

    static {
        dt0 dt0Var = new dt0("ON_CONFIGURE", 0);
        m = dt0Var;
        dt0 dt0Var2 = new dt0("ON_CREATE", 1);
        n = dt0Var2;
        dt0 dt0Var3 = new dt0("ON_UPGRADE", 2);
        o = dt0Var3;
        dt0 dt0Var4 = new dt0("ON_DOWNGRADE", 3);
        p = dt0Var4;
        dt0 dt0Var5 = new dt0("ON_OPEN", 4);
        q = dt0Var5;
        r = new dt0[]{dt0Var, dt0Var2, dt0Var3, dt0Var4, dt0Var5};
    }

    public static dt0 valueOf(String str) {
        return (dt0) Enum.valueOf(dt0.class, str);
    }

    public static dt0[] values() {
        return (dt0[]) r.clone();
    }
}
