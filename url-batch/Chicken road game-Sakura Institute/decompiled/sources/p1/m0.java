package p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7059a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(m0 m0Var, n0 n0Var) {
        m0Var.getClass();
        if (n0Var instanceof r1.t0) {
            ((r1.t0) n0Var).S(m0Var.f7059a);
        }
    }

    public static void d(m0 m0Var, n0 n0Var, int i7, int i8) {
        m0Var.getClass();
        long c4 = a8.m.c(i7, i8);
        a(m0Var, n0Var);
        n0Var.j0(m2.h.c(c4, n0Var.f7067j), 0.0f, null);
    }

    public static void e(m0 m0Var, n0 n0Var, long j8) {
        m0Var.getClass();
        a(m0Var, n0Var);
        n0Var.j0(m2.h.c(j8, n0Var.f7067j), 0.0f, null);
    }

    public static void f(m0 m0Var, n0 n0Var, int i7, int i8) {
        long c4 = a8.m.c(i7, i8);
        if (m0Var.b() == m2.k.f6322f || m0Var.c() == 0) {
            a(m0Var, n0Var);
            n0Var.j0(m2.h.c(c4, n0Var.f7067j), 0.0f, null);
        } else {
            long c6 = a8.m.c((m0Var.c() - n0Var.f7063f) - ((int) (c4 >> 32)), (int) (c4 & 4294967295L));
            a(m0Var, n0Var);
            n0Var.j0(m2.h.c(c6, n0Var.f7067j), 0.0f, null);
        }
    }

    public static void g(m0 m0Var, n0 n0Var, int i7, int i8) {
        int i9 = p0.f7074b;
        o0 o0Var = o0.f7070h;
        long c4 = a8.m.c(i7, i8);
        if (m0Var.b() == m2.k.f6322f || m0Var.c() == 0) {
            a(m0Var, n0Var);
            n0Var.j0(m2.h.c(c4, n0Var.f7067j), 0.0f, o0Var);
        } else {
            long c6 = a8.m.c((m0Var.c() - n0Var.f7063f) - ((int) (c4 >> 32)), (int) (c4 & 4294967295L));
            a(m0Var, n0Var);
            n0Var.j0(m2.h.c(c6, n0Var.f7067j), 0.0f, o0Var);
        }
    }

    public static void h(m0 m0Var, n0 n0Var, q6.c cVar) {
        m0Var.getClass();
        long c4 = a8.m.c(0, 0);
        a(m0Var, n0Var);
        n0Var.j0(m2.h.c(c4, n0Var.f7067j), 0.0f, cVar);
    }

    public abstract m2.k b();

    public abstract int c();
}
