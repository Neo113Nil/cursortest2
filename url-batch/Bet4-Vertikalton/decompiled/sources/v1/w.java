package v1;

import Y.V;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f4140a;

    /* renamed from: b, reason: collision with root package name */
    public final o f4141b;

    /* renamed from: c, reason: collision with root package name */
    public long f4142c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f4143e;

    /* renamed from: f, reason: collision with root package name */
    public long f4144f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f4145g;
    public boolean h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final t f4146j;

    /* renamed from: k, reason: collision with root package name */
    public final v f4147k;

    /* renamed from: l, reason: collision with root package name */
    public final v f4148l;

    /* renamed from: m, reason: collision with root package name */
    public int f4149m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f4150n;

    public w(int i, o oVar, boolean z2, boolean z3, o1.j jVar) {
        d1.d.e(oVar, "connection");
        this.f4140a = i;
        this.f4141b = oVar;
        this.f4144f = oVar.f4108q.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f4145g = arrayDeque;
        this.i = new u(this, oVar.f4107p.c(), z3);
        this.f4146j = new t(this, z2);
        this.f4147k = new v(this);
        this.f4148l = new v(this);
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
        byte[] bArr = p1.b.f3455a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f4135b && uVar.f4137e) {
                    t tVar = this.f4146j;
                    if (tVar.f4131a || tVar.f4133c) {
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
            this.f4141b.i(this.f4140a);
        }
    }

    public final void b() {
        t tVar = this.f4146j;
        if (tVar.f4133c) {
            throw new IOException("stream closed");
        }
        if (tVar.f4131a) {
            throw new IOException("stream finished");
        }
        if (this.f4149m != 0) {
            IOException iOException = this.f4150n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f4149m;
            V.g(i);
            throw new A(i);
        }
    }

    public final void c(int i, IOException iOException) {
        V.h("rstStatusCode", i);
        if (d(i, iOException)) {
            o oVar = this.f4141b;
            oVar.getClass();
            V.h("statusCode", i);
            oVar.f4114w.m(this.f4140a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = p1.b.f3455a;
        synchronized (this) {
            if (this.f4149m != 0) {
                return false;
            }
            this.f4149m = i;
            this.f4150n = iOException;
            notifyAll();
            if (this.i.f4135b) {
                if (this.f4146j.f4131a) {
                    return false;
                }
            }
            this.f4141b.i(this.f4140a);
            return true;
        }
    }

    public final void e(int i) {
        V.h("errorCode", i);
        if (d(i, null)) {
            this.f4141b.m(this.f4140a, i);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f4146j;
    }

    public final boolean g() {
        boolean z2 = (this.f4140a & 1) == 1;
        this.f4141b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f4149m != 0) {
            return false;
        }
        u uVar = this.i;
        if (uVar.f4135b || uVar.f4137e) {
            t tVar = this.f4146j;
            if (tVar.f4131a || tVar.f4133c) {
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
    public final void i(o1.j jVar, boolean z2) {
        boolean h;
        d1.d.e(jVar, "headers");
        byte[] bArr = p1.b.f3455a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f4135b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.f4145g.add(jVar);
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
        this.f4141b.i(this.f4140a);
    }

    public final synchronized void j(int i) {
        V.h("errorCode", i);
        if (this.f4149m == 0) {
            this.f4149m = i;
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
