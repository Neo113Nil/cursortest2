package y1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f4283a;

    /* renamed from: b, reason: collision with root package name */
    public final o f4284b;

    /* renamed from: c, reason: collision with root package name */
    public long f4285c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f4286e;

    /* renamed from: f, reason: collision with root package name */
    public long f4287f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f4288g;
    public boolean h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final t f4289j;

    /* renamed from: k, reason: collision with root package name */
    public final v f4290k;

    /* renamed from: l, reason: collision with root package name */
    public final v f4291l;

    /* renamed from: m, reason: collision with root package name */
    public int f4292m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f4293n;

    public w(int i, o oVar, boolean z2, boolean z3, r1.j jVar) {
        g1.d.e(oVar, "connection");
        this.f4283a = i;
        this.f4284b = oVar;
        this.f4287f = oVar.f4251q.f();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f4288g = arrayDeque;
        this.i = new u(this, oVar.f4250p.f(), z3);
        this.f4289j = new t(this, z2);
        this.f4290k = new v(this);
        this.f4291l = new v(this);
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
        byte[] bArr = s1.b.f3607a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f4278b && uVar.f4280e) {
                    t tVar = this.f4289j;
                    if (tVar.f4274a || tVar.f4276c) {
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
            this.f4284b.i(this.f4283a);
        }
    }

    public final void b() {
        t tVar = this.f4289j;
        if (tVar.f4276c) {
            throw new IOException("stream closed");
        }
        if (tVar.f4274a) {
            throw new IOException("stream finished");
        }
        if (this.f4292m != 0) {
            IOException iOException = this.f4293n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f4292m;
            X0.a.g(i);
            throw new A(i);
        }
    }

    public final void c(int i, IOException iOException) {
        X0.a.h("rstStatusCode", i);
        if (d(i, iOException)) {
            o oVar = this.f4284b;
            oVar.getClass();
            X0.a.h("statusCode", i);
            oVar.f4257w.m(this.f4283a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = s1.b.f3607a;
        synchronized (this) {
            if (this.f4292m != 0) {
                return false;
            }
            this.f4292m = i;
            this.f4293n = iOException;
            notifyAll();
            if (this.i.f4278b) {
                if (this.f4289j.f4274a) {
                    return false;
                }
            }
            this.f4284b.i(this.f4283a);
            return true;
        }
    }

    public final void e(int i) {
        X0.a.h("errorCode", i);
        if (d(i, null)) {
            this.f4284b.m(this.f4283a, i);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f4289j;
    }

    public final boolean g() {
        boolean z2 = (this.f4283a & 1) == 1;
        this.f4284b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f4292m != 0) {
            return false;
        }
        u uVar = this.i;
        if (uVar.f4278b || uVar.f4280e) {
            t tVar = this.f4289j;
            if (tVar.f4274a || tVar.f4276c) {
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
    public final void i(r1.j jVar, boolean z2) {
        boolean h;
        g1.d.e(jVar, "headers");
        byte[] bArr = s1.b.f3607a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f4278b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.f4288g.add(jVar);
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
        this.f4284b.i(this.f4283a);
    }

    public final synchronized void j(int i) {
        X0.a.h("errorCode", i);
        if (this.f4292m == 0) {
            this.f4292m = i;
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
