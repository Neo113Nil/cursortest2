package r0;

import e2.InterfaceC0424c;

/* renamed from: r0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0892N {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8125a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AbstractC0892N abstractC0892N, AbstractC0893O abstractC0893O) {
        abstractC0892N.getClass();
        if (abstractC0893O instanceof t0.V) {
            ((t0.V) abstractC0893O).C(abstractC0892N.f8125a);
        }
    }

    public static void d(AbstractC0892N abstractC0892N, AbstractC0893O abstractC0893O, int i3, int i4) {
        abstractC0892N.getClass();
        long c2 = l0.c.c(i3, i4);
        a(abstractC0892N, abstractC0893O);
        abstractC0893O.f0(O0.h.c(c2, abstractC0893O.f8130h), 0.0f, null);
    }

    public static void e(AbstractC0892N abstractC0892N, AbstractC0893O abstractC0893O, long j3) {
        abstractC0892N.getClass();
        a(abstractC0892N, abstractC0893O);
        abstractC0893O.f0(O0.h.c(j3, abstractC0893O.f8130h), 0.0f, null);
    }

    public static void f(AbstractC0892N abstractC0892N, AbstractC0893O abstractC0893O, int i3, int i4) {
        long c2 = l0.c.c(i3, i4);
        if (abstractC0892N.b() == O0.k.f3741d || abstractC0892N.c() == 0) {
            a(abstractC0892N, abstractC0893O);
            abstractC0893O.f0(O0.h.c(c2, abstractC0893O.f8130h), 0.0f, null);
        } else {
            long c3 = l0.c.c((abstractC0892N.c() - abstractC0893O.f8126d) - ((int) (c2 >> 32)), (int) (c2 & 4294967295L));
            a(abstractC0892N, abstractC0893O);
            abstractC0893O.f0(O0.h.c(c3, abstractC0893O.f8130h), 0.0f, null);
        }
    }

    public static void g(AbstractC0892N abstractC0892N, AbstractC0893O abstractC0893O, int i3, int i4) {
        int i5 = AbstractC0895Q.f8135b;
        C0894P c0894p = C0894P.f8131f;
        long c2 = l0.c.c(i3, i4);
        if (abstractC0892N.b() == O0.k.f3741d || abstractC0892N.c() == 0) {
            a(abstractC0892N, abstractC0893O);
            abstractC0893O.f0(O0.h.c(c2, abstractC0893O.f8130h), 0.0f, c0894p);
        } else {
            long c3 = l0.c.c((abstractC0892N.c() - abstractC0893O.f8126d) - ((int) (c2 >> 32)), (int) (c2 & 4294967295L));
            a(abstractC0892N, abstractC0893O);
            abstractC0893O.f0(O0.h.c(c3, abstractC0893O.f8130h), 0.0f, c0894p);
        }
    }

    public static void h(AbstractC0892N abstractC0892N, AbstractC0893O abstractC0893O, InterfaceC0424c interfaceC0424c) {
        abstractC0892N.getClass();
        long c2 = l0.c.c(0, 0);
        a(abstractC0892N, abstractC0893O);
        abstractC0893O.f0(O0.h.c(c2, abstractC0893O.f8130h), 0.0f, interfaceC0424c);
    }

    public abstract O0.k b();

    public abstract int c();
}
