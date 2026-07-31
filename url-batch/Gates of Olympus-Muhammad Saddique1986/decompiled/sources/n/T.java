package n;

import F.P0;
import I.AbstractC0168p0;
import I.C0143d;
import I.C0150g0;
import I.C0156j0;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.C0184y;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import I.N0;
import I.W0;
import a0.C0238c;
import android.os.Build;
import android.view.View;
import b0.C0344m;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import g0.AbstractC0437b;
import h2.AbstractC0508a;
import java.util.List;
import l2.InterfaceC0602c;
import n0.C0706d;
import n0.C0710h;
import n2.AbstractC0724d;
import o0.C0743b;
import o0.C0744c;
import p.C0775m;
import r.InterfaceC0849K;
import r.InterfaceC0859f;
import r.InterfaceC0862i;
import r0.AbstractC0891M;
import r0.C0888J;
import r0.C0929z;
import s.C0933b;
import s.C0934c;
import s.C0935d;
import s.C0936e;
import s.C0940i;
import s.C0951t;
import t.C0980h;
import t.C0984l;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import t1.C1015C;
import t1.C1016D;
import t1.C1017E;
import t1.C1020H;
import u0.AbstractC1101g0;
import x0.AbstractC1217e;

/* loaded from: classes.dex */
public abstract class T {
    public static final void a(AbstractC0437b abstractC0437b, U.q qVar, U.d dVar, C0888J c0888j, float f3, C0344m c0344m, C0167p c0167p, int i3) {
        int i4;
        C0344m c0344m2;
        U.d dVar2;
        float f4;
        c0167p.S(1142754848);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(abstractC0437b) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(null) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(qVar) ? 256 : 128;
        }
        int i5 = i4 | 3072;
        if ((i3 & 24576) == 0) {
            i5 |= c0167p.f(c0888j) ? 16384 : 8192;
        }
        if (((i5 | 1769472) & 599187) == 599186 && c0167p.x()) {
            c0167p.L();
            dVar2 = dVar;
            f4 = f3;
            c0344m2 = c0344m;
        } else {
            U.i iVar = U.b.f4465h;
            c0167p.Q(1040398089);
            c0167p.p(false);
            U.q d3 = androidx.compose.ui.draw.a.d(1.0f, 2, iVar, AbstractC0508a.v(qVar.i(U.n.f4488a)), null, abstractC0437b, c0888j);
            Q q3 = Q.f7067a;
            int i6 = c0167p.f2864P;
            U.q d4 = U.a.d(c0167p, d3);
            InterfaceC0164n0 m3 = c0167p.m();
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, q3);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0143d.R(c0167p, C0996i.f8755c, d4);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i6))) {
                A.k.o(i6, c0167p, i6, c0995h);
            }
            c0167p.p(true);
            c0344m2 = null;
            dVar2 = iVar;
            f4 = 1.0f;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new S(f4, i3, dVar2, qVar, c0344m2, abstractC0437b, c0888j);
        }
    }

    public static final void b(Object obj, int i3, t.x xVar, Q.a aVar, C0167p c0167p, int i4) {
        int i5;
        c0167p.S(-2079116560);
        if ((i4 & 6) == 0) {
            i5 = (c0167p.h(obj) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0167p.d(i3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0167p.h(xVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0167p.h(aVar) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && c0167p.x()) {
            c0167p.L();
        } else {
            boolean f3 = c0167p.f(obj) | c0167p.f(xVar);
            Object G3 = c0167p.G();
            Object obj2 = C0159l.f2829a;
            if (f3 || G3 == obj2) {
                G3 = new t.w(obj, xVar);
                c0167p.a0(G3);
            }
            t.w wVar = (t.w) G3;
            C0150g0 c0150g0 = wVar.f8519c;
            C0156j0 c0156j0 = wVar.f8521e;
            C0156j0 c0156j02 = wVar.f8522f;
            c0150g0.h(i3);
            AbstractC0168p0 abstractC0168p0 = AbstractC0891M.f8124a;
            t.w wVar2 = (t.w) c0167p.k(abstractC0168p0);
            S.i c2 = S.u.c();
            InterfaceC0424c f4 = c2 != null ? c2.f() : null;
            S.i d3 = S.u.d(c2);
            try {
                if (wVar2 != ((t.w) c0156j02.getValue())) {
                    c0156j02.setValue(wVar2);
                    if (wVar.f8520d.g() > 0) {
                        t.w wVar3 = (t.w) c0156j0.getValue();
                        if (wVar3 != null) {
                            wVar3.b();
                        }
                        if (wVar2 != null) {
                            wVar2.a();
                        } else {
                            wVar2 = null;
                        }
                        c0156j0.setValue(wVar2);
                    }
                }
                S.u.f(c2, d3, f4);
                boolean f5 = c0167p.f(wVar);
                Object G4 = c0167p.G();
                if (f5 || G4 == obj2) {
                    G4 = new C0929z(3, wVar);
                    c0167p.a0(G4);
                }
                C0143d.c(wVar, (InterfaceC0424c) G4, c0167p);
                C0143d.a(abstractC0168p0.a(wVar), aVar, c0167p, ((i5 >> 6) & 112) | 8);
            } catch (Throwable th) {
                S.u.f(c2, d3, f4);
                throw th;
            }
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new t.s(obj, i3, xVar, aVar, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0374, code lost:
    
        if (r3 == r2) goto L207;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [r.f] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(U.q qVar, C0951t c0951t, InterfaceC0849K interfaceC0849K, boolean z3, C0775m c0775m, boolean z4, int i3, U.c cVar, InterfaceC0862i interfaceC0862i, U.h hVar, InterfaceC0859f interfaceC0859f, InterfaceC0424c interfaceC0424c, C0167p c0167p, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        boolean z5;
        I.W w2;
        int i9;
        boolean z6;
        U.h hVar2;
        I.W w3;
        ?? r11;
        int i10;
        C0167p c0167p2 = c0167p;
        c0167p2.S(620764179);
        if ((i4 & 6) == 0) {
            i6 = (c0167p2.f(qVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0167p2.f(c0951t) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0167p2.f(interfaceC0849K) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0167p2.g(z3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= c0167p2.g(true) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= c0167p2.f(c0775m) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= c0167p2.g(z4) ? 1048576 : 524288;
        }
        int i11 = i6 | 12582912;
        if ((i4 & 100663296) == 0) {
            i11 |= c0167p2.f(cVar) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i11 |= c0167p2.f(interfaceC0862i) ? 536870912 : 268435456;
        }
        int i12 = i5 | 54;
        if ((i5 & 384) == 0) {
            i12 |= c0167p2.h(interfaceC0424c) ? 256 : 128;
        }
        int i13 = i12;
        if ((i11 & 306783379) == 306783378 && (i13 & 147) == 146 && c0167p.x()) {
            c0167p.L();
            i10 = i3;
            hVar2 = hVar;
            r11 = interfaceC0859f;
        } else {
            int i14 = (i11 >> 3) & 14;
            int i15 = i14 | ((i13 >> 3) & 112);
            InterfaceC0142c0 N3 = C0143d.N(interfaceC0424c, c0167p);
            boolean z7 = (((i15 & 14) ^ 6) > 4 && c0167p2.f(c0951t)) || (i15 & 6) == 4;
            Object G3 = c0167p.G();
            I.W w4 = C0159l.f2829a;
            if (z7 || G3 == w4) {
                C0934c c0934c = new C0934c();
                c0934c.f8224a = C0143d.J(Integer.MAX_VALUE);
                c0934c.f8225b = C0143d.J(Integer.MAX_VALUE);
                I.W w5 = I.W.f2781g;
                E.v vVar = new E.v(N3, 1);
                G1.m mVar = N0.f2727a;
                G3 = new P0(0, 1, W0.class, new I.F(w5, new K2.i(new I.F(w5, vVar), c0951t, c0934c, 3)), "value", "getValue()Ljava/lang/Object;");
                c0167p2.a0(G3);
            }
            InterfaceC0602c interfaceC0602c = (InterfaceC0602c) G3;
            int i16 = i14 | ((i11 >> 9) & 112);
            boolean z8 = ((((i16 & 112) ^ 48) > 32 && c0167p2.g(true)) || (i16 & 48) == 32) | ((((i16 & 14) ^ 6) > 4 && c0167p2.f(c0951t)) || (i16 & 6) == 4);
            Object G4 = c0167p.G();
            if (z8 || G4 == w4) {
                G4 = new C0935d(c0951t);
                c0167p2.a0(G4);
            }
            C0935d c0935d = (C0935d) G4;
            Object G5 = c0167p.G();
            if (G5 == w4) {
                C0184y c0184y = new C0184y(C0143d.z(c0167p));
                c0167p2.a0(c0184y);
                G5 = c0184y;
            }
            v2.c cVar2 = ((C0184y) G5).f2968d;
            b0.D d3 = (b0.D) c0167p2.k(AbstractC1101g0.f9353e);
            boolean z9 = !((Boolean) c0167p2.k(AbstractC1101g0.f9368t)).booleanValue();
            int i17 = i11 & 7168;
            int i18 = i11 >> 6;
            int i19 = i13 << 21;
            int i20 = (i11 & 65520) | (i18 & 458752) | (i18 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | (i11 & 1879048192);
            int i21 = i11;
            boolean f3 = ((((i20 & 112) ^ 48) > 32 && c0167p2.f(c0951t)) || (i20 & 48) == 32) | ((((i20 & 896) ^ 384) > 256 && c0167p2.f(interfaceC0849K)) || (i20 & 384) == 256) | ((((i20 & 7168) ^ 3072) > 2048 && c0167p2.g(z3)) || (i20 & 3072) == 2048) | ((((57344 & i20) ^ 24576) > 16384 && c0167p2.g(true)) || (i20 & 24576) == 16384) | ((((i20 & 3670016) ^ 1572864) > 1048576 && c0167p2.f(cVar)) || (i20 & 1572864) == 1048576) | (((i20 & 29360128) ^ 12582912) > 8388608 && c0167p2.f(null)) | (((i20 & 234881024) ^ 100663296) > 67108864 && c0167p2.f(null)) | ((((i20 & 1879048192) ^ 805306368) > 536870912 && c0167p2.f(interfaceC0862i)) || (i20 & 805306368) == 536870912) | c0167p2.f(d3) | c0167p2.g(z9);
            Object G6 = c0167p.G();
            if (f3 || G6 == w4) {
                i7 = i21;
                i8 = i17;
                z5 = true;
                w2 = w4;
                i9 = 0;
                z6 = z3;
                hVar2 = null;
                C0933b c0933b = new C0933b(c0951t, interfaceC0849K, z3, interfaceC0602c, interfaceC0862i, null, z9, 0, cVar2, d3, cVar, null);
                c0167p2 = c0167p;
                c0167p2.a0(c0933b);
                G6 = c0933b;
            } else {
                z6 = z3;
                i8 = i17;
                w2 = w4;
                i9 = 0;
                hVar2 = null;
                i7 = i21;
                z5 = true;
            }
            InterfaceC0426e interfaceC0426e = (InterfaceC0426e) G6;
            p.P p3 = p.P.f7567d;
            U.q a3 = androidx.compose.foundation.lazy.layout.c.a(qVar.i(c0951t.f8327k).i(c0951t.f8328l), interfaceC0602c, c0935d, p3, z4, z3);
            int i22 = i14 | ((i7 >> 18) & 112);
            int i23 = i9;
            boolean z10 = ((((i22 & 112) ^ 48) <= 32 || !c0167p2.d(i23)) ? false : z5) | (((((i22 & 14) ^ 6) <= 4 || !c0167p2.f(c0951t)) && (i22 & 6) != 4) ? false : z5);
            Object G7 = c0167p.G();
            if (z10) {
                w3 = w2;
            } else {
                w3 = w2;
            }
            G7 = new C0936e(c0951t, i23);
            c0167p2.a0(G7);
            C0936e c0936e = (C0936e) G7;
            O0.k kVar = (O0.k) c0167p2.k(AbstractC1101g0.f9360l);
            int i24 = 512 | i8 | (i7 & 3670016);
            if (z4) {
                c0167p2.Q(-1890632411);
                boolean f4 = c0167p2.f(c0936e);
                C0710h c0710h = c0951t.f8330n;
                boolean f5 = f4 | c0167p2.f(c0710h);
                if ((((i24 & 7168) ^ 3072) <= 2048 || !c0167p2.g(z6)) && (i24 & 3072) != 2048) {
                    z5 = false;
                }
                boolean f6 = f5 | z5 | c0167p2.f(kVar) | c0167p2.f(p3);
                Object G8 = c0167p.G();
                if (f6 || G8 == w3) {
                    C0984l c0984l = new C0984l(c0936e, c0710h, z3, kVar, p3);
                    c0167p2.a0(c0984l);
                    G8 = c0984l;
                }
                a3 = a3.i((C0984l) G8);
                c0167p2.p(false);
            } else {
                c0167p2.Q(-1890658823);
                c0167p2.p(false);
            }
            AbstractC0695v.b(interfaceC0602c, z0.m(a3.i(c0951t.f8329m.f4847i), c0951t, p3, z4, z3, c0775m, c0951t.f8322f, c0167p), c0951t.f8331o, interfaceC0426e, c0167p, 0);
            r11 = hVar2;
            i10 = 0;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0940i(qVar, c0951t, interfaceC0849K, z3, c0775m, z4, i10, cVar, interfaceC0862i, hVar2, r11, interfaceC0424c, i4, i5);
        }
    }

    public static final int d(int i3, K.d dVar) {
        int i4 = dVar.f3216f - 1;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = ((i4 - i5) / 2) + i5;
            Object[] objArr = dVar.f3214d;
            int i7 = ((C0980h) objArr[i6]).f8478a;
            if (i7 != i3) {
                if (i7 < i3) {
                    i5 = i6 + 1;
                    if (i3 < ((C0980h) objArr[i5]).f8478a) {
                    }
                } else {
                    i4 = i6 - 1;
                }
            }
            return i6;
        }
        return i5;
    }

    public static final void e(String str, int i3) {
        if (str.charAt(i3) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index 8, but was " + str.charAt(i3)).toString());
    }

    public static final void f(int i3, int i4, long j3, byte[] bArr) {
        int i5 = (i4 * 2) + i3;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = AbstractC0724d.f7360a[(int) (255 & j3)];
            bArr[i5 - 1] = (byte) i7;
            i5 -= 2;
            bArr[i5] = (byte) (i7 >> 8);
            j3 >>= 8;
        }
    }

    public static final void g(C0744c c0744c, n0.s sVar) {
        boolean a3 = n0.q.a(sVar);
        C0743b c0743b = c0744c.f7435b;
        C0743b c0743b2 = c0744c.f7434a;
        if (a3) {
            S1.k.r0(r2, null, 0, c0743b2.f7429d.length);
            c0743b2.f7430e = 0;
            S1.k.r0(r2, null, 0, c0743b.f7429d.length);
            c0743b.f7430e = 0;
            c0744c.f7436c = 0L;
        }
        boolean c2 = n0.q.c(sVar);
        long j3 = sVar.f7309b;
        if (!c2) {
            List list = sVar.f7318k;
            if (list == null) {
                list = S1.u.f4320d;
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0706d c0706d = (C0706d) list.get(i3);
                long j4 = c0706d.f7273a;
                long j5 = c0706d.f7275c;
                c0743b2.a(j4, C0238c.d(j5));
                c0743b.a(j4, C0238c.e(j5));
            }
            long j6 = sVar.f7319l;
            c0743b2.a(j3, C0238c.d(j6));
            c0743b.a(j3, C0238c.e(j6));
        }
        if (n0.q.c(sVar) && j3 - c0744c.f7436c > 40) {
            S1.k.r0(r1, null, 0, c0743b2.f7429d.length);
            c0743b2.f7430e = 0;
            S1.k.r0(r1, null, 0, c0743b.f7429d.length);
            c0743b.f7430e = 0;
            c0744c.f7436c = 0L;
        }
        c0744c.f7436c = j3;
    }

    public static void h(StringBuilder sb, Object obj, InterfaceC0424c interfaceC0424c) {
        if (interfaceC0424c != null) {
            sb.append((CharSequence) interfaceC0424c.n(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static void i(t1.y yVar, String str, Q.a aVar) {
        C1020H c1020h = yVar.f8952f;
        c1020h.getClass();
        u1.j jVar = new u1.j((u1.i) c1020h.b(t0.m(u1.i.class)), str, aVar);
        jVar.f9596h = null;
        jVar.f9597i = null;
        jVar.f9598j = null;
        jVar.f9599k = null;
        jVar.f9600l = null;
        yVar.f8954h.add(jVar.a());
    }

    public static final float j(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < length; i3++) {
            f3 += fArr[i3] * fArr2[i3];
        }
        return f3;
    }

    public static final void k(z2.b bVar, B2.a aVar, String str) {
        f2.j.f(bVar, "<this>");
        aVar.m().getClass();
        bVar.getClass();
        f2.x.e(1, null);
        C2.M.e(null, str);
        throw null;
    }

    public static final y1.f l(View view) {
        f2.j.f(view, "<this>");
        return (y1.f) m2.h.S(m2.h.U(m2.h.T(view, y1.g.f10393f), y1.g.f10394g));
    }

    public static M.e m(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new M.e(AbstractC1217e.a(view));
        }
        return null;
    }

    public static final C1016D n(InterfaceC0424c interfaceC0424c) {
        C1017E c1017e = new C1017E();
        interfaceC0424c.n(c1017e);
        boolean z3 = c1017e.f8847b;
        C1015C c1015c = c1017e.f8846a;
        c1015c.f8832a = z3;
        c1015c.f8833b = c1017e.f8848c;
        int i3 = c1017e.f8849d;
        boolean z4 = c1017e.f8850e;
        c1015c.f8834c = i3;
        c1015c.f8835d = false;
        c1015c.f8836e = z4;
        return new C1016D(c1015c.f8832a, c1015c.f8833b, c1015c.f8834c, c1015c.f8835d, c1015c.f8836e, c1015c.f8837f, c1015c.f8838g);
    }

    public static final void o(float[] fArr, float[] fArr2, int i3, float[] fArr3) {
        if (i3 == 0) {
            z0.n("At least one point must be provided");
            throw null;
        }
        int i4 = 2 >= i3 ? i3 - 1 : 2;
        int i5 = i4 + 1;
        float[][] fArr4 = new float[i5][];
        for (int i6 = 0; i6 < i5; i6++) {
            fArr4[i6] = new float[i3];
        }
        for (int i7 = 0; i7 < i3; i7++) {
            fArr4[0][i7] = 1.0f;
            for (int i8 = 1; i8 < i5; i8++) {
                fArr4[i8][i7] = fArr4[i8 - 1][i7] * fArr[i7];
            }
        }
        float[][] fArr5 = new float[i5][];
        for (int i9 = 0; i9 < i5; i9++) {
            fArr5[i9] = new float[i3];
        }
        float[][] fArr6 = new float[i5][];
        for (int i10 = 0; i10 < i5; i10++) {
            fArr6[i10] = new float[i5];
        }
        int i11 = 0;
        while (i11 < i5) {
            float[] fArr7 = fArr5[i11];
            float[] fArr8 = fArr4[i11];
            f2.j.f(fArr8, "<this>");
            f2.j.f(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i3);
            for (int i12 = 0; i12 < i11; i12++) {
                float[] fArr9 = fArr5[i12];
                float j3 = j(fArr7, fArr9);
                for (int i13 = 0; i13 < i3; i13++) {
                    fArr7[i13] = fArr7[i13] - (fArr9[i13] * j3);
                }
            }
            float sqrt = (float) Math.sqrt(j(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f3 = 1.0f / sqrt;
            for (int i14 = 0; i14 < i3; i14++) {
                fArr7[i14] = fArr7[i14] * f3;
            }
            float[] fArr10 = fArr6[i11];
            int i15 = 0;
            while (i15 < i5) {
                fArr10[i15] = i15 < i11 ? 0.0f : j(fArr7, fArr4[i15]);
                i15++;
            }
            i11++;
        }
        for (int i16 = i4; -1 < i16; i16--) {
            float j4 = j(fArr5[i16], fArr2);
            float[] fArr11 = fArr6[i16];
            int i17 = i16 + 1;
            if (i17 <= i4) {
                int i18 = i4;
                while (true) {
                    j4 -= fArr11[i18] * fArr3[i18];
                    if (i18 != i17) {
                        i18--;
                    }
                }
            }
            fArr3[i16] = j4 / fArr11[i16];
        }
    }
}
