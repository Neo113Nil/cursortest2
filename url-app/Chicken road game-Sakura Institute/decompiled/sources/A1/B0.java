package A1;

import A.AbstractC0017m;
import D.AbstractC0165r0;
import D.N1;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0213n0;
import Z.C0323u;
import f0.C0585f;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.AbstractC1039r;
import q.C1041t;
import q.C1042u;
import q.InterfaceC1021Z;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import s1.C1183B;
import v.AbstractC1234e;
import z1.AbstractC1365I;
import z1.AbstractC1366J;
import z1.C1361E;
import z1.C1362F;
import z1.C1364H;
import z1.C1369M;
import z1.C1377c;

/* loaded from: classes.dex */
public final class B0 implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f433e;

    public /* synthetic */ B0(int i2, Object obj) {
        this.f432d = i2;
        this.f433e = obj;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        int i2;
        Object obj4;
        String str;
        switch (this.f432d) {
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
                    int i4 = c0216p.f2861P;
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
                    C1067h c1067h = C1069j.f9820f;
                    C0192d.R(c0216p, b4, c1067h);
                    C1067h c1067h2 = C1069j.f9819e;
                    C0192d.R(c0216p, m4, c1067h2);
                    C1067h c1067h3 = C1069j.f9821g;
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i4))) {
                        AbstractC0017m.r(i4, c0216p, i4, c1067h3);
                    }
                    C1067h c1067h4 = C1069j.f9818d;
                    C0192d.R(c0216p, d4, c1067h4);
                    q.h0 h0Var = q.h0.f9258a;
                    C0585f B = j0.c.B();
                    long j4 = AbstractC1365I.f11803d;
                    AbstractC0165r0.a(B, androidx.compose.foundation.layout.c.g(lVar, 28), j4, c0216p, 432, 0);
                    AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.j(lVar, 10));
                    S.o a4 = h0Var.a(lVar, true);
                    C1041t a5 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
                    int i5 = c0216p.f2861P;
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
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                        AbstractC0017m.r(i5, c0216p, i5, c1067h3);
                    }
                    C0192d.R(c0216p, d5, c1067h4);
                    C1361E c1361e = (C1361E) this.f433e;
                    String str2 = c1361e.f11787b;
                    F0.m mVar = F0.r.f2625c;
                    F0.k kVar = F0.k.f2617l;
                    N1.b(str2, null, j4, u3.l.k0(15), null, kVar, mVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 199680, 0, 130962);
                    String str3 = c1361e.f11788c + " · " + c1361e.f11789d;
                    long j5 = AbstractC1365I.f11800a;
                    N1.b(str3, null, j5, u3.l.k0(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
                    N1.b(c1361e.f11791f + " · " + c1361e.f11792g, null, C0323u.b(0.7f, j5), u3.l.k0(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
                    c0216p.q(true);
                    N1.b(c1361e.f11790e, null, AbstractC1365I.f11801b, u3.l.k0(20), null, kVar, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 199680, 0, 130962);
                    c0216p.q(true);
                }
                return Unit.f7487a;
            case 1:
                C1042u PaperCard2 = (C1042u) obj;
                C0216p c0216p2 = (C0216p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(PaperCard2, "$this$PaperCard");
                if ((intValue2 & 17) == 16 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    S.f fVar2 = S.b.f3962q;
                    S.l lVar2 = S.l.f3977a;
                    q.f0 b5 = q.e0.b(AbstractC1031j.f9265a, fVar2, c0216p2, 48);
                    int i6 = c0216p2.f2861P;
                    InterfaceC0213n0 m6 = c0216p2.m();
                    S.o d6 = S.a.d(c0216p2, lVar2);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i2 = C1069j.f9816b;
                    c0216p2.W();
                    if (c0216p2.f2860O) {
                        c0216p2.l(c1068i2);
                    } else {
                        c0216p2.f0();
                    }
                    C1067h c1067h5 = C1069j.f9820f;
                    C0192d.R(c0216p2, b5, c1067h5);
                    C1067h c1067h6 = C1069j.f9819e;
                    C0192d.R(c0216p2, m6, c1067h6);
                    C1067h c1067h7 = C1069j.f9821g;
                    if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i6))) {
                        AbstractC0017m.r(i6, c0216p2, i6, c1067h7);
                    }
                    C1067h c1067h8 = C1069j.f9818d;
                    C0192d.R(c0216p2, d6, c1067h8);
                    q.h0 h0Var2 = q.h0.f9258a;
                    S.o U3 = u3.l.U(androidx.compose.foundation.layout.c.g(lVar2, 36), AbstractC1234e.a(10));
                    C1369M c1369m = (C1369M) this.f433e;
                    AbstractC1035n.a(androidx.compose.foundation.a.b(U3, Z.K.d(c1369m.f11833d), Z.K.f4461a), c0216p2, 0);
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.j(lVar2, 12));
                    S.o a6 = h0Var2.a(lVar2, true);
                    C1041t a7 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p2, 0);
                    int i7 = c0216p2.f2861P;
                    InterfaceC0213n0 m7 = c0216p2.m();
                    S.o d7 = S.a.d(c0216p2, a6);
                    c0216p2.W();
                    if (c0216p2.f2860O) {
                        c0216p2.l(c1068i2);
                    } else {
                        c0216p2.f0();
                    }
                    C0192d.R(c0216p2, a7, c1067h5);
                    C0192d.R(c0216p2, m7, c1067h6);
                    if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i7))) {
                        AbstractC0017m.r(i7, c0216p2, i7, c1067h7);
                    }
                    C0192d.R(c0216p2, d7, c1067h8);
                    N1.b(c1369m.f11831b, null, AbstractC1365I.f11807h, u3.l.k0(16), null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 199680, 0, 130962);
                    N1.b(c1369m.f11832c, null, AbstractC1365I.f11806g, u3.l.k0(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 3072, 0, 131058);
                    c0216p2.q(true);
                    Q.v vVar = AbstractC1366J.f11818d;
                    if (vVar == null || !vVar.isEmpty()) {
                        ListIterator listIterator = vVar.listIterator();
                        i2 = 0;
                        while (true) {
                            A2.b bVar = (A2.b) listIterator;
                            if (bVar.hasNext()) {
                                if (Intrinsics.a(((C1377c) bVar.next()).f11854d, c1369m.f11831b) && (i2 = i2 + 1) < 0) {
                                    throw new ArithmeticException("Count overflow has happened.");
                                }
                            }
                        }
                    } else {
                        i2 = 0;
                    }
                    AbstractC0864b.a(String.valueOf(i2), AbstractC1365I.f11811l, c0216p2, 0);
                    c0216p2.q(true);
                }
                return Unit.f7487a;
            case 2:
                C1042u PaperCard3 = (C1042u) obj;
                C0216p c0216p3 = (C0216p) obj2;
                int intValue3 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(PaperCard3, "$this$PaperCard");
                if ((intValue3 & 17) == 16 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    C1364H c1364h = (C1364H) this.f433e;
                    N1.b(c1364h.f11797c, null, AbstractC1365I.f11807h, u3.l.k0(17), null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 199680, 0, 130962);
                    N1.b(c1364h.f11798d, null, AbstractC1365I.f11806g, u3.l.k0(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 3072, 0, 131058);
                    C0216p c0216p4 = c0216p3;
                    AbstractC1024c.a(c0216p4, androidx.compose.foundation.layout.c.b(S.l.f3977a, 6));
                    Iterator it = c1364h.f11799e.iterator();
                    while (it.hasNext()) {
                        C1362F c1362f = (C1362F) it.next();
                        ListIterator listIterator2 = AbstractC1366J.f11818d.listIterator();
                        while (true) {
                            A2.b bVar2 = (A2.b) listIterator2;
                            if (bVar2.hasNext()) {
                                obj4 = bVar2.next();
                                if (Intrinsics.a(((C1377c) obj4).f11851a, c1362f.f11794b)) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        C1377c c1377c = (C1377c) obj4;
                        int i8 = c1362f.f11793a;
                        if (c1377c == null || (str = c1377c.f11852b) == null) {
                            str = "— vacant —";
                        }
                        C0216p c0216p5 = c0216p4;
                        N1.b("Leg " + i8 + ": " + str, null, c1377c != null ? AbstractC1365I.f11814o : AbstractC1365I.f11806g, u3.l.k0(13), null, null, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p5, 3072, 0, 130994);
                        c0216p4 = c0216p5;
                    }
                }
                return Unit.f7487a;
            case 3:
                q.g0 Button = (q.g0) obj;
                C0216p c0216p6 = (C0216p) obj2;
                int intValue4 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((intValue4 & 17) == 16 && c0216p6.z()) {
                    c0216p6.N();
                } else {
                    N1.b((String) this.f433e, null, 0L, 0L, null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p6, 196608, 0, 130974);
                }
                return Unit.f7487a;
            case 4:
                C1042u Card = (C1042u) obj;
                C0216p c0216p7 = (C0216p) obj2;
                int intValue5 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                if ((intValue5 & 17) == 16 && c0216p7.z()) {
                    c0216p7.N();
                } else {
                    S.o h4 = androidx.compose.foundation.layout.b.h(S.l.f3977a, 14);
                    C1041t a8 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p7, 0);
                    int i9 = c0216p7.f2861P;
                    InterfaceC0213n0 m8 = c0216p7.m();
                    S.o d8 = S.a.d(c0216p7, h4);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i3 = C1069j.f9816b;
                    c0216p7.W();
                    if (c0216p7.f2860O) {
                        c0216p7.l(c1068i3);
                    } else {
                        c0216p7.f0();
                    }
                    C0192d.R(c0216p7, a8, C1069j.f9820f);
                    C0192d.R(c0216p7, m8, C1069j.f9819e);
                    C1067h c1067h9 = C1069j.f9821g;
                    if (c0216p7.f2860O || !Intrinsics.a(c0216p7.I(), Integer.valueOf(i9))) {
                        AbstractC0017m.r(i9, c0216p7, i9, c1067h9);
                    }
                    C0192d.R(c0216p7, d8, C1069j.f9818d);
                    ((O.a) this.f433e).g(C1042u.f9344a, c0216p7, 6);
                    c0216p7.q(true);
                }
                return Unit.f7487a;
            default:
                InterfaceC1021Z inner = (InterfaceC1021Z) obj;
                C0216p c0216p8 = (C0216p) obj2;
                int intValue6 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(inner, "inner");
                if ((intValue6 & 6) == 0) {
                    intValue6 |= c0216p8.f(inner) ? 4 : 2;
                }
                if ((intValue6 & 19) == 18 && c0216p8.z()) {
                    c0216p8.N();
                } else {
                    S.o g4 = androidx.compose.foundation.layout.b.g(S.l.f3977a, inner);
                    c0216p8.S(-2018186931);
                    C1183B c1183b = (C1183B) this.f433e;
                    boolean h5 = c0216p8.h(c1183b);
                    Object I3 = c0216p8.I();
                    if (h5 || I3 == C0208l.f2826a) {
                        I3 = new z1.z(c1183b, 0);
                        c0216p8.c0(I3);
                    }
                    c0216p8.q(false);
                    m3.z.a((C1183B) this.f433e, g4, null, null, null, null, null, null, null, (Function1) I3, c0216p8, 48, 0);
                }
                return Unit.f7487a;
        }
    }
}
