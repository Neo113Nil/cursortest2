package y1;

import android.net.Uri;
import j1.a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import n2.p;
import o2.a0;
import o2.i0;
import o2.k0;
import r0.s1;
import s0.u1;
import y1.f;
import z1.g;

/* loaded from: classes.dex */
final class i extends v1.n {
    private static final AtomicInteger M = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private final u1 C;
    private j D;
    private p E;
    private int F;
    private boolean G;
    private volatile boolean H;
    private boolean I;
    private m4.q<Integer> J;
    private boolean K;
    private boolean L;

    /* renamed from: k, reason: collision with root package name */
    public final int f23288k;

    /* renamed from: l, reason: collision with root package name */
    public final int f23289l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f23290m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f23291n;

    /* renamed from: o, reason: collision with root package name */
    public final int f23292o;

    /* renamed from: p, reason: collision with root package name */
    private final n2.l f23293p;

    /* renamed from: q, reason: collision with root package name */
    private final n2.p f23294q;

    /* renamed from: r, reason: collision with root package name */
    private final j f23295r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f23296s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f23297t;

    /* renamed from: u, reason: collision with root package name */
    private final i0 f23298u;

    /* renamed from: v, reason: collision with root package name */
    private final h f23299v;

    /* renamed from: w, reason: collision with root package name */
    private final List<s1> f23300w;

    /* renamed from: x, reason: collision with root package name */
    private final v0.m f23301x;

    /* renamed from: y, reason: collision with root package name */
    private final o1.h f23302y;

    /* renamed from: z, reason: collision with root package name */
    private final a0 f23303z;

    private i(h hVar, n2.l lVar, n2.p pVar, s1 s1Var, boolean z6, n2.l lVar2, n2.p pVar2, boolean z7, Uri uri, List<s1> list, int i7, Object obj, long j7, long j8, long j9, int i8, boolean z8, int i9, boolean z9, boolean z10, i0 i0Var, v0.m mVar, j jVar, o1.h hVar2, a0 a0Var, boolean z11, u1 u1Var) {
        super(lVar, pVar, s1Var, i7, obj, j7, j8, j9);
        this.A = z6;
        this.f23292o = i8;
        this.L = z8;
        this.f23289l = i9;
        this.f23294q = pVar2;
        this.f23293p = lVar2;
        this.G = pVar2 != null;
        this.B = z7;
        this.f23290m = uri;
        this.f23296s = z10;
        this.f23298u = i0Var;
        this.f23297t = z9;
        this.f23299v = hVar;
        this.f23300w = list;
        this.f23301x = mVar;
        this.f23295r = jVar;
        this.f23302y = hVar2;
        this.f23303z = a0Var;
        this.f23291n = z11;
        this.C = u1Var;
        this.J = m4.q.x();
        this.f23288k = M.getAndIncrement();
    }

    private static n2.l i(n2.l lVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return lVar;
        }
        o2.a.e(bArr2);
        return new a(lVar, bArr, bArr2);
    }

    public static i j(h hVar, n2.l lVar, s1 s1Var, long j7, z1.g gVar, f.e eVar, Uri uri, List<s1> list, int i7, Object obj, boolean z6, s sVar, i iVar, byte[] bArr, byte[] bArr2, boolean z7, u1 u1Var) {
        boolean z8;
        n2.l lVar2;
        n2.p pVar;
        boolean z9;
        o1.h hVar2;
        a0 a0Var;
        j jVar;
        g.e eVar2 = eVar.f23283a;
        n2.p a7 = new p.b().i(k0.e(gVar.f23600a, eVar2.f23563f)).h(eVar2.f23571n).g(eVar2.f23572o).b(eVar.f23286d ? 8 : 0).a();
        boolean z10 = bArr != null;
        n2.l i8 = i(lVar, bArr, z10 ? l((String) o2.a.e(eVar2.f23570m)) : null);
        g.d dVar = eVar2.f23564g;
        if (dVar != null) {
            boolean z11 = bArr2 != null;
            byte[] l7 = z11 ? l((String) o2.a.e(dVar.f23570m)) : null;
            z8 = z10;
            pVar = new n2.p(k0.e(gVar.f23600a, dVar.f23563f), dVar.f23571n, dVar.f23572o);
            lVar2 = i(lVar, bArr2, l7);
            z9 = z11;
        } else {
            z8 = z10;
            lVar2 = null;
            pVar = null;
            z9 = false;
        }
        long j8 = j7 + eVar2.f23567j;
        long j9 = j8 + eVar2.f23565h;
        int i9 = gVar.f23543j + eVar2.f23566i;
        if (iVar != null) {
            n2.p pVar2 = iVar.f23294q;
            boolean z12 = pVar == pVar2 || (pVar != null && pVar2 != null && pVar.f19496a.equals(pVar2.f19496a) && pVar.f19502g == iVar.f23294q.f19502g);
            boolean z13 = uri.equals(iVar.f23290m) && iVar.I;
            hVar2 = iVar.f23302y;
            a0Var = iVar.f23303z;
            jVar = (z12 && z13 && !iVar.K && iVar.f23289l == i9) ? iVar.D : null;
        } else {
            hVar2 = new o1.h();
            a0Var = new a0(10);
            jVar = null;
        }
        return new i(hVar, i8, a7, s1Var, z8, lVar2, pVar, z9, uri, list, i7, obj, j8, j9, eVar.f23284b, eVar.f23285c, !eVar.f23286d, i9, eVar2.f23573p, z6, sVar.a(i9), eVar2.f23568k, jVar, hVar2, a0Var, z7, u1Var);
    }

    private void k(n2.l lVar, n2.p pVar, boolean z6, boolean z7) {
        n2.p e7;
        long p7;
        long j7;
        if (z6) {
            r0 = this.F != 0;
            e7 = pVar;
        } else {
            e7 = pVar.e(this.F);
        }
        try {
            w0.f u6 = u(lVar, e7, z7);
            if (r0) {
                u6.i(this.F);
            }
            do {
                try {
                    try {
                        if (this.H) {
                            break;
                        }
                    } catch (EOFException e8) {
                        if ((this.f22750d.f20949j & 16384) == 0) {
                            throw e8;
                        }
                        this.D.c();
                        p7 = u6.p();
                        j7 = pVar.f19502g;
                    }
                } catch (Throwable th) {
                    this.F = (int) (u6.p() - pVar.f19502g);
                    throw th;
                }
            } while (this.D.b(u6));
            p7 = u6.p();
            j7 = pVar.f19502g;
            this.F = (int) (p7 - j7);
        } finally {
            n2.o.a(lVar);
        }
    }

    private static byte[] l(String str) {
        if (l4.b.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean p(f.e eVar, z1.g gVar) {
        g.e eVar2 = eVar.f23283a;
        return eVar2 instanceof g.b ? ((g.b) eVar2).f23556q || (eVar.f23285c == 0 && gVar.f23602c) : gVar.f23602c;
    }

    private void r() {
        k(this.f22755i, this.f22748b, this.A, true);
    }

    private void s() {
        if (this.G) {
            o2.a.e(this.f23293p);
            o2.a.e(this.f23294q);
            k(this.f23293p, this.f23294q, this.B, false);
            this.F = 0;
            this.G = false;
        }
    }

    private long t(w0.m mVar) {
        mVar.h();
        try {
            this.f23303z.K(10);
            mVar.n(this.f23303z.d(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f23303z.F() != 4801587) {
            return -9223372036854775807L;
        }
        this.f23303z.P(3);
        int B = this.f23303z.B();
        int i7 = B + 10;
        if (i7 > this.f23303z.b()) {
            byte[] d7 = this.f23303z.d();
            this.f23303z.K(i7);
            System.arraycopy(d7, 0, this.f23303z.d(), 0, 10);
        }
        mVar.n(this.f23303z.d(), 10, B);
        j1.a e7 = this.f23302y.e(this.f23303z.d(), B);
        if (e7 == null) {
            return -9223372036854775807L;
        }
        int h7 = e7.h();
        for (int i8 = 0; i8 < h7; i8++) {
            a.b g7 = e7.g(i8);
            if (g7 instanceof o1.l) {
                o1.l lVar = (o1.l) g7;
                if ("com.apple.streaming.transportStreamTimestamp".equals(lVar.f19682g)) {
                    System.arraycopy(lVar.f19683h, 0, this.f23303z.d(), 0, 8);
                    this.f23303z.O(0);
                    this.f23303z.N(8);
                    return this.f23303z.v() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private w0.f u(n2.l lVar, n2.p pVar, boolean z6) {
        p pVar2;
        long j7;
        long b7 = lVar.b(pVar);
        if (z6) {
            try {
                this.f23298u.h(this.f23296s, this.f22753g);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        w0.f fVar = new w0.f(lVar, pVar.f19502g, b7);
        if (this.D == null) {
            long t6 = t(fVar);
            fVar.h();
            j jVar = this.f23295r;
            j f7 = jVar != null ? jVar.f() : this.f23299v.a(pVar.f19496a, this.f22750d, this.f23300w, this.f23298u, lVar.g(), fVar, this.C);
            this.D = f7;
            if (f7.a()) {
                pVar2 = this.E;
                j7 = t6 != -9223372036854775807L ? this.f23298u.b(t6) : this.f22753g;
            } else {
                pVar2 = this.E;
                j7 = 0;
            }
            pVar2.n0(j7);
            this.E.Z();
            this.D.d(this.E);
        }
        this.E.k0(this.f23301x);
        return fVar;
    }

    public static boolean w(i iVar, Uri uri, z1.g gVar, f.e eVar, long j7) {
        if (iVar == null) {
            return false;
        }
        if (uri.equals(iVar.f23290m) && iVar.I) {
            return false;
        }
        return !p(eVar, gVar) || j7 + eVar.f23283a.f23567j < iVar.f22754h;
    }

    @Override // n2.h0.e
    public void a() {
        j jVar;
        o2.a.e(this.E);
        if (this.D == null && (jVar = this.f23295r) != null && jVar.e()) {
            this.D = this.f23295r;
            this.G = false;
        }
        s();
        if (this.H) {
            return;
        }
        if (!this.f23297t) {
            r();
        }
        this.I = !this.H;
    }

    @Override // n2.h0.e
    public void c() {
        this.H = true;
    }

    @Override // v1.n
    public boolean h() {
        return this.I;
    }

    public int m(int i7) {
        o2.a.f(!this.f23291n);
        if (i7 >= this.J.size()) {
            return 0;
        }
        return this.J.get(i7).intValue();
    }

    public void n(p pVar, m4.q<Integer> qVar) {
        this.E = pVar;
        this.J = qVar;
    }

    public void o() {
        this.K = true;
    }

    public boolean q() {
        return this.L;
    }

    public void v() {
        this.L = true;
    }
}
