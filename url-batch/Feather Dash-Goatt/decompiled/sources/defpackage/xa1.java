package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class xa1 {
    public static final vy a = new vy(fs.e, 1.0f);
    public static final vy b = new vy(fs.g, 1.0f);

    public static final am0 a(am0 am0Var, float f) {
        return am0Var.c(f == 1.0f ? a : new vy(fs.e, f));
    }

    public static final am0 b(am0 am0Var, float f) {
        return am0Var.c(new wa1(0.0f, f, 0.0f, f, 5));
    }

    public static final am0 c(am0 am0Var, float f) {
        return am0Var.c(new wa1(f, f, f, f));
    }

    public static final am0 d(am0 am0Var, float f, float f2) {
        return am0Var.c(new wa1(f, f2, f, f2));
    }

    public static final am0 e(am0 am0Var, float f) {
        return am0Var.c(new wa1(f, 0.0f, f, 0.0f, 10));
    }

    public static am0 f(am0 am0Var) {
        return am0Var.c(new wa1(Float.NaN, 0.0f, 700.0f, 0.0f, 10));
    }
}
