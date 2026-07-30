package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ew0 {
    public static final ew0 d;
    public static final ew0 e;
    public static final ew0 g;
    public static final ew0 h;
    public static final ew0 i;
    public static final ew0 j;
    public static final ew0 k;
    public static final /* synthetic */ ew0[] l;

    static {
        ew0 ew0Var = new ew0("Invalid", 0);
        d = ew0Var;
        ew0 ew0Var2 = new ew0("Cancelled", 1);
        e = ew0Var2;
        ew0 ew0Var3 = new ew0("InitialPending", 2);
        g = ew0Var3;
        ew0 ew0Var4 = new ew0("RecomposePending", 3);
        h = ew0Var4;
        ew0 ew0Var5 = new ew0("Recomposing", 4);
        i = ew0Var5;
        ew0 ew0Var6 = new ew0("ApplyPending", 5);
        j = ew0Var6;
        ew0 ew0Var7 = new ew0("Applied", 6);
        k = ew0Var7;
        l = new ew0[]{ew0Var, ew0Var2, ew0Var3, ew0Var4, ew0Var5, ew0Var6, ew0Var7};
    }

    public static ew0 valueOf(String str) {
        return (ew0) Enum.valueOf(ew0.class, str);
    }

    public static ew0[] values() {
        return (ew0[]) l.clone();
    }
}
