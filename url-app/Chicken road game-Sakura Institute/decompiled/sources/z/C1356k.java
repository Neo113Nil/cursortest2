package z;

import A0.C0031b;
import A0.C0036g;
import A0.D;
import A0.L;
import A0.t;
import B0.F;
import S.n;
import Z.AbstractC0319p;
import Z.C0323u;
import Z.InterfaceC0324v;
import Z.O;
import Z.r;
import b0.AbstractC0497e;
import b0.C0499g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m3.z;
import p0.AbstractC0954O;
import p0.AbstractC0967c;
import p0.C0976l;
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
import z2.C1440x;

/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1356k extends n implements InterfaceC1081w, InterfaceC1074o, n0 {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC0324v f11767A;
    public Map B;

    /* renamed from: C, reason: collision with root package name */
    public C1350e f11768C;

    /* renamed from: D, reason: collision with root package name */
    public C1355j f11769D;

    /* renamed from: E, reason: collision with root package name */
    public C1354i f11770E;

    /* renamed from: t, reason: collision with root package name */
    public String f11771t;

    /* renamed from: u, reason: collision with root package name */
    public L f11772u;

    /* renamed from: v, reason: collision with root package name */
    public F0.d f11773v;

    /* renamed from: w, reason: collision with root package name */
    public int f11774w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11775x;

    /* renamed from: y, reason: collision with root package name */
    public int f11776y;

    /* renamed from: z, reason: collision with root package name */
    public int f11777z;

    public final C1350e B0() {
        if (this.f11768C == null) {
            this.f11768C = new C1350e(this.f11771t, this.f11772u, this.f11773v, this.f11774w, this.f11775x, this.f11776y, this.f11777z);
        }
        C1350e c1350e = this.f11768C;
        Intrinsics.c(c1350e);
        return c1350e;
    }

    public final C1350e C0(M0.b bVar) {
        C1350e c1350e;
        C1354i c1354i = this.f11770E;
        if (c1354i != null && c1354i.f11763c && (c1350e = c1354i.f11764d) != null) {
            c1350e.c(bVar);
            return c1350e;
        }
        C1350e B02 = B0();
        B02.c(bVar);
        return B02;
    }

    @Override // r0.InterfaceC1074o
    public final void a(G g4) {
        if (this.f3990s) {
            C1350e C02 = C0(g4);
            C0031b c0031b = C02.f11731j;
            if (c0031b == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f11768C + ", textSubstitution=" + this.f11770E + ')').toString());
            }
            r k4 = g4.f9624d.f5603e.k();
            boolean z4 = C02.f11732k;
            if (z4) {
                long j4 = C02.f11733l;
                k4.g();
                k4.p(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L), 1);
            }
            try {
                D d4 = this.f11772u.f303a;
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
                    c0031b.g(k4, c4, this.f11772u.f303a.f256a.a(), o5, jVar2, abstractC0497e2, 3);
                } else {
                    InterfaceC0324v interfaceC0324v = this.f11767A;
                    long a4 = interfaceC0324v != null ? interfaceC0324v.a() : C0323u.f4547g;
                    if (a4 == 16) {
                        a4 = this.f11772u.b() != 16 ? this.f11772u.b() : C0323u.f4542b;
                    }
                    c0031b.f(k4, a4, o5, jVar2, abstractC0497e2, 3);
                }
                if (z4) {
                    k4.b();
                }
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

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        long j5;
        boolean z4;
        t tVar;
        C1350e C02 = C0(interfaceC0947H);
        M0.k layoutDirection = interfaceC0947H.getLayoutDirection();
        if (C02.f11728g > 1) {
            C1347b c1347b = C02.f11734m;
            L l4 = C02.f11723b;
            M0.b bVar = C02.f11730i;
            Intrinsics.c(bVar);
            C1347b m4 = z.m(c1347b, layoutDirection, l4, bVar, C02.f11724c);
            C02.f11734m = m4;
            j5 = m4.a(j4, C02.f11728g);
        } else {
            j5 = j4;
        }
        C0031b c0031b = C02.f11731j;
        if (c0031b == null || (tVar = C02.f11735n) == null || tVar.b() || layoutDirection != C02.f11736o || (!M0.a.c(j5, C02.f11737p) && (M0.a.i(j5) != M0.a.i(C02.f11737p) || M0.a.h(j5) < c0031b.b() || c0031b.f313d.f903d))) {
            C0031b b4 = C02.b(j5, layoutDirection);
            C02.f11737p = j5;
            long p4 = u3.d.p(j5, u3.d.c(M.k(b4.d()), M.k(b4.b())));
            C02.f11733l = p4;
            C02.f11732k = !l.b0(C02.f11725d, 3) && (((float) ((int) (p4 >> 32))) < b4.d() || ((float) ((int) (p4 & 4294967295L))) < b4.b());
            C02.f11731j = b4;
            z4 = true;
        } else {
            if (!M0.a.c(j5, C02.f11737p)) {
                C0031b c0031b2 = C02.f11731j;
                Intrinsics.c(c0031b2);
                long p5 = u3.d.p(j5, u3.d.c(M.k(Math.min(c0031b2.f310a.f3353i.b(), c0031b2.d())), M.k(c0031b2.b())));
                C02.f11733l = p5;
                C02.f11732k = !l.b0(C02.f11725d, 3) && (((float) ((int) (p5 >> 32))) < c0031b2.d() || ((float) ((int) (p5 & 4294967295L))) < c0031b2.b());
                C02.f11737p = j5;
            }
            z4 = false;
        }
        t tVar2 = C02.f11735n;
        if (tVar2 != null) {
            tVar2.b();
        }
        Unit unit = Unit.f7487a;
        C0031b c0031b3 = C02.f11731j;
        Intrinsics.c(c0031b3);
        long j6 = C02.f11733l;
        if (z4) {
            AbstractC1065f.t(this, 2).U0();
            Map map = this.B;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            C0976l c0976l = AbstractC0967c.f9034a;
            F f4 = c0031b3.f313d;
            map.put(c0976l, Integer.valueOf(Math.round(f4.d(0))));
            map.put(AbstractC0967c.f9035b, Integer.valueOf(Math.round(f4.d(f4.f906g - 1))));
            this.B = map;
        }
        int i2 = (int) (j6 >> 32);
        int i4 = (int) (j6 & 4294967295L);
        int min = Math.min(i2, 262142);
        int min2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int l5 = u3.d.l(min2 == Integer.MAX_VALUE ? min : min2);
        AbstractC0954O a4 = interfaceC0944E.a(u3.d.a(min, min2, Math.min(l5, i4), i4 != Integer.MAX_VALUE ? Math.min(l5, i4) : Integer.MAX_VALUE));
        Map map2 = this.B;
        Intrinsics.c(map2);
        return interfaceC0947H.t(i2, i4, map2, new P0.n(a4, 11));
    }

    @Override // r0.n0
    public final void p(y0.i iVar) {
        C1355j c1355j = this.f11769D;
        if (c1355j == null) {
            c1355j = new C1355j(this, 0);
            this.f11769D = c1355j;
        }
        C0036g c0036g = new C0036g(this.f11771t, null, 6);
        S2.e[] eVarArr = s.f11639a;
        iVar.s(q.f11632u, C1440x.a(c0036g));
        C1354i c1354i = this.f11770E;
        if (c1354i != null) {
            boolean z4 = c1354i.f11763c;
            y0.t tVar = q.f11634w;
            S2.e[] eVarArr2 = s.f11639a;
            S2.e eVar = eVarArr2[15];
            tVar.a(iVar, Boolean.valueOf(z4));
            C0036g c0036g2 = new C0036g(c1354i.f11762b, null, 6);
            y0.t tVar2 = q.f11633v;
            S2.e eVar2 = eVarArr2[14];
            tVar2.a(iVar, c0036g2);
        }
        iVar.s(y0.h.f11559j, new C1317a(null, new C1355j(this, 1)));
        iVar.s(y0.h.f11560k, new C1317a(null, new C1355j(this, 2)));
        iVar.s(y0.h.f11561l, new C1317a(null, new C1093I(12, this)));
        s.c(iVar, c1355j);
    }
}
