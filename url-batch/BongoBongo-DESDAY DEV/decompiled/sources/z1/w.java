package z1;

import Z.V;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f4513a;

    /* renamed from: b, reason: collision with root package name */
    public final o f4514b;

    /* renamed from: c, reason: collision with root package name */
    public long f4515c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f4516e;

    /* renamed from: f, reason: collision with root package name */
    public long f4517f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f4518g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4519h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final t f4520j;

    /* renamed from: k, reason: collision with root package name */
    public final v f4521k;

    /* renamed from: l, reason: collision with root package name */
    public final v f4522l;

    /* renamed from: m, reason: collision with root package name */
    public int f4523m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f4524n;

    public w(int i, o oVar, boolean z2, boolean z3, s1.j jVar) {
        h1.d.e(oVar, "connection");
        this.f4513a = i;
        this.f4514b = oVar;
        this.f4517f = oVar.f4480q.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f4518g = arrayDeque;
        this.i = new u(this, oVar.f4479p.c(), z3);
        this.f4520j = new t(this, z2);
        this.f4521k = new v(this);
        this.f4522l = new v(this);
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
        boolean h2;
        byte[] bArr = t1.b.f3898a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f4508b && uVar.f4510e) {
                    t tVar = this.f4520j;
                    if (tVar.f4504a || tVar.f4506c) {
                        z2 = true;
                        h2 = h();
                    }
                }
                z2 = false;
                h2 = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            c(9, null);
        } else {
            if (h2) {
                return;
            }
            this.f4514b.i(this.f4513a);
        }
    }

    public final void b() {
        t tVar = this.f4520j;
        if (tVar.f4506c) {
            throw new IOException("stream closed");
        }
        if (tVar.f4504a) {
            throw new IOException("stream finished");
        }
        if (this.f4523m != 0) {
            IOException iOException = this.f4524n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f4523m;
            V.g(i);
            throw new A(i);
        }
    }

    public final void c(int i, IOException iOException) {
        V.h("rstStatusCode", i);
        if (d(i, iOException)) {
            o oVar = this.f4514b;
            oVar.getClass();
            V.h("statusCode", i);
            oVar.f4486w.m(this.f4513a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = t1.b.f3898a;
        synchronized (this) {
            if (this.f4523m != 0) {
                return false;
            }
            this.f4523m = i;
            this.f4524n = iOException;
            notifyAll();
            if (this.i.f4508b) {
                if (this.f4520j.f4504a) {
                    return false;
                }
            }
            this.f4514b.i(this.f4513a);
            return true;
        }
    }

    public final void e(int i) {
        V.h("errorCode", i);
        if (d(i, null)) {
            this.f4514b.m(this.f4513a, i);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.f4519h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f4520j;
    }

    public final boolean g() {
        boolean z2 = (this.f4513a & 1) == 1;
        this.f4514b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f4523m != 0) {
            return false;
        }
        u uVar = this.i;
        if (uVar.f4508b || uVar.f4510e) {
            t tVar = this.f4520j;
            if (tVar.f4504a || tVar.f4506c) {
                if (this.f4519h) {
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
    public final void i(s1.j jVar, boolean z2) {
        boolean h2;
        h1.d.e(jVar, "headers");
        byte[] bArr = t1.b.f3898a;
        synchronized (this) {
            try {
                if (this.f4519h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f4508b = true;
                    }
                    h2 = h();
                    notifyAll();
                }
                this.f4519h = true;
                this.f4518g.add(jVar);
                if (z2) {
                }
                h2 = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h2) {
            return;
        }
        this.f4514b.i(this.f4513a);
    }

    public final synchronized void j(int i) {
        V.h("errorCode", i);
        if (this.f4523m == 0) {
            this.f4523m = i;
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
