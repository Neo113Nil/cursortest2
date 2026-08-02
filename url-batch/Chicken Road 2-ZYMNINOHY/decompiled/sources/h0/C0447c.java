package h0;

import T.C0096n;
import T.C0097o;
import T.F;
import T.G;
import W.J;
import Y.z;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import q0.C1377t;
import t0.C1427b;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447c implements u0.i {
    public static final b0.c o = new b0.c(24);

    /* renamed from: a, reason: collision with root package name */
    public final e0.t f9054a;

    /* renamed from: b, reason: collision with root package name */
    public final s f9055b;

    /* renamed from: c, reason: collision with root package name */
    public final C1427b f9056c;

    /* renamed from: f, reason: collision with root package name */
    public f0.e f9059f;

    /* renamed from: g, reason: collision with root package name */
    public u0.n f9060g;

    /* renamed from: h, reason: collision with root package name */
    public Handler f9061h;

    /* renamed from: i, reason: collision with root package name */
    public g0.m f9062i;

    /* renamed from: j, reason: collision with root package name */
    public o f9063j;

    /* renamed from: k, reason: collision with root package name */
    public Uri f9064k;

    /* renamed from: l, reason: collision with root package name */
    public l f9065l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9066m;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f9058e = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f9057d = new HashMap();
    public long n = -9223372036854775807L;

    public C0447c(e0.t tVar, C1427b c1427b, s sVar) {
        this.f9054a = tVar;
        this.f9055b = sVar;
        this.f9056c = c1427b;
    }

    public final l a(boolean z, Uri uri) {
        HashMap hashMap = this.f9057d;
        l lVar = ((C0446b) hashMap.get(uri)).f9045d;
        if (lVar != null && z) {
            if (!uri.equals(this.f9064k)) {
                List list = this.f9063j.f9158e;
                int i4 = 0;
                while (true) {
                    if (i4 >= list.size()) {
                        break;
                    }
                    if (uri.equals(((n) list.get(i4)).f9150a)) {
                        l lVar2 = this.f9065l;
                        if (lVar2 == null || !lVar2.o) {
                            this.f9064k = uri;
                            C0446b c0446b = (C0446b) hashMap.get(uri);
                            l lVar3 = c0446b.f9045d;
                            if (lVar3 == null || !lVar3.o) {
                                c0446b.e(b(uri));
                            } else {
                                this.f9065l = lVar3;
                                this.f9062i.y(lVar3);
                            }
                        }
                    } else {
                        i4++;
                    }
                }
            }
            C0446b c0446b2 = (C0446b) hashMap.get(uri);
            l lVar4 = c0446b2.f9045d;
            if (!c0446b2.f9052k) {
                c0446b2.f9052k = true;
                if (lVar4 != null && !lVar4.o) {
                    c0446b2.c(true);
                }
            }
        }
        return lVar;
    }

    public final Uri b(Uri uri) {
        h hVar;
        l lVar = this.f9065l;
        if (lVar == null || !lVar.v.f9129e || (hVar = (h) lVar.f9144t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.f9110b));
        int i4 = hVar.f9111c;
        if (i4 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i4));
        }
        return buildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i4;
        C0446b c0446b = (C0446b) this.f9057d.get(uri);
        if (c0446b.f9045d == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, J.Z(c0446b.f9045d.f9145u));
        l lVar = c0446b.f9045d;
        return lVar.o || (i4 = lVar.f9130d) == 2 || i4 == 1 || c0446b.f9046e + max > elapsedRealtime;
    }

    @Override // u0.i
    public final void g(u0.k kVar, long j4, long j5) {
        o oVar;
        u0.q qVar = (u0.q) kVar;
        p pVar = (p) qVar.f15492f;
        boolean z = pVar instanceof l;
        if (z) {
            String str = pVar.f9165a;
            o oVar2 = o.f9156l;
            Uri parse = Uri.parse(str);
            C0096n c0096n = new C0096n();
            c0096n.f2819a = CommonUrlParts.Values.FALSE_INTEGER;
            c0096n.f2830l = F.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new n(parse, new C0097o(c0096n), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            oVar = new o("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            oVar = (o) pVar;
        }
        this.f9063j = oVar;
        this.f9064k = ((n) oVar.f9158e.get(0)).f9150a;
        this.f9058e.add(new C0445a(this));
        List list2 = oVar.f9157d;
        int size = list2.size();
        for (int i4 = 0; i4 < size; i4++) {
            Uri uri = (Uri) list2.get(i4);
            this.f9057d.put(uri, new C0446b(this, uri));
        }
        Y.k kVar2 = qVar.f15488b;
        z zVar = qVar.f15490d;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        C0446b c0446b = (C0446b) this.f9057d.get(this.f9064k);
        if (z) {
            c0446b.f((l) pVar, c1377t);
        } else {
            c0446b.c(false);
        }
        this.f9056c.getClass();
        this.f9059f.d(c1377t, 4);
    }

    @Override // u0.i
    public final void m(u0.k kVar, long j4, long j5, boolean z) {
        u0.q qVar = (u0.q) kVar;
        long j6 = qVar.f15487a;
        Y.k kVar2 = qVar.f15488b;
        z zVar = qVar.f15490d;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        this.f9056c.getClass();
        this.f9059f.c(c1377t, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // u0.i
    public final void o(u0.k kVar, long j4, long j5, int i4) {
        C1377t c1377t;
        u0.q qVar = (u0.q) kVar;
        if (i4 == 0) {
            long j6 = qVar.f15487a;
            c1377t = new C1377t(qVar.f15488b, j4);
        } else {
            long j7 = qVar.f15487a;
            Y.k kVar2 = qVar.f15488b;
            z zVar = qVar.f15490d;
            c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        }
        this.f9059f.h(c1377t, qVar.f15489c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i4);
    }

    @Override // u0.i
    public final g1.e p(u0.k kVar, long j4, long j5, IOException iOException, int i4) {
        long min;
        u0.q qVar = (u0.q) kVar;
        long j6 = qVar.f15487a;
        Y.k kVar2 = qVar.f15488b;
        z zVar = qVar.f15490d;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        int i5 = qVar.f15489c;
        this.f9056c.getClass();
        Throwable th = iOException;
        while (true) {
            if (th == null) {
                min = Math.min((i4 - 1) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 5000);
                break;
            }
            if ((th instanceof G) || (th instanceof FileNotFoundException) || (th instanceof Y.s) || (th instanceof u0.m) || ((th instanceof Y.i) && ((Y.i) th).f3694a == 2008)) {
                break;
            }
            th = th.getCause();
        }
        min = -9223372036854775807L;
        boolean z = min == -9223372036854775807L;
        this.f9059f.g(c1377t, i5, iOException, z);
        return z ? u0.n.f15483f : new g1.e(0, min, false);
    }
}
