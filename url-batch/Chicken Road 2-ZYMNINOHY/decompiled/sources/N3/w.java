package N3;

import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class w implements T3.v {

    /* renamed from: a, reason: collision with root package name */
    public final long f1924a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1925b;

    /* renamed from: c, reason: collision with root package name */
    public final T3.g f1926c = new T3.g();

    /* renamed from: d, reason: collision with root package name */
    public final T3.g f1927d = new T3.g();

    /* renamed from: e, reason: collision with root package name */
    public boolean f1928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f1929f;

    public w(y yVar, long j4, boolean z) {
        this.f1929f = yVar;
        this.f1924a = j4;
        this.f1925b = z;
    }

    public final void a(long j4) {
        byte[] bArr = H3.b.f1103a;
        this.f1929f.f1932b.n(j4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j4;
        y yVar = this.f1929f;
        synchronized (yVar) {
            this.f1928e = true;
            T3.g gVar = this.f1927d;
            j4 = gVar.f2975b;
            gVar.skip(j4);
            yVar.notifyAll();
        }
        if (j4 > 0) {
            a(j4);
        }
        this.f1929f.a();
    }

    @Override // T3.v
    public final T3.x d() {
        return this.f1929f.f1941k;
    }

    @Override // T3.v
    public final long j(T3.g sink, long j4) {
        Throwable th;
        boolean z;
        long j5;
        kotlin.jvm.internal.i.e(sink, "sink");
        do {
            y yVar = this.f1929f;
            synchronized (yVar) {
                yVar.f1941k.h();
                try {
                    if (yVar.f() == null || this.f1925b) {
                        th = null;
                    } else {
                        th = yVar.n;
                        if (th == null) {
                            EnumC0078b f4 = yVar.f();
                            kotlin.jvm.internal.i.b(f4);
                            th = new E(f4);
                        }
                    }
                    if (this.f1928e) {
                        throw new IOException("stream closed");
                    }
                    T3.g gVar = this.f1927d;
                    long j6 = gVar.f2975b;
                    z = false;
                    if (j6 > 0) {
                        j5 = gVar.j(sink, Math.min(8192L, j6));
                        long j7 = yVar.f1933c + j5;
                        yVar.f1933c = j7;
                        long j8 = j7 - yVar.f1934d;
                        if (th == null && j8 >= yVar.f1932b.f1893p.a() / 2) {
                            yVar.f1932b.u(yVar.f1931a, j8);
                            yVar.f1934d = yVar.f1933c;
                        }
                    } else {
                        if (!this.f1925b && th == null) {
                            try {
                                yVar.wait();
                                z = true;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        j5 = -1;
                    }
                    yVar.f1941k.k();
                } catch (Throwable th2) {
                    yVar.f1941k.k();
                    throw th2;
                }
            }
        } while (z);
        if (j5 != -1) {
            a(j5);
            return j5;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }
}
