package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jj1 {
    public static final jj1 d;
    public static final jj1 e;
    public static final jj1 g;
    public static final /* synthetic */ jj1[] h;

    static {
        jj1 jj1Var = new jj1("ContinueTraversal", 0);
        d = jj1Var;
        jj1 jj1Var2 = new jj1("SkipSubtreeAndContinueTraversal", 1);
        e = jj1Var2;
        jj1 jj1Var3 = new jj1("CancelTraversal", 2);
        g = jj1Var3;
        h = new jj1[]{jj1Var, jj1Var2, jj1Var3};
    }

    public static jj1 valueOf(String str) {
        return (jj1) Enum.valueOf(jj1.class, str);
    }

    public static jj1[] values() {
        return (jj1[]) h.clone();
    }
}
