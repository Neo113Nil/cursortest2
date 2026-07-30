package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gc1 {
    public static final gc1 d;
    public static final gc1 e;
    public static final gc1 g;
    public static final gc1 h;
    public static final gc1 i;
    public static final gc1 j;
    public static final gc1 k;
    public static final /* synthetic */ gc1[] l;

    static {
        gc1 gc1Var = new gc1("DASH", 0);
        d = gc1Var;
        gc1 gc1Var2 = new gc1("CHECKPOINT", 1);
        e = gc1Var2;
        gc1 gc1Var3 = new gc1("COLLISION", 2);
        g = gc1Var3;
        gc1 gc1Var4 = new gc1("CONTINUE", 3);
        h = gc1Var4;
        gc1 gc1Var5 = new gc1("VICTORY", 4);
        i = gc1Var5;
        gc1 gc1Var6 = new gc1("DAILY_REWARD", 5);
        j = gc1Var6;
        gc1 gc1Var7 = new gc1("ACHIEVEMENT_REWARD", 6);
        k = gc1Var7;
        l = new gc1[]{gc1Var, gc1Var2, gc1Var3, gc1Var4, gc1Var5, gc1Var6, gc1Var7};
    }

    public static gc1 valueOf(String str) {
        return (gc1) Enum.valueOf(gc1.class, str);
    }

    public static gc1[] values() {
        return (gc1[]) l.clone();
    }
}
