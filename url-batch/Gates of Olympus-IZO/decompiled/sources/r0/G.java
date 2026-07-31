package r0;

import t0.U;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7113a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(G g3, H h3) {
        g3.getClass();
        if (h3 instanceof U) {
            ((U) h3).v(g3.f7113a);
        }
    }

    public static void d(G g3, H h3, int i3, int i4) {
        g3.getClass();
        long c3 = I2.d.c(i3, i4);
        a(g3, h3);
        h3.Q(M0.g.c(c3, h3.f7118h), 0.0f, null);
    }

    public static void e(G g3, H h3, long j3) {
        g3.getClass();
        a(g3, h3);
        h3.Q(M0.g.c(j3, h3.f7118h), 0.0f, null);
    }

    public static void f(G g3, H h3, int i3, int i4) {
        long c3 = I2.d.c(i3, i4);
        if (g3.b() == M0.j.f2775d || g3.c() == 0) {
            a(g3, h3);
            h3.Q(M0.g.c(c3, h3.f7118h), 0.0f, null);
        } else {
            long c4 = I2.d.c((g3.c() - h3.f7114d) - ((int) (c3 >> 32)), (int) (c3 & 4294967295L));
            a(g3, h3);
            h3.Q(M0.g.c(c4, h3.f7118h), 0.0f, null);
        }
    }

    public static void g(G g3, H h3, int i3, int i4) {
        int i5 = J.f7123b;
        I i6 = I.f7119f;
        long c3 = I2.d.c(i3, i4);
        if (g3.b() == M0.j.f2775d || g3.c() == 0) {
            a(g3, h3);
            h3.Q(M0.g.c(c3, h3.f7118h), 0.0f, i6);
        } else {
            long c4 = I2.d.c((g3.c() - h3.f7114d) - ((int) (c3 >> 32)), (int) (c3 & 4294967295L));
            a(g3, h3);
            h3.Q(M0.g.c(c4, h3.f7118h), 0.0f, i6);
        }
    }

    public static void h(G g3, H h3, Y1.c cVar) {
        g3.getClass();
        long c3 = I2.d.c(0, 0);
        a(g3, h3);
        h3.Q(M0.g.c(c3, h3.f7118h), 0.0f, cVar);
    }

    public static void i(G g3, H h3, long j3) {
        int i3 = J.f7123b;
        I i4 = I.f7119f;
        g3.getClass();
        a(g3, h3);
        h3.Q(M0.g.c(j3, h3.f7118h), 0.0f, i4);
    }

    public abstract M0.j b();

    public abstract int c();
}
