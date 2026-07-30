package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vc0 {
    public static final vc0 d;
    public static final vc0 e;
    public static final /* synthetic */ vc0[] g;

    static {
        vc0 vc0Var = new vc0("Ltr", 0);
        d = vc0Var;
        vc0 vc0Var2 = new vc0("Rtl", 1);
        e = vc0Var2;
        g = new vc0[]{vc0Var, vc0Var2};
    }

    public static vc0 valueOf(String str) {
        return (vc0) Enum.valueOf(vc0.class, str);
    }

    public static vc0[] values() {
        return (vc0[]) g.clone();
    }
}
