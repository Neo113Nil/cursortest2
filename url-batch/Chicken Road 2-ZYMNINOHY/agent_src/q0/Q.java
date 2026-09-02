package q0;

import W.C0112e;
import a.AbstractC0124a;
import android.net.Uri;
import i2.AbstractC0457a;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Q implements u0.k {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f14864a;

    /* renamed from: b, reason: collision with root package name */
    public final Y.z f14865b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.j f14866c;

    /* renamed from: d, reason: collision with root package name */
    public final U f14867d;

    /* renamed from: e, reason: collision with root package name */
    public final C0112e f14868e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f14870g;

    /* renamed from: i, reason: collision with root package name */
    public long f14872i;

    /* renamed from: j, reason: collision with root package name */
    public Y.k f14873j;

    /* renamed from: k, reason: collision with root package name */
    public y0.F f14874k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14875l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U f14876m;

    /* renamed from: f, reason: collision with root package name */
    public final T.r f14869f = new T.r();

    /* renamed from: h, reason: collision with root package name */
    public boolean f14871h = true;

    public Q(U u4, Uri uri, Y.h hVar, B1.j jVar, U u5, C0112e c0112e) {
        this.f14876m = u4;
        this.f14864a = uri;
        this.f14865b = new Y.z(hVar);
        this.f14866c = jVar;
        this.f14867d = u5;
        this.f14868e = c0112e;
        C1377t.f15067b.getAndIncrement();
        this.f14873j = a(0L, null);
    }

    public final Y.k a(long j4, String str) {
        Map map = U.f14881Q;
        if (str != null && !str.startsWith("W/")) {
            L3.h hVar = new L3.h(4);
            hVar.e(map.entrySet());
            hVar.d("If-Range", str);
            map = hVar.a(false);
        }
        Map map2 = Collections.EMPTY_MAP;
        Uri uri = this.f14864a;
        AbstractC0124a.o(uri, "The uri must be set.");
        return new Y.k(uri, 1, null, map, j4, -1L, null, 6);
    }

    @Override // u0.k
    public final void c() {
        Y.h hVar;
        y0.n nVar;
        int i4;
        int i5 = 0;
        String str = null;
        while (i5 == 0 && !this.f14870g) {
            try {
                long j4 = this.f14869f.f2881a;
                Y.k a3 = a(j4, str);
                this.f14873j = a3;
                long b4 = this.f14865b.b(a3);
                if (this.f14870g) {
                    if (i5 != 1 && this.f14866c.n() != -1) {
                        this.f14869f.f2881a = this.f14866c.n();
                    }
                    AbstractC0457a.f(this.f14865b);
                    return;
                }
                List list = (List) this.f14865b.f3752a.t().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (b4 != -1) {
                    b4 += j4;
                    U u4 = this.f14876m;
                    u4.f14912q.post(new M(u4, 0));
                }
                long j5 = b4;
                this.f14876m.f14914s = L0.b.d(this.f14865b.f3752a.t());
                Y.z zVar = this.f14865b;
                L0.b bVar = this.f14876m.f14914s;
                if (bVar == null || (i4 = bVar.f1609f) == -1) {
                    hVar = zVar;
                } else {
                    hVar = new C1376s(zVar, i4, this);
                    y0.F D3 = this.f14876m.D(new T(0, true));
                    this.f14874k = D3;
                    D3.d(U.f14882R);
                }
                this.f14866c.t(hVar, this.f14864a, this.f14865b.f3752a.t(), j4, j5, this.f14867d);
                if (this.f14876m.f14914s != null && (nVar = (y0.n) this.f14866c.f202c) != null && (nVar instanceof R0.d)) {
                    ((R0.d) nVar).f2305s = true;
                }
                if (this.f14871h) {
                    B1.j jVar = this.f14866c;
                    long j6 = this.f14872i;
                    y0.n nVar2 = (y0.n) jVar.f202c;
                    nVar2.getClass();
                    nVar2.a(j4, j6);
                    this.f14871h = false;
                }
                while (i5 == 0 && !this.f14870g) {
                    try {
                        C0112e c0112e = this.f14868e;
                        synchronized (c0112e) {
                            while (!c0112e.f3303b) {
                                c0112e.f3302a.getClass();
                                c0112e.wait();
                            }
                        }
                        B1.j jVar2 = this.f14866c;
                        T.r rVar = this.f14869f;
                        y0.n nVar3 = (y0.n) jVar2.f202c;
                        nVar3.getClass();
                        y0.k kVar = (y0.k) jVar2.f203d;
                        kVar.getClass();
                        i5 = nVar3.c(kVar, rVar);
                        long n = this.f14866c.n();
                        if (n > this.f14876m.f14906i + j4) {
                            C0112e c0112e2 = this.f14868e;
                            synchronized (c0112e2) {
                                c0112e2.f3303b = false;
                            }
                            U u5 = this.f14876m;
                            u5.f14912q.post(u5.f14911p);
                            j4 = n;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i5 == 1) {
                    i5 = 0;
                } else if (this.f14866c.n() != -1) {
                    this.f14869f.f2881a = this.f14866c.n();
                }
                AbstractC0457a.f(this.f14865b);
            } catch (Throwable th) {
                if (i5 != 1 && this.f14866c.n() != -1) {
                    this.f14869f.f2881a = this.f14866c.n();
                }
                AbstractC0457a.f(this.f14865b);
                throw th;
            }
        }
    }

    @Override // u0.k
    public final void d() {
        this.f14870g = true;
    }
}
