package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class an0 {
    public static final an0 d;
    public static final an0 e;
    public static final an0 g;
    public static final /* synthetic */ an0[] h;

    static {
        an0 an0Var = new an0("NONE", 0);
        d = an0Var;
        an0 an0Var2 = new an0("MENU", 1);
        e = an0Var2;
        an0 an0Var3 = new an0("GAMEPLAY", 2);
        g = an0Var3;
        h = new an0[]{an0Var, an0Var2, an0Var3};
    }

    public static an0 valueOf(String str) {
        return (an0) Enum.valueOf(an0.class, str);
    }

    public static an0[] values() {
        return (an0[]) h.clone();
    }
}
