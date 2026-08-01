package r1;

import X.V;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f3617a;

    /* renamed from: b, reason: collision with root package name */
    public final o f3618b;

    /* renamed from: c, reason: collision with root package name */
    public long f3619c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f3620e;

    /* renamed from: f, reason: collision with root package name */
    public long f3621f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f3622g;
    public boolean h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final t f3623j;

    /* renamed from: k, reason: collision with root package name */
    public final v f3624k;

    /* renamed from: l, reason: collision with root package name */
    public final v f3625l;

    /* renamed from: m, reason: collision with root package name */
    public int f3626m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f3627n;

    public w(int i, o oVar, boolean z2, boolean z3, k1.l lVar) {
        Z0.d.e(oVar, "connection");
        this.f3617a = i;
        this.f3618b = oVar;
        this.f3621f = oVar.f3585q.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f3622g = arrayDeque;
        this.i = new u(this, oVar.f3584p.c(), z3);
        this.f3623j = new t(this, z2);
        this.f3624k = new v(this);
        this.f3625l = new v(this);
        if (lVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(lVar);
        }
    }

    public final void a() {
        boolean z2;
        boolean h;
        byte[] bArr = l1.b.f3252a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f3612b && uVar.f3614e) {
                    t tVar = this.f3623j;
                    if (tVar.f3608a || tVar.f3610c) {
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
            this.f3618b.i(this.f3617a);
        }
    }

    public final void b() {
        t tVar = this.f3623j;
        if (tVar.f3610c) {
            throw new IOException("stream closed");
        }
        if (tVar.f3608a) {
            throw new IOException("stream finished");
        }
        if (this.f3626m != 0) {
            IOException iOException = this.f3627n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f3626m;
            V.f(i);
            throw new B(i);
        }
    }

    public final void c(int i, IOException iOException) {
        V.g("rstStatusCode", i);
        if (d(i, iOException)) {
            o oVar = this.f3618b;
            oVar.getClass();
            V.g("statusCode", i);
            oVar.f3591w.m(this.f3617a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = l1.b.f3252a;
        synchronized (this) {
            if (this.f3626m != 0) {
                return false;
            }
            this.f3626m = i;
            this.f3627n = iOException;
            notifyAll();
            if (this.i.f3612b) {
                if (this.f3623j.f3608a) {
                    return false;
                }
            }
            this.f3618b.i(this.f3617a);
            return true;
        }
    }

    public final void e(int i) {
        V.g("errorCode", i);
        if (d(i, null)) {
            this.f3618b.m(this.f3617a, i);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f3623j;
    }

    public final boolean g() {
        boolean z2 = (this.f3617a & 1) == 1;
        this.f3618b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f3626m != 0) {
            return false;
        }
        u uVar = this.i;
        if (uVar.f3612b || uVar.f3614e) {
            t tVar = this.f3623j;
            if (tVar.f3608a || tVar.f3610c) {
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
    public final void i(k1.l lVar, boolean z2) {
        boolean h;
        Z0.d.e(lVar, "headers");
        byte[] bArr = l1.b.f3252a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f3612b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.f3622g.add(lVar);
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
        this.f3618b.i(this.f3617a);
    }

    public final synchronized void j(int i) {
        V.g("errorCode", i);
        if (this.f3626m == 0) {
            this.f3626m = i;
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
