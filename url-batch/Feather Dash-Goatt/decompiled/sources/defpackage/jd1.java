package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jd1 {
    public static final jd1 d;
    public static final jd1 e;
    public static final /* synthetic */ jd1[] g;

    static {
        jd1 jd1Var = new jd1("Loading", 0);
        d = jd1Var;
        jd1 jd1Var2 = new jd1("Ready", 1);
        e = jd1Var2;
        g = new jd1[]{jd1Var, jd1Var2};
    }

    public static jd1 valueOf(String str) {
        return (jd1) Enum.valueOf(jd1.class, str);
    }

    public static jd1[] values() {
        return (jd1[]) g.clone();
    }
}
