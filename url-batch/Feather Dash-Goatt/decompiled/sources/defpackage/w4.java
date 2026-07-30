package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class w4 {
    public static final w4 d;
    public static final w4 e;
    public static final /* synthetic */ w4[] g;

    static {
        w4 w4Var = new w4("SHOW_ORIGINAL", 0);
        d = w4Var;
        w4 w4Var2 = new w4("SHOW_TRANSLATED", 1);
        e = w4Var2;
        g = new w4[]{w4Var, w4Var2};
    }

    public static w4 valueOf(String str) {
        return (w4) Enum.valueOf(w4.class, str);
    }

    public static w4[] values() {
        return (w4[]) g.clone();
    }
}
