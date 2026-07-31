package u1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class k0 implements r2.c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f7227d;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(k0 k0Var, l0 l0Var) {
        k0Var.getClass();
        if (l0Var instanceof w1.y0) {
            ((w1.y0) l0Var).k(k0Var.f7227d);
        }
    }

    public static void g(k0 k0Var, l0 l0Var, int i, int i8) {
        k0Var.getClass();
        a(k0Var, l0Var);
        l0Var.U(r2.i.c((i8 & 4294967295L) | (i << 32), l0Var.f7234h), 0.0f, null);
    }

    public static void h(k0 k0Var, l0 l0Var, long j7) {
        k0Var.getClass();
        a(k0Var, l0Var);
        l0Var.U(r2.i.c(j7, l0Var.f7234h), 0.0f, null);
    }

    public static void k(k0 k0Var, l0 l0Var, int i, int i8) {
        long j7 = (i << 32) | (i8 & 4294967295L);
        if (k0Var.e() == r2.l.f6529d || k0Var.f() == 0) {
            a(k0Var, l0Var);
            l0Var.U(r2.i.c(j7, l0Var.f7234h), 0.0f, null);
        } else {
            int f6 = (k0Var.f() - l0Var.f7230d) - ((int) (j7 >> 32));
            a(k0Var, l0Var);
            l0Var.U(r2.i.c((f6 << 32) | (((int) (j7 & 4294967295L)) & 4294967295L), l0Var.f7234h), 0.0f, null);
        }
    }

    public static void m(k0 k0Var, l0 l0Var, int i, int i8) {
        int i9 = n0.f7247b;
        m0 m0Var = m0.f7237f;
        long j7 = (i << 32) | (i8 & 4294967295L);
        if (k0Var.e() == r2.l.f6529d || k0Var.f() == 0) {
            a(k0Var, l0Var);
            l0Var.U(r2.i.c(j7, l0Var.f7234h), 0.0f, m0Var);
        } else {
            int f6 = (k0Var.f() - l0Var.f7230d) - ((int) (j7 >> 32));
            a(k0Var, l0Var);
            l0Var.U(r2.i.c((f6 << 32) | (((int) (j7 & 4294967295L)) & 4294967295L), l0Var.f7234h), 0.0f, m0Var);
        }
    }

    public static void o(k0 k0Var, l0 l0Var, p6.c cVar) {
        k0Var.getClass();
        long j7 = 0;
        a(k0Var, l0Var);
        l0Var.U(r2.i.c((j7 & 4294967295L) | (j7 << 32), l0Var.f7234h), 0.0f, cVar);
    }

    public float d(m mVar) {
        return Float.NaN;
    }

    public abstract r2.l e();

    public abstract int f();
}
