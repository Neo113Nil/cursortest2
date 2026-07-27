package A1;

import A.AbstractC0017m;
import D.N1;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0213n0;
import Z.C0323u;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import p0.InterfaceC0945F;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.AbstractC1039r;
import q.C1028g;
import q.C1041t;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import v.AbstractC1234e;
import z1.AbstractC1365I;
import z1.C1377c;
import z1.C1393s;

/* loaded from: classes.dex */
public final class X extends M2.p implements L2.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f552e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f553i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(List list, Object obj, int i2) {
        super(4);
        this.f551d = i2;
        this.f552e = list;
        this.f553i = obj;
    }

    @Override // L2.d
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        Object obj5;
        int i4;
        switch (this.f551d) {
            case 0:
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
                    C1377c c1377c = (C1377c) this.f552e.get(intValue);
                    c0216p.S(1253847385);
                    C1393s c1393s = (C1393s) this.f553i;
                    Iterator it = c1393s.f11910d.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj5 = it.next();
                            if (Intrinsics.a(((Map.Entry) obj5).getValue(), c1377c.f11851a)) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj5;
                    Integer num = entry != null ? (Integer) entry.getKey() : null;
                    S.l lVar = S.l.f3977a;
                    S.o j4 = androidx.compose.foundation.layout.b.j(androidx.compose.foundation.layout.c.f5081a, 0.0f, 4, 1);
                    q.f0 b4 = q.e0.b(AbstractC1031j.f9265a, S.b.f3962q, c0216p, 48);
                    int i5 = c0216p.f2861P;
                    InterfaceC0213n0 m4 = c0216p.m();
                    S.o d4 = S.a.d(c0216p, j4);
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
                    C0192d.R(c0216p, d4, c1067h4);
                    S.o a4 = q.h0.f9258a.a(lVar, true);
                    C1041t a5 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
                    int i6 = c0216p.f2861P;
                    InterfaceC0213n0 m5 = c0216p.m();
                    S.o d5 = S.a.d(c0216p, a4);
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.l(c1068i);
                    } else {
                        c0216p.f0();
                    }
                    C0192d.R(c0216p, a5, c1067h);
                    C0192d.R(c0216p, m5, c1067h2);
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                        AbstractC0017m.r(i6, c0216p, i6, c1067h3);
                    }
                    C0192d.R(c0216p, d5, c1067h4);
                    StringBuilder o4 = AbstractC0017m.o(c1377c.f11853c, "#", " ");
                    o4.append(c1377c.f11852b);
                    N1.b(o4.toString(), null, AbstractC1365I.f11807h, 0L, null, F0.k.f2616k, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196608, 0, 131034);
                    N1.b(c1377c.f11854d, null, AbstractC1365I.f11806g, u3.l.k0(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
                    C0216p c0216p2 = c0216p;
                    boolean z4 = true;
                    c0216p2.q(true);
                    int i7 = 6;
                    q.f0 b5 = q.e0.b(new C1028g(2), S.b.f3961p, c0216p2, 6);
                    int i8 = c0216p2.f2861P;
                    InterfaceC0213n0 m6 = c0216p2.m();
                    S.l lVar2 = lVar;
                    S.o d6 = S.a.d(c0216p2, lVar2);
                    c0216p2.W();
                    if (c0216p2.f2860O) {
                        c0216p2.l(c1068i);
                    } else {
                        c0216p2.f0();
                    }
                    C0192d.R(c0216p2, b5, c1067h);
                    C0192d.R(c0216p2, m6, c1067h2);
                    if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i8))) {
                        AbstractC0017m.r(i8, c0216p2, i8, c1067h3);
                    }
                    C0192d.R(c0216p2, d6, c1067h4);
                    c0216p2.S(514974958);
                    int i9 = 1;
                    while (i9 < 9) {
                        boolean z5 = (num != null && num.intValue() == i9) ? z4 : false;
                        Integer valueOf = Integer.valueOf(i9);
                        Map map = c1393s.f11910d;
                        boolean z6 = (map.get(valueOf) == null || Intrinsics.a(map.get(Integer.valueOf(i9)), c1377c.f11851a)) ? false : z4;
                        S.o b6 = androidx.compose.foundation.a.b(u3.l.U(androidx.compose.foundation.layout.c.g(lVar2, 28), AbstractC1234e.a(i7)), z5 ? AbstractC1365I.f11805f : z6 ? C0323u.b(0.3f, AbstractC1365I.f11813n) : AbstractC1365I.f11802c, Z.K.f4461a);
                        boolean z7 = !z6;
                        c0216p2.S(515001172);
                        boolean h4 = c0216p2.h(c1393s) | c0216p2.h(c1377c) | c0216p2.g(z5) | c0216p2.d(i9);
                        Object I3 = c0216p2.I();
                        if (h4 || I3 == C0208l.f2826a) {
                            I3 = new V(c1393s, z5, i9, c1377c);
                            c0216p2.c0(I3);
                        }
                        c0216p2.q(false);
                        S.o e4 = androidx.compose.foundation.a.e(b6, z7, null, (Function0) I3, i7);
                        InterfaceC0945F e5 = AbstractC1035n.e(S.b.f3956k, false);
                        int i10 = c0216p2.f2861P;
                        InterfaceC0213n0 m7 = c0216p2.m();
                        S.o d7 = S.a.d(c0216p2, e4);
                        InterfaceC1070k.f9822h.getClass();
                        C1068i c1068i2 = C1069j.f9816b;
                        c0216p2.W();
                        if (c0216p2.f2860O) {
                            c0216p2.l(c1068i2);
                        } else {
                            c0216p2.f0();
                        }
                        C0192d.R(c0216p2, e5, C1069j.f9820f);
                        C0192d.R(c0216p2, m7, C1069j.f9819e);
                        C1067h c1067h5 = C1069j.f9821g;
                        if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i10))) {
                            AbstractC0017m.r(i10, c0216p2, i10, c1067h5);
                        }
                        C0192d.R(c0216p2, d7, C1069j.f9818d);
                        C0216p c0216p3 = c0216p2;
                        N1.b(String.valueOf(i9), null, z5 ? AbstractC1365I.f11801b : AbstractC1365I.f11807h, u3.l.k0(11), null, F0.k.f2617l, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 199680, 0, 131026);
                        c0216p3.q(true);
                        i9++;
                        c0216p2 = c0216p3;
                        z4 = true;
                        i7 = i7;
                        lVar2 = lVar2;
                    }
                    boolean z8 = z4;
                    C0216p c0216p4 = c0216p2;
                    c0216p4.q(false);
                    c0216p4.q(z8);
                    c0216p4.q(z8);
                    c0216p4.q(false);
                }
                break;
            default:
                r.c cVar2 = (r.c) obj;
                int intValue3 = ((Number) obj2).intValue();
                C0216p c0216p5 = (C0216p) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i4 = (c0216p5.f(cVar2) ? 4 : 2) | intValue4;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i4 |= c0216p5.d(intValue3) ? 32 : 16;
                }
                if ((i4 & 147) == 146 && c0216p5.z()) {
                    c0216p5.N();
                } else {
                    C1377c c1377c2 = (C1377c) this.f552e.get(intValue3);
                    c0216p5.S(293306902);
                    S.l lVar3 = S.l.f3977a;
                    c0216p5.S(148008832);
                    Function1 function1 = (Function1) this.f553i;
                    boolean f4 = c0216p5.f(function1) | c0216p5.h(c1377c2);
                    Object I4 = c0216p5.I();
                    if (f4 || I4 == C0208l.f2826a) {
                        I4 = new L0(function1, c1377c2);
                        c0216p5.c0(I4);
                    }
                    c0216p5.q(false);
                    AbstractC0864b.f(androidx.compose.foundation.a.e(lVar3, false, null, (Function0) I4, 7), 0L, O.f.b(-1387128669, new C0064k(2, c1377c2), c0216p5), c0216p5, 384, 2);
                    c0216p5.q(false);
                }
                break;
        }
        return Unit.f7487a;
    }
}
