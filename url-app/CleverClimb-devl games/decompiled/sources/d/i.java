package d;

import b.ac;
import b.ad;
import b.v;
import java.io.IOException;

/* compiled from: OkHttpCall.java */
/* loaded from: classes2.dex */
final class i<T> implements d.b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final o<T, ?> f9562a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f9563b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f9564c;

    /* renamed from: d, reason: collision with root package name */
    private b.e f9565d;
    private Throwable e;
    private boolean f;

    i(o<T, ?> oVar, Object[] objArr) {
        this.f9562a = oVar;
        this.f9563b = objArr;
    }

    @Override // d.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public i<T> clone() {
        return new i<>(this.f9562a, this.f9563b);
    }

    @Override // d.b
    public void a(final d<T> dVar) {
        b.e eVar;
        Throwable th;
        if (dVar == null) {
            throw new NullPointerException("callback == null");
        }
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already executed.");
            }
            this.f = true;
            eVar = this.f9565d;
            th = this.e;
            if (eVar == null && th == null) {
                try {
                    b.e e = e();
                    this.f9565d = e;
                    eVar = e;
                } catch (Throwable th2) {
                    th = th2;
                    this.e = th;
                }
            }
        }
        if (th != null) {
            dVar.onFailure(this, th);
            return;
        }
        if (this.f9564c) {
            eVar.b();
        }
        eVar.a(new b.f() { // from class: d.i.1
            @Override // b.f
            public void a(b.e eVar2, ac acVar) throws IOException {
                try {
                    a(i.this.a(acVar));
                } catch (Throwable th3) {
                    a(th3);
                }
            }

            @Override // b.f
            public void a(b.e eVar2, IOException iOException) {
                try {
                    dVar.onFailure(i.this, iOException);
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }

            private void a(Throwable th3) {
                try {
                    dVar.onFailure(i.this, th3);
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
            }

            private void a(m<T> mVar) {
                try {
                    dVar.onResponse(i.this, mVar);
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }
        });
    }

    @Override // d.b
    public m<T> a() throws IOException {
        b.e eVar;
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already executed.");
            }
            this.f = true;
            if (this.e != null) {
                if (this.e instanceof IOException) {
                    throw ((IOException) this.e);
                }
                throw ((RuntimeException) this.e);
            }
            eVar = this.f9565d;
            if (eVar == null) {
                try {
                    eVar = e();
                    this.f9565d = eVar;
                } catch (IOException | RuntimeException e) {
                    this.e = e;
                    throw e;
                }
            }
        }
        if (this.f9564c) {
            eVar.b();
        }
        return a(eVar.a());
    }

    private b.e e() throws IOException {
        b.e a2 = this.f9562a.f9623c.a(this.f9562a.a(this.f9563b));
        if (a2 != null) {
            return a2;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    m<T> a(ac acVar) throws IOException {
        ad f = acVar.f();
        ac a2 = acVar.g().a(new b(f.a(), f.b())).a();
        int b2 = a2.b();
        if (b2 < 200 || b2 >= 300) {
            try {
                return m.a(p.a(f), a2);
            } finally {
                f.close();
            }
        }
        if (b2 == 204 || b2 == 205) {
            f.close();
            return m.a((Object) null, a2);
        }
        a aVar = new a(f);
        try {
            return m.a(this.f9562a.a(aVar), a2);
        } catch (RuntimeException e) {
            aVar.e();
            throw e;
        }
    }

    @Override // d.b
    public boolean b() {
        boolean z = true;
        if (this.f9564c) {
            return true;
        }
        synchronized (this) {
            if (this.f9565d == null || !this.f9565d.c()) {
                z = false;
            }
        }
        return z;
    }

    /* compiled from: OkHttpCall.java */
    static final class b extends ad {

        /* renamed from: a, reason: collision with root package name */
        private final v f9571a;

        /* renamed from: b, reason: collision with root package name */
        private final long f9572b;

        b(v vVar, long j) {
            this.f9571a = vVar;
            this.f9572b = j;
        }

        @Override // b.ad
        public v a() {
            return this.f9571a;
        }

        @Override // b.ad
        public long b() {
            return this.f9572b;
        }

        @Override // b.ad
        public c.e c() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* compiled from: OkHttpCall.java */
    static final class a extends ad {

        /* renamed from: a, reason: collision with root package name */
        IOException f9568a;

        /* renamed from: b, reason: collision with root package name */
        private final ad f9569b;

        a(ad adVar) {
            this.f9569b = adVar;
        }

        @Override // b.ad
        public v a() {
            return this.f9569b.a();
        }

        @Override // b.ad
        public long b() {
            return this.f9569b.b();
        }

        @Override // b.ad
        public c.e c() {
            return c.k.a(new c.g(this.f9569b.c()) { // from class: d.i.a.1
                @Override // c.g, c.r
                public long a(c.c cVar, long j) throws IOException {
                    try {
                        return super.a(cVar, j);
                    } catch (IOException e) {
                        a.this.f9568a = e;
                        throw e;
                    }
                }
            });
        }

        @Override // b.ad, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f9569b.close();
        }

        void e() throws IOException {
            if (this.f9568a != null) {
                throw this.f9568a;
            }
        }
    }
}
