package o0;

import B1.j;
import T.C0104w;
import T.C0107z;
import T.G;
import W.J;
import Y.A;
import Y.g;
import Y.h;
import Y.s;
import Y.z;
import a.AbstractC0124a;
import a0.C0144j;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import f0.e;
import g0.f;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.ap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import q0.AbstractC1359a;
import q0.C1353B;
import q0.C1377t;
import q0.InterfaceC1382y;
import q0.InterfaceC1383z;
import q0.f0;
import r0.C1398i;
import t0.C1427b;
import u0.i;
import u0.k;
import u0.m;
import u0.n;
import u0.o;
import u0.p;
import u0.q;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1324c extends AbstractC1359a implements i {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14609h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f14610i;

    /* renamed from: j, reason: collision with root package name */
    public final g f14611j;

    /* renamed from: k, reason: collision with root package name */
    public final f f14612k;

    /* renamed from: l, reason: collision with root package name */
    public final C0144j f14613l;

    /* renamed from: m, reason: collision with root package name */
    public final f0.i f14614m;
    public final C1427b n;
    public final long o;

    /* renamed from: p, reason: collision with root package name */
    public final e f14615p;

    /* renamed from: q, reason: collision with root package name */
    public final p f14616q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f14617r;

    /* renamed from: s, reason: collision with root package name */
    public h f14618s;

    /* renamed from: t, reason: collision with root package name */
    public n f14619t;

    /* renamed from: u, reason: collision with root package name */
    public o f14620u;
    public A v;

    /* renamed from: w, reason: collision with root package name */
    public long f14621w;

    /* renamed from: x, reason: collision with root package name */
    public p0.c f14622x;

    /* renamed from: y, reason: collision with root package name */
    public Handler f14623y;
    public C0107z z;

    static {
        T.A.a("media3.exoplayer.smoothstreaming");
    }

    public C1324c(C0107z c0107z, g gVar, p pVar, f fVar, C0144j c0144j, f0.i iVar, C1427b c1427b, long j4) {
        this.z = c0107z;
        C0104w c0104w = c0107z.f2900b;
        c0104w.getClass();
        Uri uri = c0104w.f2893a;
        this.f14622x = null;
        if (uri.equals(Uri.EMPTY)) {
            uri = null;
        } else {
            String path = uri.getPath();
            if (path != null) {
                Matcher matcher = J.f3268f.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri = Uri.withAppendedPath(uri, "Manifest");
                }
            }
        }
        this.f14610i = uri;
        this.f14611j = gVar;
        this.f14616q = pVar;
        this.f14612k = fVar;
        this.f14613l = c0144j;
        this.f14614m = iVar;
        this.n = c1427b;
        this.o = j4;
        this.f14615p = a(null);
        this.f14609h = false;
        this.f14617r = new ArrayList();
    }

    @Override // q0.AbstractC1359a
    public final InterfaceC1383z b(C1353B c1353b, j jVar, long j4) {
        e a3 = a(c1353b);
        e eVar = new e(this.f14948d.f8493c, 0, c1353b);
        C1323b c1323b = new C1323b(this.f14622x, this.f14612k, this.v, this.f14613l, this.f14614m, eVar, this.n, a3, this.f14620u, jVar);
        this.f14617r.add(c1323b);
        return c1323b;
    }

    @Override // u0.i
    public final void g(k kVar, long j4, long j5) {
        q qVar = (q) kVar;
        long j6 = qVar.f15487a;
        Y.k kVar2 = qVar.f15488b;
        z zVar = qVar.f15490d;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        this.n.getClass();
        this.f14615p.d(c1377t, qVar.f15489c);
        this.f14622x = (p0.c) qVar.f15492f;
        this.f14621w = j4 - j5;
        x();
        if (this.f14622x.f14691d) {
            this.f14623y.postDelayed(new ap(4, this), Math.max(0L, (this.f14621w + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // q0.AbstractC1359a
    public final synchronized C0107z i() {
        return this.z;
    }

    @Override // q0.AbstractC1359a
    public final void k() {
        this.f14620u.a();
    }

    @Override // u0.i
    public final void m(k kVar, long j4, long j5, boolean z) {
        q qVar = (q) kVar;
        long j6 = qVar.f15487a;
        Y.k kVar2 = qVar.f15488b;
        z zVar = qVar.f15490d;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        this.n.getClass();
        this.f14615p.c(c1377t, qVar.f15489c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // q0.AbstractC1359a
    public final void n(A a3) {
        this.v = a3;
        Looper myLooper = Looper.myLooper();
        b0.i iVar = this.f14951g;
        iVar.getClass();
        f0.i iVar2 = this.f14614m;
        iVar2.c(myLooper, iVar);
        iVar2.a();
        if (this.f14609h) {
            this.f14620u = new C1427b(2);
            x();
            return;
        }
        this.f14618s = this.f14611j.f();
        n nVar = new n("SsMediaSource");
        this.f14619t = nVar;
        this.f14620u = nVar;
        this.f14623y = J.o(null);
        y();
    }

    @Override // u0.i
    public final void o(k kVar, long j4, long j5, int i4) {
        C1377t c1377t;
        q qVar = (q) kVar;
        if (i4 == 0) {
            long j6 = qVar.f15487a;
            c1377t = new C1377t(qVar.f15488b, j4);
        } else {
            long j7 = qVar.f15487a;
            Y.k kVar2 = qVar.f15488b;
            z zVar = qVar.f15490d;
            c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        }
        this.f14615p.h(c1377t, qVar.f15489c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i4);
    }

    @Override // u0.i
    public final g1.e p(k kVar, long j4, long j5, IOException iOException, int i4) {
        long min;
        q qVar = (q) kVar;
        long j6 = qVar.f15487a;
        Y.k kVar2 = qVar.f15488b;
        z zVar = qVar.f15490d;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        int i5 = qVar.f15489c;
        this.n.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof G) || (th instanceof FileNotFoundException) || (th instanceof s) || (th instanceof m) || ((th instanceof Y.i) && ((Y.i) th).f3694a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i4 - 1) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 5000);
        g1.e eVar = min == -9223372036854775807L ? n.f15483f : new g1.e(0, min, false);
        this.f14615p.g(c1377t, i5, iOException, !eVar.a());
        return eVar;
    }

    @Override // q0.AbstractC1359a
    public final void r(InterfaceC1383z interfaceC1383z) {
        C1323b c1323b = (C1323b) interfaceC1383z;
        for (C1398i c1398i : c1323b.f14608m) {
            c1398i.B(null);
        }
        c1323b.f14606k = null;
        this.f14617r.remove(interfaceC1383z);
    }

    @Override // q0.AbstractC1359a
    public final void t() {
        this.f14622x = this.f14609h ? this.f14622x : null;
        this.f14618s = null;
        this.f14621w = 0L;
        n nVar = this.f14619t;
        if (nVar != null) {
            nVar.e(null);
            this.f14619t = null;
        }
        Handler handler = this.f14623y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f14623y = null;
        }
        this.f14614m.release();
    }

    @Override // q0.AbstractC1359a
    public final synchronized void w(C0107z c0107z) {
        this.z = c0107z;
    }

    public final void x() {
        f0 f0Var;
        boolean z;
        p0.b[] bVarArr;
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f14617r;
            if (i4 >= arrayList.size()) {
                break;
            }
            C1323b c1323b = (C1323b) arrayList.get(i4);
            p0.c cVar = this.f14622x;
            c1323b.f14607l = cVar;
            for (C1398i c1398i : c1323b.f14608m) {
                C1322a c1322a = (C1322a) c1398i.f15156e;
                p0.b[] bVarArr2 = c1322a.f14593f.f14693f;
                int i5 = c1322a.f14589b;
                p0.b bVar = bVarArr2[i5];
                int i6 = bVar.f14684k;
                long[] jArr = bVar.o;
                p0.b bVar2 = cVar.f14693f[i5];
                if (i6 == 0 || bVar2.f14684k == 0) {
                    c1322a.f14594g += i6;
                } else {
                    int i7 = i6 - 1;
                    long b4 = bVar.b(i7) + jArr[i7];
                    long j4 = bVar2.o[0];
                    if (b4 <= j4) {
                        c1322a.f14594g += i6;
                    } else {
                        c1322a.f14594g = J.f(jArr, j4, true) + c1322a.f14594g;
                    }
                }
                c1322a.f14593f = cVar;
            }
            InterfaceC1382y interfaceC1382y = c1323b.f14606k;
            interfaceC1382y.getClass();
            interfaceC1382y.s(c1323b);
            i4++;
        }
        p0.b[] bVarArr3 = this.f14622x.f14693f;
        int length = bVarArr3.length;
        long j5 = Long.MIN_VALUE;
        int i8 = 0;
        long j6 = Long.MAX_VALUE;
        while (i8 < length) {
            p0.b bVar3 = bVarArr3[i8];
            int i9 = bVar3.f14684k;
            long[] jArr2 = bVar3.o;
            if (i9 > 0) {
                z = z4;
                bVarArr = bVarArr3;
                j6 = Math.min(j6, jArr2[z ? 1 : 0]);
                int i10 = bVar3.f14684k - 1;
                j5 = Math.max(j5, bVar3.b(i10) + jArr2[i10]);
            } else {
                z = z4;
                bVarArr = bVarArr3;
            }
            i8++;
            z4 = z;
            bVarArr3 = bVarArr;
        }
        if (j6 == Long.MAX_VALUE) {
            long j7 = this.f14622x.f14691d ? -9223372036854775807L : 0L;
            p0.c cVar2 = this.f14622x;
            boolean z5 = cVar2.f14691d;
            f0Var = new f0(j7, 0L, 0L, 0L, true, z5, z5, cVar2, i());
        } else {
            p0.c cVar3 = this.f14622x;
            if (cVar3.f14691d) {
                long j8 = cVar3.f14695h;
                if (j8 != -9223372036854775807L && j8 > 0) {
                    j6 = Math.max(j6, j5 - j8);
                }
                long j9 = j6;
                long j10 = j5 - j9;
                long M4 = j10 - J.M(this.o);
                if (M4 < 5000000) {
                    M4 = Math.min(5000000L, j10 / 2);
                }
                f0Var = new f0(-9223372036854775807L, j10, j9, M4, true, true, true, this.f14622x, i());
            } else {
                long j11 = cVar3.f14694g;
                if (j11 == -9223372036854775807L) {
                    j11 = j5 - j6;
                }
                long j12 = j11;
                long j13 = j6;
                f0Var = new f0(-9223372036854775807L, -9223372036854775807L, j13 + j12, j12, j13, 0L, true, false, false, this.f14622x, i(), null);
            }
        }
        q(f0Var);
    }

    public final void y() {
        if (this.f14619t.c()) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.f14610i;
        AbstractC0124a.o(uri, "The uri must be set.");
        q qVar = new q(this.f14618s, new Y.k(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f14616q);
        this.f14619t.f(qVar, this, this.n.g(qVar.f15489c));
    }
}
