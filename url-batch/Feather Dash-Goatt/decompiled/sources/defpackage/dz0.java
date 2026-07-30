package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class dz0 {
    public static final dz0 d;
    public static final dz0 e;
    public static final dz0 g;
    public static final /* synthetic */ dz0[] h;

    static {
        dz0 dz0Var = new dz0("DEFAULT", 0);
        d = dz0Var;
        dz0 dz0Var2 = new dz0("VERY_LOW", 1);
        e = dz0Var2;
        dz0 dz0Var3 = new dz0("HIGHEST", 2);
        g = dz0Var3;
        h = new dz0[]{dz0Var, dz0Var2, dz0Var3};
    }

    public static dz0 valueOf(String str) {
        return (dz0) Enum.valueOf(dz0.class, str);
    }

    public static dz0[] values() {
        return (dz0[]) h.clone();
    }
}
