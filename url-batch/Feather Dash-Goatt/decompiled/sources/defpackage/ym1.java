package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ym1 {
    public static final ym1 d;
    public static final ym1 e;
    public static final /* synthetic */ ym1[] g;

    static {
        ym1 ym1Var = new ym1("Lsq2", 0);
        d = ym1Var;
        ym1 ym1Var2 = new ym1("Impulse", 1);
        e = ym1Var2;
        g = new ym1[]{ym1Var, ym1Var2};
    }

    public static ym1 valueOf(String str) {
        return (ym1) Enum.valueOf(ym1.class, str);
    }

    public static ym1[] values() {
        return (ym1[]) g.clone();
    }
}
