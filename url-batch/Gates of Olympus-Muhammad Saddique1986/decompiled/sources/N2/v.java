package N2;

import T2.C0231f;
import T2.F;
import T2.H;
import java.io.IOException;

/* loaded from: classes.dex */
public final class v implements F {

    /* renamed from: d, reason: collision with root package name */
    public final long f3685d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3686e;

    /* renamed from: f, reason: collision with root package name */
    public final C0231f f3687f = new C0231f();

    /* renamed from: g, reason: collision with root package name */
    public final C0231f f3688g = new C0231f();

    /* renamed from: h, reason: collision with root package name */
    public boolean f3689h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f3690i;

    public v(x xVar, long j3, boolean z3) {
        this.f3690i = xVar;
        this.f3685d = j3;
        this.f3686e = z3;
    }

    @Override // T2.F
    public final H c() {
        return this.f3690i.f3702k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j3;
        x xVar = this.f3690i;
        synchronized (xVar) {
            this.f3689h = true;
            C0231f c0231f = this.f3688g;
            j3 = c0231f.f4409e;
            c0231f.v(j3);
            xVar.notifyAll();
        }
        if (j3 > 0) {
            byte[] bArr = H2.b.f2632a;
            this.f3690i.f3693b.g(j3);
        }
        this.f3690i.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0089 A[LOOP:0: B:3:0x0010->B:40:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c A[SYNTHETIC] */
    @Override // T2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(C0231f c0231f, long j3) {
        int i3;
        Throwable th;
        boolean z3;
        long j4;
        f2.j.f(c0231f, "sink");
        long j5 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        while (true) {
            x xVar = this.f3690i;
            synchronized (xVar) {
                xVar.f3702k.h();
                try {
                    synchronized (xVar) {
                        i3 = xVar.f3704m;
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
                    xVar.f3702k.k();
                }
            }
            if (i3 == 0 || this.f3686e) {
                th = null;
            } else {
                th = xVar.f3705n;
                if (th == null) {
                    synchronized (xVar) {
                        int i4 = xVar.f3704m;
                        A.k.m(i4);
                        th = new D(i4);
                    }
                }
            }
            if (this.f3689h) {
                throw new IOException("stream closed");
            }
            C0231f c0231f2 = this.f3688g;
            long j6 = c0231f2.f4409e;
            z3 = false;
            if (j6 > j5) {
                j4 = c0231f2.f(c0231f, Math.min(j3, j6));
                long j7 = xVar.f3694c + j4;
                xVar.f3694c = j7;
                long j8 = j7 - xVar.f3695d;
                if (th == null && j8 >= xVar.f3693b.f3655s.a() / 2) {
                    xVar.f3693b.n(j8, xVar.f3692a);
                    xVar.f3695d = xVar.f3694c;
                }
            } else {
                if (!this.f3686e && th == null) {
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
