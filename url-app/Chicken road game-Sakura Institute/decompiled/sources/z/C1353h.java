package z;

import A0.AbstractC0037h;
import A0.AbstractC0042m;
import A0.C0034e;
import A0.C0036g;
import A0.D;
import A0.H;
import A0.I;
import A0.L;
import A0.o;
import S.n;
import Z.AbstractC0319p;
import Z.C0323u;
import Z.InterfaceC0324v;
import Z.O;
import Z.r;
import b0.AbstractC0497e;
import b0.C0499g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.z;
import p0.AbstractC0954O;
import p0.AbstractC0967c;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.AbstractC1065f;
import r0.G;
import r0.InterfaceC1074o;
import r0.InterfaceC1081w;
import r0.n0;
import s.C1093I;
import u3.l;
import w.M;
import y0.C1317a;
import y0.q;
import y0.s;
import y0.t;
import z2.C1440x;

/* renamed from: z.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1353h extends n implements InterfaceC1081w, InterfaceC1074o, n0 {

    /* renamed from: A, reason: collision with root package name */
    public int f11746A;
    public List B;

    /* renamed from: C, reason: collision with root package name */
    public Function1 f11747C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC0324v f11748D;

    /* renamed from: E, reason: collision with root package name */
    public Function1 f11749E;

    /* renamed from: F, reason: collision with root package name */
    public Map f11750F;

    /* renamed from: G, reason: collision with root package name */
    public C1349d f11751G;

    /* renamed from: H, reason: collision with root package name */
    public C1352g f11752H;

    /* renamed from: I, reason: collision with root package name */
    public C1351f f11753I;

    /* renamed from: t, reason: collision with root package name */
    public C0036g f11754t;

    /* renamed from: u, reason: collision with root package name */
    public L f11755u;

    /* renamed from: v, reason: collision with root package name */
    public F0.d f11756v;

    /* renamed from: w, reason: collision with root package name */
    public Function1 f11757w;

    /* renamed from: x, reason: collision with root package name */
    public int f11758x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11759y;

    /* renamed from: z, reason: collision with root package name */
    public int f11760z;

    public final C1349d B0() {
        if (this.f11751G == null) {
            this.f11751G = new C1349d(this.f11754t, this.f11755u, this.f11756v, this.f11758x, this.f11759y, this.f11760z, this.f11746A, this.B);
        }
        C1349d c1349d = this.f11751G;
        Intrinsics.c(c1349d);
        return c1349d;
    }

    public final C1349d C0(M0.b bVar) {
        C1349d c1349d;
        C1351f c1351f = this.f11753I;
        if (c1351f != null && c1351f.f11742c && (c1349d = c1351f.f11743d) != null) {
            c1349d.c(bVar);
            return c1349d;
        }
        C1349d B02 = B0();
        B02.c(bVar);
        return B02;
    }

    @Override // r0.n0
    public final boolean T() {
        return true;
    }

    @Override // r0.InterfaceC1074o
    public final void a(G g4) {
        if (this.f3990s) {
            r k4 = g4.f9624d.f5603e.k();
            I i2 = C0(g4).f11719n;
            if (i2 == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            long j4 = i2.f291c;
            float f4 = (int) (j4 >> 32);
            o oVar = i2.f290b;
            boolean z4 = ((f4 > oVar.f353d ? 1 : (f4 == oVar.f353d ? 0 : -1)) < 0 || oVar.f352c || (((float) ((int) (j4 & 4294967295L))) > oVar.f354e ? 1 : (((float) ((int) (j4 & 4294967295L))) == oVar.f354e ? 0 : -1)) < 0) && !l.b0(this.f11758x, 3);
            if (z4) {
                Y.d h4 = j0.c.h(0L, l.N((int) (j4 >> 32), (int) (j4 & 4294967295L)));
                k4.g();
                r.l(k4, h4);
            }
            try {
                D d4 = this.f11755u.f303a;
                L0.j jVar = d4.f268m;
                if (jVar == null) {
                    jVar = L0.j.f3510b;
                }
                L0.j jVar2 = jVar;
                O o4 = d4.f269n;
                if (o4 == null) {
                    o4 = O.f4488d;
                }
                O o5 = o4;
                AbstractC0497e abstractC0497e = d4.f271p;
                if (abstractC0497e == null) {
                    abstractC0497e = C0499g.f5607a;
                }
                AbstractC0497e abstractC0497e2 = abstractC0497e;
                AbstractC0319p c4 = d4.f256a.c();
                if (c4 != null) {
                    o.h(oVar, k4, c4, this.f11755u.f303a.f256a.a(), o5, jVar2, abstractC0497e2);
                } else {
                    InterfaceC0324v interfaceC0324v = this.f11748D;
                    long a4 = interfaceC0324v != null ? interfaceC0324v.a() : C0323u.f4547g;
                    if (a4 == 16) {
                        a4 = this.f11755u.b() != 16 ? this.f11755u.b() : C0323u.f4542b;
                    }
                    o.g(oVar, k4, a4, o5, jVar2, abstractC0497e2);
                }
                if (z4) {
                    k4.b();
                }
                C1351f c1351f = this.f11753I;
                if (c1351f == null || !c1351f.f11742c) {
                    C0036g c0036g = this.f11754t;
                    int length = c0036g.f328a.length();
                    List list = c0036g.f331d;
                    if (list != null) {
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            C0034e c0034e = (C0034e) list.get(i4);
                            if ((c0034e.f324a instanceof AbstractC0042m) && AbstractC0037h.c(0, length, c0034e.f325b, c0034e.f326c)) {
                                break;
                            }
                        }
                    }
                }
                List list2 = this.B;
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                g4.a();
            } catch (Throwable th) {
                if (z4) {
                    k4.b();
                }
                throw th;
            }
        }
    }

    @Override // r0.InterfaceC1081w
    public final int b(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return M.k(C0(o4).d(o4.getLayoutDirection()).c());
    }

    @Override // r0.InterfaceC1081w
    public final int c(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return M.k(C0(o4).d(o4.getLayoutDirection()).a());
    }

    @Override // r0.InterfaceC1081w
    public final int d(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return C0(o4).a(i2, o4.getLayoutDirection());
    }

    @Override // r0.InterfaceC1081w
    public final int f(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return C0(o4).a(i2, o4.getLayoutDirection());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123  */
    @Override // r0.InterfaceC1081w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        I i2;
        C1349d C02 = C0(interfaceC0947H);
        M0.k layoutDirection = interfaceC0947H.getLayoutDirection();
        boolean z4 = true;
        if (C02.f11712g > 1) {
            C1347b c1347b = C02.f11714i;
            L l4 = C02.f11707b;
            M0.b bVar = C02.f11716k;
            Intrinsics.c(bVar);
            C1347b m4 = z.m(c1347b, layoutDirection, l4, bVar, C02.f11708c);
            C02.f11714i = m4;
            j4 = m4.a(j4, C02.f11712g);
        }
        I i4 = C02.f11719n;
        if (i4 != null) {
            o oVar = i4.f290b;
            if (!oVar.f350a.b()) {
                H h4 = i4.f289a;
                if (layoutDirection == h4.f286h) {
                    long j5 = h4.f288j;
                    if (M0.a.c(j4, j5) || (M0.a.i(j4) == M0.a.i(j5) && M0.a.h(j4) >= oVar.f354e && !oVar.f352c)) {
                        I i5 = C02.f11719n;
                        Intrinsics.c(i5);
                        if (M0.a.c(j4, i5.f289a.f288j)) {
                            z4 = false;
                        } else {
                            I i6 = C02.f11719n;
                            Intrinsics.c(i6);
                            C02.f11719n = C02.e(layoutDirection, j4, i6.f290b);
                        }
                        i2 = C02.f11719n;
                        if (i2 != null) {
                            throw new IllegalStateException("You must call layoutWithConstraints first");
                        }
                        i2.f290b.f350a.b();
                        if (z4) {
                            AbstractC1065f.t(this, 2).U0();
                            Function1 function1 = this.f11757w;
                            if (function1 != null) {
                                function1.invoke(i2);
                            }
                            Map map = this.f11750F;
                            if (map == null) {
                                map = new LinkedHashMap(2);
                            }
                            map.put(AbstractC0967c.f9034a, Integer.valueOf(Math.round(i2.f292d)));
                            map.put(AbstractC0967c.f9035b, Integer.valueOf(Math.round(i2.f293e)));
                            this.f11750F = map;
                        }
                        Function1 function12 = this.f11747C;
                        if (function12 != null) {
                            function12.invoke(i2.f294f);
                        }
                        long j6 = i2.f291c;
                        int i7 = (int) (j6 >> 32);
                        int i8 = (int) (j6 & 4294967295L);
                        int min = Math.min(i7, 262142);
                        int min2 = i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i7, 262142);
                        int l5 = u3.d.l(min2 == Integer.MAX_VALUE ? min : min2);
                        AbstractC0954O a4 = interfaceC0944E.a(u3.d.a(min, min2, Math.min(l5, i8), i8 != Integer.MAX_VALUE ? Math.min(l5, i8) : Integer.MAX_VALUE));
                        Map map2 = this.f11750F;
                        Intrinsics.c(map2);
                        return interfaceC0947H.t(i7, i8, map2, new P0.n(a4, 10));
                    }
                }
            }
        }
        C02.f11719n = C02.e(layoutDirection, j4, C02.b(j4, layoutDirection));
        i2 = C02.f11719n;
        if (i2 != null) {
        }
    }

    @Override // r0.n0
    public final void p(y0.i iVar) {
        C1352g c1352g = this.f11752H;
        if (c1352g == null) {
            c1352g = new C1352g(this, 0);
            this.f11752H = c1352g;
        }
        C0036g c0036g = this.f11754t;
        S2.e[] eVarArr = s.f11639a;
        iVar.s(q.f11632u, C1440x.a(c0036g));
        C1351f c1351f = this.f11753I;
        if (c1351f != null) {
            C0036g c0036g2 = c1351f.f11741b;
            t tVar = q.f11633v;
            S2.e[] eVarArr2 = s.f11639a;
            S2.e eVar = eVarArr2[14];
            tVar.a(iVar, c0036g2);
            boolean z4 = c1351f.f11742c;
            t tVar2 = q.f11634w;
            S2.e eVar2 = eVarArr2[15];
            tVar2.a(iVar, Boolean.valueOf(z4));
        }
        iVar.s(y0.h.f11559j, new C1317a(null, new C1352g(this, 1)));
        iVar.s(y0.h.f11560k, new C1317a(null, new C1352g(this, 2)));
        iVar.s(y0.h.f11561l, new C1317a(null, new C1093I(11, this)));
        s.c(iVar, c1352g);
    }
}
