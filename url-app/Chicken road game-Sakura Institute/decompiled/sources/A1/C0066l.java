package A1;

import A.AbstractC0017m;
import D.N1;
import D.W0;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import q.AbstractC1031j;
import q.C1042u;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import z1.AbstractC1365I;
import z1.C1377c;

/* renamed from: A1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066l implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1377c f625e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f626i;

    public /* synthetic */ C0066l(C1377c c1377c, InterfaceC0191c0 interfaceC0191c0, int i2) {
        this.f624d = i2;
        this.f625e = c1377c;
        this.f626i = interfaceC0191c0;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f624d) {
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
                    F0.k kVar = F0.k.f2617l;
                    N1.b("Bio", h0Var.a(lVar, true), AbstractC1365I.f11807h, 0L, null, kVar, mVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196614, 0, 130968);
                    c0216p.S(-2035308467);
                    Object I3 = c0216p.I();
                    if (I3 == C0208l.f2826a) {
                        I3 = new C0048c(2, this.f626i);
                        c0216p.c0(I3);
                    }
                    c0216p.q(false);
                    W0.f((Function0) I3, null, false, null, null, AbstractC0082v.f734a, c0216p, 196614);
                    c0216p.q(true);
                    C1377c c1377c = this.f625e;
                    if (kotlin.text.y.x(c1377c.f11857g)) {
                        c0216p.S(-816146518);
                        N1.b("Add a short bio — coach, discipline focus, goals.", null, AbstractC1365I.f11806g, 0L, new F0.i(1), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 6, 0, 131050);
                        c0216p.q(false);
                    } else {
                        c0216p.S(-815987488);
                        N1.b(c1377c.f11857g, null, AbstractC1365I.f11814o, u3.l.k0(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
                        c0216p.q(false);
                    }
                }
                break;
            default:
                r.c item = (r.c) obj;
                C0216p c0216p2 = (C0216p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((intValue2 & 17) == 16 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    AbstractC0864b.f(null, 0L, O.f.b(2108957482, new C0066l(this.f625e, this.f626i, 0), c0216p2), c0216p2, 384, 3);
                }
                break;
        }
        return Unit.f7487a;
    }
}
