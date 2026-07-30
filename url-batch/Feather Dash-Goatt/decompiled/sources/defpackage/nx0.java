package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nx0 {
    public static final nx0 d;
    public static final nx0 e;
    public static final nx0 g;
    public static final /* synthetic */ nx0[] h;

    static {
        nx0 nx0Var = new nx0("Initial", 0);
        d = nx0Var;
        nx0 nx0Var2 = new nx0("Main", 1);
        e = nx0Var2;
        nx0 nx0Var3 = new nx0("Final", 2);
        g = nx0Var3;
        h = new nx0[]{nx0Var, nx0Var2, nx0Var3};
    }

    public static nx0 valueOf(String str) {
        return (nx0) Enum.valueOf(nx0.class, str);
    }

    public static nx0[] values() {
        return (nx0[]) h.clone();
    }
}
