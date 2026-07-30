package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class yw0 implements nr {
    public boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(yw0 yw0Var, zw0 zw0Var) {
        yw0Var.getClass();
        if (zw0Var instanceof nm0) {
            ((nm0) zw0Var).r(yw0Var.d);
        }
    }

    public static void h(yw0 yw0Var, zw0 zw0Var, int i, int i2) {
        yw0Var.getClass();
        a(yw0Var, zw0Var);
        zw0Var.Y(s90.c((i2 & 4294967295L) | (i << 32), zw0Var.i), 0.0f, null);
    }

    public static void l(yw0 yw0Var, zw0 zw0Var, long j) {
        yw0Var.getClass();
        a(yw0Var, zw0Var);
        zw0Var.Y(s90.c(j, zw0Var.i), 0.0f, null);
    }

    public static void n(yw0 yw0Var, zw0 zw0Var, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (yw0Var.c() == vc0.d || yw0Var.g() == 0) {
            a(yw0Var, zw0Var);
            zw0Var.Y(s90.c(j, zw0Var.i), 0.0f, null);
        } else {
            int g = (yw0Var.g() - zw0Var.d) - ((int) (j >> 32));
            a(yw0Var, zw0Var);
            zw0Var.Y(s90.c((g << 32) | (((int) (j & 4294967295L)) & 4294967295L), zw0Var.i), 0.0f, null);
        }
    }

    public static void r(yw0 yw0Var, zw0 zw0Var, int i, int i2) {
        int i3 = ax0.b;
        y3 y3Var = y3.H;
        long j = (i << 32) | (i2 & 4294967295L);
        if (yw0Var.c() == vc0.d || yw0Var.g() == 0) {
            a(yw0Var, zw0Var);
            zw0Var.Y(s90.c(j, zw0Var.i), 0.0f, y3Var);
        } else {
            int g = (yw0Var.g() - zw0Var.d) - ((int) (j >> 32));
            a(yw0Var, zw0Var);
            zw0Var.Y(s90.c((g << 32) | (((int) (j & 4294967295L)) & 4294967295L), zw0Var.i), 0.0f, y3Var);
        }
    }

    public float b(o60 o60Var) {
        return Float.NaN;
    }

    public abstract vc0 c();

    public abstract int g();
}
