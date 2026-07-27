package A1;

import A.AbstractC0017m;
import D.AbstractC0151m0;
import D.AbstractC0159p;
import D.K1;
import D.N1;
import D.S0;
import D.W0;
import G.C0192d;
import G.C0205j0;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import Z.C0323u;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import p0.InterfaceC0945F;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.AbstractC1039r;
import q.C1023b;
import q.C1025d;
import q.C1028g;
import q.C1041t;
import q.C1042u;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import v.AbstractC1234e;
import y2.C1338m;
import z1.AbstractC1365I;
import z1.AbstractC1366J;
import z1.C1372P;
import z1.C1377c;
import z1.C1381g;
import z1.C1389o;
import z1.C1391q;
import z1.C1393s;
import z1.EnumC1375a;
import z1.EnumC1387m;
import z1.EnumC1388n;
import z2.C1403G;
import z2.C1439w;
import z2.C1442z;

/* renamed from: A1.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0071n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0205j0 f634a = C0192d.K(Boolean.FALSE, G.W.f2779l);

    public static final void a(C1391q c1391q, Function0 function0, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-1906188628);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? c0216p.f(c1391q) : c0216p.h(c1391q) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function0) ? 32 : 16;
        }
        int i5 = i4;
        if ((i5 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            List list = c1391q.f11905c;
            ArrayList arrayList = new ArrayList(C1442z.h(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1389o) it.next()).f11901a);
            }
            Set K3 = C1403G.K(arrayList);
            Q.v vVar = AbstractC1366J.f11818d;
            ArrayList arrayList2 = new ArrayList();
            ListIterator listIterator = vVar.listIterator();
            while (true) {
                A2.b bVar = (A2.b) listIterator;
                if (!bVar.hasNext()) {
                    break;
                }
                Object next = bVar.next();
                if (!K3.contains(((C1377c) next).f11851a)) {
                    arrayList2.add(next);
                }
            }
            W0.a(function0, O.f.b(1875909364, new C0056g(function0, 2), c0216p), null, null, null, AbstractC0083w.f763r, O.f.b(513727929, new C0060i(arrayList2, c1391q, function0, 2), c0216p), null, AbstractC1365I.f11801b, 0L, 0L, 0L, 0.0f, null, c0216p, ((i5 >> 3) & 14) | 1769520, 0, 16028);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0050d(i2, 2, c1391q, function0);
        }
    }

    public static final void b(String str, Function0 function0, C0216p c0216p, int i2) {
        int i4;
        int i5;
        Function0 function02;
        c0216p.U(1859290953);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function0) ? 32 : 16;
        }
        int i6 = i4;
        if ((i6 & 19) == 18 && c0216p.z()) {
            c0216p.N();
            function02 = function0;
            i5 = i2;
        } else {
            c0216p.S(1245928841);
            Object I3 = c0216p.I();
            G.W w4 = C0208l.f2826a;
            G.W w5 = G.W.f2779l;
            if (I3 == w4) {
                I3 = C0192d.K(EnumC1387m.f11892d, w5);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
            Object f4 = AbstractC0017m.f(c0216p, false, 1245930942);
            if (f4 == w4) {
                f4 = C0192d.K("100", w5);
                c0216p.c0(f4);
            }
            InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) f4;
            Object f5 = AbstractC0017m.f(c0216p, false, 1245932709);
            if (f5 == w4) {
                f5 = C0192d.K(EnumC1375a.f11849d, w5);
                c0216p.c0(f5);
            }
            InterfaceC0191c0 interfaceC0191c03 = (InterfaceC0191c0) f5;
            Object f6 = AbstractC0017m.f(c0216p, false, 1245934622);
            if (f6 == w4) {
                f6 = C0192d.K(Boolean.FALSE, w5);
                c0216p.c0(f6);
            }
            InterfaceC0191c0 interfaceC0191c04 = (InterfaceC0191c0) f6;
            c0216p.q(false);
            i5 = i2;
            function02 = function0;
            W0.a(function0, O.f.b(747632129, new O(str, function0, interfaceC0191c0, interfaceC0191c02, interfaceC0191c03, interfaceC0191c04), c0216p), null, O.f.b(-1094843585, new C0056g(function0, 3), c0216p), null, AbstractC0083w.f758m, O.f.b(-1711073508, new S(interfaceC0191c0, interfaceC0191c02, interfaceC0191c03, interfaceC0191c04, 0), c0216p), null, AbstractC1365I.f11801b, 0L, 0L, 0L, 0.0f, null, c0216p, ((i6 >> 3) & 14) | 1772592, 0, 16020);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0044a(str, function02, i5, 6);
        }
    }

    public static final void c(C1393s c1393s, Function0 function0, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(110664389);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? c0216p.f(c1393s) : c0216p.h(c1393s) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function0) ? 32 : 16;
        }
        int i5 = i4;
        if ((i5 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            W0.a(function0, O.f.b(8979213, new C0056g(function0, 4), c0216p), null, null, null, AbstractC0083w.f769x, O.f.b(1098515794, new Y(AbstractC1366J.f11818d, 0, c1393s), c0216p), null, AbstractC1365I.f11801b, 0L, 0L, 0L, 0.0f, null, c0216p, ((i5 >> 3) & 14) | 1769520, 0, 16028);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0050d(i2, 1, c1393s, function0);
        }
    }

    public static final void d(Function0 function0, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(1494591294);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.S(419923143);
            Object I3 = c0216p.I();
            G.W w4 = C0208l.f2826a;
            G.W w5 = G.W.f2779l;
            if (I3 == w4) {
                I3 = C0192d.K("", w5);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
            Object f4 = AbstractC0017m.f(c0216p, false, 419924775);
            if (f4 == w4) {
                f4 = C0192d.K("", w5);
                c0216p.c0(f4);
            }
            InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) f4;
            Object f5 = AbstractC0017m.f(c0216p, false, 419926365);
            if (f5 == w4) {
                f5 = C0192d.K(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date()), w5);
                c0216p.c0(f5);
            }
            InterfaceC0191c0 interfaceC0191c03 = (InterfaceC0191c0) f5;
            Object f6 = AbstractC0017m.f(c0216p, false, 419929623);
            if (f6 == w4) {
                f6 = C0192d.K(EnumC1388n.f11899d, w5);
                c0216p.c0(f6);
            }
            InterfaceC0191c0 interfaceC0191c04 = (InterfaceC0191c0) f6;
            c0216p.q(false);
            W0.a(function0, O.f.b(1392906118, new C0054f(function0, interfaceC0191c0, interfaceC0191c02, interfaceC0191c03, interfaceC0191c04), c0216p), null, O.f.b(110733832, new C0056g(function0, 5), c0216p), null, AbstractC0083w.f749d, O.f.b(-1812524597, new S(interfaceC0191c0, interfaceC0191c02, interfaceC0191c03, interfaceC0191c04, 1), c0216p), null, AbstractC1365I.f11801b, 0L, 0L, 0L, 0.0f, null, c0216p, (i4 & 14) | 1772592, 0, 16020);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new J(function0, i2, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0173, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r51.I(), java.lang.Integer.valueOf(r9)) == false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final String tournamentId, final Function0 onBack, final Function1 onField, final Function1 onCaller, C0216p c0216p, final int i2) {
        int i4;
        Object obj;
        Object obj2;
        String str;
        S.o a4;
        boolean z4;
        InterfaceC0191c0 interfaceC0191c0;
        Object obj3;
        InterfaceC0191c0 interfaceC0191c02;
        Intrinsics.checkNotNullParameter(tournamentId, "tournamentId");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onField, "onField");
        Intrinsics.checkNotNullParameter(onCaller, "onCaller");
        c0216p.U(-82338359);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(tournamentId) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(onBack) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(onField) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.h(onCaller) ? 2048 : 1024;
        }
        int i5 = i4;
        if ((i5 & 1171) == 1170 && c0216p.z()) {
            c0216p.N();
        } else {
            ListIterator listIterator = AbstractC1366J.f11816b.listIterator();
            while (true) {
                A2.b bVar = (A2.b) listIterator;
                if (!bVar.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = bVar.next();
                    if (Intrinsics.a(((C1372P) obj).f11837a, tournamentId)) {
                        break;
                    }
                }
            }
            C1372P c1372p = (C1372P) obj;
            c0216p.S(561387544);
            Object obj4 = C0208l.f2826a;
            if (c1372p == null) {
                Unit unit = Unit.f7487a;
                c0216p.S(561388712);
                boolean z5 = (i5 & 112) == 32;
                Object I3 = c0216p.I();
                if (z5 || I3 == obj4) {
                    I3 = new Z(onBack, null);
                    c0216p.c0(I3);
                }
                c0216p.q(false);
                C0192d.e(c0216p, unit, (Function2) I3);
                c0216p.q(false);
                C0222s0 s4 = c0216p.s();
                if (s4 != null) {
                    final int i6 = 0;
                    s4.f2903d = new Function2() { // from class: A1.G
                        @Override // kotlin.jvm.functions.Function2
                        public final Object h(Object obj5, Object obj6) {
                            switch (i6) {
                                case 0:
                                    ((Integer) obj6).intValue();
                                    AbstractC0071n0.e(tournamentId, onBack, onField, onCaller, (C0216p) obj5, C0192d.U(i2 | 1));
                                    break;
                                default:
                                    ((Integer) obj6).intValue();
                                    AbstractC0071n0.e(tournamentId, onBack, onField, onCaller, (C0216p) obj5, C0192d.U(i2 | 1));
                                    break;
                            }
                            return Unit.f7487a;
                        }
                    };
                    return;
                }
                return;
            }
            c0216p.q(false);
            Object obj5 = (Context) c0216p.k(AndroidCompositionLocals_androidKt.f5213b);
            c0216p.S(561391198);
            Object I4 = c0216p.I();
            if (I4 == obj4) {
                I4 = C0192d.K(Boolean.FALSE, G.W.f2779l);
                c0216p.c0(I4);
            }
            InterfaceC0191c0 interfaceC0191c03 = (InterfaceC0191c0) I4;
            c0216p.q(false);
            S.l lVar = S.l.f3977a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f5082b;
            long j4 = AbstractC1365I.f11800a;
            S.o b4 = androidx.compose.foundation.a.b(fillElement, j4, Z.K.f4461a);
            C1025d c1025d = AbstractC1031j.f9267c;
            S.e eVar = S.b.f3963r;
            C1041t a5 = AbstractC1039r.a(c1025d, eVar, c0216p, 0);
            int i7 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, b4);
            InterfaceC1070k.f9822h.getClass();
            Function0 function0 = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function0);
            } else {
                c0216p.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p, a5, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O) {
                obj2 = obj5;
            } else {
                obj2 = obj5;
            }
            AbstractC0017m.r(i7, c0216p, i7, c1067h3);
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h4);
            S.o i8 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f5081a, H1.f.q(new Pair[]{new Pair(Float.valueOf(0.0f), new C0323u(AbstractC1365I.f11804e)), new Pair(Float.valueOf(1.0f), new C0323u(AbstractC1365I.f11805f))})), 8, 12);
            q.f0 b5 = q.e0.b(AbstractC1031j.f9265a, S.b.f3962q, c0216p, 48);
            int i9 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            S.o d5 = S.a.d(c0216p, i8);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function0);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, b5, c1067h);
            C0192d.R(c0216p, m5, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i9))) {
                AbstractC0017m.r(i9, c0216p, i9, c1067h3);
            }
            C0192d.R(c0216p, d5, c1067h4);
            q.h0 h0Var = q.h0.f9258a;
            Object obj6 = obj2;
            W0.f(onBack, null, false, null, null, AbstractC0083w.f750e, c0216p, ((i5 >> 3) & 14) | 196608);
            S.o a6 = h0Var.a(lVar, true);
            int i10 = 0;
            C1041t a7 = AbstractC1039r.a(c1025d, eVar, c0216p, 0);
            int i11 = c0216p.f2861P;
            InterfaceC0213n0 m6 = c0216p.m();
            S.o d6 = S.a.d(c0216p, a6);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function0);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, a7, c1067h);
            C0192d.R(c0216p, m6, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i11))) {
                AbstractC0017m.r(i11, c0216p, i11, c1067h3);
            }
            C0192d.R(c0216p, d6, c1067h4);
            N1.b(c1372p.f11838b, null, AbstractC1365I.f11801b, u3.l.k0(20), null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 199680, 0, 130962);
            N1.b(c1372p.f11839c + " · " + c1372p.f11840d + " · " + c1372p.f11841e.name(), null, C0323u.b(0.9f, j4), u3.l.k0(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
            c0216p.q(true);
            c0216p.S(-1444856055);
            boolean h4 = c0216p.h(c1372p) | c0216p.h(obj6);
            Object I5 = c0216p.I();
            if (h4 || I5 == obj4) {
                I5 = new H(obj6, i10, c1372p);
                c0216p.c0(I5);
            }
            c0216p.q(false);
            W0.f((Function0) I5, null, false, null, null, AbstractC0083w.f751f, c0216p, 196608);
            c0216p.q(true);
            Q.v vVar = AbstractC1366J.f11817c;
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator2 = vVar.listIterator();
            while (true) {
                A2.b bVar2 = (A2.b) listIterator2;
                boolean hasNext = bVar2.hasNext();
                str = c1372p.f11837a;
                if (!hasNext) {
                    break;
                }
                Object next = bVar2.next();
                if (Intrinsics.a(((C1381g) next).f11864b, str)) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                c0216p.S(-975807583);
                c0216p.S(1076907789);
                Object I6 = c0216p.I();
                if (I6 == obj4) {
                    interfaceC0191c02 = interfaceC0191c03;
                    I6 = new C0048c(9, interfaceC0191c02);
                    c0216p.c0(I6);
                } else {
                    interfaceC0191c02 = interfaceC0191c03;
                }
                c0216p.q(false);
                AbstractC0864b.e("No events yet", "Add 100m sprint, long jump, relays — anything you'll run today.", "Add event", (Function0) I6, c0216p, 3510, 0);
                c0216p.q(false);
                z4 = false;
                interfaceC0191c0 = interfaceC0191c02;
                obj3 = obj4;
            } else {
                c0216p.S(-975453439);
                a4 = C1042u.f9344a.a(true);
                float f4 = 14;
                S.o h5 = androidx.compose.foundation.layout.b.h(a4, f4);
                C1023b c1023b = AbstractC1031j.f9265a;
                C1028g c1028g = new C1028g(10);
                c0216p.S(1076916952);
                boolean h6 = c0216p.h(arrayList) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048);
                Object I7 = c0216p.I();
                if (h6 || I7 == obj4) {
                    I7 = new I(arrayList, onField, onCaller, 0);
                    c0216p.c0(I7);
                }
                c0216p.q(false);
                z4 = false;
                interfaceC0191c0 = interfaceC0191c03;
                obj3 = obj4;
                m3.s.a(h5, null, null, false, c1028g, null, null, false, (Function1) I7, c0216p, 24576, 238);
                S.o h7 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.f5081a, f4);
                InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3957l, false);
                int i12 = c0216p.f2861P;
                InterfaceC0213n0 m7 = c0216p.m();
                S.o d7 = S.a.d(c0216p, h7);
                InterfaceC1070k.f9822h.getClass();
                Function0 function02 = C1069j.f9816b;
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(function02);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, e4, C1069j.f9820f);
                C0192d.R(c0216p, m7, C1069j.f9819e);
                C1067h c1067h5 = C1069j.f9821g;
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i12))) {
                    AbstractC0017m.r(i12, c0216p, i12, c1067h5);
                }
                C0192d.R(c0216p, d7, C1069j.f9818d);
                c0216p.S(-1444703540);
                Object I8 = c0216p.I();
                if (I8 == obj3) {
                    I8 = new C0048c(10, interfaceC0191c0);
                    c0216p.c0(I8);
                }
                c0216p.q(false);
                AbstractC0151m0.a((Function0) I8, null, null, AbstractC1365I.f11805f, AbstractC1365I.f11801b, null, null, AbstractC0083w.f755j, c0216p, 12582918);
                c0216p.q(true);
                c0216p.q(false);
            }
            c0216p.q(true);
            if (((Boolean) interfaceC0191c0.getValue()).booleanValue()) {
                c0216p.S(561580751);
                Object I9 = c0216p.I();
                if (I9 == obj3) {
                    I9 = new C0048c(11, interfaceC0191c0);
                    c0216p.c0(I9);
                }
                c0216p.q(z4);
                b(str, (Function0) I9, c0216p, 48);
            }
        }
        C0222s0 s5 = c0216p.s();
        if (s5 != null) {
            final int i13 = 1;
            s5.f2903d = new Function2() { // from class: A1.G
                @Override // kotlin.jvm.functions.Function2
                public final Object h(Object obj52, Object obj62) {
                    switch (i13) {
                        case 0:
                            ((Integer) obj62).intValue();
                            AbstractC0071n0.e(tournamentId, onBack, onField, onCaller, (C0216p) obj52, C0192d.U(i2 | 1));
                            break;
                        default:
                            ((Integer) obj62).intValue();
                            AbstractC0071n0.e(tournamentId, onBack, onField, onCaller, (C0216p) obj52, C0192d.U(i2 | 1));
                            break;
                    }
                    return Unit.f7487a;
                }
            };
        }
    }

    public static final void f(Function1 onOpen, C0216p c0216p, int i2) {
        int i4;
        S.o a4;
        InterfaceC0191c0 interfaceC0191c0;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(onOpen, "onOpen");
        c0216p.U(-1555180553);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(onOpen) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.S(503067362);
            Object I3 = c0216p.I();
            G.W w4 = C0208l.f2826a;
            if (I3 == w4) {
                I3 = C0192d.K(Boolean.FALSE, G.W.f2779l);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) I3;
            c0216p.q(false);
            S.o b4 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.f5082b, AbstractC1365I.f11800a, Z.K.f4461a);
            C1041t a5 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
            int i5 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, b4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p, a5, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                AbstractC0017m.r(i5, c0216p, i5, c1067h3);
            }
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h4);
            AbstractC0864b.j("Track Run Village", "Village & district athletics, in your pocket", c0216p, 54);
            if (AbstractC1366J.f11816b.isEmpty()) {
                c0216p.S(1692816462);
                c0216p.S(1578634804);
                Object I4 = c0216p.I();
                if (I4 == w4) {
                    I4 = new C0048c(5, interfaceC0191c02);
                    c0216p.c0(I4);
                }
                c0216p.q(false);
                AbstractC0864b.e("No tournaments yet", "Plant the first one — a school meet or a village championship.", "Create tournament", (Function0) I4, c0216p, 3510, 0);
                c0216p.q(false);
                z5 = true;
                z4 = false;
                interfaceC0191c0 = interfaceC0191c02;
            } else {
                c0216p.S(1693147387);
                a4 = C1042u.f9344a.a(true);
                float f4 = 14;
                float f5 = 10;
                S.o i6 = androidx.compose.foundation.layout.b.i(a4, f4, f5);
                C1028g c1028g = new C1028g(f5);
                c0216p.S(1578643804);
                boolean z6 = (i4 & 14) == 4;
                Object I5 = c0216p.I();
                if (z6 || I5 == w4) {
                    I5 = new E(0, onOpen);
                    c0216p.c0(I5);
                }
                c0216p.q(false);
                interfaceC0191c0 = interfaceC0191c02;
                m3.s.a(i6, null, null, false, c1028g, null, null, false, (Function1) I5, c0216p, 24576, 238);
                S.o h4 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.f5081a, f4);
                z4 = false;
                InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3957l, false);
                int i7 = c0216p.f2861P;
                InterfaceC0213n0 m5 = c0216p.m();
                S.o d5 = S.a.d(c0216p, h4);
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
                c0216p.S(1229882419);
                Object I6 = c0216p.I();
                if (I6 == w4) {
                    I6 = new C0048c(6, interfaceC0191c0);
                    c0216p.c0(I6);
                }
                c0216p.q(false);
                AbstractC0151m0.a((Function0) I6, null, null, AbstractC1365I.f11805f, AbstractC1365I.f11801b, null, null, AbstractC0083w.f746a, c0216p, 12582918);
                z5 = true;
                c0216p.q(true);
                c0216p.q(false);
            }
            c0216p.q(z5);
            if (((Boolean) interfaceC0191c0.getValue()).booleanValue()) {
                c0216p.S(503146326);
                Object I7 = c0216p.I();
                if (I7 == w4) {
                    I7 = new C0048c(7, interfaceC0191c0);
                    c0216p.c0(I7);
                }
                c0216p.q(z4);
                d((Function0) I7, c0216p, 6);
            }
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new F(i2, 0, onOpen);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0179, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r56.I(), java.lang.Integer.valueOf(r5)) == false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(String eventId, Function0 onBack, C0216p c0216p, int i2) {
        int i4;
        Object obj;
        G.W w4;
        C1068i c1068i;
        C1067h c1067h;
        InterfaceC0191c0 interfaceC0191c0;
        InterfaceC0191c0 interfaceC0191c02;
        int i5;
        S.o a4;
        int i6;
        int i7;
        C0216p c0216p2;
        boolean z4;
        InterfaceC0191c0 interfaceC0191c03;
        Object obj2;
        C1391q c1391q;
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        c0216p.U(-1621089735);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(eventId) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(onBack) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
            i7 = 5;
        } else {
            ListIterator listIterator = AbstractC1366J.f11817c.listIterator();
            while (true) {
                A2.b bVar = (A2.b) listIterator;
                if (!bVar.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = bVar.next();
                    if (Intrinsics.a(((C1381g) obj).f11863a, eventId)) {
                        break;
                    }
                }
            }
            C1381g c1381g = (C1381g) obj;
            c0216p.S(-11193848);
            G.W w5 = C0208l.f2826a;
            if (c1381g == null) {
                Unit unit = Unit.f7487a;
                c0216p.S(-11192680);
                boolean z5 = (i4 & 112) == 32;
                Object I3 = c0216p.I();
                if (z5 || I3 == w5) {
                    I3 = new C0059h0(onBack, null);
                    c0216p.c0(I3);
                }
                c0216p.q(false);
                C0192d.e(c0216p, unit, (Function2) I3);
                c0216p.q(false);
                C0222s0 s4 = c0216p.s();
                if (s4 != null) {
                    s4.f2903d = new C0044a(eventId, onBack, i2, 8);
                    return;
                }
                return;
            }
            Object f4 = AbstractC0017m.f(c0216p, false, -11191235);
            G.W w6 = G.W.f2779l;
            if (f4 == w5) {
                ListIterator listIterator2 = AbstractC1366J.f11821g.listIterator();
                while (true) {
                    A2.b bVar2 = (A2.b) listIterator2;
                    if (!bVar2.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = bVar2.next();
                        if (Intrinsics.a(((C1391q) obj2).f11904b, eventId)) {
                            break;
                        }
                    }
                }
                C1391q c1391q2 = (C1391q) obj2;
                if (c1391q2 == null) {
                    c1391q = new C1391q(AbstractC1366J.a(), eventId, null, 12);
                    AbstractC1366J.f11821g.add(c1391q);
                } else {
                    c1391q = c1391q2;
                }
                f4 = C0192d.K(c1391q, w6);
                c0216p.c0(f4);
            }
            InterfaceC0191c0 interfaceC0191c04 = (InterfaceC0191c0) f4;
            Object f5 = AbstractC0017m.f(c0216p, false, -11185074);
            if (f5 == w5) {
                f5 = C0192d.K(Boolean.FALSE, w6);
                c0216p.c0(f5);
            }
            InterfaceC0191c0 interfaceC0191c05 = (InterfaceC0191c0) f5;
            c0216p.q(false);
            S.l lVar = S.l.f3977a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f5082b;
            long j4 = AbstractC1365I.f11800a;
            S.o b4 = androidx.compose.foundation.a.b(fillElement, j4, Z.K.f4461a);
            C1025d c1025d = AbstractC1031j.f9267c;
            S.e eVar = S.b.f3963r;
            C1041t a5 = AbstractC1039r.a(c1025d, eVar, c0216p, 0);
            int i8 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, b4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i2 = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i2);
            } else {
                c0216p.f0();
            }
            C1067h c1067h2 = C1069j.f9820f;
            C0192d.R(c0216p, a5, c1067h2);
            C1067h c1067h3 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h3);
            C1067h c1067h4 = C1069j.f9821g;
            if (c0216p.f2860O) {
                w4 = w5;
            } else {
                w4 = w5;
            }
            AbstractC0017m.r(i8, c0216p, i8, c1067h4);
            C1067h c1067h5 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h5);
            FillElement fillElement2 = androidx.compose.foundation.layout.c.f5081a;
            Float valueOf = Float.valueOf(0.0f);
            long j5 = AbstractC1365I.f11811l;
            float f6 = 8;
            S.o i9 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.a.a(fillElement2, H1.f.q(new Pair[]{new Pair(valueOf, new C0323u(j5)), new Pair(Float.valueOf(1.0f), new C0323u(AbstractC1365I.f11806g))})), f6, 12);
            S.f fVar = S.b.f3962q;
            C1023b c1023b = AbstractC1031j.f9265a;
            q.f0 b5 = q.e0.b(c1023b, fVar, c0216p, 48);
            int i10 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            S.o d5 = S.a.d(c0216p, i9);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i2);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, b5, c1067h2);
            C0192d.R(c0216p, m5, c1067h3);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i10))) {
                AbstractC0017m.r(i10, c0216p, i10, c1067h4);
            }
            C0192d.R(c0216p, d5, c1067h5);
            q.h0 h0Var = q.h0.f9258a;
            G.W w7 = w4;
            W0.f(onBack, null, false, null, null, AbstractC0083w.f759n, c0216p, ((i4 >> 3) & 14) | 196608);
            S.o a6 = h0Var.a(lVar, true);
            C1041t a7 = AbstractC1039r.a(c1025d, eVar, c0216p, 0);
            int i11 = c0216p.f2861P;
            InterfaceC0213n0 m6 = c0216p.m();
            S.o d6 = S.a.d(c0216p, a6);
            c0216p.W();
            if (c0216p.f2860O) {
                c1068i = c1068i2;
                c0216p.l(c1068i);
            } else {
                c1068i = c1068i2;
                c0216p.f0();
            }
            C0192d.R(c0216p, a7, c1067h2);
            C0192d.R(c0216p, m6, c1067h3);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i11))) {
                c1067h = c1067h4;
                AbstractC0017m.r(i11, c0216p, i11, c1067h);
            } else {
                c1067h = c1067h4;
            }
            C0192d.R(c0216p, d6, c1067h5);
            C1068i c1068i3 = c1068i;
            N1.b("Field Workbench", null, AbstractC1365I.f11801b, u3.l.k0(20), null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 199686, 0, 130962);
            N1.b(j(c1381g), null, C0323u.b(0.9f, j4), u3.l.k0(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
            Object f7 = AbstractC0017m.f(c0216p, true, -1949477732);
            if (f7 == w7) {
                interfaceC0191c0 = interfaceC0191c05;
                f7 = new C0048c(12, interfaceC0191c0);
                c0216p.c0(f7);
            } else {
                interfaceC0191c0 = interfaceC0191c05;
            }
            c0216p.q(false);
            C1067h c1067h6 = c1067h;
            InterfaceC0191c0 interfaceC0191c06 = interfaceC0191c0;
            W0.f((Function0) f7, null, false, null, null, AbstractC0083w.f760o, c0216p, 196614);
            c0216p.q(true);
            float f8 = 14;
            S.o i12 = androidx.compose.foundation.layout.b.i(fillElement2, f8, f6);
            q.f0 b6 = q.e0.b(c1023b, fVar, c0216p, 48);
            int i13 = c0216p.f2861P;
            InterfaceC0213n0 m7 = c0216p.m();
            S.o d7 = S.a.d(c0216p, i12);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i3);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, b6, c1067h2);
            C0192d.R(c0216p, m7, c1067h3);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i13))) {
                AbstractC0017m.r(i13, c0216p, i13, c1067h6);
            }
            C0192d.R(c0216p, d7, c1067h5);
            String str = ((C1391q) interfaceC0191c04.getValue()).f11906d;
            S.o a8 = h0Var.a(lVar, true);
            D.L0 l02 = D.L0.f1475a;
            K1 c4 = D.L0.c(j5, 0L, 0L, c0216p, 2147481599);
            c0216p.S(-1949466997);
            Object I4 = c0216p.I();
            if (I4 == w7) {
                interfaceC0191c02 = interfaceC0191c04;
                i5 = 5;
                I4 = new C0058h(i5, interfaceC0191c02);
                c0216p.c0(I4);
            } else {
                interfaceC0191c02 = interfaceC0191c04;
                i5 = 5;
            }
            c0216p.q(false);
            S0.a(str, (Function1) I4, a8, false, false, null, AbstractC0083w.f761p, null, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, c4, c0216p, 1572912, 12582912, 0, 4063160);
            c0216p.q(true);
            if (((C1391q) interfaceC0191c02.getValue()).f11905c.isEmpty()) {
                c0216p.S(-2024001506);
                c0216p.S(-896567971);
                Object I5 = c0216p.I();
                if (I5 == w7) {
                    I5 = new C0048c(13, interfaceC0191c06);
                    c0216p.c0(I5);
                }
                c0216p.q(false);
                AbstractC0864b.e("No athletes added", "Add competitors to begin recording attempts.", "Add athlete", (Function0) I5, c0216p, 3510, 0);
                c0216p.q(false);
                i7 = i5;
                c0216p2 = c0216p;
                z4 = true;
                interfaceC0191c03 = interfaceC0191c06;
                i6 = 4;
            } else {
                int i14 = i5;
                c0216p.S(-2023686639);
                a4 = C1042u.f9344a.a(true);
                S.o h4 = androidx.compose.foundation.layout.b.h(a4, f8);
                C1028g c1028g = new C1028g(f6);
                c0216p.S(-896559350);
                Object I6 = c0216p.I();
                if (I6 == w7) {
                    i6 = 4;
                    I6 = new C0058h(i6, interfaceC0191c02);
                    c0216p.c0(I6);
                } else {
                    i6 = 4;
                }
                Function1 function1 = (Function1) I6;
                c0216p.q(false);
                i7 = i14;
                c0216p2 = c0216p;
                z4 = true;
                interfaceC0191c03 = interfaceC0191c06;
                m3.s.a(h4, null, null, false, c1028g, null, null, false, function1, c0216p, 100687872, 238);
                c0216p2.q(false);
            }
            c0216p2.q(z4);
            if (((Boolean) interfaceC0191c03.getValue()).booleanValue()) {
                C1391q c1391q3 = (C1391q) interfaceC0191c02.getValue();
                c0216p2.S(-11054625);
                Object I7 = c0216p.I();
                if (I7 == w7) {
                    I7 = new C0048c(i6, interfaceC0191c03);
                    c0216p2.c0(I7);
                }
                c0216p2.q(false);
                a(c1391q3, (Function0) I7, c0216p2, 56);
            }
        }
        C0222s0 s5 = c0216p.s();
        if (s5 != null) {
            s5.f2903d = new C0044a(eventId, onBack, i2, i7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x051e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r61.I(), java.lang.Integer.valueOf(r15)) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0182, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r61.I(), java.lang.Integer.valueOf(r10)) == false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(String eventId, Function0 onBack, C0216p c0216p, int i2) {
        int i4;
        Object obj;
        S.l lVar;
        C1067h c1067h;
        G.W w4;
        InterfaceC0191c0 interfaceC0191c0;
        boolean z4;
        C1393s c1393s;
        C0216p c0216p2;
        int i5;
        boolean z5;
        boolean z6;
        Object obj2;
        S.f fVar;
        String str;
        Map map;
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        c0216p.U(-1316923006);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(eventId) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(onBack) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            ListIterator listIterator = AbstractC1366J.f11817c.listIterator();
            while (true) {
                A2.b bVar = (A2.b) listIterator;
                if (!bVar.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = bVar.next();
                    if (Intrinsics.a(((C1381g) obj).f11863a, eventId)) {
                        break;
                    }
                }
            }
            C1381g c1381g = (C1381g) obj;
            c0216p.S(-484360609);
            G.W w5 = C0208l.f2826a;
            if (c1381g == null) {
                Unit unit = Unit.f7487a;
                c0216p.S(-484359441);
                boolean z7 = (i4 & 112) == 32;
                Object I3 = c0216p.I();
                if (z7 || I3 == w5) {
                    I3 = new C0069m0(onBack, null);
                    c0216p.c0(I3);
                }
                c0216p.q(false);
                C0192d.e(c0216p, unit, (Function2) I3);
                c0216p.q(false);
                C0222s0 s4 = c0216p.s();
                if (s4 != null) {
                    s4.f2903d = new C0044a(eventId, onBack, i2, 4);
                    return;
                }
                return;
            }
            c0216p.q(false);
            Q.v vVar = AbstractC1366J.f11820f;
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator2 = vVar.listIterator();
            while (true) {
                A2.b bVar2 = (A2.b) listIterator2;
                if (!bVar2.hasNext()) {
                    break;
                }
                Object next = bVar2.next();
                if (Intrinsics.a(((C1393s) next).f11908b, eventId)) {
                    arrayList.add(next);
                }
            }
            List D3 = C1403G.D(arrayList, new C0062j(3));
            c0216p.S(-484355391);
            Object I4 = c0216p.I();
            if (I4 == w5) {
                I4 = C0192d.K(0, G.W.f2779l);
                c0216p.c0(I4);
            }
            InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) I4;
            c0216p.q(false);
            C1393s c1393s2 = (C1393s) C1403G.s(((Number) interfaceC0191c02.getValue()).intValue(), D3);
            S.l lVar2 = S.l.f3977a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f5082b;
            int i6 = i4;
            long j4 = AbstractC1365I.f11807h;
            E1.i iVar = Z.K.f4461a;
            S.o b4 = androidx.compose.foundation.a.b(fillElement, j4, iVar);
            C1025d c1025d = AbstractC1031j.f9267c;
            S.e eVar = S.b.f3963r;
            C1041t a4 = AbstractC1039r.a(c1025d, eVar, c0216p, 0);
            int i7 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, b4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C1067h c1067h2 = C1069j.f9820f;
            C0192d.R(c0216p, a4, c1067h2);
            C1067h c1067h3 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h3);
            C1067h c1067h4 = C1069j.f9821g;
            if (c0216p.f2860O) {
                lVar = lVar2;
            } else {
                lVar = lVar2;
            }
            AbstractC0017m.r(i7, c0216p, i7, c1067h4);
            C1067h c1067h5 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h5);
            FillElement fillElement2 = androidx.compose.foundation.layout.c.f5081a;
            float f4 = 8;
            S.o i8 = androidx.compose.foundation.layout.b.i(fillElement2, f4, 10);
            S.f fVar2 = S.b.f3962q;
            q.f0 b5 = q.e0.b(AbstractC1031j.f9265a, fVar2, c0216p, 48);
            int i9 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            S.o d5 = S.a.d(c0216p, i8);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, b5, c1067h2);
            C0192d.R(c0216p, m5, c1067h3);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i9))) {
                AbstractC0017m.r(i9, c0216p, i9, c1067h4);
            }
            C0192d.R(c0216p, d5, c1067h5);
            q.h0 h0Var = q.h0.f9258a;
            S.l lVar3 = lVar;
            S.f fVar3 = fVar2;
            E1.i iVar2 = iVar;
            W0.f(onBack, null, false, null, null, AbstractC0083w.f764s, c0216p, ((i6 >> 3) & 14) | 196608);
            AbstractC1024c.a(c0216p, h0Var.a(lVar3, true));
            long j5 = AbstractC1365I.f11803d;
            F0.m mVar = F0.r.f2625c;
            F0.k kVar = F0.k.f2617l;
            N1.b("CALLER", null, j5, u3.l.k0(16), null, kVar, mVar, u3.l.k0(4), null, null, 0L, 0, false, 0, 0, null, null, c0216p, 12782598, 0, 130834);
            AbstractC1024c.a(c0216p, h0Var.a(lVar3, true));
            AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.j(lVar3, 48));
            c0216p.q(true);
            float f5 = 20;
            S.o h4 = androidx.compose.foundation.layout.b.h(fillElement2, f5);
            C1041t a5 = AbstractC1039r.a(c1025d, eVar, c0216p, 0);
            int i10 = c0216p.f2861P;
            InterfaceC0213n0 m6 = c0216p.m();
            S.o d6 = S.a.d(c0216p, h4);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, a5, c1067h2);
            C0192d.R(c0216p, m6, c1067h3);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i10))) {
                c1067h = c1067h4;
                AbstractC0017m.r(i10, c0216p, i10, c1067h);
            } else {
                c1067h = c1067h4;
            }
            C0192d.R(c0216p, d6, c1067h5);
            N1.b(j(c1381g), null, j5, u3.l.k0(44), null, kVar, mVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 199680, 0, 130962);
            String str2 = c1381g.f11867e + " · " + (c1381g.f11868f ? "Girls" : "Boys");
            long j6 = AbstractC1365I.f11800a;
            N1.b(str2, null, j6, u3.l.k0(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
            AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar3, f5));
            if (D3.isEmpty()) {
                c0216p.S(-768485805);
                N1.b("No heats configured. Add heats from event detail.", null, j6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 6, 0, 131066);
                c0216p.q(false);
                z5 = false;
                i5 = 56;
                c0216p2 = c0216p;
                w4 = w5;
                c1393s = c1393s2;
                z6 = true;
            } else {
                c0216p.S(-768301975);
                String valueOf = c1393s2 != null ? Integer.valueOf(c1393s2.f11909c) : "?";
                C1393s c1393s3 = c1393s2;
                N1.b("Heat " + valueOf + " of " + D3.size(), null, AbstractC1365I.f11801b, u3.l.k0(22), null, null, mVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 130994);
                float f6 = (float) 16;
                AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar3, f6));
                float f7 = f4;
                S.e eVar2 = eVar;
                C1041t a6 = AbstractC1039r.a(new C1028g(f7), eVar2, c0216p, 6);
                int i11 = c0216p.f2861P;
                InterfaceC0213n0 m7 = c0216p.m();
                S.o d7 = S.a.d(c0216p, lVar3);
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(c1068i);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, a6, c1067h2);
                C0192d.R(c0216p, m7, c1067h3);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i11))) {
                    AbstractC0017m.r(i11, c0216p, i11, c1067h);
                }
                C0192d.R(c0216p, d7, c1067h5);
                c0216p.S(-1560769993);
                int i12 = 1;
                while (i12 < 9) {
                    String str3 = (c1393s3 == null || (map = c1393s3.f11910d) == null) ? null : (String) map.get(Integer.valueOf(i12));
                    ListIterator listIterator3 = AbstractC1366J.f11818d.listIterator();
                    while (true) {
                        A2.b bVar3 = (A2.b) listIterator3;
                        if (!bVar3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        Object next2 = bVar3.next();
                        if (Intrinsics.a(((C1377c) next2).f11851a, str3)) {
                            obj2 = next2;
                            break;
                        }
                    }
                    C1377c c1377c = (C1377c) obj2;
                    E1.i iVar3 = iVar2;
                    S.o h5 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.b(u3.l.U(androidx.compose.foundation.layout.c.f5081a, AbstractC1234e.a(f7)), c1377c != null ? AbstractC1365I.f11806g : C0323u.b(0.5f, AbstractC1365I.f11813n), iVar3), 12);
                    S.f fVar4 = fVar3;
                    q.f0 b6 = q.e0.b(AbstractC1031j.f9265a, fVar4, c0216p, 48);
                    int i13 = c0216p.f2861P;
                    InterfaceC0213n0 m8 = c0216p.m();
                    S.o d8 = S.a.d(c0216p, h5);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i2 = C1069j.f9816b;
                    c0216p.W();
                    C1393s c1393s4 = c1393s3;
                    if (c0216p.f2860O) {
                        c0216p.l(c1068i2);
                    } else {
                        c0216p.f0();
                    }
                    C1067h c1067h6 = C1069j.f9820f;
                    C0192d.R(c0216p, b6, c1067h6);
                    C1067h c1067h7 = C1069j.f9819e;
                    C0192d.R(c0216p, m8, c1067h7);
                    C1067h c1067h8 = C1069j.f9821g;
                    if (c0216p.f2860O) {
                        fVar = fVar4;
                    } else {
                        fVar = fVar4;
                    }
                    AbstractC0017m.r(i13, c0216p, i13, c1067h8);
                    C1067h c1067h9 = C1069j.f9818d;
                    C0192d.R(c0216p, d8, c1067h9);
                    float f8 = f6;
                    S.f fVar5 = fVar;
                    int i14 = i12;
                    float f9 = f7;
                    S.e eVar3 = eVar2;
                    N1.b("L" + i12, androidx.compose.foundation.layout.c.j(lVar3, 56), AbstractC1365I.f11803d, u3.l.k0(22), null, F0.k.f2617l, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 199728, 0, 130960);
                    S.o a7 = h0Var.a(lVar3, true);
                    C1041t a8 = AbstractC1039r.a(AbstractC1031j.f9267c, eVar3, c0216p, 0);
                    int i15 = c0216p.f2861P;
                    InterfaceC0213n0 m9 = c0216p.m();
                    S.o d9 = S.a.d(c0216p, a7);
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.l(c1068i2);
                    } else {
                        c0216p.f0();
                    }
                    C0192d.R(c0216p, a8, c1067h6);
                    C0192d.R(c0216p, m9, c1067h7);
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i15))) {
                        AbstractC0017m.r(i15, c0216p, i15, c1067h8);
                    }
                    C0192d.R(c0216p, d9, c1067h9);
                    if (c1377c == null || (str = c1377c.f11852b) == null) {
                        str = "— empty —";
                    }
                    N1.b(str, null, AbstractC1365I.f11801b, u3.l.k0(18), null, F0.k.f2616k, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 199680, 0, 131026);
                    c0216p.S(350280708);
                    if (c1377c != null) {
                        N1.b(c1377c.f11854d + " · #" + c1377c.f11853c, null, C0323u.b(0.7f, AbstractC1365I.f11800a), u3.l.k0(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
                    }
                    c0216p.q(false);
                    c0216p.q(true);
                    c0216p.q(true);
                    i12 = i14 + 1;
                    eVar2 = eVar3;
                    iVar2 = iVar3;
                    f6 = f8;
                    c1393s3 = c1393s4;
                    fVar3 = fVar5;
                    f7 = f9;
                }
                C1393s c1393s5 = c1393s3;
                c0216p.q(false);
                c0216p.q(true);
                AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar3, f6));
                C1023b c1023b = AbstractC1031j.f9265a;
                q.f0 b7 = q.e0.b(new C1028g(f7), S.b.f3961p, c0216p, 6);
                int i16 = c0216p.f2861P;
                InterfaceC0213n0 m10 = c0216p.m();
                S.o d10 = S.a.d(c0216p, lVar3);
                InterfaceC1070k.f9822h.getClass();
                C1068i c1068i3 = C1069j.f9816b;
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(c1068i3);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, b7, C1069j.f9820f);
                C0192d.R(c0216p, m10, C1069j.f9819e);
                C1067h c1067h10 = C1069j.f9821g;
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i16))) {
                    AbstractC0017m.r(i16, c0216p, i16, c1067h10);
                }
                C0192d.R(c0216p, d10, C1069j.f9818d);
                c0216p.S(-1560727809);
                Object I5 = c0216p.I();
                w4 = w5;
                if (I5 == w4) {
                    interfaceC0191c0 = interfaceC0191c02;
                    I5 = new C0048c(8, interfaceC0191c0);
                    c0216p.c0(I5);
                } else {
                    interfaceC0191c0 = interfaceC0191c02;
                }
                Function0 function0 = (Function0) I5;
                c0216p.q(false);
                q.a0 a0Var = AbstractC0159p.f1957a;
                long j7 = AbstractC1365I.f11803d;
                W0.g(function0, null, false, null, AbstractC0159p.d(j7, c0216p), null, null, null, null, AbstractC0083w.f765t, c0216p, 805306374, 494);
                c0216p.S(-1560720415);
                Object I6 = c0216p.I();
                if (I6 == w4) {
                    z4 = false;
                    I6 = new K(0);
                    c0216p.c0(I6);
                } else {
                    z4 = false;
                }
                c0216p.q(z4);
                boolean z8 = z4;
                c1393s = c1393s5;
                c0216p2 = c0216p;
                i5 = 56;
                z5 = z8;
                W0.b((Function0) I6, null, false, null, AbstractC0159p.a(AbstractC1365I.f11805f, 0L, c0216p, 14), null, null, null, null, AbstractC0083w.f766u, c0216p, 805306374, 494);
                c0216p2.S(-1560712532);
                boolean h6 = c0216p2.h(D3);
                Object I7 = c0216p.I();
                if (h6 || I7 == w4) {
                    I7 = new H(D3, 1, interfaceC0191c0);
                    c0216p2.c0(I7);
                }
                c0216p2.q(z5);
                W0.g((Function0) I7, null, false, null, AbstractC0159p.d(j7, c0216p2), null, null, null, null, AbstractC0083w.f767v, c0216p, 805306368, 494);
                z6 = true;
                c0216p2.q(true);
                c0216p2.q(z5);
            }
            c0216p2.q(z6);
            c0216p2.q(z6);
            if (((Boolean) f634a.getValue()).booleanValue() && c1393s != null) {
                c0216p2.S(-484239483);
                Object I8 = c0216p.I();
                if (I8 == w4) {
                    I8 = new K(1);
                    c0216p2.c0(I8);
                }
                c0216p2.q(z5);
                c(c1393s, (Function0) I8, c0216p2, i5);
            }
        }
        C0222s0 s5 = c0216p.s();
        if (s5 != null) {
            s5.f2903d = new C0044a(eventId, onBack, i2, 7);
        }
    }

    public static final boolean i(EnumC1387m enumC1387m) {
        EnumC1387m[] elements = {EnumC1387m.f11893e, EnumC1387m.f11894i, EnumC1387m.f11895j, EnumC1387m.f11896k, EnumC1387m.f11897l};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C1439w.A(elements).contains(enumC1387m);
    }

    public static final String j(C1381g c1381g) {
        int ordinal = c1381g.f11865c.ordinal();
        Integer num = c1381g.f11866d;
        switch (ordinal) {
            case 0:
            case 1:
            case 2:
                return (num != null ? num.intValue() : 0) + " m";
            case 3:
                return (num != null ? num.intValue() : 100) + " m Hurdles";
            case 4:
                return (num != null ? num.intValue() : 400) + " m Relay";
            case 5:
                return "Long Jump";
            case 6:
                return "High Jump";
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "Shot Put";
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                return "Discus";
            case AbstractC1024c.f9242c /* 9 */:
                return "Javelin";
            case 10:
                return ((num != null ? num.intValue() : 2000) / 1000) + " km Cross-country";
            default:
                throw new C1338m();
        }
    }

    public static final String k(long j4) {
        long j5 = 60000;
        long j6 = j4 / j5;
        long j7 = 1000;
        long j8 = (j4 % j5) / j7;
        long j9 = (j4 % j7) / 10;
        if (j6 > 0) {
            String format = String.format("%d:%02d.%02d", Arrays.copyOf(new Object[]{Long.valueOf(j6), Long.valueOf(j8), Long.valueOf(j9)}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        String format2 = String.format("%02d.%02d", Arrays.copyOf(new Object[]{Long.valueOf(j8), Long.valueOf(j9)}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }
}
