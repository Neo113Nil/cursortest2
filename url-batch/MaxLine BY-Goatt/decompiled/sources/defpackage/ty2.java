package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ty2 {
    public static final ty2 m;
    public static final ty2 n;
    public static final /* synthetic */ ty2[] o;

    static {
        ty2 ty2Var = new ty2("DEFERRED", 0);
        m = ty2Var;
        ty2 ty2Var2 = new ty2("IMMEDIATE", 1);
        n = ty2Var2;
        o = new ty2[]{ty2Var, ty2Var2, new ty2("EXCLUSIVE", 2)};
    }

    public static ty2 valueOf(String str) {
        return (ty2) Enum.valueOf(ty2.class, str);
    }

    public static ty2[] values() {
        return (ty2[]) o.clone();
    }
}
