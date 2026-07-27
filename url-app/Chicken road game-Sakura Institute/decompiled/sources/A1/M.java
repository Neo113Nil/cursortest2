package A1;

import A.AbstractC0017m;
import D.C0120c;
import D.N1;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import G.X0;
import androidx.compose.foundation.layout.FillElement;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import k.C0742h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
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
import s1.C1193i;
import v.AbstractC1234e;
import z1.AbstractC1365I;
import z1.C1377c;
import z1.C1381g;
import z1.C1391q;

/* loaded from: classes.dex */
public final class M extends M2.p implements L2.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f501e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f502i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f503j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(Object obj, Object obj2, Object obj3, int i2) {
        super(4);
        this.f500d = i2;
        this.f501e = obj;
        this.f502i = obj2;
        this.f503j = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object] */
    @Override // L2.d
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        int i4;
        int i5;
        C1193i c1193i;
        switch (this.f500d) {
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
                    C1377c c1377c = (C1377c) ((ArrayList) this.f501e).get(intValue);
                    c0216p.S(-1396542826);
                    S.l lVar = S.l.f3977a;
                    FillElement fillElement = androidx.compose.foundation.layout.c.f5081a;
                    c0216p.S(1756066751);
                    C1391q c1391q = (C1391q) this.f502i;
                    boolean h4 = c0216p.h(c1391q) | c0216p.h(c1377c);
                    Function0 function0 = (Function0) this.f503j;
                    boolean f4 = h4 | c0216p.f(function0);
                    Object I3 = c0216p.I();
                    if (f4 || I3 == C0208l.f2826a) {
                        I3 = new L(c1391q, c1377c, function0);
                        c0216p.c0(I3);
                    }
                    c0216p.q(false);
                    S.o h5 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.e(fillElement, false, null, (Function0) I3, 7), 8);
                    q.f0 b4 = q.e0.b(AbstractC1031j.f9265a, S.b.f3962q, c0216p, 48);
                    int i6 = c0216p.f2861P;
                    InterfaceC0213n0 m4 = c0216p.m();
                    S.o d4 = S.a.d(c0216p, h5);
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
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                        AbstractC0017m.r(i6, c0216p, i6, c1067h3);
                    }
                    C1067h c1067h4 = C1069j.f9818d;
                    C0192d.R(c0216p, d4, c1067h4);
                    S.o b5 = androidx.compose.foundation.a.b(u3.l.U(androidx.compose.foundation.layout.c.g(lVar, 34), AbstractC1234e.a(6)), AbstractC1365I.f11804e, Z.K.f4461a);
                    InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3956k, false);
                    int i7 = c0216p.f2861P;
                    InterfaceC0213n0 m5 = c0216p.m();
                    S.o d5 = S.a.d(c0216p, b5);
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.l(c1068i);
                    } else {
                        c0216p.f0();
                    }
                    C0192d.R(c0216p, e4, c1067h);
                    C0192d.R(c0216p, m5, c1067h2);
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i7))) {
                        AbstractC0017m.r(i7, c0216p, i7, c1067h3);
                    }
                    C0192d.R(c0216p, d5, c1067h4);
                    N1.b(String.valueOf(c1377c.f11853c), null, AbstractC1365I.f11801b, 0L, null, F0.k.f2617l, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196608, 0, 130970);
                    c0216p.q(true);
                    AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.j(lVar, 10));
                    C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
                    int i8 = c0216p.f2861P;
                    InterfaceC0213n0 m6 = c0216p.m();
                    S.o d6 = S.a.d(c0216p, lVar);
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.l(c1068i);
                    } else {
                        c0216p.f0();
                    }
                    C0192d.R(c0216p, a4, c1067h);
                    C0192d.R(c0216p, m6, c1067h2);
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i8))) {
                        AbstractC0017m.r(i8, c0216p, i8, c1067h3);
                    }
                    C0192d.R(c0216p, d6, c1067h4);
                    N1.b(c1377c.f11852b, null, AbstractC1365I.f11807h, 0L, null, F0.k.f2616k, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196608, 0, 131034);
                    N1.b(c1377c.f11854d, null, AbstractC1365I.f11806g, u3.l.k0(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
                    c0216p.q(true);
                    c0216p.q(true);
                    c0216p.q(false);
                }
                break;
            case 1:
                r.c cVar2 = (r.c) obj;
                int intValue3 = ((Number) obj2).intValue();
                C0216p c0216p2 = (C0216p) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i4 = (c0216p2.f(cVar2) ? 4 : 2) | intValue4;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i4 |= c0216p2.d(intValue3) ? 32 : 16;
                }
                if ((i4 & 147) == 146 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    C1381g c1381g = (C1381g) ((ArrayList) this.f501e).get(intValue3);
                    c0216p2.S(-703364054);
                    AbstractC0864b.f(null, 0L, O.f.b(-405336649, new C0049c0(c1381g, (Function1) this.f502i, (Function1) this.f503j), c0216p2), c0216p2, 384, 3);
                    c0216p2.q(false);
                }
                break;
            case 2:
                r.c cVar3 = (r.c) obj;
                int intValue5 = ((Number) obj2).intValue();
                C0216p c0216p3 = (C0216p) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i5 = (c0216p3.f(cVar3) ? 4 : 2) | intValue6;
                } else {
                    i5 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i5 |= c0216p3.d(intValue5) ? 32 : 16;
                }
                if ((i5 & 147) == 146 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    C1377c c1377c2 = (C1377c) ((List) this.f501e).get(intValue5);
                    c0216p3.S(-245754);
                    S.l lVar2 = S.l.f3977a;
                    FillElement fillElement2 = androidx.compose.foundation.layout.c.f5081a;
                    c0216p3.S(692729993);
                    boolean h6 = c0216p3.h(c1377c2);
                    Object I4 = c0216p3.I();
                    if (h6 || I4 == C0208l.f2826a) {
                        I4 = new L(c1377c2, (InterfaceC0191c0) this.f502i, (InterfaceC0191c0) this.f503j);
                        c0216p3.c0(I4);
                    }
                    c0216p3.q(false);
                    S.o h7 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.e(fillElement2, false, null, (Function0) I4, 7), 8);
                    q.f0 b6 = q.e0.b(AbstractC1031j.f9265a, S.b.f3962q, c0216p3, 48);
                    int i9 = c0216p3.f2861P;
                    InterfaceC0213n0 m7 = c0216p3.m();
                    S.o d7 = S.a.d(c0216p3, h7);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i2 = C1069j.f9816b;
                    c0216p3.W();
                    if (c0216p3.f2860O) {
                        c0216p3.l(c1068i2);
                    } else {
                        c0216p3.f0();
                    }
                    C1067h c1067h5 = C1069j.f9820f;
                    C0192d.R(c0216p3, b6, c1067h5);
                    C1067h c1067h6 = C1069j.f9819e;
                    C0192d.R(c0216p3, m7, c1067h6);
                    C1067h c1067h7 = C1069j.f9821g;
                    if (c0216p3.f2860O || !Intrinsics.a(c0216p3.I(), Integer.valueOf(i9))) {
                        AbstractC0017m.r(i9, c0216p3, i9, c1067h7);
                    }
                    C1067h c1067h8 = C1069j.f9818d;
                    C0192d.R(c0216p3, d7, c1067h8);
                    S.o b7 = androidx.compose.foundation.a.b(u3.l.U(androidx.compose.foundation.layout.c.g(lVar2, 28), AbstractC1234e.a(6)), AbstractC1365I.f11804e, Z.K.f4461a);
                    InterfaceC0945F e5 = AbstractC1035n.e(S.b.f3956k, false);
                    int i10 = c0216p3.f2861P;
                    InterfaceC0213n0 m8 = c0216p3.m();
                    S.o d8 = S.a.d(c0216p3, b7);
                    c0216p3.W();
                    if (c0216p3.f2860O) {
                        c0216p3.l(c1068i2);
                    } else {
                        c0216p3.f0();
                    }
                    C0192d.R(c0216p3, e5, c1067h5);
                    C0192d.R(c0216p3, m8, c1067h6);
                    if (c0216p3.f2860O || !Intrinsics.a(c0216p3.I(), Integer.valueOf(i10))) {
                        AbstractC0017m.r(i10, c0216p3, i10, c1067h7);
                    }
                    C0192d.R(c0216p3, d8, c1067h8);
                    N1.b(String.valueOf(c1377c2.f11853c), null, AbstractC1365I.f11801b, u3.l.k0(12), null, F0.k.f2617l, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 199680, 0, 130962);
                    c0216p3.q(true);
                    AbstractC1024c.a(c0216p3, androidx.compose.foundation.layout.c.j(lVar2, 10));
                    C1041t a5 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p3, 0);
                    int i11 = c0216p3.f2861P;
                    InterfaceC0213n0 m9 = c0216p3.m();
                    S.o d9 = S.a.d(c0216p3, lVar2);
                    c0216p3.W();
                    if (c0216p3.f2860O) {
                        c0216p3.l(c1068i2);
                    } else {
                        c0216p3.f0();
                    }
                    C0192d.R(c0216p3, a5, c1067h5);
                    C0192d.R(c0216p3, m9, c1067h6);
                    if (c0216p3.f2860O || !Intrinsics.a(c0216p3.I(), Integer.valueOf(i11))) {
                        AbstractC0017m.r(i11, c0216p3, i11, c1067h7);
                    }
                    C0192d.R(c0216p3, d9, c1067h8);
                    N1.b(c1377c2.f11852b, null, AbstractC1365I.f11807h, 0L, null, F0.k.f2616k, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 196608, 0, 131034);
                    N1.b(c1377c2.f11854d, null, AbstractC1365I.f11806g, u3.l.k0(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 3072, 0, 131058);
                    c0216p3.q(true);
                    c0216p3.q(true);
                    c0216p3.q(false);
                }
                break;
            default:
                C0742h c0742h = (C0742h) obj;
                C1193i c1193i2 = (C1193i) obj2;
                C0216p c0216p4 = (C0216p) obj3;
                ((Number) obj4).intValue();
                if (!((Boolean) ((InterfaceC0191c0) this.f502i).getValue()).booleanValue()) {
                    List list = (List) ((X0) this.f503j).getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            c1193i = listIterator.previous();
                            if (Intrinsics.a(c1193i2, (C1193i) c1193i)) {
                            }
                        } else {
                            c1193i = 0;
                        }
                    }
                    c1193i2 = c1193i;
                }
                if (c1193i2 != null) {
                    m3.o.b(c1193i2, (P.i) this.f501e, O.f.b(-1263531443, new C0120c(c1193i2, 15, c0742h), c0216p4), c0216p4, 384);
                }
                break;
        }
        return Unit.f7487a;
    }
}
