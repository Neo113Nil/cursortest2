package H2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f2035a;

    /* renamed from: b, reason: collision with root package name */
    public final p f2036b;

    /* renamed from: c, reason: collision with root package name */
    public long f2037c;

    /* renamed from: d, reason: collision with root package name */
    public long f2038d;

    /* renamed from: e, reason: collision with root package name */
    public long f2039e;

    /* renamed from: f, reason: collision with root package name */
    public long f2040f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f2041g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2042h;

    /* renamed from: i, reason: collision with root package name */
    public final v f2043i;

    /* renamed from: j, reason: collision with root package name */
    public final u f2044j;

    /* renamed from: k, reason: collision with root package name */
    public final w f2045k;

    /* renamed from: l, reason: collision with root package name */
    public final w f2046l;

    /* renamed from: m, reason: collision with root package name */
    public int f2047m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f2048n;

    public x(int i3, p pVar, boolean z3, boolean z4, A2.o oVar) {
        Z1.i.f(pVar, "connection");
        this.f2035a = i3;
        this.f2036b = pVar;
        this.f2040f = pVar.f1999t.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f2041g = arrayDeque;
        this.f2043i = new v(this, pVar.f1998s.a(), z4);
        this.f2044j = new u(this, z3);
        this.f2045k = new w(this);
        this.f2046l = new w(this);
        if (oVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(oVar);
        }
    }

    public final void a() {
        boolean z3;
        boolean h3;
        byte[] bArr = B2.c.f415a;
        synchronized (this) {
            try {
                v vVar = this.f2043i;
                if (!vVar.f2029e && vVar.f2032h) {
                    u uVar = this.f2044j;
                    if (uVar.f2024d || uVar.f2026f) {
                        z3 = true;
                        h3 = h();
                    }
                }
                z3 = false;
                h3 = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            c(9, null);
        } else {
            if (h3) {
                return;
            }
            this.f2036b.e(this.f2035a);
        }
    }

    public final void b() {
        u uVar = this.f2044j;
        if (uVar.f2026f) {
            throw new IOException("stream closed");
        }
        if (uVar.f2024d) {
            throw new IOException("stream finished");
        }
        if (this.f2047m != 0) {
            IOException iOException = this.f2048n;
            if (iOException != null) {
                throw iOException;
            }
            int i3 = this.f2047m;
            AbstractC0080b.n(i3);
            throw new D(i3);
        }
    }

    public final void c(int i3, IOException iOException) {
        AbstractC0080b.s("rstStatusCode", i3);
        if (d(i3, iOException)) {
            p pVar = this.f2036b;
            pVar.getClass();
            AbstractC0080b.s("statusCode", i3);
            pVar.f2005z.k(this.f2035a, i3);
        }
    }

    public final boolean d(int i3, IOException iOException) {
        byte[] bArr = B2.c.f415a;
        synchronized (this) {
            if (this.f2047m != 0) {
                return false;
            }
            this.f2047m = i3;
            this.f2048n = iOException;
            notifyAll();
            if (this.f2043i.f2029e) {
                if (this.f2044j.f2024d) {
                    return false;
                }
            }
            this.f2036b.e(this.f2035a);
            return true;
        }
    }

    public final void e(int i3) {
        AbstractC0080b.s("errorCode", i3);
        if (d(i3, null)) {
            this.f2036b.k(this.f2035a, i3);
        }
    }

    public final u f() {
        synchronized (this) {
            if (!this.f2042h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f2044j;
    }

    public final boolean g() {
        boolean z3 = (this.f2035a & 1) == 1;
        this.f2036b.getClass();
        return true == z3;
    }

    public final synchronized boolean h() {
        if (this.f2047m != 0) {
            return false;
        }
        v vVar = this.f2043i;
        if (vVar.f2029e || vVar.f2032h) {
            u uVar = this.f2044j;
            if (uVar.f2024d || uVar.f2026f) {
                if (this.f2042h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(A2.o oVar, boolean z3) {
        boolean h3;
        Z1.i.f(oVar, "headers");
        byte[] bArr = B2.c.f415a;
        synchronized (this) {
            try {
                if (this.f2042h && z3) {
                    this.f2043i.getClass();
                    if (z3) {
                        this.f2043i.f2029e = true;
                    }
                    h3 = h();
                    notifyAll();
                }
                this.f2042h = true;
                this.f2041g.add(oVar);
                if (z3) {
                }
                h3 = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h3) {
            return;
        }
        this.f2036b.e(this.f2035a);
    }

    public final synchronized void j(int i3) {
        AbstractC0080b.s("errorCode", i3);
        if (this.f2047m == 0) {
            this.f2047m = i3;
            notifyAll();
        }
    }

    public final void k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
