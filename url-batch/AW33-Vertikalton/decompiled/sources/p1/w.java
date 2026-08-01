package p1;

import X.V;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f3485a;

    /* renamed from: b, reason: collision with root package name */
    public final o f3486b;

    /* renamed from: c, reason: collision with root package name */
    public long f3487c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f3488e;

    /* renamed from: f, reason: collision with root package name */
    public long f3489f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f3490g;
    public boolean h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final t f3491j;

    /* renamed from: k, reason: collision with root package name */
    public final v f3492k;

    /* renamed from: l, reason: collision with root package name */
    public final v f3493l;

    /* renamed from: m, reason: collision with root package name */
    public int f3494m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f3495n;

    public w(int i, o oVar, boolean z2, boolean z3, i1.k kVar) {
        X0.e.e(oVar, "connection");
        this.f3485a = i;
        this.f3486b = oVar;
        this.f3489f = oVar.f3453q.b();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f3490g = arrayDeque;
        this.i = new u(this, oVar.f3452p.b(), z3);
        this.f3491j = new t(this, z2);
        this.f3492k = new v(this);
        this.f3493l = new v(this);
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
        byte[] bArr = j1.b.f2599a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f3480b && uVar.f3482e) {
                    t tVar = this.f3491j;
                    if (tVar.f3476a || tVar.f3478c) {
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
            this.f3486b.g(this.f3485a);
        }
    }

    public final void b() {
        t tVar = this.f3491j;
        if (tVar.f3478c) {
            throw new IOException("stream closed");
        }
        if (tVar.f3476a) {
            throw new IOException("stream finished");
        }
        if (this.f3494m != 0) {
            IOException iOException = this.f3495n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f3494m;
            V.f(i);
            throw new B(i);
        }
    }

    public final void c(int i, IOException iOException) {
        V.g("rstStatusCode", i);
        if (d(i, iOException)) {
            o oVar = this.f3486b;
            oVar.getClass();
            V.g("statusCode", i);
            oVar.f3459w.k(this.f3485a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = j1.b.f2599a;
        synchronized (this) {
            if (this.f3494m != 0) {
                return false;
            }
            this.f3494m = i;
            this.f3495n = iOException;
            notifyAll();
            if (this.i.f3480b) {
                if (this.f3491j.f3476a) {
                    return false;
                }
            }
            this.f3486b.g(this.f3485a);
            return true;
        }
    }

    public final void e(int i) {
        V.g("errorCode", i);
        if (d(i, null)) {
            this.f3486b.k(this.f3485a, i);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f3491j;
    }

    public final boolean g() {
        boolean z2 = (this.f3485a & 1) == 1;
        this.f3486b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f3494m != 0) {
            return false;
        }
        u uVar = this.i;
        if (uVar.f3480b || uVar.f3482e) {
            t tVar = this.f3491j;
            if (tVar.f3476a || tVar.f3478c) {
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
    public final void i(i1.k kVar, boolean z2) {
        boolean h;
        X0.e.e(kVar, "headers");
        byte[] bArr = j1.b.f2599a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f3480b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.f3490g.add(kVar);
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
        this.f3486b.g(this.f3485a);
    }

    public final synchronized void j(int i) {
        V.g("errorCode", i);
        if (this.f3494m == 0) {
            this.f3494m = i;
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
