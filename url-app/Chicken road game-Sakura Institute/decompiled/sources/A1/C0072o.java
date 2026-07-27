package A1;

import A.AbstractC0017m;
import D.N1;
import D.W0;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.C1042u;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import z1.AbstractC1365I;
import z1.C1379e;

/* renamed from: A1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072o implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f636e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f637i;

    public /* synthetic */ C0072o(ArrayList arrayList, InterfaceC0191c0 interfaceC0191c0, int i2) {
        this.f635d = i2;
        this.f636e = arrayList;
        this.f637i = interfaceC0191c0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f635d) {
            case 0:
                C1042u PaperCard = (C1042u) obj;
                C0216p c0216p = (C0216p) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(PaperCard, "$this$PaperCard");
                if ((intValue & 17) == 16 && c0216p.z()) {
                    c0216p.N();
                } else {
                    S.f fVar = S.b.f3962q;
                    S.l lVar = S.l.f3977a;
                    q.f0 b4 = q.e0.b(AbstractC1031j.f9265a, fVar, c0216p, 48);
                    int i2 = c0216p.f2861P;
                    InterfaceC0213n0 m4 = c0216p.m();
                    S.o d4 = S.a.d(c0216p, lVar);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i = C1069j.f9816b;
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.l(c1068i);
                    } else {
                        c0216p.f0();
                    }
                    C0192d.R(c0216p, b4, C1069j.f9820f);
                    C0192d.R(c0216p, m4, C1069j.f9819e);
                    C1067h c1067h = C1069j.f9821g;
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i2))) {
                        AbstractC0017m.r(i2, c0216p, i2, c1067h);
                    }
                    C0192d.R(c0216p, d4, C1069j.f9818d);
                    q.h0 h0Var = q.h0.f9258a;
                    F0.m mVar = F0.r.f2625c;
                    q.h0 h0Var2 = h0Var;
                    S.l lVar2 = lVar;
                    N1.b("Personal bests", h0Var.a(lVar, true), AbstractC1365I.f11807h, 0L, null, F0.k.f2617l, mVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196614, 0, 130968);
                    c0216p.S(-2035283797);
                    Object I3 = c0216p.I();
                    G.W w4 = C0208l.f2826a;
                    if (I3 == w4) {
                        I3 = new C0048c(3, this.f637i);
                        c0216p.c0(I3);
                    }
                    c0216p.q(false);
                    W0.f((Function0) I3, null, false, null, null, AbstractC0082v.f735b, c0216p, 196614);
                    int i4 = 1;
                    c0216p.q(true);
                    ArrayList arrayList = this.f636e;
                    if (arrayList.isEmpty()) {
                        c0216p.S(-815393497);
                        N1.b("No PBs recorded yet.", null, AbstractC1365I.f11806g, 0L, new F0.i(1), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 6, 0, 131050);
                        c0216p.q(false);
                    } else {
                        boolean z4 = 0;
                        C0216p c0216p2 = c0216p;
                        c0216p2.S(-815233165);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C1379e c1379e = (C1379e) it.next();
                            S.o j4 = androidx.compose.foundation.layout.b.j(androidx.compose.foundation.layout.c.f5081a, 0.0f, 4, i4);
                            q.f0 b5 = q.e0.b(AbstractC1031j.f9265a, fVar, c0216p2, 48);
                            int i5 = c0216p2.f2861P;
                            InterfaceC0213n0 m5 = c0216p2.m();
                            S.o d5 = S.a.d(c0216p2, j4);
                            InterfaceC1070k.f9822h.getClass();
                            C1068i c1068i2 = C1069j.f9816b;
                            c0216p2.W();
                            if (c0216p2.f2860O) {
                                c0216p2.l(c1068i2);
                            } else {
                                c0216p2.f0();
                            }
                            C0192d.R(c0216p2, b5, C1069j.f9820f);
                            C0192d.R(c0216p2, m5, C1069j.f9819e);
                            C1067h c1067h2 = C1069j.f9821g;
                            if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i5))) {
                                AbstractC0017m.r(i5, c0216p2, i5, c1067h2);
                            }
                            C0192d.R(c0216p2, d5, C1069j.f9818d);
                            AbstractC0864b.a(c1379e.f11860c, AbstractC1365I.f11811l, c0216p2, z4);
                            S.l lVar3 = lVar2;
                            AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.j(lVar3, 10));
                            C0216p c0216p3 = c0216p2;
                            G.W w5 = w4;
                            N1.b(c1379e.f11861d, null, AbstractC1365I.f11807h, 0L, null, F0.k.f2617l, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 196608, 0, 130970);
                            q.h0 h0Var3 = h0Var2;
                            AbstractC1024c.a(c0216p3, h0Var3.a(lVar3, true));
                            N1.b(c1379e.f11862e, null, AbstractC1365I.f11806g, u3.l.k0(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 3072, 0, 131058);
                            c0216p3.S(2040621529);
                            boolean h4 = c0216p3.h(c1379e);
                            Object I4 = c0216p3.I();
                            if (h4 || I4 == w5) {
                                I4 = new C0068m(0, c1379e);
                                c0216p3.c0(I4);
                            }
                            c0216p3.q(false);
                            W0.f((Function0) I4, null, false, null, null, AbstractC0082v.f736c, c0216p3, 196608);
                            c0216p3.q(true);
                            i4 = 1;
                            c0216p2 = c0216p3;
                            w4 = w5;
                            z4 = 0;
                            lVar2 = lVar3;
                            h0Var2 = h0Var3;
                        }
                        c0216p2.q(z4);
                    }
                }
                break;
            default:
                r.c item = (r.c) obj;
                C0216p c0216p4 = (C0216p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((intValue2 & 17) == 16 && c0216p4.z()) {
                    c0216p4.N();
                } else {
                    AbstractC0864b.f(null, 0L, O.f.b(-1740472503, new C0072o(this.f636e, this.f637i, 0), c0216p4), c0216p4, 384, 3);
                }
                break;
        }
        return Unit.f7487a;
    }
}
