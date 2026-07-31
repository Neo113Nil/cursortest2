package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import java.util.List;
import n2.b;
import n2.g0;
import n2.l;
import n2.p0;
import o2.m0;
import r0.a2;
import r0.p1;
import t1.e0;
import t1.i;
import t1.u;
import t1.u0;
import t1.x;
import v0.b0;
import v0.y;
import y1.c;
import y1.g;
import y1.h;
import z1.e;
import z1.g;
import z1.k;
import z1.l;

/* loaded from: classes.dex */
public final class HlsMediaSource extends t1.a implements l.e {

    /* renamed from: m, reason: collision with root package name */
    private final h f2331m;

    /* renamed from: n, reason: collision with root package name */
    private final a2.h f2332n;

    /* renamed from: o, reason: collision with root package name */
    private final g f2333o;

    /* renamed from: p, reason: collision with root package name */
    private final i f2334p;

    /* renamed from: q, reason: collision with root package name */
    private final y f2335q;

    /* renamed from: r, reason: collision with root package name */
    private final g0 f2336r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f2337s;

    /* renamed from: t, reason: collision with root package name */
    private final int f2338t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f2339u;

    /* renamed from: v, reason: collision with root package name */
    private final l f2340v;

    /* renamed from: w, reason: collision with root package name */
    private final long f2341w;

    /* renamed from: x, reason: collision with root package name */
    private final a2 f2342x;

    /* renamed from: y, reason: collision with root package name */
    private a2.g f2343y;

    /* renamed from: z, reason: collision with root package name */
    private p0 f2344z;

    public static final class Factory implements x.a {

        /* renamed from: a, reason: collision with root package name */
        private final g f2345a;

        /* renamed from: b, reason: collision with root package name */
        private h f2346b;

        /* renamed from: c, reason: collision with root package name */
        private k f2347c;

        /* renamed from: d, reason: collision with root package name */
        private l.a f2348d;

        /* renamed from: e, reason: collision with root package name */
        private i f2349e;

        /* renamed from: f, reason: collision with root package name */
        private b0 f2350f;

        /* renamed from: g, reason: collision with root package name */
        private g0 f2351g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f2352h;

        /* renamed from: i, reason: collision with root package name */
        private int f2353i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f2354j;

        /* renamed from: k, reason: collision with root package name */
        private long f2355k;

        public Factory(l.a aVar) {
            this(new c(aVar));
        }

        public Factory(g gVar) {
            this.f2345a = (g) o2.a.e(gVar);
            this.f2350f = new v0.l();
            this.f2347c = new z1.a();
            this.f2348d = z1.c.f23505u;
            this.f2346b = h.f23287a;
            this.f2351g = new n2.x();
            this.f2349e = new t1.l();
            this.f2353i = 1;
            this.f2355k = -9223372036854775807L;
            this.f2352h = true;
        }

        public HlsMediaSource a(a2 a2Var) {
            o2.a.e(a2Var.f20393g);
            k kVar = this.f2347c;
            List<s1.c> list = a2Var.f20393g.f20461e;
            if (!list.isEmpty()) {
                kVar = new e(kVar, list);
            }
            g gVar = this.f2345a;
            h hVar = this.f2346b;
            i iVar = this.f2349e;
            y a7 = this.f2350f.a(a2Var);
            g0 g0Var = this.f2351g;
            return new HlsMediaSource(a2Var, gVar, hVar, iVar, a7, g0Var, this.f2348d.a(this.f2345a, g0Var, kVar), this.f2355k, this.f2352h, this.f2353i, this.f2354j);
        }
    }

    static {
        p1.a("goog.exo.hls");
    }

    private HlsMediaSource(a2 a2Var, g gVar, h hVar, i iVar, y yVar, g0 g0Var, z1.l lVar, long j7, boolean z6, int i7, boolean z7) {
        this.f2332n = (a2.h) o2.a.e(a2Var.f20393g);
        this.f2342x = a2Var;
        this.f2343y = a2Var.f20395i;
        this.f2333o = gVar;
        this.f2331m = hVar;
        this.f2334p = iVar;
        this.f2335q = yVar;
        this.f2336r = g0Var;
        this.f2340v = lVar;
        this.f2341w = j7;
        this.f2337s = z6;
        this.f2338t = i7;
        this.f2339u = z7;
    }

    private u0 F(z1.g gVar, long j7, long j8, com.google.android.exoplayer2.source.hls.a aVar) {
        long n7 = gVar.f23541h - this.f2340v.n();
        long j9 = gVar.f23548o ? n7 + gVar.f23554u : -9223372036854775807L;
        long J = J(gVar);
        long j10 = this.f2343y.f20447f;
        M(gVar, m0.r(j10 != -9223372036854775807L ? m0.B0(j10) : L(gVar, J), J, gVar.f23554u + J));
        return new u0(j7, j8, -9223372036854775807L, j9, gVar.f23554u, n7, K(gVar, J), true, !gVar.f23548o, gVar.f23537d == 2 && gVar.f23539f, aVar, this.f2342x, this.f2343y);
    }

    private u0 G(z1.g gVar, long j7, long j8, com.google.android.exoplayer2.source.hls.a aVar) {
        long j9;
        if (gVar.f23538e == -9223372036854775807L || gVar.f23551r.isEmpty()) {
            j9 = 0;
        } else {
            if (!gVar.f23540g) {
                long j10 = gVar.f23538e;
                if (j10 != gVar.f23554u) {
                    j9 = I(gVar.f23551r, j10).f23567j;
                }
            }
            j9 = gVar.f23538e;
        }
        long j11 = gVar.f23554u;
        return new u0(j7, j8, -9223372036854775807L, j11, j11, 0L, j9, true, false, true, aVar, this.f2342x, null);
    }

    private static g.b H(List<g.b> list, long j7) {
        g.b bVar = null;
        for (int i7 = 0; i7 < list.size(); i7++) {
            g.b bVar2 = list.get(i7);
            long j8 = bVar2.f23567j;
            if (j8 > j7 || !bVar2.f23556q) {
                if (j8 > j7) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    private static g.d I(List<g.d> list, long j7) {
        return list.get(m0.f(list, Long.valueOf(j7), true, true));
    }

    private long J(z1.g gVar) {
        if (gVar.f23549p) {
            return m0.B0(m0.a0(this.f2341w)) - gVar.e();
        }
        return 0L;
    }

    private long K(z1.g gVar, long j7) {
        long j8 = gVar.f23538e;
        if (j8 == -9223372036854775807L) {
            j8 = (gVar.f23554u + j7) - m0.B0(this.f2343y.f20447f);
        }
        if (gVar.f23540g) {
            return j8;
        }
        g.b H = H(gVar.f23552s, j8);
        if (H != null) {
            return H.f23567j;
        }
        if (gVar.f23551r.isEmpty()) {
            return 0L;
        }
        g.d I = I(gVar.f23551r, j8);
        g.b H2 = H(I.f23562r, j8);
        return H2 != null ? H2.f23567j : I.f23567j;
    }

    private static long L(z1.g gVar, long j7) {
        long j8;
        g.f fVar = gVar.f23555v;
        long j9 = gVar.f23538e;
        if (j9 != -9223372036854775807L) {
            j8 = gVar.f23554u - j9;
        } else {
            long j10 = fVar.f23577d;
            if (j10 == -9223372036854775807L || gVar.f23547n == -9223372036854775807L) {
                long j11 = fVar.f23576c;
                j8 = j11 != -9223372036854775807L ? j11 : gVar.f23546m * 3;
            } else {
                j8 = j10;
            }
        }
        return j8 + j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void M(z1.g gVar, long j7) {
        boolean z6;
        a2.g gVar2 = this.f2342x.f20395i;
        if (gVar2.f20450i == -3.4028235E38f && gVar2.f20451j == -3.4028235E38f) {
            g.f fVar = gVar.f23555v;
            if (fVar.f23576c == -9223372036854775807L && fVar.f23577d == -9223372036854775807L) {
                z6 = true;
                this.f2343y = new a2.g.a().k(m0.Y0(j7)).j(!z6 ? 1.0f : this.f2343y.f20450i).h(z6 ? 1.0f : this.f2343y.f20451j).f();
            }
        }
        z6 = false;
        this.f2343y = new a2.g.a().k(m0.Y0(j7)).j(!z6 ? 1.0f : this.f2343y.f20450i).h(z6 ? 1.0f : this.f2343y.f20451j).f();
    }

    @Override // t1.a
    protected void C(p0 p0Var) {
        this.f2344z = p0Var;
        this.f2335q.W();
        this.f2335q.c((Looper) o2.a.e(Looper.myLooper()), A());
        this.f2340v.d(this.f2332n.f20457a, w(null), this);
    }

    @Override // t1.a
    protected void E() {
        this.f2340v.B();
        this.f2335q.a();
    }

    @Override // t1.x
    public a2 a() {
        return this.f2342x;
    }

    @Override // t1.x
    public void c() {
        this.f2340v.f();
    }

    @Override // t1.x
    public void e(u uVar) {
        ((y1.k) uVar).B();
    }

    @Override // z1.l.e
    public void h(z1.g gVar) {
        long Y0 = gVar.f23549p ? m0.Y0(gVar.f23541h) : -9223372036854775807L;
        int i7 = gVar.f23537d;
        long j7 = (i7 == 2 || i7 == 1) ? Y0 : -9223372036854775807L;
        com.google.android.exoplayer2.source.hls.a aVar = new com.google.android.exoplayer2.source.hls.a((z1.h) o2.a.e(this.f2340v.b()), gVar);
        D(this.f2340v.a() ? F(gVar, j7, Y0, aVar) : G(gVar, j7, Y0, aVar));
    }

    @Override // t1.x
    public u j(x.b bVar, b bVar2, long j7) {
        e0.a w6 = w(bVar);
        return new y1.k(this.f2331m, this.f2340v, this.f2333o, this.f2344z, this.f2335q, u(bVar), this.f2336r, w6, bVar2, this.f2334p, this.f2337s, this.f2338t, this.f2339u, A());
    }
}
