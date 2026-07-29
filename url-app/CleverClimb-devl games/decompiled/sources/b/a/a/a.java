package b.a.a;

import b.a.a.c;
import b.a.c.f;
import b.a.c.h;
import b.aa;
import b.ac;
import b.ad;
import b.s;
import b.u;
import b.y;
import c.k;
import c.q;
import c.r;
import c.s;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: CacheInterceptor.java */
/* loaded from: classes.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    final e f1808a;

    public a(e eVar) {
        this.f1808a = eVar;
    }

    @Override // b.u
    public ac intercept(u.a aVar) throws IOException {
        ac a2 = this.f1808a != null ? this.f1808a.a(aVar.a()) : null;
        c a3 = new c.a(System.currentTimeMillis(), aVar.a(), a2).a();
        aa aaVar = a3.f1813a;
        ac acVar = a3.f1814b;
        if (this.f1808a != null) {
            this.f1808a.a(a3);
        }
        if (a2 != null && acVar == null) {
            b.a.c.a(a2.f());
        }
        if (aaVar == null && acVar == null) {
            return new ac.a().a(aVar.a()).a(y.HTTP_1_1).a(504).a("Unsatisfiable Request (only-if-cached)").a(b.a.c.f1855c).a(-1L).b(System.currentTimeMillis()).a();
        }
        if (aaVar == null) {
            return acVar.g().b(a(acVar)).a();
        }
        try {
            ac a4 = aVar.a(aaVar);
            if (a4 == null && a2 != null) {
            }
            if (acVar != null) {
                if (a4.b() == 304) {
                    ac a5 = acVar.g().a(a(acVar.e(), a4.e())).a(a4.i()).b(a4.j()).b(a(acVar)).a(a(a4)).a();
                    a4.f().close();
                    this.f1808a.a();
                    this.f1808a.a(acVar, a5);
                    return a5;
                }
                b.a.c.a(acVar.f());
            }
            ac a6 = a4.g().b(a(acVar)).a(a(a4)).a();
            if (this.f1808a != null) {
                if (b.a.c.e.b(a6) && c.a(a6, aaVar)) {
                    return a(this.f1808a.a(a6), a6);
                }
                if (f.a(aaVar.b())) {
                    try {
                        this.f1808a.b(aaVar);
                    } catch (IOException unused) {
                    }
                }
            }
            return a6;
        } finally {
            if (a2 != null) {
                b.a.c.a(a2.f());
            }
        }
    }

    private static ac a(ac acVar) {
        return (acVar == null || acVar.f() == null) ? acVar : acVar.g().a((ad) null).a();
    }

    private ac a(final b bVar, ac acVar) throws IOException {
        q a2;
        if (bVar == null || (a2 = bVar.a()) == null) {
            return acVar;
        }
        final c.e c2 = acVar.f().c();
        final c.d a3 = k.a(a2);
        return acVar.g().a(new h(acVar.e(), k.a(new r() { // from class: b.a.a.a.1

            /* renamed from: a, reason: collision with root package name */
            boolean f1809a;

            @Override // c.r
            public long a(c.c cVar, long j) throws IOException {
                try {
                    long a4 = c2.a(cVar, j);
                    if (a4 == -1) {
                        if (!this.f1809a) {
                            this.f1809a = true;
                            a3.close();
                        }
                        return -1L;
                    }
                    cVar.a(a3.c(), cVar.b() - a4, a4);
                    a3.v();
                    return a4;
                } catch (IOException e) {
                    if (!this.f1809a) {
                        this.f1809a = true;
                        bVar.b();
                    }
                    throw e;
                }
            }

            @Override // c.r
            public s a() {
                return c2.a();
            }

            @Override // c.r, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.f1809a && !b.a.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f1809a = true;
                    bVar.b();
                }
                c2.close();
            }
        }))).a();
    }

    private static b.s a(b.s sVar, b.s sVar2) {
        s.a aVar = new s.a();
        int a2 = sVar.a();
        for (int i = 0; i < a2; i++) {
            String a3 = sVar.a(i);
            String b2 = sVar.b(i);
            if ((!"Warning".equalsIgnoreCase(a3) || !b2.startsWith("1")) && (!a(a3) || sVar2.a(a3) == null)) {
                b.a.a.f1807a.a(aVar, a3, b2);
            }
        }
        int a4 = sVar2.a();
        for (int i2 = 0; i2 < a4; i2++) {
            String a5 = sVar2.a(i2);
            if (!"Content-Length".equalsIgnoreCase(a5) && a(a5)) {
                b.a.a.f1807a.a(aVar, a5, sVar2.b(i2));
            }
        }
        return aVar.a();
    }

    static boolean a(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
