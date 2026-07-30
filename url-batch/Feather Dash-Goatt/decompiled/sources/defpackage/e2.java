package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class e2 {
    public static final e2 d;
    public static final e2 e;
    public static final e2 g;
    public static final e2 h;
    public static final e2 i;
    public static final e2 j;
    public static final e2 k;
    public static final e2 l;
    public static final /* synthetic */ e2[] m;

    static {
        e2 e2Var = new e2("FIRST_RUN", 0);
        d = e2Var;
        e2 e2Var2 = new e2("VICTORIES", 1);
        e = e2Var2;
        e2 e2Var3 = new e2("BEST_SECTIONS", 2);
        g = e2Var3;
        e2 e2Var4 = new e2("TOTAL_EARNED", 3);
        h = e2Var4;
        e2 e2Var5 = new e2("HARD_VICTORIES", 4);
        i = e2Var5;
        e2 e2Var6 = new e2("DAILY_CLAIMS", 5);
        j = e2Var6;
        e2 e2Var7 = new e2("FULL_STREAKS", 6);
        k = e2Var7;
        e2 e2Var8 = new e2("ATTEMPTS", 7);
        l = e2Var8;
        m = new e2[]{e2Var, e2Var2, e2Var3, e2Var4, e2Var5, e2Var6, e2Var7, e2Var8};
    }

    public static e2 valueOf(String str) {
        return (e2) Enum.valueOf(e2.class, str);
    }

    public static e2[] values() {
        return (e2[]) m.clone();
    }
}
