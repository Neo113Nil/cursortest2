package A1;

import A.AbstractC0017m;
import B1.C0097d;
import D.N1;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0213n0;
import Z.C0323u;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1039r;
import q.C1025d;
import q.C1041t;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import v.AbstractC1234e;
import y2.C1338m;
import z1.AbstractC1365I;
import z1.AbstractC1366J;
import z1.C1377c;
import z1.C1381g;
import z1.C1389o;
import z1.C1391q;
import z1.C1393s;
import z1.EnumC1387m;
import z2.C1403G;
import z2.C1405I;
import z2.C1439w;
import z2.C1441y;

/* loaded from: classes.dex */
public final class A0 extends M2.p implements L2.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f429e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(int i2, Object obj) {
        super(4);
        this.f428d = i2;
        this.f429e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0142 A[SYNTHETIC] */
    @Override // L2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        List E3;
        Object obj5;
        String str;
        boolean z4;
        boolean z5;
        C0216p c0216p;
        S.l lVar;
        Object obj6;
        u0 u0Var;
        Object obj7;
        switch (this.f428d) {
            case 0:
                r.c cVar = (r.c) obj;
                int intValue = ((Number) obj2).intValue();
                C0216p c0216p2 = (C0216p) obj3;
                int intValue2 = ((Number) obj4).intValue();
                int i2 = (intValue2 & 6) == 0 ? (c0216p2.f(cVar) ? 4 : 2) | intValue2 : intValue2;
                if ((intValue2 & 48) == 0) {
                    i2 |= c0216p2.d(intValue) ? 32 : 16;
                }
                if ((i2 & 147) == 146 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    C1381g c1381g = (C1381g) ((ArrayList) this.f429e).get(intValue);
                    c0216p2.S(1752797822);
                    EnumC1387m[] elements = {EnumC1387m.f11893e, EnumC1387m.f11894i, EnumC1387m.f11895j, EnumC1387m.f11896k, EnumC1387m.f11897l};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    boolean contains = C1439w.A(elements).contains(c1381g.f11865c);
                    String str2 = c1381g.f11863a;
                    if (contains) {
                        ListIterator listIterator = AbstractC1366J.f11821g.listIterator();
                        while (true) {
                            A2.b bVar = (A2.b) listIterator;
                            if (bVar.hasNext()) {
                                obj6 = bVar.next();
                                if (Intrinsics.a(((C1391q) obj6).f11904b, str2)) {
                                }
                            } else {
                                obj6 = null;
                            }
                        }
                        C1391q c1391q = (C1391q) obj6;
                        if (c1391q == null) {
                            E3 = C1405I.f11931d;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (C1389o c1389o : c1391q.f11905c) {
                                Double a4 = c1389o.a();
                                if (a4 != null) {
                                    double doubleValue = a4.doubleValue();
                                    ListIterator listIterator2 = AbstractC1366J.f11818d.listIterator();
                                    while (true) {
                                        A2.b bVar2 = (A2.b) listIterator2;
                                        if (bVar2.hasNext()) {
                                            obj7 = bVar2.next();
                                            if (Intrinsics.a(((C1377c) obj7).f11851a, c1389o.f11901a)) {
                                            }
                                        } else {
                                            obj7 = null;
                                        }
                                    }
                                    C1377c c1377c = (C1377c) obj7;
                                    if (c1377c != null) {
                                        String format = String.format("%.2f m", Arrays.copyOf(new Object[]{a4}, 1));
                                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                        u0Var = new u0(c1377c.f11852b, c1377c.f11854d, format, doubleValue, true);
                                        if (u0Var == null) {
                                            arrayList.add(u0Var);
                                        }
                                    }
                                }
                                u0Var = null;
                                if (u0Var == null) {
                                }
                            }
                            E3 = C1403G.E(C1403G.D(arrayList, new C0062j(5)), 3);
                        }
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Q.v vVar = AbstractC1366J.f11820f;
                        ArrayList arrayList3 = new ArrayList();
                        ListIterator listIterator3 = vVar.listIterator();
                        while (true) {
                            A2.b bVar3 = (A2.b) listIterator3;
                            if (bVar3.hasNext()) {
                                Object next = bVar3.next();
                                if (Intrinsics.a(((C1393s) next).f11908b, str2)) {
                                    arrayList3.add(next);
                                }
                            } else {
                                Iterator it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    C1393s c1393s = (C1393s) it.next();
                                    for (Map.Entry entry : c1393s.f11911e.entrySet()) {
                                        int intValue3 = ((Number) entry.getKey()).intValue();
                                        long longValue = ((Number) entry.getValue()).longValue();
                                        String str3 = (String) c1393s.f11910d.get(Integer.valueOf(intValue3));
                                        if (str3 != null) {
                                            ListIterator listIterator4 = AbstractC1366J.f11818d.listIterator();
                                            while (true) {
                                                A2.b bVar4 = (A2.b) listIterator4;
                                                if (bVar4.hasNext()) {
                                                    obj5 = bVar4.next();
                                                    if (Intrinsics.a(((C1377c) obj5).f11851a, str3)) {
                                                    }
                                                } else {
                                                    obj5 = null;
                                                }
                                            }
                                            C1377c c1377c2 = (C1377c) obj5;
                                            if (c1377c2 != null) {
                                                arrayList2.add(new u0(c1377c2.f11852b, c1377c2.f11854d, AbstractC0071n0.k(longValue), longValue, false));
                                            }
                                        }
                                    }
                                }
                                E3 = C1403G.E(C1403G.D(arrayList2, new C0062j(4)), 3);
                            }
                        }
                    }
                    S.l lVar2 = S.l.f3977a;
                    float f4 = 14;
                    S.o U3 = u3.l.U(androidx.compose.foundation.layout.c.f5081a, AbstractC1234e.a(f4));
                    long j4 = AbstractC1365I.f11806g;
                    E1.i iVar = Z.K.f4461a;
                    S.o h4 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.b(U3, j4, iVar), f4);
                    C1025d c1025d = AbstractC1031j.f9267c;
                    S.e eVar = S.b.f3963r;
                    C1041t a5 = AbstractC1039r.a(c1025d, eVar, c0216p2, 0);
                    int i4 = c0216p2.f2861P;
                    InterfaceC0213n0 m4 = c0216p2.m();
                    S.o d4 = S.a.d(c0216p2, h4);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i = C1069j.f9816b;
                    c0216p2.W();
                    if (c0216p2.f2860O) {
                        c0216p2.l(c1068i);
                    } else {
                        c0216p2.f0();
                    }
                    C0192d.R(c0216p2, a5, C1069j.f9820f);
                    C0192d.R(c0216p2, m4, C1069j.f9819e);
                    C1067h c1067h = C1069j.f9821g;
                    if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i4))) {
                        AbstractC0017m.r(i4, c0216p2, i4, c1067h);
                    }
                    C0192d.R(c0216p2, d4, C1069j.f9818d);
                    int ordinal = c1381g.f11865c.ordinal();
                    Integer num = c1381g.f11866d;
                    switch (ordinal) {
                        case 0:
                        case 1:
                        case 2:
                            str = (num != null ? num.intValue() : 0) + " m";
                            break;
                        case 3:
                            str = (num != null ? num.intValue() : 100) + " m Hurdles";
                            break;
                        case 4:
                            str = (num != null ? num.intValue() : 400) + " m Relay";
                            break;
                        case 5:
                            str = "Long Jump";
                            break;
                        case 6:
                            str = "High Jump";
                            break;
                        case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "Shot Put";
                            break;
                        case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                            str = "Discus";
                            break;
                        case AbstractC1024c.f9242c /* 9 */:
                            str = "Javelin";
                            break;
                        case 10:
                            str = ((num != null ? num.intValue() : 2000) / 1000) + " km Cross-country";
                            break;
                        default:
                            throw new C1338m();
                    }
                    String str4 = str;
                    long j5 = AbstractC1365I.f11803d;
                    F0.m mVar = F0.r.f2625c;
                    S.e eVar2 = eVar;
                    E1.i iVar2 = iVar;
                    N1.b(str4, null, j5, u3.l.k0(18), null, F0.k.f2617l, mVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 199680, 0, 130962);
                    float f5 = 8;
                    S.l lVar3 = lVar2;
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(lVar3, f5));
                    if (E3.isEmpty()) {
                        c0216p2.S(2113096494);
                        N1.b("— no results yet —", null, C0323u.b(0.7f, AbstractC1365I.f11800a), 0L, new F0.i(1), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 6, 0, 131050);
                        z4 = false;
                        c0216p2.q(false);
                        z5 = true;
                        c0216p = c0216p2;
                    } else {
                        C0216p c0216p3 = c0216p2;
                        z4 = false;
                        boolean z6 = true;
                        c0216p3.S(2113338635);
                        int i5 = 0;
                        for (Object obj8 : E3) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                C1441y.g();
                                throw null;
                            }
                            u0 u0Var2 = (u0) obj8;
                            E1.i iVar3 = iVar2;
                            S.o h5 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.b(u3.l.U(androidx.compose.foundation.layout.c.f5081a, AbstractC1234e.a(f5)), Z.K.d(i5 != 0 ? i5 != z6 ? 4290345546L : 4289243304L : 4291404327L), iVar3), 10);
                            q.f0 b4 = q.e0.b(AbstractC1031j.f9265a, S.b.f3962q, c0216p3, 48);
                            int i7 = c0216p3.f2861P;
                            InterfaceC0213n0 m5 = c0216p3.m();
                            S.o d5 = S.a.d(c0216p3, h5);
                            InterfaceC1070k.f9822h.getClass();
                            C1068i c1068i2 = C1069j.f9816b;
                            c0216p3.W();
                            if (c0216p3.f2860O) {
                                c0216p3.l(c1068i2);
                            } else {
                                c0216p3.f0();
                            }
                            C1067h c1067h2 = C1069j.f9820f;
                            C0192d.R(c0216p3, b4, c1067h2);
                            C1067h c1067h3 = C1069j.f9819e;
                            C0192d.R(c0216p3, m5, c1067h3);
                            C1067h c1067h4 = C1069j.f9821g;
                            if (c0216p3.f2860O || !Intrinsics.a(c0216p3.I(), Integer.valueOf(i7))) {
                                AbstractC0017m.r(i7, c0216p3, i7, c1067h4);
                            }
                            C1067h c1067h5 = C1069j.f9818d;
                            C0192d.R(c0216p3, d5, c1067h5);
                            q.h0 h0Var = q.h0.f9258a;
                            String valueOf = String.valueOf(i6);
                            long j6 = AbstractC1365I.f11807h;
                            F0.k kVar = F0.k.f2617l;
                            int i8 = i5;
                            C0216p c0216p4 = c0216p3;
                            S.l lVar4 = lVar3;
                            float f6 = f5;
                            N1.b(valueOf, androidx.compose.foundation.layout.c.j(lVar3, 32), j6, u3.l.k0(22), null, kVar, mVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p4, 199728, 0, 130960);
                            S.o a6 = h0Var.a(lVar4, true);
                            S.e eVar3 = eVar2;
                            C1041t a7 = AbstractC1039r.a(AbstractC1031j.f9267c, eVar3, c0216p4, 0);
                            int i9 = c0216p4.f2861P;
                            InterfaceC0213n0 m6 = c0216p4.m();
                            S.o d6 = S.a.d(c0216p4, a6);
                            c0216p4.W();
                            if (c0216p4.f2860O) {
                                c0216p4.l(c1068i2);
                            } else {
                                c0216p4.f0();
                            }
                            C0192d.R(c0216p4, a7, c1067h2);
                            C0192d.R(c0216p4, m6, c1067h3);
                            if (c0216p4.f2860O || !Intrinsics.a(c0216p4.I(), Integer.valueOf(i9))) {
                                AbstractC0017m.r(i9, c0216p4, i9, c1067h4);
                            }
                            C0192d.R(c0216p4, d6, c1067h5);
                            String str5 = u0Var2.f729a;
                            long j7 = AbstractC1365I.f11814o;
                            eVar2 = eVar3;
                            N1.b(str5, null, j7, u3.l.k0(15), null, kVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p4, 199680, 0, 131026);
                            N1.b(u0Var2.f730b, null, C0323u.b(0.7f, j7), u3.l.k0(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p4, 3072, 0, 131058);
                            c0216p4.q(true);
                            N1.b(u0Var2.f731c, null, j7, u3.l.k0(16), null, kVar, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p4, 199680, 0, 130962);
                            c0216p4.q(true);
                            c0216p4.S(1176608754);
                            if (i8 < E3.size() - 1) {
                                lVar = lVar4;
                                AbstractC1024c.a(c0216p4, androidx.compose.foundation.layout.c.b(lVar, 6));
                            } else {
                                lVar = lVar4;
                            }
                            z4 = false;
                            c0216p4.q(false);
                            c0216p3 = c0216p4;
                            lVar3 = lVar;
                            i5 = i6;
                            f5 = f6;
                            iVar2 = iVar3;
                            z6 = true;
                        }
                        z5 = z6;
                        c0216p = c0216p3;
                        c0216p.q(z4);
                    }
                    c0216p.q(z5);
                    c0216p.q(z4);
                }
                return Unit.f7487a;
            case 1:
                int i10 = ((F0.i) obj3).f2611a;
                I0.c cVar2 = (I0.c) this.f429e;
                F0.t b5 = ((F0.e) cVar2.f3349e).b((F0.r) obj, (F0.k) obj2, i10, ((F0.j) obj4).f2612a);
                if (b5 instanceof F0.t) {
                    Object obj9 = b5.f2632d;
                    Intrinsics.d(obj9, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj9;
                }
                C0097d c0097d = new C0097d(b5, cVar2.f3354j);
                cVar2.f3354j = c0097d;
                Object obj10 = c0097d.f989j;
                Intrinsics.d(obj10, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj10;
            default:
                r.c cVar3 = (r.c) obj;
                ((Number) obj2).intValue();
                C0216p c0216p5 = (C0216p) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= c0216p5.f(cVar3) ? 4 : 2;
                }
                if ((intValue4 & 131) == 130 && c0216p5.z()) {
                    c0216p5.N();
                } else {
                    ((O.a) this.f429e).g(cVar3, c0216p5, Integer.valueOf(intValue4 & 14));
                }
                return Unit.f7487a;
        }
    }
}
