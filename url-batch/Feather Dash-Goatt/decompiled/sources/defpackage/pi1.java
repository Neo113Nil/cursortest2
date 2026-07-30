package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pi1 {
    public static final pi1 d;
    public static final pi1 e;
    public static final /* synthetic */ pi1[] g;

    static {
        pi1 pi1Var = new pi1("On", 0);
        d = pi1Var;
        pi1 pi1Var2 = new pi1("Off", 1);
        e = pi1Var2;
        g = new pi1[]{pi1Var, pi1Var2, new pi1("Indeterminate", 2)};
    }

    public static pi1 valueOf(String str) {
        return (pi1) Enum.valueOf(pi1.class, str);
    }

    public static pi1[] values() {
        return (pi1[]) g.clone();
    }
}
