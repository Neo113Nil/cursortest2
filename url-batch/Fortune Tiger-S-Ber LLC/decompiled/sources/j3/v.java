package j3;

import androidx.fragment.app.w0;
import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class v implements p3.v {

    /* renamed from: f, reason: collision with root package name */
    public final long f2474f;
    public boolean g;
    public final p3.f h = new p3.f();

    /* renamed from: i, reason: collision with root package name */
    public final p3.f f2475i = new p3.f();

    /* renamed from: j, reason: collision with root package name */
    public boolean f2476j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x f2477k;

    public v(x xVar, long j4, boolean z3) {
        this.f2477k = xVar;
        this.f2474f = j4;
        this.g = z3;
    }

    @Override // p3.v
    public final p3.x a() {
        return this.f2477k.f2486k;
    }

    @Override // p3.v
    public final long c(long j4, p3.f fVar) {
        int i4;
        Throwable th;
        boolean z3;
        long j5;
        do {
            x xVar = this.f2477k;
            synchronized (xVar) {
                xVar.f2486k.h();
                try {
                    synchronized (xVar) {
                        i4 = xVar.f2488m;
                    }
                } finally {
                    xVar.f2486k.k();
                }
            }
            if (i4 == 0 || this.g) {
                th = null;
            } else {
                th = xVar.f2489n;
                if (th == null) {
                    synchronized (xVar) {
                        int i5 = xVar.f2488m;
                        w0.g(i5);
                        th = new c0(i5);
                    }
                }
            }
            if (this.f2476j) {
                throw new IOException("stream closed");
            }
            p3.f fVar2 = this.f2475i;
            long j6 = fVar2.g;
            z3 = false;
            if (j6 > 0) {
                j5 = fVar2.c(Math.min(8192L, j6), fVar);
                long j7 = xVar.c + j5;
                xVar.c = j7;
                long j8 = j7 - xVar.f2481d;
                if (th == null && j8 >= xVar.f2480b.f2455u.b() / 2) {
                    xVar.f2480b.t(xVar.f2479a, j8);
                    xVar.f2481d = xVar.c;
                }
            } else {
                if (!this.g && th == null) {
                    try {
                        xVar.wait();
                        z3 = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                j5 = -1;
            }
        } while (z3);
        if (j5 != -1) {
            return j5;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j4;
        x xVar = this.f2477k;
        synchronized (xVar) {
            this.f2476j = true;
            p3.f fVar = this.f2475i;
            j4 = fVar.g;
            fVar.skip(j4);
            xVar.notifyAll();
        }
        if (j4 > 0) {
            m(j4);
        }
        this.f2477k.a();
    }

    public final void m(long j4) {
        byte[] bArr = d3.c.f1490a;
        this.f2477k.f2480b.q(j4);
    }
}
