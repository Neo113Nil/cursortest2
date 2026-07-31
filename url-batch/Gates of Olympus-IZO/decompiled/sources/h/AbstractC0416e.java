package h;

import A2.g;
import F.C0060q;
import F.C0077z;
import F.V0;
import H2.AbstractC0080b;
import I.AbstractC0114p0;
import I.C0089d;
import I.C0102j0;
import I.C0105l;
import I.C0113p;
import I.C0119s0;
import I.C0125v0;
import I.InterfaceC0088c0;
import I.InterfaceC0110n0;
import I.X;
import M0.j;
import M1.k;
import Q.f;
import S.t;
import U.l;
import U.m;
import Z1.i;
import Z1.u;
import a.AbstractC0157a;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0230o;
import androidx.lifecycle.V;
import e2.AbstractC0381e;
import f.AbstractC0382a;
import h2.AbstractC0447i;
import j.AbstractC0478D;
import j.C0506x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l.C0560e;
import l.C0563h;
import l.C0567l;
import l.C0568m;
import l.M;
import l.N;
import l.w;
import l0.C0571a;
import m.C0612w;
import m.l0;
import m.s0;
import m.v0;
import m.w0;
import m.z0;
import o.C0737m;
import o.J;
import q1.C0772A;
import q1.C0775D;
import q1.C0778b;
import q1.C0784h;
import r.C0797I;
import r.C0800L;
import r.InterfaceC0796H;
import r.InterfaceC0799K;
import r.InterfaceC0808e;
import r.InterfaceC0811h;
import r0.B;
import r0.H;
import r1.n;
import r1.o;
import r1.p;
import r1.r;
import r1.s;
import s.C0869l;
import s.C0882y;
import t.C0891a;
import t.y;
import t.z;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;
import u.C0932N;
import u.C0944l;
import u.C0952u;
import u.InterfaceC0945m;
import u.InterfaceC0953v;
import u.O;
import u.P;
import u0.AbstractC0963b0;
import u0.AbstractC0983l0;
import u2.h;

/* renamed from: h.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0416e implements Encoder, v2.b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    public static final void b(s0 s0Var, l lVar, Y1.c cVar, U.d dVar, Y1.c cVar2, Q.a aVar, C0113p c0113p, int i3) {
        int i4;
        C0568m c0568m;
        C0506x c0506x;
        t tVar;
        Object obj;
        C0568m c0568m2;
        ?? r13;
        int i5;
        c0113p.S(-114689412);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(s0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(lVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.h(cVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0113p.f(dVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0113p.h(cVar2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0113p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0113p.x()) {
            c0113p.L();
        } else {
            int i6 = i4 & 14;
            boolean z3 = i6 == 4;
            Object G3 = c0113p.G();
            Object obj2 = C0105l.f2272a;
            if (z3 || G3 == obj2) {
                G3 = new C0568m(s0Var, dVar);
                c0113p.a0(G3);
            }
            C0568m c0568m3 = (C0568m) G3;
            boolean z4 = i6 == 4;
            Object G4 = c0113p.G();
            Object obj3 = G4;
            if (z4 || G4 == obj2) {
                Object[] objArr = {s0Var.f5841a.a()};
                t tVar2 = new t();
                tVar2.addAll(k.i0(objArr));
                c0113p.a0(tVar2);
                obj3 = tVar2;
            }
            t tVar3 = (t) obj3;
            boolean z5 = i6 == 4;
            Object G5 = c0113p.G();
            if (z5 || G5 == obj2) {
                long[] jArr = AbstractC0478D.f5136a;
                G5 = new C0506x();
                c0113p.a0(G5);
            }
            C0506x c0506x2 = (C0506x) G5;
            boolean contains = tVar3.contains(s0Var.f5841a.a());
            w0 w0Var = s0Var.f5841a;
            if (!contains) {
                tVar3.clear();
                tVar3.add(w0Var.a());
            }
            Object a3 = w0Var.a();
            C0102j0 c0102j0 = s0Var.f5844d;
            if (i.a(a3, c0102j0.getValue())) {
                if (tVar3.size() != 1 || !i.a(tVar3.get(0), w0Var.a())) {
                    tVar3.clear();
                    tVar3.add(w0Var.a());
                }
                if (c0506x2.f5230e != 1 || c0506x2.b(w0Var.a())) {
                    c0506x2.a();
                }
                c0568m3.f5480b = dVar;
            }
            if (i.a(w0Var.a(), c0102j0.getValue()) || tVar3.contains(c0102j0.getValue())) {
                c0568m = c0568m3;
            } else {
                ListIterator listIterator = tVar3.listIterator();
                int i7 = 0;
                while (true) {
                    N1.a aVar2 = (N1.a) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (!aVar2.hasNext()) {
                        c0568m = c0568m3;
                        i5 = -1;
                        i7 = -1;
                        break;
                    }
                    Object j3 = cVar2.j(aVar2.next());
                    c0568m = c0568m3;
                    if (i.a(j3, cVar2.j(c0102j0.getValue()))) {
                        i5 = -1;
                        break;
                    } else {
                        i7++;
                        c0568m3 = c0568m;
                        listIterator = listIterator2;
                    }
                }
                if (i7 == i5) {
                    tVar3.add(c0102j0.getValue());
                } else {
                    tVar3.set(i7, c0102j0.getValue());
                }
            }
            if (c0506x2.b(c0102j0.getValue()) && c0506x2.b(w0Var.a())) {
                c0113p.Q(915535767);
                c0113p.p(false);
                c0506x = c0506x2;
                tVar = tVar3;
                obj = obj2;
                r13 = 0;
                c0568m2 = c0568m;
            } else {
                boolean z6 = false;
                c0113p.Q(912931457);
                c0506x2.a();
                int size = tVar3.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj4 = tVar3.get(i8);
                    C0506x c0506x3 = c0506x2;
                    t tVar4 = tVar3;
                    C0568m c0568m4 = c0568m;
                    c0506x3.i(obj4, f.b(885640742, new C0560e(s0Var, obj4, cVar, c0568m4, tVar4, aVar), c0113p));
                    i8++;
                    c0506x2 = c0506x3;
                    obj2 = obj2;
                    z6 = z6;
                    tVar3 = tVar4;
                    c0568m = c0568m4;
                }
                c0506x = c0506x2;
                tVar = tVar3;
                obj = obj2;
                boolean z7 = z6;
                c0568m2 = c0568m;
                c0113p.p(z7);
                r13 = z7;
            }
            C0568m c0568m5 = c0568m2;
            boolean f3 = c0113p.f(s0Var.f()) | c0113p.f(c0568m5);
            Object G6 = c0113p.G();
            if (f3 || G6 == obj) {
                G6 = (w) cVar.j(c0568m5);
                c0113p.a0(G6);
            }
            w wVar = (w) G6;
            c0568m5.getClass();
            boolean f4 = c0113p.f(c0568m5);
            Object G7 = c0113p.G();
            if (f4 || G7 == obj) {
                G7 = C0089d.J(Boolean.FALSE, X.f2228i);
                c0113p.a0(G7);
            }
            InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) G7;
            InterfaceC0088c0 M3 = C0089d.M(wVar.f5513d, c0113p);
            s0 s0Var2 = c0568m5.f5479a;
            if (i.a(s0Var2.f5841a.a(), s0Var2.f5844d.getValue())) {
                interfaceC0088c0.setValue(Boolean.FALSE);
            } else if (M3.getValue() != null) {
                interfaceC0088c0.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) interfaceC0088c0.getValue()).booleanValue();
            l lVar2 = U.i.f3302a;
            if (booleanValue) {
                c0113p.Q(249037309);
                l0 a4 = v0.a(c0568m5.f5479a, z0.f5892h, null, c0113p, 0, 2);
                boolean f5 = c0113p.f(a4);
                Object G8 = c0113p.G();
                if (f5 || G8 == obj) {
                    M m3 = (M) M3.getValue();
                    if (m3 == null || m3.f5445a) {
                        lVar2 = I2.l.n(lVar2);
                    }
                    G8 = lVar2.e(new C0567l(c0568m5, a4, M3));
                    c0113p.a0(G8);
                }
                lVar2 = (l) G8;
                c0113p.p(r13);
            } else {
                c0113p.Q(249353726);
                c0113p.p(r13);
            }
            l e3 = lVar.e(lVar2);
            Object G9 = c0113p.G();
            if (G9 == obj) {
                G9 = new C0563h(c0568m5);
                c0113p.a0(G9);
            }
            C0563h c0563h = (C0563h) G9;
            int i9 = c0113p.f2306P;
            InterfaceC0110n0 m4 = c0113p.m();
            l c3 = m.c(c0113p, e3);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, C0901i.f7923e, c0563h);
            C0089d.Q(c0113p, C0901i.f7922d, m4);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p.f2305O || !i.a(c0113p.G(), Integer.valueOf(i9))) {
                AbstractC0080b.p(i9, c0113p, i9, c0900h);
            }
            C0089d.Q(c0113p, C0901i.f7921c, c3);
            c0113p.Q(-1491001814);
            int size2 = tVar.size();
            int i10 = r13;
            while (i10 < size2) {
                t tVar5 = tVar;
                Object obj5 = tVar5.get(i10);
                c0113p.M(1908315325, r13, cVar2.j(obj5), null);
                Y1.e eVar = (Y1.e) c0506x.e(obj5);
                if (eVar == null) {
                    c0113p.Q(-971711888);
                } else {
                    c0113p.Q(1908317105);
                    eVar.g(c0113p, Integer.valueOf((int) r13));
                }
                c0113p.p(r13);
                c0113p.p(r13);
                i10++;
                tVar = tVar5;
            }
            c0113p.p(r13);
            c0113p.p(true);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0077z(s0Var, lVar, cVar, dVar, cVar2, aVar, i3);
        }
    }

    public static final void c(p pVar, C0113p c0113p, int i3) {
        c0113p.S(294589392);
        int i4 = 4;
        int i5 = (i3 & 6) == 0 ? (c0113p.f(pVar) ? 4 : 2) | i3 : i3;
        if ((i5 & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            R.i N3 = I2.l.N(c0113p);
            InterfaceC0088c0 u3 = C0089d.u(pVar.b().f6916e, c0113p);
            List list = (List) u3.getValue();
            boolean booleanValue = ((Boolean) c0113p.k(AbstractC0983l0.f8362a)).booleanValue();
            boolean f3 = c0113p.f(list);
            Object G3 = c0113p.G();
            Object obj = C0105l.f2272a;
            Object obj2 = G3;
            if (f3 || G3 == obj) {
                t tVar = new t();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    C0784h c0784h = (C0784h) obj3;
                    if (booleanValue || c0784h.f6901k.f4041d.compareTo(EnumC0230o.f4028g) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                tVar.addAll(arrayList);
                c0113p.a0(tVar);
                obj2 = tVar;
            }
            t tVar2 = (t) obj2;
            boolean z3 = false;
            j(tVar2, (List) u3.getValue(), c0113p, 0);
            InterfaceC0088c0 u4 = C0089d.u(pVar.b().f6917f, c0113p);
            Object G4 = c0113p.G();
            if (G4 == obj) {
                G4 = new t();
                c0113p.a0(G4);
            }
            t tVar3 = (t) G4;
            c0113p.Q(1361037007);
            ListIterator listIterator = tVar2.listIterator();
            while (true) {
                N1.a aVar = (N1.a) listIterator;
                if (!aVar.hasNext()) {
                    break;
                }
                C0784h c0784h2 = (C0784h) aVar.next();
                q1.w wVar = c0784h2.f6895e;
                i.d(wVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                o oVar = (o) wVar;
                boolean h3 = c0113p.h(c0784h2) | ((i5 & 14) != i4 ? z3 : true);
                Object G5 = c0113p.G();
                if (h3 || G5 == obj) {
                    G5 = new C0125v0(pVar, 6, c0784h2);
                    c0113p.a0(G5);
                }
                I2.d.b((Y1.a) G5, oVar.f7245m, f.b(1129586364, new r1.k(c0784h2, pVar, N3, tVar3, oVar), c0113p), c0113p, 384);
                i4 = 4;
                z3 = false;
            }
            boolean z4 = z3;
            c0113p.p(z4);
            Set set = (Set) u4.getValue();
            boolean f4 = c0113p.f(u4) | ((i5 & 14) == 4 ? true : z4);
            Object G6 = c0113p.G();
            if (f4 || G6 == obj) {
                G6 = new r1.l(u4, pVar, tVar3, null);
                c0113p.a0(G6);
            }
            C0089d.f(set, tVar3, (Y1.e) G6, c0113p);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new P0.m(pVar, i3, 3);
        }
    }

    public static final long d(int i3) {
        long j3 = (i3 << 32) | (0 & 4294967295L);
        int i4 = C0571a.f5539n;
        return j3;
    }

    public static final void e(Q.a aVar, C0113p c0113p, int i3) {
        int i4;
        int i5 = 3;
        c0113p.S(674185128);
        int i6 = 6;
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            AbstractC0114p0 abstractC0114p0 = R.m.f3163a;
            R.k kVar = (R.k) c0113p.k(abstractC0114p0);
            Object[] objArr = {kVar};
            O o3 = O.f8030e;
            C0932N c0932n = new C0932N(kVar, 1);
            C2.c cVar = R.o.f3164a;
            C2.c cVar2 = new C2.c(o3, i5, c0932n);
            boolean h3 = c0113p.h(kVar);
            Object G3 = c0113p.G();
            if (h3 || G3 == C0105l.f2272a) {
                G3 = new r(7, kVar);
                c0113p.a0(G3);
            }
            Object obj = (P) I2.d.H(objArr, cVar2, (Y1.a) G3, c0113p, 0, 4);
            C0089d.a(abstractC0114p0.a(obj), f.b(1863926504, new C0060q(obj, 12, aVar), c0113p), c0113p, 56);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new P0.m(aVar, i3, i6);
        }
    }

    public static final void f(C0891a c0891a, l lVar, y yVar, InterfaceC0796H interfaceC0796H, boolean z3, InterfaceC0811h interfaceC0811h, InterfaceC0808e interfaceC0808e, C0737m c0737m, boolean z4, Y1.c cVar, C0113p c0113p, int i3) {
        int i4;
        boolean z5;
        X x3;
        y yVar2;
        C0737m t3;
        InterfaceC0796H interfaceC0796H2;
        int i5;
        boolean z6;
        boolean z7;
        y yVar3;
        boolean z8;
        C0737m c0737m2;
        InterfaceC0796H interfaceC0796H3;
        boolean z9;
        int i6 = 1;
        c0113p.S(1485410512);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(c0891a) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(lVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= 128;
        }
        int i7 = i4 | 27648;
        if ((i3 & 196608) == 0) {
            i7 |= c0113p.f(interfaceC0811h) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i7 |= c0113p.f(interfaceC0808e) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i7 |= 4194304;
        }
        int i8 = i7 | 100663296;
        if ((805306368 & i3) == 0) {
            i8 |= c0113p.h(cVar) ? 536870912 : 268435456;
        }
        int i9 = i8;
        if ((i9 & 306783379) == 306783378 && c0113p.x()) {
            c0113p.L();
            yVar3 = yVar;
            interfaceC0796H3 = interfaceC0796H;
            z8 = z3;
            c0737m2 = c0737m;
            z9 = z4;
        } else {
            c0113p.N();
            int i10 = i3 & 1;
            X x4 = C0105l.f2272a;
            int i11 = 0;
            if (i10 == 0 || c0113p.w()) {
                t.p pVar = z.f7706a;
                Object[] objArr = new Object[0];
                C2.c cVar2 = y.f7687t;
                boolean d3 = c0113p.d(0) | c0113p.d(0);
                Object G3 = c0113p.G();
                if (d3 || G3 == x4) {
                    G3 = new C0882y(i11, i11, i6);
                    c0113p.a0(G3);
                }
                z5 = false;
                x3 = x4;
                y yVar4 = (y) I2.d.H(objArr, cVar2, (Y1.a) G3, c0113p, 0, 4);
                float f3 = 0;
                C0797I c0797i = new C0797I(f3, f3, f3, f3);
                int i12 = i9 & (-29361025);
                yVar2 = yVar4;
                t3 = t(c0113p);
                interfaceC0796H2 = c0797i;
                i5 = i12;
                z6 = false;
                z7 = true;
            } else {
                c0113p.L();
                i5 = i9 & (-29361025);
                yVar2 = yVar;
                interfaceC0796H2 = interfaceC0796H;
                z6 = z3;
                t3 = c0737m;
                z7 = z4;
                z5 = false;
                x3 = x4;
            }
            c0113p.q();
            int i13 = i5 >> 3;
            int i14 = (i5 & 14) | ((i5 >> 15) & 112) | (i13 & 896);
            boolean z10 = (((((i14 & 14) ^ 6) <= 4 || !c0113p.f(c0891a)) && (i14 & 6) != 4) ? z5 : true) | (((((i14 & 112) ^ 48) <= 32 || !c0113p.f(interfaceC0808e)) && (i14 & 48) != 32) ? z5 : true);
            if (((i14 & 896) ^ 384) > 256 && c0113p.f(interfaceC0796H2)) {
                z5 = true;
            }
            boolean z11 = z10 | z5;
            Object G4 = c0113p.G();
            if (z11 || G4 == x3) {
                G4 = new t.c(new C0060q(interfaceC0796H2, c0891a, interfaceC0808e));
                c0113p.a0(G4);
            }
            int i15 = (i13 & 14) | 196608 | (i5 & 7168) | (57344 & i5) | (i13 & 29360128);
            int i16 = i5 << 9;
            AbstractC0381e.d(lVar, yVar2, (t.c) G4, interfaceC0796H2, z6, t3, z7, interfaceC0811h, interfaceC0808e, cVar, c0113p, i15 | (234881024 & i16) | (i16 & 1879048192), (i5 >> 27) & 14);
            yVar3 = yVar2;
            z8 = z6;
            c0737m2 = t3;
            interfaceC0796H3 = interfaceC0796H2;
            z9 = z7;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0869l(c0891a, lVar, yVar3, interfaceC0796H3, z8, interfaceC0811h, interfaceC0808e, c0737m2, z9, cVar, i3);
        }
    }

    public static final void g(C0775D c0775d, l lVar, U.d dVar, String str, Y1.c cVar, Y1.c cVar2, Y1.c cVar3, Y1.c cVar4, Y1.c cVar5, Y1.c cVar6, C0113p c0113p, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        l lVar2;
        String str2;
        Y1.c cVar7;
        U.d dVar2;
        Y1.c cVar8;
        Y1.c cVar9;
        Y1.c cVar10;
        Y1.c cVar11;
        l lVar3;
        U.d dVar3;
        Y1.c cVar12;
        Y1.c cVar13;
        Y1.c cVar14;
        Y1.c cVar15;
        Y1.c cVar16;
        String str3;
        c0113p.S(1840250294);
        if ((i3 & 6) == 0) {
            i5 = i3 | (c0113p.h(c0775d) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0113p.f("joints") ? 32 : 16;
        }
        int i8 = 1797504 | i5;
        if ((i3 & 12582912) == 0) {
            i8 = 5991808 | i5;
        }
        if ((i3 & 100663296) == 0) {
            i8 |= 33554432;
        }
        int i9 = 805306368 | i8;
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0113p.h(cVar6) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((306783379 & i9) == 306783378 && (i6 & 3) == 2 && c0113p.x()) {
            c0113p.L();
            lVar3 = lVar;
            dVar3 = dVar;
            str3 = str;
            cVar12 = cVar;
            cVar13 = cVar2;
            cVar14 = cVar3;
            cVar15 = cVar4;
            cVar16 = cVar5;
        } else {
            c0113p.N();
            if ((i3 & 1) == 0 || c0113p.w()) {
                i7 = i9 & (-264241153);
                lVar2 = U.i.f3302a;
                str2 = null;
                cVar7 = null;
                dVar2 = U.a.f3280d;
                cVar8 = r1.y.f7288g;
                cVar9 = cVar8;
                cVar10 = r1.y.f7289h;
                cVar11 = cVar10;
            } else {
                c0113p.L();
                i7 = i9 & (-264241153);
                lVar2 = lVar;
                dVar2 = dVar;
                str2 = str;
                cVar8 = cVar;
                cVar10 = cVar2;
                cVar9 = cVar3;
                cVar11 = cVar4;
                cVar7 = cVar5;
            }
            c0113p.q();
            boolean z3 = ((i7 & 112) == 32) | ((i7 & 57344) == 16384) | ((i6 & 14) == 4);
            Object G3 = c0113p.G();
            if (z3 || G3 == C0105l.f2272a) {
                C0772A c0772a = new C0772A(c0775d.f6848v, str2);
                cVar6.j(c0772a);
                G3 = c0772a.c();
                c0113p.a0(G3);
            }
            q1.z zVar = (q1.z) G3;
            int i10 = i7 & 8078;
            int i11 = i7 >> 3;
            h(c0775d, zVar, lVar2, dVar2, cVar8, cVar10, cVar9, cVar11, cVar7, c0113p, (57344 & i11) | i10 | (458752 & i11) | (i11 & 234881024));
            lVar3 = lVar2;
            dVar3 = dVar2;
            cVar12 = cVar8;
            cVar13 = cVar10;
            cVar14 = cVar9;
            cVar15 = cVar11;
            cVar16 = cVar7;
            str3 = str2;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new s(c0775d, lVar3, dVar3, str3, cVar12, cVar13, cVar14, cVar15, cVar16, cVar6, i3, i4);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 ??, still in use, count: 1, list:
          (r2v6 ?? I:java.lang.Object) from 0x0a3d: INVOKE (r5v36 ?? I:I.p), (r2v6 ?? I:java.lang.Object) VIRTUAL call: I.p.a0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:359)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void h(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 ??, still in use, count: 1, list:
          (r2v6 ?? I:java.lang.Object) from 0x0a3d: INVOKE (r5v36 ?? I:I.p), (r2v6 ?? I:java.lang.Object) VIRTUAL call: I.p.a0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:359)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static final boolean i(InterfaceC0088c0 interfaceC0088c0) {
        return ((Boolean) interfaceC0088c0.getValue()).booleanValue();
    }

    public static final void j(t tVar, List list, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(1537894851);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(tVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(list) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            boolean booleanValue = ((Boolean) c0113p.k(AbstractC0983l0.f8362a)).booleanValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0784h c0784h = (C0784h) it.next();
                C0238x c0238x = c0784h.f6901k;
                boolean g3 = c0113p.g(booleanValue) | c0113p.h(tVar) | c0113p.h(c0784h);
                Object G3 = c0113p.G();
                if (g3 || G3 == C0105l.f2272a) {
                    G3 = new n(tVar, c0784h, booleanValue);
                    c0113p.a0(G3);
                }
                C0089d.c(c0238x, (Y1.c) G3, c0113p);
            }
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new V0(i3, 8, tVar, list);
        }
    }

    public static final void k(InterfaceC0953v interfaceC0953v, Object obj, int i3, Object obj2, C0113p c0113p, int i4) {
        int i5;
        c0113p.S(1439843069);
        if ((i4 & 6) == 0) {
            i5 = (c0113p.f(interfaceC0953v) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0113p.f(obj) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0113p.d(i3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0113p.f(obj2) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && c0113p.x()) {
            c0113p.L();
        } else {
            ((R.c) obj).e(obj2, f.b(980966366, new V0(i3, obj2, interfaceC0953v), c0113p), c0113p, 48);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0952u(interfaceC0953v, obj, i3, obj2, i4);
        }
    }

    public static final y2.i l(Decoder decoder) {
        i.f(decoder, "<this>");
        y2.i iVar = decoder instanceof y2.i ? (y2.i) decoder : null;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + u.a(decoder.getClass()));
    }

    public static final u2.f m(String str, AbstractC0381e abstractC0381e, SerialDescriptor[] serialDescriptorArr, Y1.c cVar) {
        i.f(str, "serialName");
        i.f(cVar, "builder");
        if (AbstractC0447i.t0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC0381e.equals(h.f8550b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        u2.a aVar = new u2.a(str);
        cVar.j(aVar);
        return new u2.f(str, abstractC0381e, aVar.f8522b.size(), k.i0(serialDescriptorArr), aVar);
    }

    public static final void n(long j3, J j4) {
        if (j4 == J.f6443d) {
            if (M0.a.g(j3) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (M0.a.h(j3) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static V o(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            i.e(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (V) newInstance;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        }
    }

    public static boolean p(String str, String str2) {
        i.f(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i3 < str.length()) {
                    char charAt = str.charAt(i3);
                    int i6 = i5 + 1;
                    if (i5 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i4 - 1 == 0 && i5 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i4++;
                    }
                    i3++;
                    i5 = i6;
                } else if (i4 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return i.a(AbstractC0447i.H0(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final long r(long j3, boolean z3, int i3, float f3) {
        int h3 = ((z3 || AbstractC0157a.y(i3, 2)) && M0.a.d(j3)) ? M0.a.h(j3) : Integer.MAX_VALUE;
        if (M0.a.j(j3) != h3) {
            h3 = AbstractC0381e.r(AbstractC0382a.e(f3), M0.a.j(j3), h3);
        }
        int g3 = M0.a.g(j3);
        int min = Math.min(0, 262142);
        int min2 = h3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(h3, 262142);
        int h4 = I2.l.h(min2 == Integer.MAX_VALUE ? min : min2);
        return I2.l.a(min, min2, Math.min(h4, 0), g3 != Integer.MAX_VALUE ? Math.min(h4, g3) : Integer.MAX_VALUE);
    }

    public static q1.w s(q1.z zVar) {
        Iterator it = g2.h.c0(zVar, C0778b.f6885n).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (q1.w) next;
    }

    public static C0737m t(C0113p c0113p) {
        float f3 = N.f5447a;
        M0.b bVar = (M0.b) c0113p.k(AbstractC0963b0.f8296f);
        boolean c3 = c0113p.c(bVar.a());
        Object G3 = c0113p.G();
        Object obj = C0105l.f2272a;
        if (c3 || G3 == obj) {
            G3 = new C0612w(new g(bVar));
            c0113p.a0(G3);
        }
        C0612w c0612w = (C0612w) G3;
        boolean f4 = c0113p.f(c0612w);
        Object G4 = c0113p.G();
        if (f4 || G4 == obj) {
            G4 = new C0737m(c0612w);
            c0113p.a0(G4);
        }
        return (C0737m) G4;
    }

    public static final Object u(z0.i iVar, z0.t tVar) {
        Object obj = iVar.f8982d.get(tVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static final l v(l lVar, InterfaceC0945m interfaceC0945m, n0.f fVar, boolean z3, j jVar, J j3, boolean z4, C0113p c0113p, int i3) {
        if (!z4) {
            c0113p.Q(-1890658823);
            c0113p.p(false);
            return lVar;
        }
        c0113p.Q(-1890632411);
        boolean z5 = true;
        boolean z6 = ((((i3 & 112) ^ 48) > 32 && c0113p.f(interfaceC0945m)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && c0113p.f(fVar)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && c0113p.g(z3)) || (i3 & 3072) == 2048) | ((((57344 & i3) ^ 24576) > 16384 && c0113p.f(jVar)) || (i3 & 24576) == 16384);
        if ((((458752 & i3) ^ 196608) <= 131072 || !c0113p.f(j3)) && (i3 & 196608) != 131072) {
            z5 = false;
        }
        boolean z7 = z6 | z5;
        Object G3 = c0113p.G();
        if (z7 || G3 == C0105l.f2272a) {
            G3 = new C0944l(interfaceC0945m, fVar, z3, jVar, j3);
            c0113p.a0(G3);
        }
        l e3 = lVar.e((C0944l) G3);
        c0113p.p(false);
        return e3;
    }

    public static B w(InterfaceC0799K interfaceC0799K, int i3, int i4, int i5, int i6, int i7, t0.O o3, List list, H[] hArr, int i8) {
        int[] iArr;
        float f3;
        String str;
        String str2;
        long j3;
        String str3;
        String str4;
        long j4;
        int i9;
        int i10;
        InterfaceC0799K interfaceC0799K2;
        int i11;
        int r3;
        int i12;
        String str5;
        int i13;
        String str6;
        String str7;
        long j5;
        String str8;
        String str9;
        long j6;
        int i14;
        float f4;
        long j7;
        float f5;
        String str10;
        float f6;
        float f7;
        float f8;
        boolean z3;
        int i15;
        String str11;
        float f9;
        List list2 = list;
        int i16 = i8;
        long j8 = i7;
        int[] iArr2 = new int[i16];
        float f10 = 0.0f;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            if (i17 >= i16) {
                break;
            }
            r0.z zVar = (r0.z) list2.get(i17);
            Object r4 = zVar.r();
            C0800L c0800l = r4 instanceof C0800L ? (C0800L) r4 : null;
            float f11 = c0800l != null ? c0800l.f7011a : 0.0f;
            if (f11 > 0.0f) {
                f10 += f11;
                i18++;
            } else {
                int i22 = i5 - i19;
                H h3 = hArr[i17];
                if (h3 == null) {
                    h3 = zVar.b(interfaceC0799K.e(0, i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i22 < 0 ? 0 : i22, i6, false));
                }
                int a3 = interfaceC0799K.a(h3);
                int c3 = interfaceC0799K.c(h3);
                iArr2[i17] = a3;
                int i23 = i22 - a3;
                if (i23 < 0) {
                    i23 = 0;
                }
                i20 = Math.min(i7, i23);
                i19 += a3 + i20;
                int max = Math.max(i21, c3);
                hArr[i17] = h3;
                i21 = max;
            }
            i17++;
            list2 = list;
            i16 = i8;
        }
        int i24 = i21;
        if (i18 == 0) {
            i12 = i19 - i20;
            interfaceC0799K2 = interfaceC0799K;
            i10 = i24;
            iArr = iArr2;
            i11 = 0;
            r3 = 0;
            i9 = i3;
        } else {
            int i25 = i5 != Integer.MAX_VALUE ? i5 : i3;
            long j9 = (i18 - 1) * j8;
            long j10 = (i25 - i19) - j9;
            if (j10 < 0) {
                j10 = 0;
            }
            float f12 = j10 / f10;
            long j11 = j10;
            iArr = iArr2;
            int i26 = 0;
            while (true) {
                f3 = f10;
                str = "totalWeight ";
                str2 = "fixedSpace ";
                j3 = j10;
                str3 = "weightChildrenCount ";
                str4 = "remainingToTarget ";
                j4 = j9;
                if (i26 >= i8) {
                    break;
                }
                Object r5 = ((r0.z) list.get(i26)).r();
                C0800L c0800l2 = r5 instanceof C0800L ? (C0800L) r5 : null;
                if (c0800l2 != null) {
                    f9 = c0800l2.f7011a;
                    str11 = "arrangementSpacingTotal ";
                } else {
                    str11 = "arrangementSpacingTotal ";
                    f9 = 0.0f;
                }
                float f13 = f12 * f9;
                try {
                    j11 -= Math.round(f13);
                    i26++;
                    f10 = f3;
                    j10 = j3;
                    j9 = j4;
                } catch (IllegalArgumentException e3) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i5 + "mainAxisMin " + i3 + "targetSpace " + i25 + "arrangementSpacingPx " + j8 + "weightChildrenCount " + i18 + "fixedSpace " + i19 + str11 + j4 + str4 + j3 + str + f3 + "weightUnitSpace " + f12 + "itemWeight " + f9 + "weightedSize " + f13).initCause(e3);
                }
            }
            i9 = i3;
            long j12 = j3;
            long j13 = j4;
            String str12 = "weightedSize ";
            String str13 = "weightUnitSpace ";
            String str14 = "arrangementSpacingTotal ";
            i10 = i24;
            int i27 = 0;
            int i28 = 0;
            int i29 = i19;
            int i30 = i8;
            while (i27 < i30) {
                if (hArr[i27] == null) {
                    r0.z zVar2 = (r0.z) list.get(i27);
                    String str15 = str2;
                    Object r6 = zVar2.r();
                    int i31 = i18;
                    C0800L c0800l3 = r6 instanceof C0800L ? (C0800L) r6 : null;
                    float f14 = c0800l3 != null ? c0800l3.f7011a : 0.0f;
                    if (f14 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    String str16 = str3;
                    int signum = Long.signum(j11);
                    long j14 = j8;
                    j11 -= signum;
                    float f15 = f12 * f14;
                    int max2 = Math.max(0, Math.round(f15) + signum);
                    if (c0800l3 != null) {
                        try {
                            z3 = c0800l3.f7012b;
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                            f6 = f14;
                            f7 = f12;
                            str10 = str13;
                            f8 = f15;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i5 + "mainAxisMin " + i9 + "targetSpace " + i25 + "arrangementSpacingPx " + j14 + str16 + i31 + str15 + i29 + str14 + j13 + str4 + j12 + str + f3 + str10 + f7 + "weight " + f6 + str12 + f8 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max2).initCause(e);
                        }
                    } else {
                        z3 = true;
                    }
                    try {
                        if (z3 && max2 != Integer.MAX_VALUE) {
                            i15 = max2;
                            f6 = f14;
                            f7 = f12;
                            str10 = str13;
                            f8 = f15;
                            H b2 = zVar2.b(interfaceC0799K.e(i15, max2, i6, true));
                            int a4 = interfaceC0799K.a(b2);
                            int c4 = interfaceC0799K.c(b2);
                            iArr[i27] = a4;
                            i28 += a4;
                            i10 = Math.max(i10, c4);
                            hArr[i27] = b2;
                            i14 = i29;
                            f4 = f3;
                            str7 = str;
                            str5 = str15;
                            i13 = i31;
                            str3 = str16;
                            j5 = j13;
                            f5 = f7;
                            str6 = str12;
                            str8 = str14;
                            j7 = j14;
                            str9 = str4;
                            j6 = j12;
                        }
                        H b22 = zVar2.b(interfaceC0799K.e(i15, max2, i6, true));
                        int a42 = interfaceC0799K.a(b22);
                        int c42 = interfaceC0799K.c(b22);
                        iArr[i27] = a42;
                        i28 += a42;
                        i10 = Math.max(i10, c42);
                        hArr[i27] = b22;
                        i14 = i29;
                        f4 = f3;
                        str7 = str;
                        str5 = str15;
                        i13 = i31;
                        str3 = str16;
                        j5 = j13;
                        f5 = f7;
                        str6 = str12;
                        str8 = str14;
                        j7 = j14;
                        str9 = str4;
                        j6 = j12;
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i5 + "mainAxisMin " + i9 + "targetSpace " + i25 + "arrangementSpacingPx " + j14 + str16 + i31 + str15 + i29 + str14 + j13 + str4 + j12 + str + f3 + str10 + f7 + "weight " + f6 + str12 + f8 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max2).initCause(e);
                    }
                    f6 = f14;
                    f7 = f12;
                    str10 = str13;
                    i15 = 0;
                    f8 = f15;
                } else {
                    str5 = str2;
                    i13 = i18;
                    str6 = str12;
                    str7 = str;
                    j5 = j13;
                    str8 = str14;
                    str9 = str4;
                    j6 = j12;
                    i14 = i29;
                    f4 = f3;
                    j7 = j8;
                    String str17 = str13;
                    f5 = f12;
                    str10 = str17;
                }
                i27++;
                i18 = i13;
                str2 = str5;
                j12 = j6;
                str4 = str9;
                str14 = str8;
                i30 = i8;
                j13 = j5;
                str = str7;
                float f16 = f4;
                i29 = i14;
                j8 = j7;
                str12 = str6;
                f3 = f16;
                float f17 = f5;
                str13 = str10;
                f12 = f17;
            }
            interfaceC0799K2 = interfaceC0799K;
            int i32 = i29;
            i11 = 0;
            r3 = AbstractC0381e.r((int) (i28 + j13), 0, i5 - i32);
            i12 = i32;
        }
        int i33 = i12 + r3;
        if (i33 < 0) {
            i33 = i11;
        }
        int max3 = Math.max(i33, i9);
        int max4 = Math.max(i10, Math.max(i4, i11));
        int[] iArr3 = new int[i8];
        for (int i34 = i11; i34 < i8; i34++) {
            iArr3[i34] = i11;
        }
        interfaceC0799K2.b(max3, iArr, iArr3, o3);
        return interfaceC0799K.d(hArr, o3, iArr3, max3, max4);
    }

    public static final L1.s z(String str) {
        int i3;
        int i4;
        AbstractC0381e.m(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        if (i.g(charAt, 48) < 0) {
            i3 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i3 = 0;
        }
        int i6 = 119304647;
        int i7 = 119304647;
        while (i3 < length) {
            int digit = Character.digit((int) str.charAt(i3), 10);
            if (digit < 0) {
                return null;
            }
            int i8 = i5 ^ Integer.MIN_VALUE;
            if (Integer.compare(i8, i7 ^ Integer.MIN_VALUE) > 0) {
                if (i7 == i6) {
                    i4 = i3;
                    i7 = (int) (((-1) & 4294967295L) / (10 & 4294967295L));
                    if (Integer.compare(i8, i7 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            i4 = i3;
            int i9 = i5 * 10;
            int i10 = i9 + digit;
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i3 = i4 + 1;
            i5 = i10;
            i6 = 119304647;
        }
        return new L1.s(i5);
    }

    public abstract void q(SerialDescriptor serialDescriptor, int i3, Object obj);

    public abstract void x(Throwable th);

    public abstract void y(A2.k kVar);
}
