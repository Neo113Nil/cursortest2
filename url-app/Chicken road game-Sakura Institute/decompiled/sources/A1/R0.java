package A1;

import A.AbstractC0017m;
import D.AbstractC0151m0;
import D.W0;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import androidx.compose.foundation.layout.FillElement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import p0.InterfaceC0945F;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.AbstractC1039r;
import q.C1023b;
import q.C1028g;
import q.C1041t;
import q.C1042u;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1342q;
import z1.AbstractC1365I;
import z1.AbstractC1366J;
import z1.C1374S;
import z1.C1377c;
import z2.C1403G;

/* loaded from: classes.dex */
public abstract class R0 {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f534a = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public static final void a(Function0 function0, C0216p c0216p, int i2) {
        int i4;
        InterfaceC0191c0 interfaceC0191c0;
        c0216p.U(-128396935);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.S(-550344052);
            Object I3 = c0216p.I();
            G.W w4 = C0208l.f2826a;
            G.W w5 = G.W.f2779l;
            if (I3 == w4) {
                String format = f534a.format(new Date());
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                I3 = C0192d.K(format, w5);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) I3;
            Object f4 = AbstractC0017m.f(c0216p, false, -550342361);
            if (f4 == w4) {
                f4 = C0192d.K("", w5);
                c0216p.c0(f4);
            }
            InterfaceC0191c0 interfaceC0191c03 = (InterfaceC0191c0) f4;
            Object f5 = AbstractC0017m.f(c0216p, false, -550340729);
            if (f5 == w4) {
                f5 = C0192d.K("", w5);
                c0216p.c0(f5);
            }
            InterfaceC0191c0 interfaceC0191c04 = (InterfaceC0191c0) f5;
            Object f6 = AbstractC0017m.f(c0216p, false, -550339095);
            if (f6 == w4) {
                f6 = C0192d.K("00", w5);
                c0216p.c0(f6);
            }
            InterfaceC0191c0 interfaceC0191c05 = (InterfaceC0191c0) f6;
            Object f7 = AbstractC0017m.f(c0216p, false, -550337465);
            if (f7 == w4) {
                f7 = C0192d.K("", w5);
                c0216p.c0(f7);
            }
            InterfaceC0191c0 interfaceC0191c06 = (InterfaceC0191c0) f7;
            Object f8 = AbstractC0017m.f(c0216p, false, -550335758);
            Object obj = null;
            if (f8 == w4) {
                f8 = C0192d.K(null, w5);
                c0216p.c0(f8);
            }
            InterfaceC0191c0 interfaceC0191c07 = (InterfaceC0191c0) f8;
            Object f9 = AbstractC0017m.f(c0216p, false, -550333654);
            if (f9 == w4) {
                f9 = C0192d.K(Boolean.FALSE, w5);
                c0216p.c0(f9);
            }
            InterfaceC0191c0 interfaceC0191c08 = (InterfaceC0191c0) f9;
            c0216p.q(false);
            ListIterator listIterator = AbstractC1366J.f11818d.listIterator();
            while (true) {
                A2.b bVar = (A2.b) listIterator;
                if (!bVar.hasNext()) {
                    break;
                }
                Object next = bVar.next();
                if (Intrinsics.a(((C1377c) next).f11851a, (String) interfaceC0191c07.getValue())) {
                    obj = next;
                    break;
                }
            }
            long j4 = AbstractC1365I.f11801b;
            W0.a(function0, O.f.b(496143921, new x0(function0, interfaceC0191c03, interfaceC0191c04, interfaceC0191c05, interfaceC0191c07, interfaceC0191c02, interfaceC0191c06, 1), c0216p), null, O.f.b(163500783, new C0056g(function0, 9), c0216p), null, D.f443e, O.f.b(1812019724, new x0(interfaceC0191c02, interfaceC0191c03, interfaceC0191c04, interfaceC0191c05, interfaceC0191c06, interfaceC0191c08, (C1377c) obj), c0216p), null, j4, 0L, 0L, 0L, 0.0f, null, c0216p, (i4 & 14) | 1772592, 0, 16020);
            if (((Boolean) interfaceC0191c08.getValue()).booleanValue()) {
                c0216p.S(-550263841);
                Object I4 = c0216p.I();
                if (I4 == w4) {
                    interfaceC0191c0 = interfaceC0191c08;
                    I4 = new O0(1, interfaceC0191c0);
                    c0216p.c0(I4);
                } else {
                    interfaceC0191c0 = interfaceC0191c08;
                }
                c0216p.q(false);
                W0.a((Function0) I4, O.f.b(1597383692, new C0079s(4, interfaceC0191c0), c0216p), null, null, null, D.f445g, O.f.b(523237927, new Y(interfaceC0191c07, 1, interfaceC0191c0), c0216p), null, j4, 0L, 0L, 0L, 0.0f, null, c0216p, 1769526, 0, 16028);
            }
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new J(function0, i2, 5);
        }
    }

    public static final void b(InterfaceC0191c0 interfaceC0191c0, boolean z4) {
        interfaceC0191c0.setValue(Boolean.valueOf(z4));
    }

    public static final void c(final String str, final String str2, final S.o oVar, C0216p c0216p, final int i2) {
        int i4;
        c0216p.U(1955136757);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.f(oVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            AbstractC0864b.f(oVar, AbstractC1365I.f11802c, O.f.b(-402771404, new C0065k0(str, 3, str2), c0216p), c0216p, ((i4 >> 6) & 14) | 384, 0);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new Function2() { // from class: A1.Q0
                @Override // kotlin.jvm.functions.Function2
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int U3 = C0192d.U(i2 | 1);
                    R0.c(str, str2, oVar, (C0216p) obj, U3);
                    return Unit.f7487a;
                }
            };
        }
    }

    public static final void d(C1374S c1374s, C0216p c0216p, int i2) {
        int i4;
        Object obj;
        c0216p.U(-1241566282);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(c1374s) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            ListIterator listIterator = AbstractC1366J.f11818d.listIterator();
            while (true) {
                A2.b bVar = (A2.b) listIterator;
                if (!bVar.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = bVar.next();
                    if (Intrinsics.a(((C1377c) obj).f11851a, c1374s.f11844b)) {
                        break;
                    }
                }
            }
            AbstractC0864b.f(null, 0L, O.f.b(-2124228491, new C0065k0(c1374s, 4, (C1377c) obj), c0216p), c0216p, 384, 3);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new P0(i2, 0, c1374s);
        }
    }

    public static final void e(int i2, C0216p c0216p) {
        S.o a4;
        C1067h c1067h;
        C1067h c1067h2;
        C1067h c1067h3;
        C1067h c1067h4;
        Function0 function0;
        boolean z4;
        c0216p.U(-1719714392);
        if (i2 == 0 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.S(1524106275);
            Object I3 = c0216p.I();
            Object obj = C0208l.f2826a;
            if (I3 == obj) {
                I3 = C0192d.K(Boolean.FALSE, G.W.f2779l);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
            c0216p.q(false);
            List D3 = C1403G.D(AbstractC1366J.f11824j, new C0062j(8));
            FillElement fillElement = androidx.compose.foundation.layout.c.f5082b;
            S.o b4 = androidx.compose.foundation.a.b(fillElement, AbstractC1365I.f11800a, Z.K.f4461a);
            C1041t a5 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
            int i4 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, b4);
            InterfaceC1070k.f9822h.getClass();
            Function0 function02 = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function02);
            } else {
                c0216p.f0();
            }
            C1067h c1067h5 = C1069j.f9820f;
            C0192d.R(c0216p, a5, c1067h5);
            C1067h c1067h6 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h6);
            C1067h c1067h7 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i4))) {
                AbstractC0017m.r(i4, c0216p, i4, c1067h7);
            }
            C1067h c1067h8 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h8);
            AbstractC0864b.j("Training Journal", "Log runs, track weekly volume and pace", c0216p, 54);
            f(0, c0216p);
            a4 = C1042u.f9344a.a(true);
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, false);
            int i5 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            S.o d5 = S.a.d(c0216p, a4);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function02);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e4, c1067h5);
            C0192d.R(c0216p, m5, c1067h6);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                AbstractC0017m.r(i5, c0216p, i5, c1067h7);
            }
            C0192d.R(c0216p, d5, c1067h8);
            if (D3.isEmpty()) {
                c0216p.S(-623801514);
                c0216p.S(1642453105);
                Object I4 = c0216p.I();
                if (I4 == obj) {
                    I4 = new C0048c(28, interfaceC0191c0);
                    c0216p.c0(I4);
                }
                c0216p.q(false);
                c1067h = c1067h8;
                AbstractC0864b.e("No sessions logged yet", "Track today's run — distance, time, notes. Weekly totals appear automatically.", "Log session", (Function0) I4, c0216p, 3510, 0);
                c0216p.q(false);
                c1067h2 = c1067h7;
                c1067h3 = c1067h6;
                c1067h4 = c1067h5;
                function0 = function02;
                z4 = false;
            } else {
                c1067h = c1067h8;
                c0216p.S(-623497993);
                S.o h4 = androidx.compose.foundation.layout.b.h(fillElement, 14);
                C1028g c1028g = new C1028g(8);
                c0216p.S(1642460589);
                boolean h5 = c0216p.h(D3);
                Object I5 = c0216p.I();
                if (h5 || I5 == obj) {
                    I5 = new C0070n(2, D3);
                    c0216p.c0(I5);
                }
                c0216p.q(false);
                c1067h2 = c1067h7;
                c1067h3 = c1067h6;
                c1067h4 = c1067h5;
                function0 = function02;
                z4 = false;
                m3.s.a(h4, null, null, false, c1028g, null, null, false, (Function1) I5, c0216p, 24582, 238);
                c0216p.q(false);
            }
            c0216p.q(true);
            S.o h6 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.f5081a, 14);
            InterfaceC0945F e5 = AbstractC1035n.e(S.b.f3957l, z4);
            int i6 = c0216p.f2861P;
            InterfaceC0213n0 m6 = c0216p.m();
            S.o d6 = S.a.d(c0216p, h6);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function0);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e5, c1067h4);
            C0192d.R(c0216p, m6, c1067h3);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                AbstractC0017m.r(i6, c0216p, i6, c1067h2);
            }
            C0192d.R(c0216p, d6, c1067h);
            c0216p.S(1642468785);
            Object I6 = c0216p.I();
            if (I6 == obj) {
                I6 = new C0048c(29, interfaceC0191c0);
                c0216p.c0(I6);
            }
            c0216p.q(z4);
            AbstractC0151m0.a((Function0) I6, null, null, AbstractC1365I.f11805f, AbstractC1365I.f11801b, null, null, D.f439a, c0216p, 12582918);
            c0216p.q(true);
            c0216p.q(true);
            if (((Boolean) interfaceC0191c0.getValue()).booleanValue()) {
                c0216p.S(1524148020);
                Object I7 = c0216p.I();
                if (I7 == obj) {
                    I7 = new O0(0, interfaceC0191c0);
                    c0216p.c0(I7);
                }
                c0216p.q(false);
                a((Function0) I7, c0216p, 6);
            }
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0077q0(i2, 2);
        }
    }

    public static final void f(int i2, C0216p c0216p) {
        Object obj;
        c0216p.U(-1094799643);
        if (i2 == 0 && c0216p.z()) {
            c0216p.N();
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.setFirstDayOfWeek(2);
            calendar.set(7, 2);
            int i4 = 0;
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            Date time = calendar.getTime();
            Q.v vVar = AbstractC1366J.f11824j;
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = vVar.listIterator();
            while (true) {
                A2.b bVar = (A2.b) listIterator;
                if (!bVar.hasNext()) {
                    break;
                }
                Object next = bVar.next();
                C1374S c1374s = (C1374S) next;
                try {
                    AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                    obj = f534a.parse(c1374s.f11845c);
                } catch (Throwable th) {
                    AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                    obj = AbstractC1343r.a(th);
                }
                if (((Date) (obj instanceof C1342q ? null : obj)) != null && (!r8.before(time))) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            double d4 = 0.0d;
            while (it.hasNext()) {
                d4 += ((C1374S) it.next()).f11846d;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                i4 += ((C1374S) it2.next()).f11847e;
            }
            Integer valueOf = d4 > 0.0d ? Integer.valueOf((int) (i4 / d4)) : null;
            S.l lVar = S.l.f3977a;
            S.o h4 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.f5081a, 14);
            C1023b c1023b = AbstractC1031j.f9265a;
            q.f0 b4 = q.e0.b(new C1028g(8), S.b.f3961p, c0216p, 6);
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
            C0192d.R(c0216p, b4, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                AbstractC0017m.r(i5, c0216p, i5, c1067h);
            }
            C0192d.R(c0216p, d5, C1069j.f9818d);
            q.h0 h0Var = q.h0.f9258a;
            String format = String.format("%.1f km", Arrays.copyOf(new Object[]{Double.valueOf(d4)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            c("This week", format, h0Var.a(lVar, true), c0216p, 6);
            c("Time", g(i4), h0Var.a(lVar, true), c0216p, 6);
            c("Avg pace", h(valueOf), h0Var.a(lVar, true), c0216p, 6);
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0077q0(i2, 3);
        }
    }

    public static final String g(int i2) {
        int i4 = i2 / 3600;
        int i5 = (i2 % 3600) / 60;
        int i6 = i2 % 60;
        String format = i4 > 0 ? String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, 3)) : String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final String h(Integer num) {
        if (num == null) {
            return "—";
        }
        String format = String.format("%d:%02d /km", Arrays.copyOf(new Object[]{Integer.valueOf(num.intValue() / 60), Integer.valueOf(num.intValue() % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
