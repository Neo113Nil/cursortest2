package A;

import D.A1;
import D.C0185z0;
import D.I1;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import G.X0;
import a.AbstractC0345a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0782h;
import l.C0790p;
import l.u0;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import q.C1013Q;
import q.C1043v;
import q.m0;
import s0.AbstractC1144g0;
import s0.C1157n;
import w.n0;
import z2.C1412P;

/* loaded from: classes.dex */
public final class i0 extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i2, Object obj) {
        super(3);
        this.f155d = i2;
        this.f156e = obj;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        InterfaceC0946G t4;
        InterfaceC0946G t5;
        long a4;
        long a5;
        G.W w4 = C0208l.f2826a;
        int i2 = 0;
        Object obj4 = this.f156e;
        switch (this.f155d) {
            case 0:
                S.o oVar = (S.o) obj;
                C0216p c0216p = (C0216p) obj2;
                ((Number) obj3).intValue();
                c0216p.S(1980580247);
                M0.b bVar = (M0.b) c0216p.k(AbstractC1144g0.f10218f);
                Object I3 = c0216p.I();
                if (I3 == w4) {
                    I3 = C0192d.K(new M0.j(0L), G.W.f2779l);
                    c0216p.c0(I3);
                }
                InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
                a0 a0Var = (a0) obj4;
                boolean h4 = c0216p.h(a0Var);
                Object I4 = c0216p.I();
                if (h4 || I4 == w4) {
                    I4 = new f0(a0Var, 0, interfaceC0191c0);
                    c0216p.c0(I4);
                }
                Function0 function0 = (Function0) I4;
                boolean f4 = c0216p.f(bVar);
                Object I5 = c0216p.I();
                if (f4 || I5 == w4) {
                    I5 = new h0(bVar, interfaceC0191c0, r0);
                    c0216p.c0(I5);
                }
                C0790p c0790p = O.f45a;
                S.o b4 = S.a.b(oVar, C1157n.f10272m, new J(function0, i2, (Function1) I5));
                c0216p.q(false);
                return b4;
            case 1:
                C0216p c0216p2 = (C0216p) obj2;
                ((Number) obj3).intValue();
                c0216p2.S(-1541271084);
                A1 a12 = (A1) obj4;
                float f5 = a12.f1179b;
                u0 u0Var = I1.f1338a;
                X0 a6 = AbstractC0782h.a(f5, u0Var, c0216p2, 0);
                X0 a7 = AbstractC0782h.a(a12.f1178a, u0Var, c0216p2, 0);
                S.o l4 = androidx.compose.foundation.layout.c.l(((S.o) obj).h(androidx.compose.foundation.layout.c.f5081a), S.b.f3958m);
                boolean f6 = c0216p2.f(a7);
                Object I6 = c0216p2.I();
                if (f6 || I6 == w4) {
                    I6 = new C0185z0(a7, 1);
                    c0216p2.c0(I6);
                }
                S.o j4 = androidx.compose.foundation.layout.c.j(androidx.compose.foundation.layout.b.f(l4, (Function1) I6), ((M0.e) a6.getValue()).f3545d);
                c0216p2.q(false);
                return j4;
            case 2:
                AbstractC0954O a8 = ((InterfaceC0944E) obj2).a(((M0.a) obj3).f3539a);
                t4 = ((InterfaceC0947H) obj).t(a8.f9005d, a8.f9006e, C1412P.c(), new C0028y(a8, 17, (k.v) obj4));
                return t4;
            case 3:
                long j5 = ((Y.c) obj3).f4372a;
                ((C) obj4).f10e.c(((l0.s) obj2).f7925c);
                Unit unit = Unit.f7487a;
                return Unit.f7487a;
            case 4:
                C0216p c0216p3 = (C0216p) obj2;
                ((Number) obj3).intValue();
                c0216p3.S(-1608161351);
                Function1 function1 = (Function1) obj4;
                boolean f7 = c0216p3.f(function1);
                Object I7 = c0216p3.I();
                if (f7 || I7 == w4) {
                    I7 = new C1043v(function1);
                    c0216p3.c0(I7);
                }
                C1043v c1043v = (C1043v) I7;
                c0216p3.q(false);
                return c1043v;
            case 5:
                C0216p c0216p4 = (C0216p) obj2;
                ((Number) obj3).intValue();
                c0216p4.S(-1415685722);
                m0 m0Var = (m0) obj4;
                boolean f8 = c0216p4.f(m0Var);
                Object I8 = c0216p4.I();
                if (f8 || I8 == w4) {
                    I8 = new C1013Q(m0Var);
                    c0216p4.c0(I8);
                }
                C1013Q c1013q = (C1013Q) I8;
                c0216p4.q(false);
                return c1013q;
            case 6:
                long j6 = ((M0.a) obj3).f3539a;
                long j7 = ((n0) obj4).f11271f;
                AbstractC0954O a9 = ((InterfaceC0944E) obj2).a(M0.a.b(j6, kotlin.ranges.b.e((int) (j7 >> 32), M0.a.k(j6), M0.a.i(j6)), 0, kotlin.ranges.b.e((int) (j7 & 4294967295L), M0.a.j(j6), M0.a.h(j6)), 0, 10));
                t5 = ((InterfaceC0947H) obj).t(a9.f9005d, a9.f9006e, C1412P.c(), new P0.n(a9, 9));
                return t5;
            default:
                C0216p c0216p5 = (C0216p) obj2;
                ((Number) obj3).intValue();
                c0216p5.S(1582736677);
                M0.b bVar2 = (M0.b) c0216p5.k(AbstractC1144g0.f10218f);
                F0.d dVar = (F0.d) c0216p5.k(AbstractC1144g0.f10221i);
                M0.k kVar = (M0.k) c0216p5.k(AbstractC1144g0.f10224l);
                A0.L l5 = (A0.L) obj4;
                boolean f9 = c0216p5.f(l5) | c0216p5.f(kVar);
                Object I9 = c0216p5.I();
                if (f9 || I9 == w4) {
                    I9 = AbstractC0345a.E(l5, kVar);
                    c0216p5.c0(I9);
                }
                A0.L l6 = (A0.L) I9;
                boolean f10 = c0216p5.f(dVar) | c0216p5.f(l6);
                Object I10 = c0216p5.I();
                if (f10 || I10 == w4) {
                    A0.D d4 = l6.f303a;
                    F0.r rVar = d4.f261f;
                    F0.k kVar2 = d4.f258c;
                    if (kVar2 == null) {
                        kVar2 = F0.k.f2614i;
                    }
                    F0.i iVar = d4.f259d;
                    int i4 = iVar != null ? iVar.f2611a : 0;
                    F0.j jVar = d4.f260e;
                    I10 = ((F0.e) dVar).b(rVar, kVar2, i4, jVar != null ? jVar.f2612a : 1);
                    c0216p5.c0(I10);
                }
                X0 x02 = (X0) I10;
                Object I11 = c0216p5.I();
                Object obj5 = I11;
                if (I11 == w4) {
                    Object value = x02.getValue();
                    n0 n0Var = new n0();
                    n0Var.f11266a = kVar;
                    n0Var.f11267b = bVar2;
                    n0Var.f11268c = dVar;
                    n0Var.f11269d = l5;
                    n0Var.f11270e = value;
                    a5 = w.b0.a(l5, bVar2, dVar, w.b0.f11137a, 1);
                    n0Var.f11271f = a5;
                    c0216p5.c0(n0Var);
                    obj5 = n0Var;
                }
                n0 n0Var2 = (n0) obj5;
                Object value2 = x02.getValue();
                if (kVar != n0Var2.f11266a || !Intrinsics.a(bVar2, n0Var2.f11267b) || !Intrinsics.a(dVar, n0Var2.f11268c) || !Intrinsics.a(l6, n0Var2.f11269d) || !Intrinsics.a(value2, n0Var2.f11270e)) {
                    n0Var2.f11266a = kVar;
                    n0Var2.f11267b = bVar2;
                    n0Var2.f11268c = dVar;
                    n0Var2.f11269d = l6;
                    n0Var2.f11270e = value2;
                    a4 = w.b0.a(l6, bVar2, dVar, w.b0.f11137a, 1);
                    n0Var2.f11271f = a4;
                }
                boolean h5 = c0216p5.h(n0Var2);
                Object I12 = c0216p5.I();
                if (h5 || I12 == w4) {
                    I12 = new i0(6, n0Var2);
                    c0216p5.c0(I12);
                }
                S.o b5 = androidx.compose.ui.layout.a.b((L2.c) I12);
                c0216p5.q(false);
                return b5;
        }
    }
}
