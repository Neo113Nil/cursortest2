package p0;

import A.AbstractC0017m;
import A.C0005a;
import G.C0192d;
import G.C0208l;
import G.C0212n;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0213n0;
import a.AbstractC0345a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;

/* renamed from: p0.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0960V {

    /* renamed from: a, reason: collision with root package name */
    public static final C0949J f9023a = new C0949J(4);

    public static final long a(float f4, float f5) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
        int i2 = AbstractC0958T.f9017b;
        return floatToRawIntBits;
    }

    public static final void b(S.o oVar, Function2 function2, C0216p c0216p, int i2, int i4) {
        int i5;
        c0216p.U(-1298353104);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c0216p.h(function2) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            if (i6 != 0) {
                oVar = S.l.f3977a;
            }
            Object I3 = c0216p.I();
            if (I3 == C0208l.f2826a) {
                I3 = new C0963Y(C0949J.f8998b);
                c0216p.c0(I3);
            }
            c((C0963Y) I3, oVar, function2, c0216p, (i5 << 3) & 1008);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0959U(oVar, function2, i2, i4);
        }
    }

    public static final void c(C0963Y c0963y, S.o oVar, Function2 function2, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-511989831);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(c0963y) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(oVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(function2) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            int i5 = c0216p.f2861P;
            C0212n M3 = C0192d.M(c0216p);
            S.o d4 = S.a.d(c0216p, oVar);
            InterfaceC0213n0 m4 = c0216p.m();
            C1068i c1068i = C1068i.f9805j;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, c0963y, c0963y.f9028c);
            C0192d.R(c0216p, M3, c0963y.f9029d);
            C0192d.R(c0216p, function2, c0963y.f9030e);
            InterfaceC1070k.f9822h.getClass();
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C0192d.R(c0216p, d4, C1069j.f9818d);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                AbstractC0017m.r(i5, c0216p, i5, c1067h);
            }
            c0216p.q(true);
            if (c0216p.z()) {
                c0216p.S(-26502501);
                c0216p.q(false);
            } else {
                c0216p.S(-26580342);
                boolean h4 = c0216p.h(c0963y);
                Object I3 = c0216p.I();
                if (h4 || I3 == C0208l.f2826a) {
                    I3 = new A3.e(22, c0963y);
                    c0216p.c0(I3);
                }
                C0192d.g((Function0) I3, c0216p);
                c0216p.q(false);
            }
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0005a(c0963y, oVar, function2, i2, 5);
        }
    }

    public static final Y.d d(InterfaceC0980p interfaceC0980p) {
        InterfaceC0980p x2 = interfaceC0980p.x();
        return x2 != null ? x2.n(interfaceC0980p, true) : new Y.d(0.0f, 0.0f, (int) (interfaceC0980p.K() >> 32), (int) (interfaceC0980p.K() & 4294967295L));
    }

    public static final Y.d e(InterfaceC0980p interfaceC0980p) {
        InterfaceC0980p g4 = g(interfaceC0980p);
        float K3 = (int) (g4.K() >> 32);
        float K4 = (int) (g4.K() & 4294967295L);
        Y.d n2 = g(interfaceC0980p).n(interfaceC0980p, true);
        float f4 = n2.f4374a;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > K3) {
            f4 = K3;
        }
        float f5 = n2.f4375b;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > K4) {
            f5 = K4;
        }
        float f6 = n2.f4376c;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 <= K3) {
            K3 = f6;
        }
        float f7 = n2.f4377d;
        float f8 = f7 >= 0.0f ? f7 : 0.0f;
        if (f8 <= K4) {
            K4 = f8;
        }
        if (f4 == K3 || f5 == K4) {
            return Y.d.f4373e;
        }
        long j4 = g4.j(AbstractC0345a.c(f4, f5));
        long j5 = g4.j(AbstractC0345a.c(K3, f5));
        long j6 = g4.j(AbstractC0345a.c(K3, K4));
        long j7 = g4.j(AbstractC0345a.c(f4, K4));
        float d4 = Y.c.d(j4);
        float d5 = Y.c.d(j5);
        float d6 = Y.c.d(j7);
        float d7 = Y.c.d(j6);
        float min = Math.min(d4, Math.min(d5, Math.min(d6, d7)));
        float max = Math.max(d4, Math.max(d5, Math.max(d6, d7)));
        float e4 = Y.c.e(j4);
        float e5 = Y.c.e(j5);
        float e6 = Y.c.e(j7);
        float e7 = Y.c.e(j6);
        return new Y.d(min, Math.min(e4, Math.min(e5, Math.min(e6, e7))), max, Math.max(e4, Math.max(e5, Math.max(e6, e7))));
    }

    public static final boolean f(int i2, int i4) {
        return i2 == i4;
    }

    public static final InterfaceC0980p g(InterfaceC0980p interfaceC0980p) {
        InterfaceC0980p interfaceC0980p2;
        InterfaceC0980p x2 = interfaceC0980p.x();
        while (true) {
            InterfaceC0980p interfaceC0980p3 = x2;
            interfaceC0980p2 = interfaceC0980p;
            interfaceC0980p = interfaceC0980p3;
            if (interfaceC0980p == null) {
                break;
            }
            x2 = interfaceC0980p.x();
        }
        r0.a0 a0Var = interfaceC0980p2 instanceof r0.a0 ? (r0.a0) interfaceC0980p2 : null;
        if (a0Var == null) {
            return interfaceC0980p2;
        }
        r0.a0 a0Var2 = a0Var.f9764t;
        while (true) {
            r0.a0 a0Var3 = a0Var2;
            r0.a0 a0Var4 = a0Var;
            a0Var = a0Var3;
            if (a0Var == null) {
                return a0Var4;
            }
            a0Var2 = a0Var.f9764t;
        }
    }

    public static final r0.P h(r0.P p4) {
        r0.E e4 = p4.f9707r.f9762r;
        while (true) {
            r0.E s4 = e4.s();
            r0.E e5 = null;
            if ((s4 != null ? s4.f9596i : null) == null) {
                r0.P M02 = ((r0.a0) e4.B.f2910d).M0();
                Intrinsics.c(M02);
                return M02;
            }
            r0.E s5 = e4.s();
            if (s5 != null) {
                e5 = s5.f9596i;
            }
            Intrinsics.c(e5);
            r0.E s6 = e4.s();
            Intrinsics.c(s6);
            e4 = s6.f9596i;
            Intrinsics.c(e4);
        }
    }

    public static final long i(long j4, long j5) {
        float d4 = Y.f.d(j4);
        long j6 = AbstractC0958T.f9016a;
        if (j5 == j6) {
            AbstractC0864b.D("ScaleFactor is unspecified");
            throw null;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) * d4;
        float b4 = Y.f.b(j4);
        if (j5 != j6) {
            return u3.l.N(intBitsToFloat, Float.intBitsToFloat((int) (j5 & 4294967295L)) * b4);
        }
        AbstractC0864b.D("ScaleFactor is unspecified");
        throw null;
    }
}
