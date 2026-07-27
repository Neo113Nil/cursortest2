package p0;

import kotlin.jvm.functions.Function1;

/* renamed from: p0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0953N {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9004a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AbstractC0953N abstractC0953N, AbstractC0954O abstractC0954O) {
        abstractC0953N.getClass();
        if (abstractC0954O instanceof r0.U) {
            ((r0.U) abstractC0954O).z(abstractC0953N.f9004a);
        }
    }

    public static void d(AbstractC0953N abstractC0953N, AbstractC0954O abstractC0954O, int i2, int i4) {
        abstractC0953N.getClass();
        long g4 = j0.c.g(i2, i4);
        a(abstractC0953N, abstractC0954O);
        abstractC0954O.n0(M0.h.c(g4, abstractC0954O.f9009k), 0.0f, null);
    }

    public static void e(AbstractC0953N abstractC0953N, AbstractC0954O abstractC0954O, long j4) {
        abstractC0953N.getClass();
        a(abstractC0953N, abstractC0954O);
        abstractC0954O.n0(M0.h.c(j4, abstractC0954O.f9009k), 0.0f, null);
    }

    public static void f(AbstractC0953N abstractC0953N, AbstractC0954O abstractC0954O, int i2, int i4) {
        long g4 = j0.c.g(i2, i4);
        if (abstractC0953N.b() == M0.k.f3555d || abstractC0953N.c() == 0) {
            a(abstractC0953N, abstractC0954O);
            abstractC0954O.n0(M0.h.c(g4, abstractC0954O.f9009k), 0.0f, null);
        } else {
            long g5 = j0.c.g((abstractC0953N.c() - abstractC0954O.f9005d) - ((int) (g4 >> 32)), (int) (g4 & 4294967295L));
            a(abstractC0953N, abstractC0954O);
            abstractC0954O.n0(M0.h.c(g5, abstractC0954O.f9009k), 0.0f, null);
        }
    }

    public static void g(AbstractC0953N abstractC0953N, AbstractC0954O abstractC0954O, int i2, int i4) {
        int i5 = AbstractC0956Q.f9014b;
        C0955P c0955p = C0955P.f9010e;
        long g4 = j0.c.g(i2, i4);
        if (abstractC0953N.b() == M0.k.f3555d || abstractC0953N.c() == 0) {
            a(abstractC0953N, abstractC0954O);
            abstractC0954O.n0(M0.h.c(g4, abstractC0954O.f9009k), 0.0f, c0955p);
        } else {
            long g5 = j0.c.g((abstractC0953N.c() - abstractC0954O.f9005d) - ((int) (g4 >> 32)), (int) (g4 & 4294967295L));
            a(abstractC0953N, abstractC0954O);
            abstractC0954O.n0(M0.h.c(g5, abstractC0954O.f9009k), 0.0f, c0955p);
        }
    }

    public static void h(AbstractC0953N abstractC0953N, AbstractC0954O abstractC0954O, int i2, int i4, Function1 function1, int i5) {
        if ((i5 & 8) != 0) {
            int i6 = AbstractC0956Q.f9014b;
            function1 = C0955P.f9010e;
        }
        abstractC0953N.getClass();
        long g4 = j0.c.g(i2, i4);
        a(abstractC0953N, abstractC0954O);
        abstractC0954O.n0(M0.h.c(g4, abstractC0954O.f9009k), 0.0f, function1);
    }

    public abstract M0.k b();

    public abstract int c();
}
