package y1;

import Y.V;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f4312a;

    /* renamed from: b, reason: collision with root package name */
    public final o f4313b;

    /* renamed from: c, reason: collision with root package name */
    public long f4314c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f4315e;

    /* renamed from: f, reason: collision with root package name */
    public long f4316f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f4317g;
    public boolean h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final t f4318j;

    /* renamed from: k, reason: collision with root package name */
    public final v f4319k;

    /* renamed from: l, reason: collision with root package name */
    public final v f4320l;

    /* renamed from: m, reason: collision with root package name */
    public int f4321m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f4322n;

    public w(int i, o oVar, boolean z2, boolean z3, r1.k kVar) {
        g1.d.e(oVar, "connection");
        this.f4312a = i;
        this.f4313b = oVar;
        this.f4316f = oVar.f4280q.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f4317g = arrayDeque;
        this.i = new u(this, oVar.f4279p.c(), z3);
        this.f4318j = new t(this, z2);
        this.f4319k = new v(this);
        this.f4320l = new v(this);
        if (kVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(kVar);
        }
    }

    public final void a() {
        boolean z2;
        boolean h;
        byte[] bArr = s1.b.f3721a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f4307b && uVar.f4309e) {
                    t tVar = this.f4318j;
                    if (tVar.f4303a || tVar.f4305c) {
                        z2 = true;
                        h = h();
                    }
                }
                z2 = false;
                h = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            c(9, null);
        } else {
            if (h) {
                return;
            }
            this.f4313b.i(this.f4312a);
        }
    }

    public final void b() {
        t tVar = this.f4318j;
        if (tVar.f4305c) {
            throw new IOException("stream closed");
        }
        if (tVar.f4303a) {
            throw new IOException("stream finished");
        }
        if (this.f4321m != 0) {
            IOException iOException = this.f4322n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f4321m;
            V.g(i);
            throw new A(i);
        }
    }

    public final void c(int i, IOException iOException) {
        V.h("rstStatusCode", i);
        if (d(i, iOException)) {
            o oVar = this.f4313b;
            oVar.getClass();
            V.h("statusCode", i);
            oVar.f4286w.m(this.f4312a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = s1.b.f3721a;
        synchronized (this) {
            if (this.f4321m != 0) {
                return false;
            }
            this.f4321m = i;
            this.f4322n = iOException;
            notifyAll();
            if (this.i.f4307b) {
                if (this.f4318j.f4303a) {
                    return false;
                }
            }
            this.f4313b.i(this.f4312a);
            return true;
        }
    }

    public final void e(int i) {
        V.h("errorCode", i);
        if (d(i, null)) {
            this.f4313b.m(this.f4312a, i);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f4318j;
    }

    public final boolean g() {
        boolean z2 = (this.f4312a & 1) == 1;
        this.f4313b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f4321m != 0) {
            return false;
        }
        u uVar = this.i;
        if (uVar.f4307b || uVar.f4309e) {
            t tVar = this.f4318j;
            if (tVar.f4303a || tVar.f4305c) {
                if (this.h) {
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
    public final void i(r1.k kVar, boolean z2) {
        boolean h;
        g1.d.e(kVar, "headers");
        byte[] bArr = s1.b.f3721a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f4307b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.f4317g.add(kVar);
                if (z2) {
                }
                h = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h) {
            return;
        }
        this.f4313b.i(this.f4312a);
    }

    public final synchronized void j(int i) {
        V.h("errorCode", i);
        if (this.f4321m == 0) {
            this.f4321m = i;
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
