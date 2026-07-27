package A1;

import A.AbstractC0017m;
import D.N1;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import androidx.compose.foundation.layout.FillElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0945F;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.AbstractC1039r;
import q.C1041t;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import v.AbstractC1234e;
import z1.AbstractC1365I;
import z1.C1377c;

/* loaded from: classes.dex */
public final class J0 extends M2.p implements L2.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q.v f485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f486e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q.v f487i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f488j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(Q.v vVar, int i2, Q.v vVar2, InterfaceC0191c0 interfaceC0191c0) {
        super(4);
        this.f485d = vVar;
        this.f486e = i2;
        this.f487i = vVar2;
        this.f488j = interfaceC0191c0;
    }

    @Override // L2.d
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        r.c cVar = (r.c) obj;
        int intValue = ((Number) obj2).intValue();
        C0216p c0216p = (C0216p) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i2 = (c0216p.f(cVar) ? 4 : 2) | intValue2;
        } else {
            i2 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i2 |= c0216p.d(intValue) ? 32 : 16;
        }
        if ((i2 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            C1377c c1377c = (C1377c) this.f485d.get(intValue);
            c0216p.S(1480040051);
            S.l lVar = S.l.f3977a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f5081a;
            c0216p.S(740481166);
            int i4 = this.f486e;
            boolean d4 = c0216p.d(i4) | c0216p.h(c1377c);
            Object I3 = c0216p.I();
            if (d4 || I3 == C0208l.f2826a) {
                I3 = new I0(this.f487i, i4, c1377c, this.f488j);
                c0216p.c0(I3);
            }
            c0216p.q(false);
            S.o h4 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.e(fillElement, false, null, (Function0) I3, 7), 8);
            q.f0 b4 = q.e0.b(AbstractC1031j.f9265a, S.b.f3962q, c0216p, 48);
            int i5 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d5 = S.a.d(c0216p, h4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p, b4, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                AbstractC0017m.r(i5, c0216p, i5, c1067h3);
            }
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d5, c1067h4);
            S.o b5 = androidx.compose.foundation.a.b(u3.l.U(androidx.compose.foundation.layout.c.g(lVar, 32), AbstractC1234e.a(6)), AbstractC1365I.f11804e, Z.K.f4461a);
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3956k, false);
            int i6 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            S.o d6 = S.a.d(c0216p, b5);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e4, c1067h);
            C0192d.R(c0216p, m5, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                AbstractC0017m.r(i6, c0216p, i6, c1067h3);
            }
            C0192d.R(c0216p, d6, c1067h4);
            N1.b(String.valueOf(c1377c.f11853c), null, AbstractC1365I.f11801b, 0L, null, F0.k.f2617l, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196608, 0, 130970);
            c0216p.q(true);
            AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.j(lVar, 10));
            C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
            int i7 = c0216p.f2861P;
            InterfaceC0213n0 m6 = c0216p.m();
            S.o d7 = S.a.d(c0216p, lVar);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, a4, c1067h);
            C0192d.R(c0216p, m6, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i7))) {
                AbstractC0017m.r(i7, c0216p, i7, c1067h3);
            }
            C0192d.R(c0216p, d7, c1067h4);
            N1.b(c1377c.f11852b, null, AbstractC1365I.f11807h, 0L, null, F0.k.f2616k, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196608, 0, 131034);
            N1.b(c1377c.f11854d, null, AbstractC1365I.f11806g, u3.l.k0(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
            c0216p.q(true);
            c0216p.q(true);
            c0216p.q(false);
        }
        return Unit.f7487a;
    }
}
