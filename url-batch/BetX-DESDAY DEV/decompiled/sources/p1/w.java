package p1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f3869a;

    /* renamed from: b, reason: collision with root package name */
    public final o f3870b;

    /* renamed from: c, reason: collision with root package name */
    public long f3871c;

    /* renamed from: d, reason: collision with root package name */
    public long f3872d;

    /* renamed from: e, reason: collision with root package name */
    public long f3873e;

    /* renamed from: f, reason: collision with root package name */
    public long f3874f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f3875g;
    public boolean h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final t f3876j;

    /* renamed from: k, reason: collision with root package name */
    public final v f3877k;

    /* renamed from: l, reason: collision with root package name */
    public final v f3878l;

    /* renamed from: m, reason: collision with root package name */
    public int f3879m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f3880n;

    public w(int i, o oVar, boolean z2, boolean z3, i1.n nVar) {
        X0.f.e(oVar, "connection");
        this.f3869a = i;
        this.f3870b = oVar;
        this.f3874f = oVar.f3832q.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f3875g = arrayDeque;
        this.i = new u(this, oVar.f3831p.c(), z3);
        this.f3876j = new t(this, z2);
        this.f3877k = new v(this);
        this.f3878l = new v(this);
        if (nVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(nVar);
        }
    }

    public final void a() {
        boolean z2;
        boolean h;
        byte[] bArr = j1.b.f2971a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f3863b && uVar.f3866e) {
                    t tVar = this.f3876j;
                    if (tVar.f3858a || tVar.f3860c) {
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
            this.f3870b.i(this.f3869a);
        }
    }

    public final void b() {
        t tVar = this.f3876j;
        if (tVar.f3860c) {
            throw new IOException("stream closed");
        }
        if (tVar.f3858a) {
            throw new IOException("stream finished");
        }
        if (this.f3879m != 0) {
            IOException iOException = this.f3880n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f3879m;
            X0.e.f(i);
            throw new B(i);
        }
    }

    public final void c(int i, IOException iOException) {
        X0.e.g("rstStatusCode", i);
        if (d(i, iOException)) {
            o oVar = this.f3870b;
            oVar.getClass();
            X0.e.g("statusCode", i);
            oVar.f3838w.m(this.f3869a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = j1.b.f2971a;
        synchronized (this) {
            if (this.f3879m != 0) {
                return false;
            }
            this.f3879m = i;
            this.f3880n = iOException;
            notifyAll();
            if (this.i.f3863b) {
                if (this.f3876j.f3858a) {
                    return false;
                }
            }
            this.f3870b.i(this.f3869a);
            return true;
        }
    }

    public final void e(int i) {
        X0.e.g("errorCode", i);
        if (d(i, null)) {
            this.f3870b.m(this.f3869a, i);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f3876j;
    }

    public final boolean g() {
        boolean z2 = (this.f3869a & 1) == 1;
        this.f3870b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f3879m != 0) {
            return false;
        }
        u uVar = this.i;
        if (uVar.f3863b || uVar.f3866e) {
            t tVar = this.f3876j;
            if (tVar.f3858a || tVar.f3860c) {
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
    public final void i(i1.n nVar, boolean z2) {
        boolean h;
        X0.f.e(nVar, "headers");
        byte[] bArr = j1.b.f2971a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f3863b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.f3875g.add(nVar);
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
        this.f3870b.i(this.f3869a);
    }

    public final synchronized void j(int i) {
        X0.e.g("errorCode", i);
        if (this.f3879m == 0) {
            this.f3879m = i;
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
