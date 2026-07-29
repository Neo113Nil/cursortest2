package c;

import java.io.IOException;

/* compiled from: RealBufferedSink.java */
/* loaded from: classes.dex */
final class l implements d {

    /* renamed from: a, reason: collision with root package name */
    public final c f2209a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final q f2210b;

    /* renamed from: c, reason: collision with root package name */
    boolean f2211c;

    l(q qVar) {
        if (qVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f2210b = qVar;
    }

    @Override // c.d, c.e
    public c c() {
        return this.f2209a;
    }

    @Override // c.q
    public void a_(c cVar, long j) throws IOException {
        if (this.f2211c) {
            throw new IllegalStateException("closed");
        }
        this.f2209a.a_(cVar, j);
        v();
    }

    @Override // c.d
    public d b(f fVar) throws IOException {
        if (this.f2211c) {
            throw new IllegalStateException("closed");
        }
        this.f2209a.b(fVar);
        return v();
    }

    @Override // c.d
    public d b(String str) throws IOException {
        if (this.f2211c) {
            throw new IllegalStateException("closed");
        }
        this.f2209a.b(str);
        return v();
    }

    @Override // c.d
    public d c(byte[] bArr) throws IOException {
        if (this.f2211c) {
            throw new IllegalStateException("closed");
        }
        this.f2209a.c(bArr);
        return v();
    }

    @Override // c.d
    public d c(byte[] bArr, int i, int i2) throws IOException {
        if (this.f2211c) {
            throw new IllegalStateException("closed");
        }
        this.f2209a.c(bArr, i, i2);
        return v();
    }

    @Override // c.d
    public d i(int i) throws IOException {
        if (this.f2211c) {
            throw new IllegalStateException("closed");
        }
        this.f2209a.i(i);
        return v();
    }

    @Override // c.d
    public d h(int i) throws IOException {
        if (this.f2211c) {
            throw new IllegalStateException("closed");
        }
        this.f2209a.h(i);
        return v();
    }

    @Override // c.d
    public d g(int i) throws IOException {
        if (this.f2211c) {
            throw new IllegalStateException("closed");
        }
        this.f2209a.g(i);
        return v();
    }

    @Override // c.d
    public d l(long j) throws IOException {
        if (this.f2211c) {
            throw new IllegalStateException("closed");
        }
        this.f2209a.l(j);
        return v();
    }

    @Override // c.d
    public d k(long j) throws IOException {
        if (this.f2211c) {
            throw new IllegalStateException("closed");
        }
        this.f2209a.k(j);
        return v();
    }

    @Override // c.d
    public d v() throws IOException {
        if (this.f2211c) {
            throw new IllegalStateException("closed");
        }
        long h = this.f2209a.h();
        if (h > 0) {
            this.f2210b.a_(this.f2209a, h);
        }
        return this;
    }

    @Override // c.d, c.q, java.io.Flushable
    public void flush() throws IOException {
        if (this.f2211c) {
            throw new IllegalStateException("closed");
        }
        if (this.f2209a.f2186b > 0) {
            this.f2210b.a_(this.f2209a, this.f2209a.f2186b);
        }
        this.f2210b.flush();
    }

    @Override // c.q, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f2211c) {
            return;
        }
        Throwable th = null;
        try {
            if (this.f2209a.f2186b > 0) {
                this.f2210b.a_(this.f2209a, this.f2209a.f2186b);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f2210b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f2211c = true;
        if (th != null) {
            t.a(th);
        }
    }

    @Override // c.q
    public s a() {
        return this.f2210b.a();
    }

    public String toString() {
        return "buffer(" + this.f2210b + ")";
    }
}
