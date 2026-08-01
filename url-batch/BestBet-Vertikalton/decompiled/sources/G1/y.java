package G1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f458a;

    /* renamed from: b, reason: collision with root package name */
    public final q f459b;

    /* renamed from: c, reason: collision with root package name */
    public long f460c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f461e;

    /* renamed from: f, reason: collision with root package name */
    public long f462f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f463g;
    public boolean h;
    public final w i;

    /* renamed from: j, reason: collision with root package name */
    public final v f464j;

    /* renamed from: k, reason: collision with root package name */
    public final x f465k;

    /* renamed from: l, reason: collision with root package name */
    public final x f466l;

    /* renamed from: m, reason: collision with root package name */
    public int f467m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f468n;

    public y(int i, q qVar, boolean z2, boolean z3, z1.j jVar) {
        k1.e.e(qVar, "connection");
        this.f458a = i;
        this.f459b = qVar;
        this.f462f = qVar.f426q.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f463g = arrayDeque;
        this.i = new w(this, qVar.f425p.a(), z3);
        this.f464j = new v(this, z2);
        this.f465k = new x(this);
        this.f466l = new x(this);
        if (jVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(jVar);
        }
    }

    public final void a() {
        boolean z2;
        boolean h;
        byte[] bArr = A1.c.f13a;
        synchronized (this) {
            try {
                w wVar = this.i;
                if (!wVar.f453b && wVar.f455e) {
                    v vVar = this.f464j;
                    if (vVar.f449a || vVar.f451c) {
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
            this.f459b.j(this.f458a);
        }
    }

    public final void b() {
        v vVar = this.f464j;
        if (vVar.f451c) {
            throw new IOException("stream closed");
        }
        if (vVar.f449a) {
            throw new IOException("stream finished");
        }
        if (this.f467m != 0) {
            IOException iOException = this.f468n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f467m;
            AbstractC0001b.h(i);
            throw new E(i);
        }
    }

    public final void c(int i, IOException iOException) {
        AbstractC0001b.j("rstStatusCode", i);
        if (d(i, iOException)) {
            q qVar = this.f459b;
            qVar.getClass();
            AbstractC0001b.j("statusCode", i);
            qVar.f432w.s(this.f458a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = A1.c.f13a;
        synchronized (this) {
            if (this.f467m != 0) {
                return false;
            }
            this.f467m = i;
            this.f468n = iOException;
            notifyAll();
            if (this.i.f453b) {
                if (this.f464j.f449a) {
                    return false;
                }
            }
            this.f459b.j(this.f458a);
            return true;
        }
    }

    public final void e(int i) {
        AbstractC0001b.j("errorCode", i);
        if (d(i, null)) {
            this.f459b.s(this.f458a, i);
        }
    }

    public final v f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f464j;
    }

    public final boolean g() {
        boolean z2 = (this.f458a & 1) == 1;
        this.f459b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f467m != 0) {
            return false;
        }
        w wVar = this.i;
        if (wVar.f453b || wVar.f455e) {
            v vVar = this.f464j;
            if (vVar.f449a || vVar.f451c) {
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
    public final void i(z1.j jVar, boolean z2) {
        boolean h;
        k1.e.e(jVar, "headers");
        byte[] bArr = A1.c.f13a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f453b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.f463g.add(jVar);
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
        this.f459b.j(this.f458a);
    }

    public final synchronized void j(int i) {
        AbstractC0001b.j("errorCode", i);
        if (this.f467m == 0) {
            this.f467m = i;
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
