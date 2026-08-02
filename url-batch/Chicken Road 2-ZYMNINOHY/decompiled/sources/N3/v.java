package N3;

import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class v implements T3.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1920a;

    /* renamed from: b, reason: collision with root package name */
    public final T3.g f1921b = new T3.g();

    /* renamed from: c, reason: collision with root package name */
    public boolean f1922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f1923d;

    public v(y yVar, boolean z) {
        this.f1923d = yVar;
        this.f1920a = z;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z) {
        long min;
        boolean z4;
        y yVar = this.f1923d;
        synchronized (yVar) {
            yVar.f1942l.h();
            while (yVar.f1935e >= yVar.f1936f && !this.f1920a && !this.f1922c && yVar.f() == null) {
                try {
                    try {
                        yVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    yVar.f1942l.k();
                    throw th;
                }
            }
            yVar.f1942l.k();
            yVar.b();
            min = Math.min(yVar.f1936f - yVar.f1935e, this.f1921b.f2975b);
            yVar.f1935e += min;
            z4 = z && min == this.f1921b.f2975b;
        }
        this.f1923d.f1942l.h();
        try {
            y yVar2 = this.f1923d;
            yVar2.f1932b.s(yVar2.f1931a, z4, this.f1921b, min);
        } finally {
            this.f1923d.f1942l.k();
        }
    }

    @Override // T3.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y yVar = this.f1923d;
        byte[] bArr = H3.b.f1103a;
        synchronized (yVar) {
            if (this.f1922c) {
                return;
            }
            boolean z = yVar.f() == null;
            y yVar2 = this.f1923d;
            if (!yVar2.f1940j.f1920a) {
                if (this.f1921b.f2975b > 0) {
                    while (this.f1921b.f2975b > 0) {
                        a(true);
                    }
                } else if (z) {
                    yVar2.f1932b.s(yVar2.f1931a, true, null, 0L);
                }
            }
            synchronized (this.f1923d) {
                this.f1922c = true;
            }
            this.f1923d.f1932b.flush();
            this.f1923d.a();
        }
    }

    @Override // T3.t
    public final T3.x d() {
        return this.f1923d.f1942l;
    }

    @Override // T3.t, java.io.Flushable
    public final void flush() {
        y yVar = this.f1923d;
        byte[] bArr = H3.b.f1103a;
        synchronized (yVar) {
            yVar.b();
        }
        while (this.f1921b.f2975b > 0) {
            a(false);
            this.f1923d.f1932b.flush();
        }
    }

    @Override // T3.t
    public final void o(T3.g gVar, long j4) {
        byte[] bArr = H3.b.f1103a;
        T3.g gVar2 = this.f1921b;
        gVar2.o(gVar, j4);
        while (gVar2.f2975b >= 16384) {
            a(false);
        }
    }
}
