package A1;

import A.AbstractC0017m;
import D.N1;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0213n0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0945F;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.AbstractC1039r;
import q.C1041t;
import q.C1042u;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import v.AbstractC1234e;
import z1.AbstractC1365I;
import z1.C1377c;

/* loaded from: classes.dex */
public final class G0 implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1377c f467e;

    public G0(int i2, C1377c c1377c) {
        this.f466d = i2;
        this.f467e = c1377c;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        String str;
        C0216p c0216p;
        C1042u PaperCard = (C1042u) obj;
        C0216p c0216p2 = (C0216p) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(PaperCard, "$this$PaperCard");
        if ((intValue & 17) == 16 && c0216p2.z()) {
            c0216p2.N();
        } else {
            S.f fVar = S.b.f3962q;
            S.l lVar = S.l.f3977a;
            q.f0 b4 = q.e0.b(AbstractC1031j.f9265a, fVar, c0216p2, 48);
            int i2 = c0216p2.f2861P;
            InterfaceC0213n0 m4 = c0216p2.m();
            S.o d4 = S.a.d(c0216p2, lVar);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p2.W();
            if (c0216p2.f2860O) {
                c0216p2.l(c1068i);
            } else {
                c0216p2.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p2, b4, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p2, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i2))) {
                AbstractC0017m.r(i2, c0216p2, i2, c1067h3);
            }
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p2, d4, c1067h4);
            q.h0 h0Var = q.h0.f9258a;
            S.o b5 = androidx.compose.foundation.a.b(u3.l.U(androidx.compose.foundation.layout.c.g(lVar, 40), AbstractC1234e.a(10)), AbstractC1365I.f11811l, Z.K.f4461a);
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3956k, false);
            int i4 = c0216p2.f2861P;
            InterfaceC0213n0 m5 = c0216p2.m();
            S.o d5 = S.a.d(c0216p2, b5);
            c0216p2.W();
            if (c0216p2.f2860O) {
                c0216p2.l(c1068i);
            } else {
                c0216p2.f0();
            }
            C0192d.R(c0216p2, e4, c1067h);
            C0192d.R(c0216p2, m5, c1067h2);
            if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i4))) {
                AbstractC0017m.r(i4, c0216p2, i4, c1067h3);
            }
            C0192d.R(c0216p2, d5, c1067h4);
            int i5 = this.f466d + 1;
            String valueOf = String.valueOf(i5);
            long j4 = AbstractC1365I.f11801b;
            F0.m mVar = F0.r.f2625c;
            F0.k kVar = F0.k.f2617l;
            N1.b(valueOf, null, j4, u3.l.k0(18), null, kVar, mVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 199680, 0, 130962);
            c0216p2.q(true);
            AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.j(lVar, 12));
            S.o a4 = h0Var.a(lVar, true);
            C1041t a5 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p2, 0);
            int i6 = c0216p2.f2861P;
            InterfaceC0213n0 m6 = c0216p2.m();
            S.o d6 = S.a.d(c0216p2, a4);
            c0216p2.W();
            if (c0216p2.f2860O) {
                c0216p2.l(c1068i);
            } else {
                c0216p2.f0();
            }
            C0192d.R(c0216p2, a5, c1067h);
            C0192d.R(c0216p2, m6, c1067h2);
            if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i6))) {
                AbstractC0017m.r(i6, c0216p2, i6, c1067h3);
            }
            C0192d.R(c0216p2, d6, c1067h4);
            long j5 = AbstractC1365I.f11806g;
            N1.b("Leg " + i5, null, j5, u3.l.k0(11), null, F0.k.f2616k, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 199680, 0, 131026);
            C1377c c1377c = this.f467e;
            if (c1377c == null || (str = c1377c.f11852b) == null) {
                str = "Tap to assign";
            }
            N1.b(str, null, c1377c != null ? AbstractC1365I.f11807h : j5, u3.l.k0(16), null, kVar, mVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 199680, 0, 130962);
            c0216p2.S(1088601054);
            if (c1377c != null) {
                c0216p = c0216p2;
                N1.b(c1377c.f11854d + " · #" + c1377c.f11853c, null, j5, u3.l.k0(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
            } else {
                c0216p = c0216p2;
            }
            c0216p.q(false);
            c0216p.q(true);
            c0216p.q(true);
        }
        return Unit.f7487a;
    }
}
