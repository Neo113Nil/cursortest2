package b.a.d;

import b.a.b.g;
import b.a.c.h;
import b.a.c.i;
import b.aa;
import b.ac;
import b.ad;
import b.s;
import b.t;
import b.x;
import c.k;
import c.q;
import c.r;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: Http1Codec.java */
/* loaded from: classes.dex */
public final class a implements b.a.c.c {

    /* renamed from: a, reason: collision with root package name */
    final x f1878a;

    /* renamed from: b, reason: collision with root package name */
    final g f1879b;

    /* renamed from: c, reason: collision with root package name */
    final c.e f1880c;

    /* renamed from: d, reason: collision with root package name */
    final c.d f1881d;
    int e = 0;

    public a(x xVar, g gVar, c.e eVar, c.d dVar) {
        this.f1878a = xVar;
        this.f1879b = gVar;
        this.f1880c = eVar;
        this.f1881d = dVar;
    }

    @Override // b.a.c.c
    public q a(aa aaVar, long j) {
        if ("chunked".equalsIgnoreCase(aaVar.a("Transfer-Encoding"))) {
            return e();
        }
        if (j != -1) {
            return a(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // b.a.c.c
    public void c() {
        b.a.b.c b2 = this.f1879b.b();
        if (b2 != null) {
            b2.b();
        }
    }

    @Override // b.a.c.c
    public void a(aa aaVar) throws IOException {
        a(aaVar.c(), i.a(aaVar, this.f1879b.b().a().b().type()));
    }

    @Override // b.a.c.c
    public ad a(ac acVar) throws IOException {
        return new h(acVar.e(), k.a(b(acVar)));
    }

    private r b(ac acVar) throws IOException {
        if (!b.a.c.e.b(acVar)) {
            return b(0L);
        }
        if ("chunked".equalsIgnoreCase(acVar.a("Transfer-Encoding"))) {
            return a(acVar.a().a());
        }
        long a2 = b.a.c.e.a(acVar);
        if (a2 != -1) {
            return b(a2);
        }
        return f();
    }

    @Override // b.a.c.c
    public void a() throws IOException {
        this.f1881d.flush();
    }

    @Override // b.a.c.c
    public void b() throws IOException {
        this.f1881d.flush();
    }

    public void a(s sVar, String str) throws IOException {
        if (this.e != 0) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.f1881d.b(str).b("\r\n");
        int a2 = sVar.a();
        for (int i = 0; i < a2; i++) {
            this.f1881d.b(sVar.a(i)).b(": ").b(sVar.b(i)).b("\r\n");
        }
        this.f1881d.b("\r\n");
        this.e = 1;
    }

    @Override // b.a.c.c
    public ac.a a(boolean z) throws IOException {
        if (this.e != 1 && this.e != 3) {
            throw new IllegalStateException("state: " + this.e);
        }
        try {
            b.a.c.k a2 = b.a.c.k.a(this.f1880c.q());
            ac.a a3 = new ac.a().a(a2.f1875a).a(a2.f1876b).a(a2.f1877c).a(d());
            if (z && a2.f1876b == 100) {
                return null;
            }
            this.e = 4;
            return a3;
        } catch (EOFException e2) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f1879b);
            iOException.initCause(e2);
            throw iOException;
        }
    }

    public s d() throws IOException {
        s.a aVar = new s.a();
        while (true) {
            String q = this.f1880c.q();
            if (q.length() != 0) {
                b.a.a.f1807a.a(aVar, q);
            } else {
                return aVar.a();
            }
        }
    }

    public q e() {
        if (this.e != 1) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 2;
        return new b();
    }

    public q a(long j) {
        if (this.e != 1) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 2;
        return new d(j);
    }

    public r b(long j) throws IOException {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 5;
        return new e(j);
    }

    public r a(t tVar) throws IOException {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 5;
        return new c(tVar);
    }

    public r f() throws IOException {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        if (this.f1879b == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.e = 5;
        this.f1879b.d();
        return new f();
    }

    void a(c.h hVar) {
        c.s a2 = hVar.a();
        hVar.a(c.s.f2222c);
        a2.f();
        a2.g_();
    }

    /* compiled from: Http1Codec.java */
    private final class d implements q {

        /* renamed from: b, reason: collision with root package name */
        private final c.h f1890b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1891c;

        /* renamed from: d, reason: collision with root package name */
        private long f1892d;

        d(long j) {
            this.f1890b = new c.h(a.this.f1881d.a());
            this.f1892d = j;
        }

        @Override // c.q
        public c.s a() {
            return this.f1890b;
        }

        @Override // c.q
        public void a_(c.c cVar, long j) throws IOException {
            if (this.f1891c) {
                throw new IllegalStateException("closed");
            }
            b.a.c.a(cVar.b(), 0L, j);
            if (j > this.f1892d) {
                throw new ProtocolException("expected " + this.f1892d + " bytes but received " + j);
            }
            a.this.f1881d.a_(cVar, j);
            this.f1892d -= j;
        }

        @Override // c.q, java.io.Flushable
        public void flush() throws IOException {
            if (this.f1891c) {
                return;
            }
            a.this.f1881d.flush();
        }

        @Override // c.q, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f1891c) {
                return;
            }
            this.f1891c = true;
            if (this.f1892d > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.a(this.f1890b);
            a.this.e = 3;
        }
    }

    /* compiled from: Http1Codec.java */
    private final class b implements q {

        /* renamed from: b, reason: collision with root package name */
        private final c.h f1886b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1887c;

        b() {
            this.f1886b = new c.h(a.this.f1881d.a());
        }

        @Override // c.q
        public c.s a() {
            return this.f1886b;
        }

        @Override // c.q
        public void a_(c.c cVar, long j) throws IOException {
            if (this.f1887c) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            a.this.f1881d.k(j);
            a.this.f1881d.b("\r\n");
            a.this.f1881d.a_(cVar, j);
            a.this.f1881d.b("\r\n");
        }

        @Override // c.q, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f1887c) {
                return;
            }
            a.this.f1881d.flush();
        }

        @Override // c.q, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f1887c) {
                return;
            }
            this.f1887c = true;
            a.this.f1881d.b("0\r\n\r\n");
            a.this.a(this.f1886b);
            a.this.e = 3;
        }
    }

    /* compiled from: Http1Codec.java */
    /* renamed from: b.a.d.a$a, reason: collision with other inner class name */
    private abstract class AbstractC0015a implements r {

        /* renamed from: a, reason: collision with root package name */
        protected final c.h f1882a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f1883b;

        private AbstractC0015a() {
            this.f1882a = new c.h(a.this.f1880c.a());
        }

        @Override // c.r
        public c.s a() {
            return this.f1882a;
        }

        protected final void a(boolean z) throws IOException {
            if (a.this.e == 6) {
                return;
            }
            if (a.this.e != 5) {
                throw new IllegalStateException("state: " + a.this.e);
            }
            a.this.a(this.f1882a);
            a.this.e = 6;
            if (a.this.f1879b != null) {
                a.this.f1879b.a(!z, a.this);
            }
        }
    }

    /* compiled from: Http1Codec.java */
    private class e extends AbstractC0015a {
        private long e;

        public e(long j) throws IOException {
            super();
            this.e = j;
            if (this.e == 0) {
                a(true);
            }
        }

        @Override // c.r
        public long a(c.c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f1883b) {
                throw new IllegalStateException("closed");
            }
            if (this.e == 0) {
                return -1L;
            }
            long a2 = a.this.f1880c.a(cVar, Math.min(this.e, j));
            if (a2 == -1) {
                a(false);
                throw new ProtocolException("unexpected end of stream");
            }
            this.e -= a2;
            if (this.e == 0) {
                a(true);
            }
            return a2;
        }

        @Override // c.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f1883b) {
                return;
            }
            if (this.e != 0 && !b.a.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false);
            }
            this.f1883b = true;
        }
    }

    /* compiled from: Http1Codec.java */
    private class c extends AbstractC0015a {
        private final t e;
        private long f;
        private boolean g;

        c(t tVar) {
            super();
            this.f = -1L;
            this.g = true;
            this.e = tVar;
        }

        @Override // c.r
        public long a(c.c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f1883b) {
                throw new IllegalStateException("closed");
            }
            if (!this.g) {
                return -1L;
            }
            if (this.f == 0 || this.f == -1) {
                b();
                if (!this.g) {
                    return -1L;
                }
            }
            long a2 = a.this.f1880c.a(cVar, Math.min(j, this.f));
            if (a2 == -1) {
                a(false);
                throw new ProtocolException("unexpected end of stream");
            }
            this.f -= a2;
            return a2;
        }

        private void b() throws IOException {
            if (this.f != -1) {
                a.this.f1880c.q();
            }
            try {
                this.f = a.this.f1880c.n();
                String trim = a.this.f1880c.q().trim();
                if (this.f < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f + trim + "\"");
                }
                if (this.f == 0) {
                    this.g = false;
                    b.a.c.e.a(a.this.f1878a.f(), this.e, a.this.d());
                    a(true);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // c.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f1883b) {
                return;
            }
            if (this.g && !b.a.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false);
            }
            this.f1883b = true;
        }
    }

    /* compiled from: Http1Codec.java */
    private class f extends AbstractC0015a {
        private boolean e;

        f() {
            super();
        }

        @Override // c.r
        public long a(c.c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f1883b) {
                throw new IllegalStateException("closed");
            }
            if (this.e) {
                return -1L;
            }
            long a2 = a.this.f1880c.a(cVar, j);
            if (a2 != -1) {
                return a2;
            }
            this.e = true;
            a(true);
            return -1L;
        }

        @Override // c.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f1883b) {
                return;
            }
            if (!this.e) {
                a(false);
            }
            this.f1883b = true;
        }
    }
}
