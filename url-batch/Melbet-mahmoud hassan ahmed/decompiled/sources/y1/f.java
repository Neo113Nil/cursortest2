package y1;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n2.p;
import n2.p0;
import o2.k0;
import o2.m0;
import r0.j3;
import r0.s1;
import s0.u1;
import t1.x0;
import z1.g;

/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final h f23256a;

    /* renamed from: b, reason: collision with root package name */
    private final n2.l f23257b;

    /* renamed from: c, reason: collision with root package name */
    private final n2.l f23258c;

    /* renamed from: d, reason: collision with root package name */
    private final s f23259d;

    /* renamed from: e, reason: collision with root package name */
    private final Uri[] f23260e;

    /* renamed from: f, reason: collision with root package name */
    private final s1[] f23261f;

    /* renamed from: g, reason: collision with root package name */
    private final z1.l f23262g;

    /* renamed from: h, reason: collision with root package name */
    private final x0 f23263h;

    /* renamed from: i, reason: collision with root package name */
    private final List<s1> f23264i;

    /* renamed from: k, reason: collision with root package name */
    private final u1 f23266k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23267l;

    /* renamed from: n, reason: collision with root package name */
    private IOException f23269n;

    /* renamed from: o, reason: collision with root package name */
    private Uri f23270o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23271p;

    /* renamed from: q, reason: collision with root package name */
    private m2.t f23272q;

    /* renamed from: s, reason: collision with root package name */
    private boolean f23274s;

    /* renamed from: j, reason: collision with root package name */
    private final y1.e f23265j = new y1.e(4);

    /* renamed from: m, reason: collision with root package name */
    private byte[] f23268m = m0.f19757f;

    /* renamed from: r, reason: collision with root package name */
    private long f23273r = -9223372036854775807L;

    private static final class a extends v1.l {

        /* renamed from: l, reason: collision with root package name */
        private byte[] f23275l;

        public a(n2.l lVar, n2.p pVar, s1 s1Var, int i7, Object obj, byte[] bArr) {
            super(lVar, pVar, 3, s1Var, i7, obj, bArr);
        }

        @Override // v1.l
        protected void g(byte[] bArr, int i7) {
            this.f23275l = Arrays.copyOf(bArr, i7);
        }

        public byte[] j() {
            return this.f23275l;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public v1.f f23276a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f23277b;

        /* renamed from: c, reason: collision with root package name */
        public Uri f23278c;

        public b() {
            a();
        }

        public void a() {
            this.f23276a = null;
            this.f23277b = false;
            this.f23278c = null;
        }
    }

    static final class c extends v1.b {

        /* renamed from: e, reason: collision with root package name */
        private final List<g.e> f23279e;

        /* renamed from: f, reason: collision with root package name */
        private final long f23280f;

        /* renamed from: g, reason: collision with root package name */
        private final String f23281g;

        public c(String str, long j7, List<g.e> list) {
            super(0L, list.size() - 1);
            this.f23281g = str;
            this.f23280f = j7;
            this.f23279e = list;
        }

        @Override // v1.o
        public long a() {
            c();
            g.e eVar = this.f23279e.get((int) d());
            return this.f23280f + eVar.f23567j + eVar.f23565h;
        }

        @Override // v1.o
        public long b() {
            c();
            return this.f23280f + this.f23279e.get((int) d()).f23567j;
        }
    }

    private static final class d extends m2.c {

        /* renamed from: h, reason: collision with root package name */
        private int f23282h;

        public d(x0 x0Var, int[] iArr) {
            super(x0Var, iArr);
            this.f23282h = d(x0Var.b(iArr[0]));
        }

        @Override // m2.t
        public void m(long j7, long j8, long j9, List<? extends v1.n> list, v1.o[] oVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (i(this.f23282h, elapsedRealtime)) {
                for (int i7 = this.f18979b - 1; i7 >= 0; i7--) {
                    if (!i(i7, elapsedRealtime)) {
                        this.f23282h = i7;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // m2.t
        public int q() {
            return 0;
        }

        @Override // m2.t
        public int r() {
            return this.f23282h;
        }

        @Override // m2.t
        public Object t() {
            return null;
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final g.e f23283a;

        /* renamed from: b, reason: collision with root package name */
        public final long f23284b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23285c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f23286d;

        public e(g.e eVar, long j7, int i7) {
            this.f23283a = eVar;
            this.f23284b = j7;
            this.f23285c = i7;
            this.f23286d = (eVar instanceof g.b) && ((g.b) eVar).f23557r;
        }
    }

    public f(h hVar, z1.l lVar, Uri[] uriArr, s1[] s1VarArr, g gVar, p0 p0Var, s sVar, List<s1> list, u1 u1Var) {
        this.f23256a = hVar;
        this.f23262g = lVar;
        this.f23260e = uriArr;
        this.f23261f = s1VarArr;
        this.f23259d = sVar;
        this.f23264i = list;
        this.f23266k = u1Var;
        n2.l a7 = gVar.a(1);
        this.f23257b = a7;
        if (p0Var != null) {
            a7.d(p0Var);
        }
        this.f23258c = gVar.a(3);
        this.f23263h = new x0(s1VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < uriArr.length; i7++) {
            if ((s1VarArr[i7].f20949j & 16384) == 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        this.f23272q = new d(this.f23263h, o4.d.k(arrayList));
    }

    private static Uri d(z1.g gVar, g.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f23569l) == null) {
            return null;
        }
        return k0.e(gVar.f23600a, str);
    }

    private Pair<Long, Integer> f(i iVar, boolean z6, z1.g gVar, long j7, long j8) {
        if (iVar != null && !z6) {
            if (!iVar.h()) {
                return new Pair<>(Long.valueOf(iVar.f22796j), Integer.valueOf(iVar.f23292o));
            }
            Long valueOf = Long.valueOf(iVar.f23292o == -1 ? iVar.g() : iVar.f22796j);
            int i7 = iVar.f23292o;
            return new Pair<>(valueOf, Integer.valueOf(i7 != -1 ? i7 + 1 : -1));
        }
        long j9 = gVar.f23554u + j7;
        if (iVar != null && !this.f23271p) {
            j8 = iVar.f22753g;
        }
        if (!gVar.f23548o && j8 >= j9) {
            return new Pair<>(Long.valueOf(gVar.f23544k + gVar.f23551r.size()), -1);
        }
        long j10 = j8 - j7;
        int i8 = 0;
        int f7 = m0.f(gVar.f23551r, Long.valueOf(j10), true, !this.f23262g.a() || iVar == null);
        long j11 = f7 + gVar.f23544k;
        if (f7 >= 0) {
            g.d dVar = gVar.f23551r.get(f7);
            List<g.b> list = j10 < dVar.f23567j + dVar.f23565h ? dVar.f23562r : gVar.f23552s;
            while (true) {
                if (i8 >= list.size()) {
                    break;
                }
                g.b bVar = list.get(i8);
                if (j10 >= bVar.f23567j + bVar.f23565h) {
                    i8++;
                } else if (bVar.f23556q) {
                    j11 += list == gVar.f23552s ? 1L : 0L;
                    r1 = i8;
                }
            }
        }
        return new Pair<>(Long.valueOf(j11), Integer.valueOf(r1));
    }

    private static e g(z1.g gVar, long j7, int i7) {
        int i8 = (int) (j7 - gVar.f23544k);
        if (i8 == gVar.f23551r.size()) {
            if (i7 == -1) {
                i7 = 0;
            }
            if (i7 < gVar.f23552s.size()) {
                return new e(gVar.f23552s.get(i7), j7, i7);
            }
            return null;
        }
        g.d dVar = gVar.f23551r.get(i8);
        if (i7 == -1) {
            return new e(dVar, j7, -1);
        }
        if (i7 < dVar.f23562r.size()) {
            return new e(dVar.f23562r.get(i7), j7, i7);
        }
        int i9 = i8 + 1;
        if (i9 < gVar.f23551r.size()) {
            return new e(gVar.f23551r.get(i9), j7 + 1, -1);
        }
        if (gVar.f23552s.isEmpty()) {
            return null;
        }
        return new e(gVar.f23552s.get(0), j7 + 1, 0);
    }

    static List<g.e> i(z1.g gVar, long j7, int i7) {
        int i8 = (int) (j7 - gVar.f23544k);
        if (i8 < 0 || gVar.f23551r.size() < i8) {
            return m4.q.x();
        }
        ArrayList arrayList = new ArrayList();
        if (i8 < gVar.f23551r.size()) {
            if (i7 != -1) {
                g.d dVar = gVar.f23551r.get(i8);
                if (i7 == 0) {
                    arrayList.add(dVar);
                } else if (i7 < dVar.f23562r.size()) {
                    List<g.b> list = dVar.f23562r;
                    arrayList.addAll(list.subList(i7, list.size()));
                }
                i8++;
            }
            List<g.d> list2 = gVar.f23551r;
            arrayList.addAll(list2.subList(i8, list2.size()));
            i7 = 0;
        }
        if (gVar.f23547n != -9223372036854775807L) {
            int i9 = i7 != -1 ? i7 : 0;
            if (i9 < gVar.f23552s.size()) {
                List<g.b> list3 = gVar.f23552s;
                arrayList.addAll(list3.subList(i9, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private v1.f l(Uri uri, int i7) {
        if (uri == null) {
            return null;
        }
        byte[] c7 = this.f23265j.c(uri);
        if (c7 != null) {
            this.f23265j.b(uri, c7);
            return null;
        }
        return new a(this.f23258c, new p.b().i(uri).b(1).a(), this.f23261f[i7], this.f23272q.q(), this.f23272q.t(), this.f23268m);
    }

    private long s(long j7) {
        long j8 = this.f23273r;
        if (j8 != -9223372036854775807L) {
            return j8 - j7;
        }
        return -9223372036854775807L;
    }

    private void w(z1.g gVar) {
        this.f23273r = gVar.f23548o ? -9223372036854775807L : gVar.e() - this.f23262g.n();
    }

    public v1.o[] a(i iVar, long j7) {
        int i7;
        int c7 = iVar == null ? -1 : this.f23263h.c(iVar.f22750d);
        int length = this.f23272q.length();
        v1.o[] oVarArr = new v1.o[length];
        boolean z6 = false;
        int i8 = 0;
        while (i8 < length) {
            int b7 = this.f23272q.b(i8);
            Uri uri = this.f23260e[b7];
            if (this.f23262g.e(uri)) {
                z1.g i9 = this.f23262g.i(uri, z6);
                o2.a.e(i9);
                long n7 = i9.f23541h - this.f23262g.n();
                i7 = i8;
                Pair<Long, Integer> f7 = f(iVar, b7 != c7, i9, n7, j7);
                oVarArr[i7] = new c(i9.f23600a, n7, i(i9, ((Long) f7.first).longValue(), ((Integer) f7.second).intValue()));
            } else {
                oVarArr[i8] = v1.o.f22797a;
                i7 = i8;
            }
            i8 = i7 + 1;
            z6 = false;
        }
        return oVarArr;
    }

    public long b(long j7, j3 j3Var) {
        int r7 = this.f23272q.r();
        Uri[] uriArr = this.f23260e;
        z1.g i7 = (r7 >= uriArr.length || r7 == -1) ? null : this.f23262g.i(uriArr[this.f23272q.o()], true);
        if (i7 == null || i7.f23551r.isEmpty() || !i7.f23602c) {
            return j7;
        }
        long n7 = i7.f23541h - this.f23262g.n();
        long j8 = j7 - n7;
        int f7 = m0.f(i7.f23551r, Long.valueOf(j8), true, true);
        long j9 = i7.f23551r.get(f7).f23567j;
        return j3Var.a(j8, j9, f7 != i7.f23551r.size() - 1 ? i7.f23551r.get(f7 + 1).f23567j : j9) + n7;
    }

    public int c(i iVar) {
        if (iVar.f23292o == -1) {
            return 1;
        }
        z1.g gVar = (z1.g) o2.a.e(this.f23262g.i(this.f23260e[this.f23263h.c(iVar.f22750d)], false));
        int i7 = (int) (iVar.f22796j - gVar.f23544k);
        if (i7 < 0) {
            return 1;
        }
        List<g.b> list = i7 < gVar.f23551r.size() ? gVar.f23551r.get(i7).f23562r : gVar.f23552s;
        if (iVar.f23292o >= list.size()) {
            return 2;
        }
        g.b bVar = list.get(iVar.f23292o);
        if (bVar.f23557r) {
            return 0;
        }
        return m0.c(Uri.parse(k0.d(gVar.f23600a, bVar.f23563f)), iVar.f22748b.f19496a) ? 1 : 2;
    }

    public void e(long j7, long j8, List<i> list, boolean z6, b bVar) {
        z1.g gVar;
        long j9;
        Uri uri;
        int i7;
        i iVar = list.isEmpty() ? null : (i) m4.t.c(list);
        int c7 = iVar == null ? -1 : this.f23263h.c(iVar.f22750d);
        long j10 = j8 - j7;
        long s7 = s(j7);
        if (iVar != null && !this.f23271p) {
            long d7 = iVar.d();
            j10 = Math.max(0L, j10 - d7);
            if (s7 != -9223372036854775807L) {
                s7 = Math.max(0L, s7 - d7);
            }
        }
        this.f23272q.m(j7, j10, s7, list, a(iVar, j8));
        int o7 = this.f23272q.o();
        boolean z7 = c7 != o7;
        Uri uri2 = this.f23260e[o7];
        if (!this.f23262g.e(uri2)) {
            bVar.f23278c = uri2;
            this.f23274s &= uri2.equals(this.f23270o);
            this.f23270o = uri2;
            return;
        }
        z1.g i8 = this.f23262g.i(uri2, true);
        o2.a.e(i8);
        this.f23271p = i8.f23602c;
        w(i8);
        long n7 = i8.f23541h - this.f23262g.n();
        Pair<Long, Integer> f7 = f(iVar, z7, i8, n7, j8);
        long longValue = ((Long) f7.first).longValue();
        int intValue = ((Integer) f7.second).intValue();
        if (longValue >= i8.f23544k || iVar == null || !z7) {
            gVar = i8;
            j9 = n7;
            uri = uri2;
            i7 = o7;
        } else {
            Uri uri3 = this.f23260e[c7];
            z1.g i9 = this.f23262g.i(uri3, true);
            o2.a.e(i9);
            j9 = i9.f23541h - this.f23262g.n();
            Pair<Long, Integer> f8 = f(iVar, false, i9, j9, j8);
            longValue = ((Long) f8.first).longValue();
            intValue = ((Integer) f8.second).intValue();
            i7 = c7;
            uri = uri3;
            gVar = i9;
        }
        if (longValue < gVar.f23544k) {
            this.f23269n = new t1.b();
            return;
        }
        e g7 = g(gVar, longValue, intValue);
        if (g7 == null) {
            if (!gVar.f23548o) {
                bVar.f23278c = uri;
                this.f23274s &= uri.equals(this.f23270o);
                this.f23270o = uri;
                return;
            } else {
                if (z6 || gVar.f23551r.isEmpty()) {
                    bVar.f23277b = true;
                    return;
                }
                g7 = new e((g.e) m4.t.c(gVar.f23551r), (gVar.f23544k + gVar.f23551r.size()) - 1, -1);
            }
        }
        this.f23274s = false;
        this.f23270o = null;
        Uri d8 = d(gVar, g7.f23283a.f23564g);
        v1.f l7 = l(d8, i7);
        bVar.f23276a = l7;
        if (l7 != null) {
            return;
        }
        Uri d9 = d(gVar, g7.f23283a);
        v1.f l8 = l(d9, i7);
        bVar.f23276a = l8;
        if (l8 != null) {
            return;
        }
        boolean w6 = i.w(iVar, uri, gVar, g7, j9);
        if (w6 && g7.f23286d) {
            return;
        }
        bVar.f23276a = i.j(this.f23256a, this.f23257b, this.f23261f[i7], j9, gVar, g7, uri, this.f23264i, this.f23272q.q(), this.f23272q.t(), this.f23267l, this.f23259d, iVar, this.f23265j.a(d9), this.f23265j.a(d8), w6, this.f23266k);
    }

    public int h(long j7, List<? extends v1.n> list) {
        return (this.f23269n != null || this.f23272q.length() < 2) ? list.size() : this.f23272q.l(j7, list);
    }

    public x0 j() {
        return this.f23263h;
    }

    public m2.t k() {
        return this.f23272q;
    }

    public boolean m(v1.f fVar, long j7) {
        m2.t tVar = this.f23272q;
        return tVar.h(tVar.e(this.f23263h.c(fVar.f22750d)), j7);
    }

    public void n() {
        IOException iOException = this.f23269n;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f23270o;
        if (uri == null || !this.f23274s) {
            return;
        }
        this.f23262g.g(uri);
    }

    public boolean o(Uri uri) {
        return m0.s(this.f23260e, uri);
    }

    public void p(v1.f fVar) {
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            this.f23268m = aVar.h();
            this.f23265j.b(aVar.f22748b.f19496a, (byte[]) o2.a.e(aVar.j()));
        }
    }

    public boolean q(Uri uri, long j7) {
        int e7;
        int i7 = 0;
        while (true) {
            Uri[] uriArr = this.f23260e;
            if (i7 >= uriArr.length) {
                i7 = -1;
                break;
            }
            if (uriArr[i7].equals(uri)) {
                break;
            }
            i7++;
        }
        if (i7 == -1 || (e7 = this.f23272q.e(i7)) == -1) {
            return true;
        }
        this.f23274s |= uri.equals(this.f23270o);
        return j7 == -9223372036854775807L || (this.f23272q.h(e7, j7) && this.f23262g.c(uri, j7));
    }

    public void r() {
        this.f23269n = null;
    }

    public void t(boolean z6) {
        this.f23267l = z6;
    }

    public void u(m2.t tVar) {
        this.f23272q = tVar;
    }

    public boolean v(long j7, v1.f fVar, List<? extends v1.n> list) {
        if (this.f23269n != null) {
            return false;
        }
        return this.f23272q.n(j7, fVar, list);
    }
}
