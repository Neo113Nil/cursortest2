package b;

import b.s;
import java.io.Closeable;

/* compiled from: Response.java */
/* loaded from: classes.dex */
public final class ac implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final aa f2048a;

    /* renamed from: b, reason: collision with root package name */
    final y f2049b;

    /* renamed from: c, reason: collision with root package name */
    final int f2050c;

    /* renamed from: d, reason: collision with root package name */
    final String f2051d;
    final r e;
    final s f;
    final ad g;
    final ac h;
    final ac i;
    final ac j;
    final long k;
    final long l;
    private volatile d m;

    ac(a aVar) {
        this.f2048a = aVar.f2052a;
        this.f2049b = aVar.f2053b;
        this.f2050c = aVar.f2054c;
        this.f2051d = aVar.f2055d;
        this.e = aVar.e;
        this.f = aVar.f.a();
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
    }

    public aa a() {
        return this.f2048a;
    }

    public int b() {
        return this.f2050c;
    }

    public boolean c() {
        return this.f2050c >= 200 && this.f2050c < 300;
    }

    public r d() {
        return this.e;
    }

    public String a(String str) {
        return a(str, null);
    }

    public String a(String str, String str2) {
        String a2 = this.f.a(str);
        return a2 != null ? a2 : str2;
    }

    public s e() {
        return this.f;
    }

    public ad f() {
        return this.g;
    }

    public a g() {
        return new a(this);
    }

    public d h() {
        d dVar = this.m;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.f);
        this.m = a2;
        return a2;
    }

    public long i() {
        return this.k;
    }

    public long j() {
        return this.l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.g.close();
    }

    public String toString() {
        return "Response{protocol=" + this.f2049b + ", code=" + this.f2050c + ", message=" + this.f2051d + ", url=" + this.f2048a.a() + '}';
    }

    /* compiled from: Response.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        aa f2052a;

        /* renamed from: b, reason: collision with root package name */
        y f2053b;

        /* renamed from: c, reason: collision with root package name */
        int f2054c;

        /* renamed from: d, reason: collision with root package name */
        String f2055d;
        r e;
        s.a f;
        ad g;
        ac h;
        ac i;
        ac j;
        long k;
        long l;

        public a() {
            this.f2054c = -1;
            this.f = new s.a();
        }

        a(ac acVar) {
            this.f2054c = -1;
            this.f2052a = acVar.f2048a;
            this.f2053b = acVar.f2049b;
            this.f2054c = acVar.f2050c;
            this.f2055d = acVar.f2051d;
            this.e = acVar.e;
            this.f = acVar.f.b();
            this.g = acVar.g;
            this.h = acVar.h;
            this.i = acVar.i;
            this.j = acVar.j;
            this.k = acVar.k;
            this.l = acVar.l;
        }

        public a a(aa aaVar) {
            this.f2052a = aaVar;
            return this;
        }

        public a a(y yVar) {
            this.f2053b = yVar;
            return this;
        }

        public a a(int i) {
            this.f2054c = i;
            return this;
        }

        public a a(String str) {
            this.f2055d = str;
            return this;
        }

        public a a(r rVar) {
            this.e = rVar;
            return this;
        }

        public a a(String str, String str2) {
            this.f.a(str, str2);
            return this;
        }

        public a a(s sVar) {
            this.f = sVar.b();
            return this;
        }

        public a a(ad adVar) {
            this.g = adVar;
            return this;
        }

        public a a(ac acVar) {
            if (acVar != null) {
                a("networkResponse", acVar);
            }
            this.h = acVar;
            return this;
        }

        public a b(ac acVar) {
            if (acVar != null) {
                a("cacheResponse", acVar);
            }
            this.i = acVar;
            return this;
        }

        private void a(String str, ac acVar) {
            if (acVar.g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (acVar.h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (acVar.i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (acVar.j == null) {
                return;
            }
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }

        public a c(ac acVar) {
            if (acVar != null) {
                d(acVar);
            }
            this.j = acVar;
            return this;
        }

        private void d(ac acVar) {
            if (acVar.g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(long j) {
            this.k = j;
            return this;
        }

        public a b(long j) {
            this.l = j;
            return this;
        }

        public ac a() {
            if (this.f2052a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f2053b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f2054c < 0) {
                throw new IllegalStateException("code < 0: " + this.f2054c);
            }
            return new ac(this);
        }
    }
}
