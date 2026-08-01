package t1;

import X.V;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f3838a;

    /* renamed from: b, reason: collision with root package name */
    public final o f3839b;

    /* renamed from: c, reason: collision with root package name */
    public long f3840c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f3841e;

    /* renamed from: f, reason: collision with root package name */
    public long f3842f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f3843g;
    public boolean h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final t f3844j;

    /* renamed from: k, reason: collision with root package name */
    public final v f3845k;

    /* renamed from: l, reason: collision with root package name */
    public final v f3846l;

    /* renamed from: m, reason: collision with root package name */
    public int f3847m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f3848n;

    public w(int i, o oVar, boolean z2, boolean z3, m1.j jVar) {
        b1.d.e(oVar, "connection");
        this.f3838a = i;
        this.f3839b = oVar;
        this.f3842f = oVar.f3806q.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f3843g = arrayDeque;
        this.i = new u(this, oVar.f3805p.c(), z3);
        this.f3844j = new t(this, z2);
        this.f3845k = new v(this);
        this.f3846l = new v(this);
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
        byte[] bArr = n1.b.f3286a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f3833b && uVar.f3835e) {
                    t tVar = this.f3844j;
                    if (tVar.f3829a || tVar.f3831c) {
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
            this.f3839b.i(this.f3838a);
        }
    }

    public final void b() {
        t tVar = this.f3844j;
        if (tVar.f3831c) {
            throw new IOException("stream closed");
        }
        if (tVar.f3829a) {
            throw new IOException("stream finished");
        }
        if (this.f3847m != 0) {
            IOException iOException = this.f3848n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f3847m;
            V.f(i);
            throw new B(i);
        }
    }

    public final void c(int i, IOException iOException) {
        V.g("rstStatusCode", i);
        if (d(i, iOException)) {
            o oVar = this.f3839b;
            oVar.getClass();
            V.g("statusCode", i);
            oVar.f3812w.m(this.f3838a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = n1.b.f3286a;
        synchronized (this) {
            if (this.f3847m != 0) {
                return false;
            }
            this.f3847m = i;
            this.f3848n = iOException;
            notifyAll();
            if (this.i.f3833b) {
                if (this.f3844j.f3829a) {
                    return false;
                }
            }
            this.f3839b.i(this.f3838a);
            return true;
        }
    }

    public final void e(int i) {
        V.g("errorCode", i);
        if (d(i, null)) {
            this.f3839b.m(this.f3838a, i);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f3844j;
    }

    public final boolean g() {
        boolean z2 = (this.f3838a & 1) == 1;
        this.f3839b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f3847m != 0) {
            return false;
        }
        u uVar = this.i;
        if (uVar.f3833b || uVar.f3835e) {
            t tVar = this.f3844j;
            if (tVar.f3829a || tVar.f3831c) {
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
    public final void i(m1.j jVar, boolean z2) {
        boolean h;
        b1.d.e(jVar, "headers");
        byte[] bArr = n1.b.f3286a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f3833b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.f3843g.add(jVar);
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
        this.f3839b.i(this.f3838a);
    }

    public final synchronized void j(int i) {
        V.g("errorCode", i);
        if (this.f3847m == 0) {
            this.f3847m = i;
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
