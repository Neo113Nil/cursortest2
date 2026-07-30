package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class b31 {
    public static final b31 d;
    public static final b31 e;
    public static final /* synthetic */ b31[] g;

    static {
        b31 b31Var = new b31("Ltr", 0);
        d = b31Var;
        b31 b31Var2 = new b31("Rtl", 1);
        e = b31Var2;
        g = new b31[]{b31Var, b31Var2};
    }

    public static b31 valueOf(String str) {
        return (b31) Enum.valueOf(b31.class, str);
    }

    public static b31[] values() {
        return (b31[]) g.clone();
    }
}
