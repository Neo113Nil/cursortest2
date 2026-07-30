package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zx2 {
    public static final zx2 m;
    public static final zx2 n;
    public static final /* synthetic */ zx2[] o;

    static {
        zx2 zx2Var = new zx2("On", 0);
        m = zx2Var;
        zx2 zx2Var2 = new zx2("Off", 1);
        n = zx2Var2;
        o = new zx2[]{zx2Var, zx2Var2, new zx2("Indeterminate", 2)};
    }

    public static zx2 valueOf(String str) {
        return (zx2) Enum.valueOf(zx2.class, str);
    }

    public static zx2[] values() {
        return (zx2[]) o.clone();
    }
}
