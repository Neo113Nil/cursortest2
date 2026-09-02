package h0;

import E1.P;
import T.G;
import W.J;
import Y.v;
import Y.z;
import a.AbstractC0124a;
import android.net.Uri;
import android.os.SystemClock;
import androidx.datastore.preferences.protobuf.C0179l;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import q0.C1377t;
import t0.C1427b;
import v2.I;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446b implements u0.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f9042a;

    /* renamed from: b, reason: collision with root package name */
    public final u0.n f9043b = new u0.n("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: c, reason: collision with root package name */
    public final Y.h f9044c;

    /* renamed from: d, reason: collision with root package name */
    public l f9045d;

    /* renamed from: e, reason: collision with root package name */
    public long f9046e;

    /* renamed from: f, reason: collision with root package name */
    public long f9047f;

    /* renamed from: g, reason: collision with root package name */
    public long f9048g;

    /* renamed from: h, reason: collision with root package name */
    public long f9049h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9050i;

    /* renamed from: j, reason: collision with root package name */
    public IOException f9051j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9052k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0447c f9053l;

    public C0446b(C0447c c0447c, Uri uri) {
        this.f9053l = c0447c;
        this.f9042a = uri;
        this.f9044c = ((Y.g) c0447c.f9054a.f8416a).f();
    }

    public static boolean a(C0446b c0446b, long j4) {
        c0446b.f9049h = SystemClock.elapsedRealtime() + j4;
        Uri uri = c0446b.f9042a;
        C0447c c0447c = c0446b.f9053l;
        if (!uri.equals(c0447c.f9064k)) {
            return true;
        }
        List list = c0447c.f9063j.f9158e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i4 = 0; i4 < size; i4++) {
            C0446b c0446b2 = (C0446b) c0447c.f9057d.get(((n) list.get(i4)).f9150a);
            c0446b2.getClass();
            if (elapsedRealtime > c0446b2.f9049h) {
                Uri uri2 = c0446b2.f9042a;
                c0447c.f9064k = uri2;
                c0446b2.e(c0447c.b(uri2));
                return true;
            }
        }
        return false;
    }

    public final Uri b() {
        l lVar = this.f9045d;
        Uri uri = this.f9042a;
        if (lVar != null) {
            k kVar = lVar.v;
            if (kVar.f9125a != -9223372036854775807L || kVar.f9129e) {
                Uri.Builder buildUpon = uri.buildUpon();
                l lVar2 = this.f9045d;
                if (lVar2.v.f9129e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.f9137k + lVar2.f9142r.size()));
                    l lVar3 = this.f9045d;
                    if (lVar3.n != -9223372036854775807L) {
                        I i4 = lVar3.f9143s;
                        int size = i4.size();
                        if (!i4.isEmpty() && ((g) v2.r.j(i4)).f9108m) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.f9045d.v;
                if (kVar2.f9125a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", kVar2.f9126b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z) {
        e(z ? b() : this.f9042a);
    }

    public final void d(Uri uri) {
        C0447c c0447c = this.f9053l;
        u0.p i4 = c0447c.f9055b.i(c0447c.f9063j, this.f9045d);
        Map map = Collections.EMPTY_MAP;
        AbstractC0124a.o(uri, "The uri must be set.");
        u0.q qVar = new u0.q(this.f9044c, new Y.k(uri, 1, null, map, 0L, -1L, null, 1), 4, i4);
        this.f9043b.f(qVar, this, c0447c.f9056c.g(qVar.f15489c));
    }

    public final void e(Uri uri) {
        this.f9049h = 0L;
        if (this.f9050i) {
            return;
        }
        u0.n nVar = this.f9043b;
        if (nVar.d() || nVar.c()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = this.f9048g;
        if (elapsedRealtime >= j4) {
            d(uri);
        } else {
            this.f9050i = true;
            this.f9053l.f9061h.postDelayed(new g0.p(this, 1, uri), j4 - elapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(l lVar, C1377t c1377t) {
        boolean z;
        CopyOnWriteArrayList copyOnWriteArrayList;
        boolean z4;
        long j4;
        long j5;
        long j6;
        int i4;
        I i5;
        l lVar2;
        C0179l c0179l;
        long j7;
        C0179l c0179l2;
        boolean z5;
        k kVar;
        int size;
        int size2;
        int size3;
        l lVar3 = this.f9045d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f9046e = elapsedRealtime;
        C0447c c0447c = this.f9053l;
        CopyOnWriteArrayList copyOnWriteArrayList2 = c0447c.f9058e;
        if (lVar3 != null) {
            long j8 = lVar.f9137k;
            long j9 = lVar3.f9137k;
            if (j8 <= j9 && (j8 < j9 || ((size = lVar.f9142r.size() - lVar3.f9142r.size()) == 0 ? !((size2 = lVar.f9143s.size()) > (size3 = lVar3.f9143s.size()) || (size2 == size3 && lVar.o && !lVar3.o)) : size <= 0))) {
                z = false;
                I i6 = lVar.f9142r;
                long j10 = lVar.f9137k;
                long j11 = 0;
                if (z) {
                    if (!lVar.o) {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        z4 = true;
                        lVar2 = lVar3;
                        j7 = j10;
                    } else if (lVar3.o) {
                        lVar2 = lVar3;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j7 = j10;
                        c0179l = null;
                        z4 = true;
                    } else {
                        z4 = true;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j7 = j10;
                        lVar2 = new l(lVar3.f9130d, lVar3.f9165a, lVar3.f9166b, lVar3.f9131e, lVar3.f9133g, lVar3.f9134h, lVar3.f9135i, lVar3.f9136j, lVar3.f9137k, lVar3.f9138l, lVar3.f9139m, lVar3.n, lVar3.f9167c, true, lVar3.f9140p, lVar3.f9141q, lVar3.f9142r, lVar3.f9143s, lVar3.v, lVar3.f9144t, lVar3.f9146w);
                    }
                    c0179l = null;
                } else {
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    z4 = true;
                    if (lVar.f9140p) {
                        j4 = lVar.f9134h;
                    } else {
                        l lVar4 = c0447c.f9065l;
                        j4 = lVar4 != null ? lVar4.f9134h : 0L;
                        if (lVar3 != null) {
                            long j12 = lVar3.f9134h;
                            long j13 = lVar3.f9137k;
                            I i7 = lVar3.f9142r;
                            j5 = j4;
                            int size4 = i7.size();
                            int i8 = (int) (j10 - j13);
                            i iVar = i8 < i7.size() ? (i) i7.get(i8) : null;
                            if (iVar != null) {
                                j6 = iVar.f9118e;
                            } else {
                                if (size4 == j10 - j13) {
                                    j6 = lVar3.f9145u;
                                }
                                if (lVar.f9135i) {
                                    l lVar5 = c0447c.f9065l;
                                    int i9 = lVar5 != null ? lVar5.f9136j : 0;
                                    if (lVar3 != null) {
                                        int i10 = (int) (j10 - lVar3.f9137k);
                                        I i11 = lVar3.f9142r;
                                        i iVar2 = i10 < i11.size() ? (i) i11.get(i10) : null;
                                        if (iVar2 != null) {
                                            i9 = (lVar3.f9136j + iVar2.f9117d) - ((i) i6.get(0)).f9117d;
                                            i4 = i9;
                                            i5 = i6;
                                        }
                                    }
                                    i4 = i9;
                                    i5 = i6;
                                } else {
                                    i4 = lVar.f9136j;
                                    i5 = i6;
                                }
                                c0179l = null;
                                j7 = j10;
                                lVar2 = new l(lVar.f9130d, lVar.f9165a, lVar.f9166b, lVar.f9131e, lVar.f9133g, j5, true, i4, lVar.f9137k, lVar.f9138l, lVar.f9139m, lVar.n, lVar.f9167c, lVar.o, lVar.f9140p, lVar.f9141q, i5, lVar.f9143s, lVar.v, lVar.f9144t, lVar.f9146w);
                            }
                            j4 = j12 + j6;
                        }
                    }
                    j5 = j4;
                    if (lVar.f9135i) {
                    }
                    c0179l = null;
                    j7 = j10;
                    lVar2 = new l(lVar.f9130d, lVar.f9165a, lVar.f9166b, lVar.f9131e, lVar.f9133g, j5, true, i4, lVar.f9137k, lVar.f9138l, lVar.f9139m, lVar.n, lVar.f9167c, lVar.o, lVar.f9140p, lVar.f9141q, i5, lVar.f9143s, lVar.v, lVar.f9144t, lVar.f9146w);
                }
                this.f9045d = lVar2;
                Uri uri = this.f9042a;
                if (lVar2 == lVar3) {
                    this.f9051j = c0179l;
                    this.f9047f = elapsedRealtime;
                    if (uri.equals(c0447c.f9064k)) {
                        if (c0447c.f9065l == null) {
                            c0447c.f9066m = !lVar2.o;
                            c0447c.n = lVar2.f9134h;
                        }
                        c0447c.f9065l = lVar2;
                        c0447c.f9062i.y(lVar2);
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((t) it.next()).a();
                    }
                } else if (!lVar2.o) {
                    long size5 = j7 + lVar.f9142r.size();
                    l lVar6 = this.f9045d;
                    if (size5 < lVar6.f9137k) {
                        c0179l2 = new C0179l();
                        z5 = z4;
                    } else {
                        c0179l2 = ((double) (elapsedRealtime - this.f9047f)) > ((double) J.Z(lVar6.f9139m)) * 3.5d ? new C0179l() : c0179l;
                        z5 = false;
                    }
                    if (c0179l2 != null) {
                        this.f9051j = c0179l2;
                        P p2 = new P(z4 ? 1 : 0, 9, c0179l2);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((t) it2.next()).c(uri, p2, z5);
                        }
                    }
                }
                l lVar7 = this.f9045d;
                kVar = lVar7.v;
                long j14 = lVar7.f9139m;
                if (!kVar.f9129e) {
                    if (lVar7 == lVar3) {
                        long j15 = lVar7.n;
                        if (j15 != -9223372036854775807L) {
                            j11 = j15 / 2;
                        } else {
                            j14 /= 2;
                        }
                    }
                    this.f9048g = (J.Z(j11) + elapsedRealtime) - c1377t.f15068a;
                    if (this.f9045d.o) {
                        return;
                    }
                    if (uri.equals(c0447c.f9064k) || this.f9052k) {
                        e(b());
                        return;
                    }
                    return;
                }
                if (lVar7 == lVar3) {
                    j14 /= 2;
                }
                j11 = j14;
                this.f9048g = (J.Z(j11) + elapsedRealtime) - c1377t.f15068a;
                if (this.f9045d.o) {
                }
            }
        } else {
            lVar.getClass();
        }
        z = true;
        I i62 = lVar.f9142r;
        long j102 = lVar.f9137k;
        long j112 = 0;
        if (z) {
        }
        this.f9045d = lVar2;
        Uri uri2 = this.f9042a;
        if (lVar2 == lVar3) {
        }
        l lVar72 = this.f9045d;
        kVar = lVar72.v;
        long j142 = lVar72.f9139m;
        if (!kVar.f9129e) {
        }
        j112 = j142;
        this.f9048g = (J.Z(j112) + elapsedRealtime) - c1377t.f15068a;
        if (this.f9045d.o) {
        }
    }

    @Override // u0.i
    public final void g(u0.k kVar, long j4, long j5) {
        u0.q qVar = (u0.q) kVar;
        p pVar = (p) qVar.f15492f;
        Y.k kVar2 = qVar.f15488b;
        z zVar = qVar.f15490d;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        if (pVar instanceof l) {
            f((l) pVar, c1377t);
            this.f9053l.f9059f.d(c1377t, 4);
        } else {
            G b4 = G.b("Loaded playlist has unexpected type.", null);
            this.f9051j = b4;
            this.f9053l.f9059f.g(c1377t, 4, b4, true);
        }
        this.f9053l.f9056c.getClass();
    }

    @Override // u0.i
    public final void m(u0.k kVar, long j4, long j5, boolean z) {
        u0.q qVar = (u0.q) kVar;
        long j6 = qVar.f15487a;
        Y.k kVar2 = qVar.f15488b;
        z zVar = qVar.f15490d;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        C0447c c0447c = this.f9053l;
        c0447c.f9056c.getClass();
        c0447c.f9059f.c(c1377t, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
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
        this.f9053l.f9059f.h(c1377t, qVar.f15489c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i4);
    }

    @Override // u0.i
    public final g1.e p(u0.k kVar, long j4, long j5, IOException iOException, int i4) {
        u0.q qVar = (u0.q) kVar;
        long j6 = qVar.f15487a;
        int i5 = qVar.f15489c;
        Y.k kVar2 = qVar.f15488b;
        z zVar = qVar.f15490d;
        Uri uri = zVar.f3754c;
        C1377t c1377t = new C1377t(kVar2, uri, zVar.f3755d, j4, j5, zVar.f3753b);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z4 = iOException instanceof q;
        g1.e eVar = u0.n.f15482e;
        C0447c c0447c = this.f9053l;
        if (z || z4) {
            int i6 = iOException instanceof v ? ((v) iOException).f3743c : Integer.MAX_VALUE;
            if (z4 || i6 == 400 || i6 == 503) {
                this.f9048g = SystemClock.elapsedRealtime();
                c(false);
                f0.e eVar2 = c0447c.f9059f;
                String str = J.f3263a;
                eVar2.g(c1377t, i5, iOException, true);
                return eVar;
            }
        }
        P p2 = new P(i4, 9, iOException);
        Iterator it = c0447c.f9058e.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= !((t) it.next()).c(this.f9042a, p2, false);
        }
        C1427b c1427b = c0447c.f9056c;
        if (z5) {
            c1427b.getClass();
            long h2 = C1427b.h(p2);
            eVar = h2 != -9223372036854775807L ? new g1.e(0, h2, false) : u0.n.f15483f;
        }
        boolean a3 = eVar.a();
        c0447c.f9059f.g(c1377t, i5, iOException, !a3);
        if (!a3) {
            c1427b.getClass();
        }
        return eVar;
    }
}
