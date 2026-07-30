package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class og0 {
    public static final og0 d;
    public static final og0 e;
    public static final og0 g;
    public static final og0 h;
    public static final og0 i;
    public static final /* synthetic */ og0[] j;

    static {
        og0 og0Var = new og0("DESTROYED", 0);
        d = og0Var;
        og0 og0Var2 = new og0("INITIALIZED", 1);
        e = og0Var2;
        og0 og0Var3 = new og0("CREATED", 2);
        g = og0Var3;
        og0 og0Var4 = new og0("STARTED", 3);
        h = og0Var4;
        og0 og0Var5 = new og0("RESUMED", 4);
        i = og0Var5;
        j = new og0[]{og0Var, og0Var2, og0Var3, og0Var4, og0Var5};
    }

    public static og0 valueOf(String str) {
        return (og0) Enum.valueOf(og0.class, str);
    }

    public static og0[] values() {
        return (og0[]) j.clone();
    }
}
