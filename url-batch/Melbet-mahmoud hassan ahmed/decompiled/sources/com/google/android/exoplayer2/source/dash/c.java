package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import m2.t;
import n2.c0;
import n2.g0;
import n2.i0;
import n2.l;
import n2.p0;
import o2.m0;
import r0.j3;
import r0.s1;
import s0.u1;
import v1.g;
import v1.k;
import v1.m;
import v1.n;
import v1.o;
import v1.p;
import w1.f;
import w1.h;
import x1.i;
import x1.j;

/* loaded from: classes.dex */
public class c implements com.google.android.exoplayer2.source.dash.a {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f2281a;

    /* renamed from: b, reason: collision with root package name */
    private final w1.b f2282b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f2283c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2284d;

    /* renamed from: e, reason: collision with root package name */
    private final l f2285e;

    /* renamed from: f, reason: collision with root package name */
    private final long f2286f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2287g;

    /* renamed from: h, reason: collision with root package name */
    private final e.c f2288h;

    /* renamed from: i, reason: collision with root package name */
    protected final b[] f2289i;

    /* renamed from: j, reason: collision with root package name */
    private t f2290j;

    /* renamed from: k, reason: collision with root package name */
    private x1.c f2291k;

    /* renamed from: l, reason: collision with root package name */
    private int f2292l;

    /* renamed from: m, reason: collision with root package name */
    private IOException f2293m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f2294n;

    public static final class a implements a.InterfaceC0044a {

        /* renamed from: a, reason: collision with root package name */
        private final l.a f2295a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2296b;

        /* renamed from: c, reason: collision with root package name */
        private final g.a f2297c;

        public a(l.a aVar) {
            this(aVar, 1);
        }

        public a(l.a aVar, int i7) {
            this(v1.e.f22729o, aVar, i7);
        }

        public a(g.a aVar, l.a aVar2, int i7) {
            this.f2297c = aVar;
            this.f2295a = aVar2;
            this.f2296b = i7;
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0044a
        public com.google.android.exoplayer2.source.dash.a a(i0 i0Var, x1.c cVar, w1.b bVar, int i7, int[] iArr, t tVar, int i8, long j7, boolean z6, List<s1> list, e.c cVar2, p0 p0Var, u1 u1Var) {
            l a7 = this.f2295a.a();
            if (p0Var != null) {
                a7.d(p0Var);
            }
            return new c(this.f2297c, i0Var, cVar, bVar, i7, iArr, tVar, i8, a7, j7, this.f2296b, z6, list, cVar2, u1Var);
        }
    }

    protected static final class b {

        /* renamed from: a, reason: collision with root package name */
        final g f2298a;

        /* renamed from: b, reason: collision with root package name */
        public final j f2299b;

        /* renamed from: c, reason: collision with root package name */
        public final x1.b f2300c;

        /* renamed from: d, reason: collision with root package name */
        public final f f2301d;

        /* renamed from: e, reason: collision with root package name */
        private final long f2302e;

        /* renamed from: f, reason: collision with root package name */
        private final long f2303f;

        b(long j7, j jVar, x1.b bVar, g gVar, long j8, f fVar) {
            this.f2302e = j7;
            this.f2299b = jVar;
            this.f2300c = bVar;
            this.f2303f = j8;
            this.f2298a = gVar;
            this.f2301d = fVar;
        }

        b b(long j7, j jVar) {
            long a7;
            long a8;
            f l7 = this.f2299b.l();
            f l8 = jVar.l();
            if (l7 == null) {
                return new b(j7, jVar, this.f2300c, this.f2298a, this.f2303f, l7);
            }
            if (!l7.g()) {
                return new b(j7, jVar, this.f2300c, this.f2298a, this.f2303f, l8);
            }
            long i7 = l7.i(j7);
            if (i7 == 0) {
                return new b(j7, jVar, this.f2300c, this.f2298a, this.f2303f, l8);
            }
            long h7 = l7.h();
            long c7 = l7.c(h7);
            long j8 = (i7 + h7) - 1;
            long c8 = l7.c(j8) + l7.b(j8, j7);
            long h8 = l8.h();
            long c9 = l8.c(h8);
            long j9 = this.f2303f;
            if (c8 == c9) {
                a7 = j8 + 1;
            } else {
                if (c8 < c9) {
                    throw new t1.b();
                }
                if (c9 < c7) {
                    a8 = j9 - (l8.a(c7, j7) - h7);
                    return new b(j7, jVar, this.f2300c, this.f2298a, a8, l8);
                }
                a7 = l7.a(c9, j7);
            }
            a8 = j9 + (a7 - h8);
            return new b(j7, jVar, this.f2300c, this.f2298a, a8, l8);
        }

        b c(f fVar) {
            return new b(this.f2302e, this.f2299b, this.f2300c, this.f2298a, this.f2303f, fVar);
        }

        b d(x1.b bVar) {
            return new b(this.f2302e, this.f2299b, bVar, this.f2298a, this.f2303f, this.f2301d);
        }

        public long e(long j7) {
            return this.f2301d.d(this.f2302e, j7) + this.f2303f;
        }

        public long f() {
            return this.f2301d.h() + this.f2303f;
        }

        public long g(long j7) {
            return (e(j7) + this.f2301d.j(this.f2302e, j7)) - 1;
        }

        public long h() {
            return this.f2301d.i(this.f2302e);
        }

        public long i(long j7) {
            return k(j7) + this.f2301d.b(j7 - this.f2303f, this.f2302e);
        }

        public long j(long j7) {
            return this.f2301d.a(j7, this.f2302e) + this.f2303f;
        }

        public long k(long j7) {
            return this.f2301d.c(j7 - this.f2303f);
        }

        public i l(long j7) {
            return this.f2301d.f(j7 - this.f2303f);
        }

        public boolean m(long j7, long j8) {
            return this.f2301d.g() || j8 == -9223372036854775807L || i(j7) <= j8;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c, reason: collision with other inner class name */
    protected static final class C0045c extends v1.b {

        /* renamed from: e, reason: collision with root package name */
        private final b f2304e;

        /* renamed from: f, reason: collision with root package name */
        private final long f2305f;

        public C0045c(b bVar, long j7, long j8, long j9) {
            super(j7, j8);
            this.f2304e = bVar;
            this.f2305f = j9;
        }

        @Override // v1.o
        public long a() {
            c();
            return this.f2304e.i(d());
        }

        @Override // v1.o
        public long b() {
            c();
            return this.f2304e.k(d());
        }
    }

    public c(g.a aVar, i0 i0Var, x1.c cVar, w1.b bVar, int i7, int[] iArr, t tVar, int i8, l lVar, long j7, int i9, boolean z6, List<s1> list, e.c cVar2, u1 u1Var) {
        this.f2281a = i0Var;
        this.f2291k = cVar;
        this.f2282b = bVar;
        this.f2283c = iArr;
        this.f2290j = tVar;
        this.f2284d = i8;
        this.f2285e = lVar;
        this.f2292l = i7;
        this.f2286f = j7;
        this.f2287g = i9;
        this.f2288h = cVar2;
        long g7 = cVar.g(i7);
        ArrayList<j> o7 = o();
        this.f2289i = new b[tVar.length()];
        int i10 = 0;
        while (i10 < this.f2289i.length) {
            j jVar = o7.get(tVar.b(i10));
            x1.b j8 = bVar.j(jVar.f23142c);
            b[] bVarArr = this.f2289i;
            if (j8 == null) {
                j8 = jVar.f23142c.get(0);
            }
            int i11 = i10;
            bVarArr[i11] = new b(g7, jVar, j8, aVar.a(i8, jVar.f23141b, z6, list, cVar2, u1Var), 0L, jVar.l());
            i10 = i11 + 1;
        }
    }

    private g0.a l(t tVar, List<x1.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = tVar.length();
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (tVar.i(i8, elapsedRealtime)) {
                i7++;
            }
        }
        int f7 = w1.b.f(list);
        return new g0.a(f7, f7 - this.f2282b.g(list), length, i7);
    }

    private long m(long j7, long j8) {
        if (!this.f2291k.f23094d) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(n(j7), this.f2289i[0].i(this.f2289i[0].g(j7))) - j8);
    }

    private long n(long j7) {
        x1.c cVar = this.f2291k;
        long j8 = cVar.f23091a;
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j7 - m0.B0(j8 + cVar.d(this.f2292l).f23127b);
    }

    private ArrayList<j> o() {
        List<x1.a> list = this.f2291k.d(this.f2292l).f23128c;
        ArrayList<j> arrayList = new ArrayList<>();
        for (int i7 : this.f2283c) {
            arrayList.addAll(list.get(i7).f23083c);
        }
        return arrayList;
    }

    private long p(b bVar, n nVar, long j7, long j8, long j9) {
        return nVar != null ? nVar.g() : m0.r(bVar.j(j7), j8, j9);
    }

    private b s(int i7) {
        b bVar = this.f2289i[i7];
        x1.b j7 = this.f2282b.j(bVar.f2299b.f23142c);
        if (j7 == null || j7.equals(bVar.f2300c)) {
            return bVar;
        }
        b d7 = bVar.d(j7);
        this.f2289i[i7] = d7;
        return d7;
    }

    @Override // v1.j
    public void a() {
        for (b bVar : this.f2289i) {
            g gVar = bVar.f2298a;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    @Override // v1.j
    public void b() {
        IOException iOException = this.f2293m;
        if (iOException != null) {
            throw iOException;
        }
        this.f2281a.b();
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void c(t tVar) {
        this.f2290j = tVar;
    }

    @Override // v1.j
    public void d(v1.f fVar) {
        w0.d e7;
        if (fVar instanceof m) {
            int d7 = this.f2290j.d(((m) fVar).f22750d);
            b bVar = this.f2289i[d7];
            if (bVar.f2301d == null && (e7 = bVar.f2298a.e()) != null) {
                this.f2289i[d7] = bVar.c(new h(e7, bVar.f2299b.f23143d));
            }
        }
        e.c cVar = this.f2288h;
        if (cVar != null) {
            cVar.i(fVar);
        }
    }

    @Override // v1.j
    public boolean e(long j7, v1.f fVar, List<? extends n> list) {
        if (this.f2293m != null) {
            return false;
        }
        return this.f2290j.n(j7, fVar, list);
    }

    @Override // v1.j
    public long f(long j7, j3 j3Var) {
        for (b bVar : this.f2289i) {
            if (bVar.f2301d != null) {
                long j8 = bVar.j(j7);
                long k7 = bVar.k(j8);
                long h7 = bVar.h();
                return j3Var.a(j7, k7, (k7 >= j7 || (h7 != -1 && j8 >= (bVar.f() + h7) - 1)) ? k7 : bVar.k(j8 + 1));
            }
        }
        return j7;
    }

    @Override // v1.j
    public int g(long j7, List<? extends n> list) {
        return (this.f2293m != null || this.f2290j.length() < 2) ? list.size() : this.f2290j.l(j7, list);
    }

    @Override // v1.j
    public void h(long j7, long j8, List<? extends n> list, v1.h hVar) {
        int i7;
        int i8;
        o[] oVarArr;
        long j9;
        long j10;
        if (this.f2293m != null) {
            return;
        }
        long j11 = j8 - j7;
        long B0 = m0.B0(this.f2291k.f23091a) + m0.B0(this.f2291k.d(this.f2292l).f23127b) + j8;
        e.c cVar = this.f2288h;
        if (cVar == null || !cVar.h(B0)) {
            long B02 = m0.B0(m0.a0(this.f2286f));
            long n7 = n(B02);
            n nVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.f2290j.length();
            o[] oVarArr2 = new o[length];
            int i9 = 0;
            while (i9 < length) {
                b bVar = this.f2289i[i9];
                if (bVar.f2301d == null) {
                    oVarArr2[i9] = o.f22797a;
                    i7 = i9;
                    i8 = length;
                    oVarArr = oVarArr2;
                    j9 = j11;
                    j10 = B02;
                } else {
                    long e7 = bVar.e(B02);
                    long g7 = bVar.g(B02);
                    i7 = i9;
                    i8 = length;
                    oVarArr = oVarArr2;
                    j9 = j11;
                    j10 = B02;
                    long p7 = p(bVar, nVar, j8, e7, g7);
                    if (p7 < e7) {
                        oVarArr[i7] = o.f22797a;
                    } else {
                        oVarArr[i7] = new C0045c(s(i7), p7, g7, n7);
                    }
                }
                i9 = i7 + 1;
                B02 = j10;
                oVarArr2 = oVarArr;
                length = i8;
                j11 = j9;
            }
            long j12 = j11;
            long j13 = B02;
            this.f2290j.m(j7, j12, m(j13, j7), list, oVarArr2);
            b s7 = s(this.f2290j.r());
            g gVar = s7.f2298a;
            if (gVar != null) {
                j jVar = s7.f2299b;
                i n8 = gVar.f() == null ? jVar.n() : null;
                i m7 = s7.f2301d == null ? jVar.m() : null;
                if (n8 != null || m7 != null) {
                    hVar.f22756a = q(s7, this.f2285e, this.f2290j.p(), this.f2290j.q(), this.f2290j.t(), n8, m7);
                    return;
                }
            }
            long j14 = s7.f2302e;
            boolean z6 = j14 != -9223372036854775807L;
            if (s7.h() == 0) {
                hVar.f22757b = z6;
                return;
            }
            long e8 = s7.e(j13);
            long g8 = s7.g(j13);
            long p8 = p(s7, nVar, j8, e8, g8);
            if (p8 < e8) {
                this.f2293m = new t1.b();
                return;
            }
            if (p8 > g8 || (this.f2294n && p8 >= g8)) {
                hVar.f22757b = z6;
                return;
            }
            if (z6 && s7.k(p8) >= j14) {
                hVar.f22757b = true;
                return;
            }
            int min = (int) Math.min(this.f2287g, (g8 - p8) + 1);
            if (j14 != -9223372036854775807L) {
                while (min > 1 && s7.k((min + p8) - 1) >= j14) {
                    min--;
                }
            }
            hVar.f22756a = r(s7, this.f2285e, this.f2284d, this.f2290j.p(), this.f2290j.q(), this.f2290j.t(), p8, min, list.isEmpty() ? j8 : -9223372036854775807L, n7);
        }
    }

    @Override // v1.j
    public boolean i(v1.f fVar, boolean z6, g0.c cVar, g0 g0Var) {
        g0.b b7;
        if (!z6) {
            return false;
        }
        e.c cVar2 = this.f2288h;
        if (cVar2 != null && cVar2.j(fVar)) {
            return true;
        }
        if (!this.f2291k.f23094d && (fVar instanceof n)) {
            IOException iOException = cVar.f19426c;
            if ((iOException instanceof c0) && ((c0) iOException).f19398i == 404) {
                b bVar = this.f2289i[this.f2290j.d(fVar.f22750d)];
                long h7 = bVar.h();
                if (h7 != -1 && h7 != 0) {
                    if (((n) fVar).g() > (bVar.f() + h7) - 1) {
                        this.f2294n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f2289i[this.f2290j.d(fVar.f22750d)];
        x1.b j7 = this.f2282b.j(bVar2.f2299b.f23142c);
        if (j7 != null && !bVar2.f2300c.equals(j7)) {
            return true;
        }
        g0.a l7 = l(this.f2290j, bVar2.f2299b.f23142c);
        if ((!l7.a(2) && !l7.a(1)) || (b7 = g0Var.b(l7, cVar)) == null || !l7.a(b7.f19422a)) {
            return false;
        }
        int i7 = b7.f19422a;
        if (i7 == 2) {
            t tVar = this.f2290j;
            return tVar.h(tVar.d(fVar.f22750d), b7.f19423b);
        }
        if (i7 != 1) {
            return false;
        }
        this.f2282b.e(bVar2.f2300c, b7.f19423b);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void k(x1.c cVar, int i7) {
        try {
            this.f2291k = cVar;
            this.f2292l = i7;
            long g7 = cVar.g(i7);
            ArrayList<j> o7 = o();
            for (int i8 = 0; i8 < this.f2289i.length; i8++) {
                j jVar = o7.get(this.f2290j.b(i8));
                b[] bVarArr = this.f2289i;
                bVarArr[i8] = bVarArr[i8].b(g7, jVar);
            }
        } catch (t1.b e7) {
            this.f2293m = e7;
        }
    }

    protected v1.f q(b bVar, l lVar, s1 s1Var, int i7, Object obj, i iVar, i iVar2) {
        i iVar3 = iVar;
        j jVar = bVar.f2299b;
        if (iVar3 != null) {
            i a7 = iVar3.a(iVar2, bVar.f2300c.f23087a);
            if (a7 != null) {
                iVar3 = a7;
            }
        } else {
            iVar3 = iVar2;
        }
        return new m(lVar, w1.g.a(jVar, bVar.f2300c.f23087a, iVar3, 0), s1Var, i7, obj, bVar.f2298a);
    }

    protected v1.f r(b bVar, l lVar, int i7, s1 s1Var, int i8, Object obj, long j7, int i9, long j8, long j9) {
        j jVar = bVar.f2299b;
        long k7 = bVar.k(j7);
        i l7 = bVar.l(j7);
        if (bVar.f2298a == null) {
            return new p(lVar, w1.g.a(jVar, bVar.f2300c.f23087a, l7, bVar.m(j7, j9) ? 0 : 8), s1Var, i8, obj, k7, bVar.i(j7), j7, i7, s1Var);
        }
        int i10 = 1;
        int i11 = 1;
        while (i10 < i9) {
            i a7 = l7.a(bVar.l(i10 + j7), bVar.f2300c.f23087a);
            if (a7 == null) {
                break;
            }
            i11++;
            i10++;
            l7 = a7;
        }
        long j10 = (i11 + j7) - 1;
        long i12 = bVar.i(j10);
        long j11 = bVar.f2302e;
        return new k(lVar, w1.g.a(jVar, bVar.f2300c.f23087a, l7, bVar.m(j10, j9) ? 0 : 8), s1Var, i8, obj, k7, i12, j8, (j11 == -9223372036854775807L || j11 > i12) ? -9223372036854775807L : j11, j7, i11, -jVar.f23143d, bVar.f2298a);
    }
}
