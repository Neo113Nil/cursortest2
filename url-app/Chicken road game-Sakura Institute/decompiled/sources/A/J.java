package A;

import A1.A0;
import B1.C0097d;
import D.z1;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0233y;
import G.InterfaceC0191c0;
import G.X0;
import android.graphics.Typeface;
import android.text.Spannable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.C0778d;
import l.C0788n;
import m0.C0855c;
import o.C0891i0;
import o.C0911t;
import p.C0935k;
import p.InterfaceC0934j;
import q.n0;

/* loaded from: classes.dex */
public final class J extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f32i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(Object obj, int i2, Object obj2) {
        super(3);
        this.f30d = i2;
        this.f31e = obj;
        this.f32i = obj2;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        switch (this.f30d) {
            case 0:
                C0216p c0216p = (C0216p) obj2;
                ((Number) obj3).intValue();
                c0216p.S(759876635);
                Object I3 = c0216p.I();
                G.W w4 = C0208l.f2826a;
                if (I3 == w4) {
                    I3 = C0192d.D((Function0) this.f31e);
                    c0216p.c0(I3);
                }
                X0 x02 = (X0) I3;
                Object I4 = c0216p.I();
                if (I4 == w4) {
                    I4 = new C0778d(new Y.c(((Y.c) x02.getValue()).f4372a), O.f46b, new Y.c(O.f47c), 8);
                    c0216p.c0(I4);
                }
                C0778d c0778d = (C0778d) I4;
                Unit unit = Unit.f7487a;
                boolean h4 = c0216p.h(c0778d);
                Object I5 = c0216p.I();
                if (h4 || I5 == w4) {
                    I5 = new N(x02, c0778d, null);
                    c0216p.c0(I5);
                }
                C0192d.e(c0216p, unit, (Function2) I5);
                C0788n c0788n = c0778d.f7700c;
                boolean f4 = c0216p.f(c0788n);
                Object I6 = c0216p.I();
                if (f4 || I6 == w4) {
                    I6 = new I(c0788n, 0);
                    c0216p.c0(I6);
                }
                S.o oVar = (S.o) ((Function1) this.f32i).invoke((Function0) I6);
                c0216p.q(false);
                return oVar;
            case 1:
                C0216p c0216p2 = (C0216p) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    z1.d((O.a) this.f31e, (Function2) this.f32i, c0216p2, 0);
                }
                return Unit.f7487a;
            case 2:
                A0.D d4 = (A0.D) obj;
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                F0.r rVar = d4.f261f;
                F0.k kVar = d4.f258c;
                if (kVar == null) {
                    kVar = F0.k.f2614i;
                }
                F0.i iVar = d4.f259d;
                int i2 = iVar != null ? iVar.f2611a : 0;
                F0.j jVar = d4.f260e;
                int i4 = jVar != null ? jVar.f2612a : 1;
                I0.c cVar = (I0.c) ((A0) this.f32i).f429e;
                F0.t b4 = ((F0.e) cVar.f3349e).b(rVar, kVar, i2, i4);
                if (b4 instanceof F0.t) {
                    Object obj4 = b4.f2632d;
                    Intrinsics.d(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj4;
                } else {
                    C0097d c0097d = new C0097d(b4, cVar.f3354j);
                    cVar.f3354j = c0097d;
                    Object obj5 = c0097d.f989j;
                    Intrinsics.d(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj5;
                }
                ((Spannable) this.f31e).setSpan(new D0.b(1, typeface), intValue, intValue2, 33);
                return Unit.f7487a;
            case 3:
                C0216p c0216p3 = (C0216p) obj2;
                ((Number) obj3).intValue();
                c0216p3.S(-353972293);
                m.S b5 = ((m.Q) this.f31e).b((InterfaceC0934j) this.f32i, c0216p3);
                boolean f5 = c0216p3.f(b5);
                Object I7 = c0216p3.I();
                if (f5 || I7 == C0208l.f2826a) {
                    I7 = new m.U(b5);
                    c0216p3.c0(I7);
                }
                m.U u4 = (m.U) I7;
                c0216p3.q(false);
                return u4;
            case 4:
                C0216p c0216p4 = (C0216p) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0216p4.z()) {
                    c0216p4.N();
                } else {
                    Object I8 = c0216p4.I();
                    if (I8 == C0208l.f2826a) {
                        I8 = new n.j();
                        c0216p4.c0(I8);
                    }
                    n.j jVar2 = (n.j) I8;
                    jVar2.f8523a.clear();
                    ((C0028y) this.f31e).invoke(jVar2);
                    jVar2.a((n.c) this.f32i, c0216p4, 0);
                }
                return Unit.f7487a;
            case 5:
                l0.s sVar = (l0.s) obj;
                l0.s sVar2 = (l0.s) obj2;
                long j4 = ((Y.c) obj3).f4372a;
                C0891i0 c0891i0 = (C0891i0) this.f31e;
                if (((Boolean) c0891i0.f8798w.invoke(sVar)).booleanValue()) {
                    if (!c0891i0.B) {
                        if (c0891i0.f8801z == null) {
                            c0891i0.f8801z = Y2.l.a(Integer.MAX_VALUE, 6, null);
                        }
                        c0891i0.B = true;
                        W2.B.m(c0891i0.p0(), null, null, new o.K(c0891i0, null), 3);
                    }
                    u3.l.Q((C0855c) this.f32i, sVar);
                    long g4 = Y.c.g(sVar2.f7925c, j4);
                    Y2.e eVar = c0891i0.f8801z;
                    if (eVar != null) {
                        eVar.o(new C0911t(g4));
                    }
                }
                return Unit.f7487a;
            default:
                C0216p c0216p5 = (C0216p) obj2;
                ((Number) obj3).intValue();
                c0216p5.S(-102778667);
                Object I9 = c0216p5.I();
                G.W w5 = C0208l.f2826a;
                if (I9 == w5) {
                    C0233y c0233y = new C0233y(C0192d.z(kotlin.coroutines.i.f7498d, c0216p5));
                    c0216p5.c0(c0233y);
                    I9 = c0233y;
                }
                b3.c cVar2 = ((C0233y) I9).f2966d;
                Object I10 = c0216p5.I();
                if (I10 == w5) {
                    I10 = C0192d.K(null, G.W.f2779l);
                    c0216p5.c0(I10);
                }
                InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I10;
                InterfaceC0191c0 N3 = C0192d.N((Function1) this.f32i, c0216p5);
                C0935k c0935k = (C0935k) this.f31e;
                boolean f6 = c0216p5.f(c0935k);
                Object I11 = c0216p5.I();
                if (f6 || I11 == w5) {
                    I11 = new n0(interfaceC0191c0, 14, c0935k);
                    c0216p5.c0(I11);
                }
                C0192d.d(c0935k, (Function1) I11, c0216p5);
                S.l lVar = S.l.f3977a;
                boolean h5 = c0216p5.h(cVar2) | c0216p5.f(c0935k) | c0216p5.f(N3);
                Object I12 = c0216p5.I();
                if (h5 || I12 == w5) {
                    w.h0 h0Var = new w.h0(cVar2, interfaceC0191c0, (C0935k) this.f31e, N3, null);
                    c0216p5.c0(h0Var);
                    I12 = h0Var;
                }
                S.o a4 = l0.w.a(lVar, c0935k, (Function2) I12);
                c0216p5.q(false);
                return a4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Function1 function1, C0935k c0935k) {
        super(3);
        this.f30d = 6;
        this.f32i = function1;
        this.f31e = c0935k;
    }
}
