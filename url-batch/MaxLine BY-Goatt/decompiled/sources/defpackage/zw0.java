package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zw0 {
    public static final zw0 m;
    public static final zw0 n;
    public static final zw0 o;
    public static final /* synthetic */ zw0[] p;

    static {
        zw0 zw0Var = new zw0("None", 0);
        m = zw0Var;
        zw0 zw0Var2 = new zw0("Selection", 1);
        n = zw0Var2;
        zw0 zw0Var3 = new zw0("Cursor", 2);
        o = zw0Var3;
        p = new zw0[]{zw0Var, zw0Var2, zw0Var3};
    }

    public static zw0 valueOf(String str) {
        return (zw0) Enum.valueOf(zw0.class, str);
    }

    public static zw0[] values() {
        return (zw0[]) p.clone();
    }
}
