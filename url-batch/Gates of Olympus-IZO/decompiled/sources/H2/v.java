package H2;

import N2.C0150f;
import N2.F;
import N2.H;
import java.io.IOException;

/* loaded from: classes.dex */
public final class v implements F {

    /* renamed from: d, reason: collision with root package name */
    public final long f2028d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2029e;

    /* renamed from: f, reason: collision with root package name */
    public final C0150f f2030f = new C0150f();

    /* renamed from: g, reason: collision with root package name */
    public final C0150f f2031g = new C0150f();

    /* renamed from: h, reason: collision with root package name */
    public boolean f2032h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f2033i;

    public v(x xVar, long j3, boolean z3) {
        this.f2033i = xVar;
        this.f2028d = j3;
        this.f2029e = z3;
    }

    @Override // N2.F
    public final H c() {
        return this.f2033i.f2045k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j3;
        x xVar = this.f2033i;
        synchronized (xVar) {
            this.f2032h = true;
            C0150f c0150f = this.f2031g;
            j3 = c0150f.f2929e;
            c0150f.x(j3);
            xVar.notifyAll();
        }
        if (j3 > 0) {
            byte[] bArr = B2.c.f415a;
            this.f2033i.f2036b.i(j3);
        }
        this.f2033i.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0089 A[LOOP:0: B:3:0x0010->B:40:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c A[SYNTHETIC] */
    @Override // N2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long l(C0150f c0150f, long j3) {
        int i3;
        Throwable th;
        boolean z3;
        long j4;
        Z1.i.f(c0150f, "sink");
        long j5 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        while (true) {
            x xVar = this.f2033i;
            synchronized (xVar) {
                xVar.f2045k.h();
                try {
                    synchronized (xVar) {
                        i3 = xVar.f2047m;
                    }
                    if (z3) {
                        if (j4 != -1) {
                            return j4;
                        }
                        if (th == null) {
                            return -1L;
                        }
                        throw th;
                    }
                    j5 = 0;
                } finally {
                    xVar.f2045k.k();
                }
            }
            if (i3 == 0 || this.f2029e) {
                th = null;
            } else {
                th = xVar.f2048n;
                if (th == null) {
                    synchronized (xVar) {
                        int i4 = xVar.f2047m;
                        AbstractC0080b.n(i4);
                        th = new D(i4);
                    }
                }
            }
            if (this.f2032h) {
                throw new IOException("stream closed");
            }
            C0150f c0150f2 = this.f2031g;
            long j6 = c0150f2.f2929e;
            z3 = false;
            if (j6 > j5) {
                j4 = c0150f2.l(c0150f, Math.min(j3, j6));
                long j7 = xVar.f2037c + j4;
                xVar.f2037c = j7;
                long j8 = j7 - xVar.f2038d;
                if (th == null && j8 >= xVar.f2036b.f1998s.a() / 2) {
                    xVar.f2036b.m(j8, xVar.f2035a);
                    xVar.f2038d = xVar.f2037c;
                }
            } else {
                if (!this.f2029e && th == null) {
                    xVar.k();
                    z3 = true;
                }
                j4 = -1;
            }
            if (z3) {
            }
        }
    }
}
