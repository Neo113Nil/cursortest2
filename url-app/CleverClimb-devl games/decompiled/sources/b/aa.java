package b;

import b.s;

/* compiled from: Request.java */
/* loaded from: classes.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    final t f2034a;

    /* renamed from: b, reason: collision with root package name */
    final String f2035b;

    /* renamed from: c, reason: collision with root package name */
    final s f2036c;

    /* renamed from: d, reason: collision with root package name */
    final ab f2037d;
    final Object e;
    private volatile d f;

    aa(a aVar) {
        this.f2034a = aVar.f2038a;
        this.f2035b = aVar.f2039b;
        this.f2036c = aVar.f2040c.a();
        this.f2037d = aVar.f2041d;
        this.e = aVar.e != null ? aVar.e : this;
    }

    public t a() {
        return this.f2034a;
    }

    public String b() {
        return this.f2035b;
    }

    public s c() {
        return this.f2036c;
    }

    public String a(String str) {
        return this.f2036c.a(str);
    }

    public ab d() {
        return this.f2037d;
    }

    public a e() {
        return new a(this);
    }

    public d f() {
        d dVar = this.f;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.f2036c);
        this.f = a2;
        return a2;
    }

    public boolean g() {
        return this.f2034a.c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f2035b);
        sb.append(", url=");
        sb.append(this.f2034a);
        sb.append(", tag=");
        sb.append(this.e != this ? this.e : null);
        sb.append('}');
        return sb.toString();
    }

    /* compiled from: Request.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        t f2038a;

        /* renamed from: b, reason: collision with root package name */
        String f2039b;

        /* renamed from: c, reason: collision with root package name */
        s.a f2040c;

        /* renamed from: d, reason: collision with root package name */
        ab f2041d;
        Object e;

        public a() {
            this.f2039b = "GET";
            this.f2040c = new s.a();
        }

        a(aa aaVar) {
            this.f2038a = aaVar.f2034a;
            this.f2039b = aaVar.f2035b;
            this.f2041d = aaVar.f2037d;
            this.e = aaVar.e;
            this.f2040c = aaVar.f2036c.b();
        }

        public a a(t tVar) {
            if (tVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f2038a = tVar;
            return this;
        }

        public a a(String str, String str2) {
            this.f2040c.c(str, str2);
            return this;
        }

        public a b(String str, String str2) {
            this.f2040c.a(str, str2);
            return this;
        }

        public a a(String str) {
            this.f2040c.b(str);
            return this;
        }

        public a a(s sVar) {
            this.f2040c = sVar.b();
            return this;
        }

        public a a(String str, ab abVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (abVar != null && !b.a.c.f.c(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (abVar == null && b.a.c.f.b(str)) {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
            this.f2039b = str;
            this.f2041d = abVar;
            return this;
        }

        public aa a() {
            if (this.f2038a == null) {
                throw new IllegalStateException("url == null");
            }
            return new aa(this);
        }
    }
}
