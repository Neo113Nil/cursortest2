package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vx0 {
    public static final vx0 d;
    public static final vx0 e;
    public static final vx0 g;
    public static final /* synthetic */ vx0[] h;

    static {
        vx0 vx0Var = new vx0("Unknown", 0);
        d = vx0Var;
        vx0 vx0Var2 = new vx0("Dispatching", 1);
        e = vx0Var2;
        vx0 vx0Var3 = new vx0("NotDispatching", 2);
        g = vx0Var3;
        h = new vx0[]{vx0Var, vx0Var2, vx0Var3};
    }

    public static vx0 valueOf(String str) {
        return (vx0) Enum.valueOf(vx0.class, str);
    }

    public static vx0[] values() {
        return (vx0[]) h.clone();
    }
}
