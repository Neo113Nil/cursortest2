package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n2.g0;
import n2.h0;
import n2.i0;
import n2.j0;
import n2.l;
import n2.p0;
import o2.d0;
import o2.m0;
import o2.r;
import r0.a2;
import r0.n2;
import r0.p1;
import r0.r3;
import t1.e0;
import t1.i;
import t1.q;
import t1.t;
import t1.u;
import t1.x;
import v0.b0;
import v0.y;
import x1.j;
import x1.o;

/* loaded from: classes.dex */
public final class DashMediaSource extends t1.a {
    private final Runnable A;
    private final Runnable B;
    private final e.b C;
    private final i0 D;
    private l E;
    private h0 F;
    private p0 G;
    private IOException H;
    private Handler I;
    private a2.g J;
    private Uri K;
    private Uri L;
    private x1.c M;
    private boolean N;
    private long O;
    private long P;
    private long Q;
    private int R;
    private long S;
    private int T;

    /* renamed from: m, reason: collision with root package name */
    private final a2 f2216m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f2217n;

    /* renamed from: o, reason: collision with root package name */
    private final l.a f2218o;

    /* renamed from: p, reason: collision with root package name */
    private final a.InterfaceC0044a f2219p;

    /* renamed from: q, reason: collision with root package name */
    private final i f2220q;

    /* renamed from: r, reason: collision with root package name */
    private final y f2221r;

    /* renamed from: s, reason: collision with root package name */
    private final g0 f2222s;

    /* renamed from: t, reason: collision with root package name */
    private final w1.b f2223t;

    /* renamed from: u, reason: collision with root package name */
    private final long f2224u;

    /* renamed from: v, reason: collision with root package name */
    private final e0.a f2225v;

    /* renamed from: w, reason: collision with root package name */
    private final j0.a<? extends x1.c> f2226w;

    /* renamed from: x, reason: collision with root package name */
    private final e f2227x;

    /* renamed from: y, reason: collision with root package name */
    private final Object f2228y;

    /* renamed from: z, reason: collision with root package name */
    private final SparseArray<com.google.android.exoplayer2.source.dash.b> f2229z;

    public static final class Factory implements x.a {

        /* renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0044a f2230a;

        /* renamed from: b, reason: collision with root package name */
        private final l.a f2231b;

        /* renamed from: c, reason: collision with root package name */
        private b0 f2232c;

        /* renamed from: d, reason: collision with root package name */
        private i f2233d;

        /* renamed from: e, reason: collision with root package name */
        private g0 f2234e;

        /* renamed from: f, reason: collision with root package name */
        private long f2235f;

        /* renamed from: g, reason: collision with root package name */
        private j0.a<? extends x1.c> f2236g;

        public Factory(a.InterfaceC0044a interfaceC0044a, l.a aVar) {
            this.f2230a = (a.InterfaceC0044a) o2.a.e(interfaceC0044a);
            this.f2231b = aVar;
            this.f2232c = new v0.l();
            this.f2234e = new n2.x();
            this.f2235f = 30000L;
            this.f2233d = new t1.l();
        }

        public Factory(l.a aVar) {
            this(new c.a(aVar), aVar);
        }

        public DashMediaSource a(a2 a2Var) {
            o2.a.e(a2Var.f20393g);
            j0.a aVar = this.f2236g;
            if (aVar == null) {
                aVar = new x1.d();
            }
            List<s1.c> list = a2Var.f20393g.f20461e;
            return new DashMediaSource(a2Var, null, this.f2231b, !list.isEmpty() ? new s1.b(aVar, list) : aVar, this.f2230a, this.f2233d, this.f2232c.a(a2Var), this.f2234e, this.f2235f, null);
        }
    }

    class a implements d0.b {
        a() {
        }

        @Override // o2.d0.b
        public void a() {
            DashMediaSource.this.b0(d0.h());
        }

        @Override // o2.d0.b
        public void b(IOException iOException) {
            DashMediaSource.this.a0(iOException);
        }
    }

    private static final class b extends r3 {

        /* renamed from: h, reason: collision with root package name */
        private final long f2238h;

        /* renamed from: i, reason: collision with root package name */
        private final long f2239i;

        /* renamed from: j, reason: collision with root package name */
        private final long f2240j;

        /* renamed from: k, reason: collision with root package name */
        private final int f2241k;

        /* renamed from: l, reason: collision with root package name */
        private final long f2242l;

        /* renamed from: m, reason: collision with root package name */
        private final long f2243m;

        /* renamed from: n, reason: collision with root package name */
        private final long f2244n;

        /* renamed from: o, reason: collision with root package name */
        private final x1.c f2245o;

        /* renamed from: p, reason: collision with root package name */
        private final a2 f2246p;

        /* renamed from: q, reason: collision with root package name */
        private final a2.g f2247q;

        public b(long j7, long j8, long j9, int i7, long j10, long j11, long j12, x1.c cVar, a2 a2Var, a2.g gVar) {
            o2.a.f(cVar.f23094d == (gVar != null));
            this.f2238h = j7;
            this.f2239i = j8;
            this.f2240j = j9;
            this.f2241k = i7;
            this.f2242l = j10;
            this.f2243m = j11;
            this.f2244n = j12;
            this.f2245o = cVar;
            this.f2246p = a2Var;
            this.f2247q = gVar;
        }

        private long x(long j7) {
            w1.f l7;
            long j8 = this.f2244n;
            if (!y(this.f2245o)) {
                return j8;
            }
            if (j7 > 0) {
                j8 += j7;
                if (j8 > this.f2243m) {
                    return -9223372036854775807L;
                }
            }
            long j9 = this.f2242l + j8;
            long g7 = this.f2245o.g(0);
            int i7 = 0;
            while (i7 < this.f2245o.e() - 1 && j9 >= g7) {
                j9 -= g7;
                i7++;
                g7 = this.f2245o.g(i7);
            }
            x1.g d7 = this.f2245o.d(i7);
            int a7 = d7.a(2);
            return (a7 == -1 || (l7 = d7.f23128c.get(a7).f23083c.get(0).l()) == null || l7.i(g7) == 0) ? j8 : (j8 + l7.c(l7.a(j9, g7))) - j9;
        }

        private static boolean y(x1.c cVar) {
            return cVar.f23094d && cVar.f23095e != -9223372036854775807L && cVar.f23092b == -9223372036854775807L;
        }

        @Override // r0.r3
        public int f(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f2241k) >= 0 && intValue < m()) {
                return intValue;
            }
            return -1;
        }

        @Override // r0.r3
        public r3.b k(int i7, r3.b bVar, boolean z6) {
            o2.a.c(i7, 0, m());
            return bVar.v(z6 ? this.f2245o.d(i7).f23126a : null, z6 ? Integer.valueOf(this.f2241k + i7) : null, 0, this.f2245o.g(i7), m0.B0(this.f2245o.d(i7).f23127b - this.f2245o.d(0).f23127b) - this.f2242l);
        }

        @Override // r0.r3
        public int m() {
            return this.f2245o.e();
        }

        @Override // r0.r3
        public Object q(int i7) {
            o2.a.c(i7, 0, m());
            return Integer.valueOf(this.f2241k + i7);
        }

        @Override // r0.r3
        public r3.d s(int i7, r3.d dVar, long j7) {
            o2.a.c(i7, 0, 1);
            long x6 = x(j7);
            Object obj = r3.d.f20923w;
            a2 a2Var = this.f2246p;
            x1.c cVar = this.f2245o;
            return dVar.j(obj, a2Var, cVar, this.f2238h, this.f2239i, this.f2240j, true, y(cVar), this.f2247q, x6, this.f2243m, 0, m() - 1, this.f2242l);
        }

        @Override // r0.r3
        public int t() {
            return 1;
        }
    }

    private final class c implements e.b {
        private c() {
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void a() {
            DashMediaSource.this.U();
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void b(long j7) {
            DashMediaSource.this.T(j7);
        }
    }

    static final class d implements j0.a<Long> {

        /* renamed from: a, reason: collision with root package name */
        private static final Pattern f2249a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // n2.j0.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, l4.d.f18614c)).readLine();
            try {
                Matcher matcher = f2249a.matcher(readLine);
                if (!matcher.matches()) {
                    throw n2.c("Couldn't parse timestamp: " + readLine, null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j7 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j7 * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e7) {
                throw n2.c(null, e7);
            }
        }
    }

    private final class e implements h0.b<j0<x1.c>> {
        private e() {
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // n2.h0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void m(j0<x1.c> j0Var, long j7, long j8, boolean z6) {
            DashMediaSource.this.V(j0Var, j7, j8);
        }

        @Override // n2.h0.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void l(j0<x1.c> j0Var, long j7, long j8) {
            DashMediaSource.this.W(j0Var, j7, j8);
        }

        @Override // n2.h0.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public h0.c o(j0<x1.c> j0Var, long j7, long j8, IOException iOException, int i7) {
            return DashMediaSource.this.X(j0Var, j7, j8, iOException, i7);
        }
    }

    final class f implements i0 {
        f() {
        }

        private void a() {
            if (DashMediaSource.this.H != null) {
                throw DashMediaSource.this.H;
            }
        }

        @Override // n2.i0
        public void b() {
            DashMediaSource.this.F.b();
            a();
        }
    }

    private final class g implements h0.b<j0<Long>> {
        private g() {
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // n2.h0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void m(j0<Long> j0Var, long j7, long j8, boolean z6) {
            DashMediaSource.this.V(j0Var, j7, j8);
        }

        @Override // n2.h0.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void l(j0<Long> j0Var, long j7, long j8) {
            DashMediaSource.this.Y(j0Var, j7, j8);
        }

        @Override // n2.h0.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public h0.c o(j0<Long> j0Var, long j7, long j8, IOException iOException, int i7) {
            return DashMediaSource.this.Z(j0Var, j7, j8, iOException);
        }
    }

    private static final class h implements j0.a<Long> {
        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // n2.j0.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(m0.I0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        p1.a("goog.exo.dash");
    }

    private DashMediaSource(a2 a2Var, x1.c cVar, l.a aVar, j0.a<? extends x1.c> aVar2, a.InterfaceC0044a interfaceC0044a, i iVar, y yVar, g0 g0Var, long j7) {
        this.f2216m = a2Var;
        this.J = a2Var.f20395i;
        this.K = ((a2.h) o2.a.e(a2Var.f20393g)).f20457a;
        this.L = a2Var.f20393g.f20457a;
        this.M = cVar;
        this.f2218o = aVar;
        this.f2226w = aVar2;
        this.f2219p = interfaceC0044a;
        this.f2221r = yVar;
        this.f2222s = g0Var;
        this.f2224u = j7;
        this.f2220q = iVar;
        this.f2223t = new w1.b();
        boolean z6 = cVar != null;
        this.f2217n = z6;
        a aVar3 = null;
        this.f2225v = w(null);
        this.f2228y = new Object();
        this.f2229z = new SparseArray<>();
        this.C = new c(this, aVar3);
        this.S = -9223372036854775807L;
        this.Q = -9223372036854775807L;
        if (!z6) {
            this.f2227x = new e(this, aVar3);
            this.D = new f();
            this.A = new Runnable() { // from class: w1.d
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.i0();
                }
            };
            this.B = new Runnable() { // from class: w1.e
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.R();
                }
            };
            return;
        }
        o2.a.f(true ^ cVar.f23094d);
        this.f2227x = null;
        this.A = null;
        this.B = null;
        this.D = new i0.a();
    }

    /* synthetic */ DashMediaSource(a2 a2Var, x1.c cVar, l.a aVar, j0.a aVar2, a.InterfaceC0044a interfaceC0044a, i iVar, y yVar, g0 g0Var, long j7, a aVar3) {
        this(a2Var, cVar, aVar, aVar2, interfaceC0044a, iVar, yVar, g0Var, j7);
    }

    private static long L(x1.g gVar, long j7, long j8) {
        long B0 = m0.B0(gVar.f23127b);
        boolean P = P(gVar);
        long j9 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < gVar.f23128c.size(); i7++) {
            x1.a aVar = gVar.f23128c.get(i7);
            List<j> list = aVar.f23083c;
            if ((!P || aVar.f23082b != 3) && !list.isEmpty()) {
                w1.f l7 = list.get(0).l();
                if (l7 == null) {
                    return B0 + j7;
                }
                long j10 = l7.j(j7, j8);
                if (j10 == 0) {
                    return B0;
                }
                long d7 = (l7.d(j7, j8) + j10) - 1;
                j9 = Math.min(j9, l7.b(d7, j7) + l7.c(d7) + B0);
            }
        }
        return j9;
    }

    private static long M(x1.g gVar, long j7, long j8) {
        long B0 = m0.B0(gVar.f23127b);
        boolean P = P(gVar);
        long j9 = B0;
        for (int i7 = 0; i7 < gVar.f23128c.size(); i7++) {
            x1.a aVar = gVar.f23128c.get(i7);
            List<j> list = aVar.f23083c;
            if ((!P || aVar.f23082b != 3) && !list.isEmpty()) {
                w1.f l7 = list.get(0).l();
                if (l7 == null || l7.j(j7, j8) == 0) {
                    return B0;
                }
                j9 = Math.max(j9, l7.c(l7.d(j7, j8)) + B0);
            }
        }
        return j9;
    }

    private static long N(x1.c cVar, long j7) {
        w1.f l7;
        int e7 = cVar.e() - 1;
        x1.g d7 = cVar.d(e7);
        long B0 = m0.B0(d7.f23127b);
        long g7 = cVar.g(e7);
        long B02 = m0.B0(j7);
        long B03 = m0.B0(cVar.f23091a);
        long B04 = m0.B0(5000L);
        for (int i7 = 0; i7 < d7.f23128c.size(); i7++) {
            List<j> list = d7.f23128c.get(i7).f23083c;
            if (!list.isEmpty() && (l7 = list.get(0).l()) != null) {
                long e8 = ((B03 + B0) + l7.e(g7, B02)) - B02;
                if (e8 < B04 - 100000 || (e8 > B04 && e8 < B04 + 100000)) {
                    B04 = e8;
                }
            }
        }
        return n4.b.a(B04, 1000L, RoundingMode.CEILING);
    }

    private long O() {
        return Math.min((this.R - 1) * 1000, 5000);
    }

    private static boolean P(x1.g gVar) {
        for (int i7 = 0; i7 < gVar.f23128c.size(); i7++) {
            int i8 = gVar.f23128c.get(i7).f23082b;
            if (i8 == 1 || i8 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean Q(x1.g gVar) {
        for (int i7 = 0; i7 < gVar.f23128c.size(); i7++) {
            w1.f l7 = gVar.f23128c.get(i7).f23083c.get(0).l();
            if (l7 == null || l7.g()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        c0(false);
    }

    private void S() {
        d0.j(this.F, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(IOException iOException) {
        r.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        c0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(long j7) {
        this.Q = j7;
        c0(true);
    }

    private void c0(boolean z6) {
        long j7;
        x1.g gVar;
        long j8;
        for (int i7 = 0; i7 < this.f2229z.size(); i7++) {
            int keyAt = this.f2229z.keyAt(i7);
            if (keyAt >= this.T) {
                this.f2229z.valueAt(i7).M(this.M, keyAt - this.T);
            }
        }
        x1.g d7 = this.M.d(0);
        int e7 = this.M.e() - 1;
        x1.g d8 = this.M.d(e7);
        long g7 = this.M.g(e7);
        long B0 = m0.B0(m0.a0(this.Q));
        long M = M(d7, this.M.g(0), B0);
        long L = L(d8, g7, B0);
        boolean z7 = this.M.f23094d && !Q(d8);
        if (z7) {
            long j9 = this.M.f23096f;
            if (j9 != -9223372036854775807L) {
                M = Math.max(M, L - m0.B0(j9));
            }
        }
        long j10 = L - M;
        x1.c cVar = this.M;
        if (cVar.f23094d) {
            o2.a.f(cVar.f23091a != -9223372036854775807L);
            long B02 = (B0 - m0.B0(this.M.f23091a)) - M;
            j0(B02, j10);
            long Y0 = this.M.f23091a + m0.Y0(M);
            long B03 = B02 - m0.B0(this.J.f20447f);
            long min = Math.min(5000000L, j10 / 2);
            if (B03 < min) {
                j8 = min;
                j7 = Y0;
            } else {
                j7 = Y0;
                j8 = B03;
            }
            gVar = d7;
        } else {
            j7 = -9223372036854775807L;
            gVar = d7;
            j8 = 0;
        }
        long B04 = M - m0.B0(gVar.f23127b);
        x1.c cVar2 = this.M;
        D(new b(cVar2.f23091a, j7, this.Q, this.T, B04, j10, j8, cVar2, this.f2216m, cVar2.f23094d ? this.J : null));
        if (this.f2217n) {
            return;
        }
        this.I.removeCallbacks(this.B);
        if (z7) {
            this.I.postDelayed(this.B, N(this.M, m0.a0(this.Q)));
        }
        if (this.N) {
            i0();
            return;
        }
        if (z6) {
            x1.c cVar3 = this.M;
            if (cVar3.f23094d) {
                long j11 = cVar3.f23095e;
                if (j11 != -9223372036854775807L) {
                    if (j11 == 0) {
                        j11 = 5000;
                    }
                    g0(Math.max(0L, (this.O + j11) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void d0(o oVar) {
        j0.a<Long> dVar;
        String str = oVar.f23181a;
        if (m0.c(str, "urn:mpeg:dash:utc:direct:2014") || m0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            e0(oVar);
            return;
        }
        if (m0.c(str, "urn:mpeg:dash:utc:http-iso:2014") || m0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            dVar = new d();
        } else {
            if (!m0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !m0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                if (m0.c(str, "urn:mpeg:dash:utc:ntp:2014") || m0.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
                    S();
                    return;
                } else {
                    a0(new IOException("Unsupported UTC timing scheme"));
                    return;
                }
            }
            dVar = new h(null);
        }
        f0(oVar, dVar);
    }

    private void e0(o oVar) {
        try {
            b0(m0.I0(oVar.f23182b) - this.P);
        } catch (n2 e7) {
            a0(e7);
        }
    }

    private void f0(o oVar, j0.a<Long> aVar) {
        h0(new j0(this.E, Uri.parse(oVar.f23182b), 5, aVar), new g(this, null), 1);
    }

    private void g0(long j7) {
        this.I.postDelayed(this.A, j7);
    }

    private <T> void h0(j0<T> j0Var, h0.b<j0<T>> bVar, int i7) {
        this.f2225v.z(new q(j0Var.f19458a, j0Var.f19459b, this.F.n(j0Var, bVar, i7)), j0Var.f19460c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        Uri uri;
        this.I.removeCallbacks(this.A);
        if (this.F.i()) {
            return;
        }
        if (this.F.j()) {
            this.N = true;
            return;
        }
        synchronized (this.f2228y) {
            uri = this.K;
        }
        this.N = false;
        h0(new j0(this.E, uri, 4, this.f2226w), this.f2227x, this.f2222s.d(4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0061, code lost:
    
        if (r1 != (-9223372036854775807L)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0025, code lost:
    
        if (r1 != (-9223372036854775807L)) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void j0(long j7, long j8) {
        long j9;
        long Y0;
        long j10;
        long j11;
        long j12;
        long j13;
        float f7;
        float f8;
        x1.l lVar;
        long Y02 = m0.Y0(j7);
        long j14 = this.f2216m.f20395i.f20449h;
        if (j14 == -9223372036854775807L) {
            x1.l lVar2 = this.M.f23100j;
            if (lVar2 != null) {
                j14 = lVar2.f23173c;
            }
            j9 = Y02;
            Y0 = m0.Y0(j7 - j8);
            if (Y0 < 0 && j9 > 0) {
                Y0 = 0;
            }
            j10 = this.M.f23093c;
            if (j10 != -9223372036854775807L) {
                Y0 = Math.min(Y0 + j10, Y02);
            }
            j11 = Y0;
            j12 = this.f2216m.f20395i.f20448g;
            if (j12 == -9223372036854775807L) {
                x1.l lVar3 = this.M.f23100j;
                if (lVar3 != null) {
                    j12 = lVar3.f23172b;
                }
                if (j11 > j9) {
                    j9 = j11;
                }
                j13 = this.J.f20447f;
                if (j13 == -9223372036854775807L) {
                    x1.c cVar = this.M;
                    x1.l lVar4 = cVar.f23100j;
                    if (lVar4 != null) {
                        long j15 = lVar4.f23171a;
                        if (j15 != -9223372036854775807L) {
                            j13 = j15;
                        }
                    }
                    j13 = cVar.f23097g;
                    if (j13 == -9223372036854775807L) {
                        j13 = this.f2224u;
                    }
                }
                if (j13 < j11) {
                    j13 = j11;
                }
                if (j13 > j9) {
                    j13 = m0.r(m0.Y0(j7 - Math.min(5000000L, j8 / 2)), j11, j9);
                }
                a2.g gVar = this.f2216m.f20395i;
                f7 = gVar.f20450i;
                if (f7 == -3.4028235E38f) {
                    x1.l lVar5 = this.M.f23100j;
                    f7 = lVar5 != null ? lVar5.f23174d : -3.4028235E38f;
                }
                f8 = gVar.f20451j;
                if (f8 == -3.4028235E38f) {
                    x1.l lVar6 = this.M.f23100j;
                    f8 = lVar6 != null ? lVar6.f23175e : -3.4028235E38f;
                }
                if (f7 == -3.4028235E38f && f8 == -3.4028235E38f && ((lVar = this.M.f23100j) == null || lVar.f23171a == -9223372036854775807L)) {
                    f8 = 1.0f;
                    f7 = 1.0f;
                }
                this.J = new a2.g.a().k(j13).i(j11).g(j9).j(f7).h(f8).f();
            }
            j11 = m0.r(j12, j11, Y02);
            if (j11 > j9) {
            }
            j13 = this.J.f20447f;
            if (j13 == -9223372036854775807L) {
            }
            if (j13 < j11) {
            }
            if (j13 > j9) {
            }
            a2.g gVar2 = this.f2216m.f20395i;
            f7 = gVar2.f20450i;
            if (f7 == -3.4028235E38f) {
            }
            f8 = gVar2.f20451j;
            if (f8 == -3.4028235E38f) {
            }
            if (f7 == -3.4028235E38f) {
                f8 = 1.0f;
                f7 = 1.0f;
            }
            this.J = new a2.g.a().k(j13).i(j11).g(j9).j(f7).h(f8).f();
        }
        j9 = Math.min(Y02, j14);
        Y0 = m0.Y0(j7 - j8);
        if (Y0 < 0) {
            Y0 = 0;
        }
        j10 = this.M.f23093c;
        if (j10 != -9223372036854775807L) {
        }
        j11 = Y0;
        j12 = this.f2216m.f20395i.f20448g;
        if (j12 == -9223372036854775807L) {
        }
        j11 = m0.r(j12, j11, Y02);
        if (j11 > j9) {
        }
        j13 = this.J.f20447f;
        if (j13 == -9223372036854775807L) {
        }
        if (j13 < j11) {
        }
        if (j13 > j9) {
        }
        a2.g gVar22 = this.f2216m.f20395i;
        f7 = gVar22.f20450i;
        if (f7 == -3.4028235E38f) {
        }
        f8 = gVar22.f20451j;
        if (f8 == -3.4028235E38f) {
        }
        if (f7 == -3.4028235E38f) {
        }
        this.J = new a2.g.a().k(j13).i(j11).g(j9).j(f7).h(f8).f();
    }

    @Override // t1.a
    protected void C(p0 p0Var) {
        this.G = p0Var;
        this.f2221r.W();
        this.f2221r.c(Looper.myLooper(), A());
        if (this.f2217n) {
            c0(false);
            return;
        }
        this.E = this.f2218o.a();
        this.F = new h0("DashMediaSource");
        this.I = m0.w();
        i0();
    }

    @Override // t1.a
    protected void E() {
        this.N = false;
        this.E = null;
        h0 h0Var = this.F;
        if (h0Var != null) {
            h0Var.l();
            this.F = null;
        }
        this.O = 0L;
        this.P = 0L;
        this.M = this.f2217n ? this.M : null;
        this.K = this.L;
        this.H = null;
        Handler handler = this.I;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.I = null;
        }
        this.Q = -9223372036854775807L;
        this.R = 0;
        this.S = -9223372036854775807L;
        this.T = 0;
        this.f2229z.clear();
        this.f2223t.i();
        this.f2221r.a();
    }

    void T(long j7) {
        long j8 = this.S;
        if (j8 == -9223372036854775807L || j8 < j7) {
            this.S = j7;
        }
    }

    void U() {
        this.I.removeCallbacks(this.B);
        i0();
    }

    void V(j0<?> j0Var, long j7, long j8) {
        q qVar = new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b());
        this.f2222s.a(j0Var.f19458a);
        this.f2225v.q(qVar, j0Var.f19460c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void W(j0<x1.c> j0Var, long j7, long j8) {
        boolean z6;
        String str;
        String str2;
        q qVar = new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b());
        this.f2222s.a(j0Var.f19458a);
        this.f2225v.t(qVar, j0Var.f19460c);
        x1.c e7 = j0Var.e();
        x1.c cVar = this.M;
        int e8 = cVar == null ? 0 : cVar.e();
        long j9 = e7.d(0).f23127b;
        int i7 = 0;
        while (i7 < e8 && this.M.d(i7).f23127b < j9) {
            i7++;
        }
        if (e7.f23094d) {
            if (e8 - i7 > e7.e()) {
                str = "DashMediaSource";
                str2 = "Loaded out of sync manifest";
            } else {
                long j10 = this.S;
                if (j10 == -9223372036854775807L || e7.f23098h * 1000 > j10) {
                    z6 = false;
                    if (!z6) {
                        int i8 = this.R;
                        this.R = i8 + 1;
                        if (i8 < this.f2222s.d(j0Var.f19460c)) {
                            g0(O());
                            return;
                        } else {
                            this.H = new w1.c();
                            return;
                        }
                    }
                    this.R = 0;
                } else {
                    str = "DashMediaSource";
                    str2 = "Loaded stale dynamic manifest: " + e7.f23098h + ", " + this.S;
                }
            }
            r.i(str, str2);
            z6 = true;
            if (!z6) {
            }
        }
        this.M = e7;
        this.N = e7.f23094d & this.N;
        this.O = j7 - j8;
        this.P = j7;
        synchronized (this.f2228y) {
            if (j0Var.f19459b.f19496a == this.K) {
                Uri uri = this.M.f23101k;
                if (uri == null) {
                    uri = j0Var.f();
                }
                this.K = uri;
            }
        }
        if (e8 == 0) {
            x1.c cVar2 = this.M;
            if (cVar2.f23094d) {
                o oVar = cVar2.f23099i;
                if (oVar != null) {
                    d0(oVar);
                    return;
                } else {
                    S();
                    return;
                }
            }
        } else {
            this.T += i7;
        }
        c0(true);
    }

    h0.c X(j0<x1.c> j0Var, long j7, long j8, IOException iOException, int i7) {
        q qVar = new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b());
        long c7 = this.f2222s.c(new g0.c(qVar, new t(j0Var.f19460c), iOException, i7));
        h0.c h7 = c7 == -9223372036854775807L ? h0.f19437g : h0.h(false, c7);
        boolean z6 = !h7.c();
        this.f2225v.x(qVar, j0Var.f19460c, iOException, z6);
        if (z6) {
            this.f2222s.a(j0Var.f19458a);
        }
        return h7;
    }

    void Y(j0<Long> j0Var, long j7, long j8) {
        q qVar = new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b());
        this.f2222s.a(j0Var.f19458a);
        this.f2225v.t(qVar, j0Var.f19460c);
        b0(j0Var.e().longValue() - j7);
    }

    h0.c Z(j0<Long> j0Var, long j7, long j8, IOException iOException) {
        this.f2225v.x(new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b()), j0Var.f19460c, iOException, true);
        this.f2222s.a(j0Var.f19458a);
        a0(iOException);
        return h0.f19436f;
    }

    @Override // t1.x
    public a2 a() {
        return this.f2216m;
    }

    @Override // t1.x
    public void c() {
        this.D.b();
    }

    @Override // t1.x
    public void e(u uVar) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) uVar;
        bVar.I();
        this.f2229z.remove(bVar.f2253f);
    }

    @Override // t1.x
    public u j(x.b bVar, n2.b bVar2, long j7) {
        int intValue = ((Integer) bVar.f22249a).intValue() - this.T;
        e0.a x6 = x(bVar, this.M.d(intValue).f23127b);
        com.google.android.exoplayer2.source.dash.b bVar3 = new com.google.android.exoplayer2.source.dash.b(intValue + this.T, this.M, this.f2223t, intValue, this.f2219p, this.G, this.f2221r, u(bVar), this.f2222s, x6, this.Q, this.D, bVar2, this.f2220q, this.C, A());
        this.f2229z.put(bVar3.f2253f, bVar3);
        return bVar3;
    }
}
