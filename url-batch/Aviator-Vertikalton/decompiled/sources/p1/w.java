package p1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f3865a;

    /* renamed from: b, reason: collision with root package name */
    public final o f3866b;

    /* renamed from: c, reason: collision with root package name */
    public long f3867c;

    /* renamed from: d, reason: collision with root package name */
    public long f3868d;

    /* renamed from: e, reason: collision with root package name */
    public long f3869e;

    /* renamed from: f, reason: collision with root package name */
    public long f3870f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f3871g;
    public boolean h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final t f3872j;

    /* renamed from: k, reason: collision with root package name */
    public final v f3873k;

    /* renamed from: l, reason: collision with root package name */
    public final v f3874l;

    /* renamed from: m, reason: collision with root package name */
    public int f3875m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f3876n;

    public w(int i, o oVar, boolean z2, boolean z3, i1.n nVar) {
        X0.f.e(oVar, "connection");
        this.f3865a = i;
        this.f3866b = oVar;
        this.f3870f = oVar.f3828q.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f3871g = arrayDeque;
        this.i = new u(this, oVar.f3827p.c(), z3);
        this.f3872j = new t(this, z2);
        this.f3873k = new v(this);
        this.f3874l = new v(this);
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
        byte[] bArr = j1.b.f2967a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f3859b && uVar.f3862e) {
                    t tVar = this.f3872j;
                    if (tVar.f3854a || tVar.f3856c) {
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
            this.f3866b.i(this.f3865a);
        }
    }

    public final void b() {
        t tVar = this.f3872j;
        if (tVar.f3856c) {
            throw new IOException("stream closed");
        }
        if (tVar.f3854a) {
            throw new IOException("stream finished");
        }
        if (this.f3875m != 0) {
            IOException iOException = this.f3876n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f3875m;
            X0.e.f(i);
            throw new B(i);
        }
    }

    public final void c(int i, IOException iOException) {
        X0.e.g("rstStatusCode", i);
        if (d(i, iOException)) {
            o oVar = this.f3866b;
            oVar.getClass();
            X0.e.g("statusCode", i);
            oVar.f3834w.m(this.f3865a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = j1.b.f2967a;
        synchronized (this) {
            if (this.f3875m != 0) {
                return false;
            }
            this.f3875m = i;
            this.f3876n = iOException;
            notifyAll();
            if (this.i.f3859b) {
                if (this.f3872j.f3854a) {
                    return false;
                }
            }
            this.f3866b.i(this.f3865a);
            return true;
        }
    }

    public final void e(int i) {
        X0.e.g("errorCode", i);
        if (d(i, null)) {
            this.f3866b.m(this.f3865a, i);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f3872j;
    }

    public final boolean g() {
        boolean z2 = (this.f3865a & 1) == 1;
        this.f3866b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f3875m != 0) {
            return false;
        }
        u uVar = this.i;
        if (uVar.f3859b || uVar.f3862e) {
            t tVar = this.f3872j;
            if (tVar.f3854a || tVar.f3856c) {
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
        byte[] bArr = j1.b.f2967a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f3859b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.f3871g.add(nVar);
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
        this.f3866b.i(this.f3865a);
    }

    public final synchronized void j(int i) {
        X0.e.g("errorCode", i);
        if (this.f3875m == 0) {
            this.f3875m = i;
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
