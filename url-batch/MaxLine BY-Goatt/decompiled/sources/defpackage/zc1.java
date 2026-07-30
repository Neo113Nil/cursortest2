package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zc1 {
    public static final zc1 m;
    public static final zc1 n;
    public static final zc1 o;
    public static final zc1 p;
    public static final zc1 q;
    public static final /* synthetic */ zc1[] r;

    static {
        zc1 zc1Var = new zc1("DESTROYED", 0);
        m = zc1Var;
        zc1 zc1Var2 = new zc1("INITIALIZED", 1);
        n = zc1Var2;
        zc1 zc1Var3 = new zc1("CREATED", 2);
        o = zc1Var3;
        zc1 zc1Var4 = new zc1("STARTED", 3);
        p = zc1Var4;
        zc1 zc1Var5 = new zc1("RESUMED", 4);
        q = zc1Var5;
        r = new zc1[]{zc1Var, zc1Var2, zc1Var3, zc1Var4, zc1Var5};
    }

    public static zc1 valueOf(String str) {
        return (zc1) Enum.valueOf(zc1.class, str);
    }

    public static zc1[] values() {
        return (zc1[]) r.clone();
    }
}
