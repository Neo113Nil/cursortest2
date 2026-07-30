package com.anythink.core.common.n.b;

import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.n.b.u;
import com.google.android.gms.internal.ads.CL;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class af implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final ad f15657a;

    /* renamed from: b, reason: collision with root package name */
    final ab f15658b;

    /* renamed from: c, reason: collision with root package name */
    final int f15659c;

    /* renamed from: d, reason: collision with root package name */
    final String f15660d;

    /* renamed from: e, reason: collision with root package name */
    final t f15661e;

    /* renamed from: f, reason: collision with root package name */
    final u f15662f;

    /* renamed from: g, reason: collision with root package name */
    final ag f15663g;

    /* renamed from: h, reason: collision with root package name */
    final af f15664h;
    final af i;

    /* renamed from: j, reason: collision with root package name */
    final af f15665j;

    /* renamed from: k, reason: collision with root package name */
    final long f15666k;

    /* renamed from: l, reason: collision with root package name */
    final long f15667l;

    /* renamed from: m, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.b.c f15668m;

    /* renamed from: n, reason: collision with root package name */
    private volatile d f15669n;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        ad f15670a;

        /* renamed from: b, reason: collision with root package name */
        ab f15671b;

        /* renamed from: c, reason: collision with root package name */
        int f15672c;

        /* renamed from: d, reason: collision with root package name */
        String f15673d;

        /* renamed from: e, reason: collision with root package name */
        t f15674e;

        /* renamed from: f, reason: collision with root package name */
        u.a f15675f;

        /* renamed from: g, reason: collision with root package name */
        ag f15676g;

        /* renamed from: h, reason: collision with root package name */
        af f15677h;
        af i;

        /* renamed from: j, reason: collision with root package name */
        af f15678j;

        /* renamed from: k, reason: collision with root package name */
        long f15679k;

        /* renamed from: l, reason: collision with root package name */
        long f15680l;

        /* renamed from: m, reason: collision with root package name */
        com.anythink.core.common.n.b.a.b.c f15681m;

        public a() {
            this.f15672c = -1;
            this.f15675f = new u.a();
        }

        private static void d(af afVar) {
            if (afVar.f15663g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public final a a(ad adVar) {
            this.f15670a = adVar;
            return this;
        }

        public final a b(String str, String str2) {
            this.f15675f.a(str, str2);
            return this;
        }

        public final a c(af afVar) {
            if (afVar != null && afVar.f15663g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            this.f15678j = afVar;
            return this;
        }

        private a b(String str) {
            this.f15675f.b(str);
            return this;
        }

        public final a a(ab abVar) {
            this.f15671b = abVar;
            return this;
        }

        public final a a(int i) {
            this.f15672c = i;
            return this;
        }

        public final a b(af afVar) {
            if (afVar != null) {
                a("cacheResponse", afVar);
            }
            this.i = afVar;
            return this;
        }

        public a(af afVar) {
            this.f15672c = -1;
            this.f15670a = afVar.f15657a;
            this.f15671b = afVar.f15658b;
            this.f15672c = afVar.f15659c;
            this.f15673d = afVar.f15660d;
            this.f15674e = afVar.f15661e;
            this.f15675f = afVar.f15662f.b();
            this.f15676g = afVar.f15663g;
            this.f15677h = afVar.f15664h;
            this.i = afVar.i;
            this.f15678j = afVar.f15665j;
            this.f15679k = afVar.f15666k;
            this.f15680l = afVar.f15667l;
            this.f15681m = afVar.f15668m;
        }

        public final a a(String str) {
            this.f15673d = str;
            return this;
        }

        public final a a(t tVar) {
            this.f15674e = tVar;
            return this;
        }

        public final a b(long j9) {
            this.f15680l = j9;
            return this;
        }

        public final a a(String str, String str2) {
            this.f15675f.d(str, str2);
            return this;
        }

        public final a a(u uVar) {
            this.f15675f = uVar.b();
            return this;
        }

        public final a a(ag agVar) {
            this.f15676g = agVar;
            return this;
        }

        public final a a(af afVar) {
            if (afVar != null) {
                a("networkResponse", afVar);
            }
            this.f15677h = afVar;
            return this;
        }

        private static void a(String str, af afVar) {
            if (afVar.f15663g == null) {
                if (afVar.f15664h == null) {
                    if (afVar.i == null) {
                        if (afVar.f15665j != null) {
                            throw new IllegalArgumentException(CL.j(str, ".priorResponse != null"));
                        }
                        return;
                    }
                    throw new IllegalArgumentException(CL.j(str, ".cacheResponse != null"));
                }
                throw new IllegalArgumentException(CL.j(str, ".networkResponse != null"));
            }
            throw new IllegalArgumentException(CL.j(str, ".body != null"));
        }

        public final a a(long j9) {
            this.f15679k = j9;
            return this;
        }

        private void a(com.anythink.core.common.n.b.a.b.c cVar) {
            this.f15681m = cVar;
        }

        public final af a() {
            if (this.f15670a != null) {
                if (this.f15671b != null) {
                    if (this.f15672c >= 0) {
                        if (this.f15673d != null) {
                            return new af(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f15672c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public af(a aVar) {
        this.f15657a = aVar.f15670a;
        this.f15658b = aVar.f15671b;
        this.f15659c = aVar.f15672c;
        this.f15660d = aVar.f15673d;
        this.f15661e = aVar.f15674e;
        this.f15662f = aVar.f15675f.a();
        this.f15663g = aVar.f15676g;
        this.f15664h = aVar.f15677h;
        this.i = aVar.i;
        this.f15665j = aVar.f15678j;
        this.f15666k = aVar.f15679k;
        this.f15667l = aVar.f15680l;
        this.f15668m = aVar.f15681m;
    }

    private boolean n() {
        int i = this.f15659c;
        return i >= 200 && i < 300;
    }

    private u o() {
        com.anythink.core.common.n.b.a.b.c cVar = this.f15668m;
        if (cVar != null) {
            return cVar.e();
        }
        throw new IllegalStateException("trailers not available");
    }

    private boolean p() {
        int i = this.f15659c;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case BaseATView.a.f9932L /* 301 */:
            case 302:
            case BaseATView.a.f9934N /* 303 */:
                return true;
            default:
                return false;
        }
    }

    private af q() {
        return this.i;
    }

    private List<h> r() {
        String str;
        int i = this.f15659c;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return Collections.EMPTY_LIST;
            }
            str = "Proxy-Authenticate";
        }
        return com.anythink.core.common.n.b.a.c.e.a(this.f15662f, str);
    }

    public final ad a() {
        return this.f15657a;
    }

    public final ab b() {
        return this.f15658b;
    }

    public final int c() {
        return this.f15659c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ag agVar = this.f15663g;
        if (agVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        agVar.close();
    }

    public final String d() {
        return this.f15660d;
    }

    public final t e() {
        return this.f15661e;
    }

    public final u f() {
        return this.f15662f;
    }

    public final ag g() {
        return this.f15663g;
    }

    public final a h() {
        return new a(this);
    }

    public final af i() {
        return this.f15664h;
    }

    public final af j() {
        return this.f15665j;
    }

    public final d k() {
        d dVar = this.f15669n;
        if (dVar != null) {
            return dVar;
        }
        d a9 = d.a(this.f15662f);
        this.f15669n = a9;
        return a9;
    }

    public final long l() {
        return this.f15666k;
    }

    public final long m() {
        return this.f15667l;
    }

    public final String toString() {
        return "Response{protocol=" + this.f15658b + ", code=" + this.f15659c + ", message=" + this.f15660d + ", url=" + this.f15657a.f15638a + '}';
    }

    private String a(String str, String str2) {
        String a9 = this.f15662f.a(str);
        return a9 != null ? a9 : str2;
    }

    private List<String> b(String str) {
        return this.f15662f.b(str);
    }

    private ag a(long j9) {
        com.anythink.core.common.n.c.e h9 = this.f15663g.c().h();
        com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
        h9.b(j9);
        cVar.a(h9, Math.min(j9, h9.d().b()));
        return ag.a(this.f15663g.a(), cVar.b(), cVar);
    }

    public final String a(String str) {
        String a9 = this.f15662f.a(str);
        if (a9 != null) {
            return a9;
        }
        return null;
    }
}
