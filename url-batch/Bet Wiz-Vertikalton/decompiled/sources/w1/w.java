package w1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f4168a;

    /* renamed from: b, reason: collision with root package name */
    public final o f4169b;

    /* renamed from: c, reason: collision with root package name */
    public long f4170c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f4171e;

    /* renamed from: f, reason: collision with root package name */
    public long f4172f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f4173g;
    public boolean h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final t f4174j;

    /* renamed from: k, reason: collision with root package name */
    public final v f4175k;

    /* renamed from: l, reason: collision with root package name */
    public final v f4176l;

    /* renamed from: m, reason: collision with root package name */
    public int f4177m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f4178n;

    public w(int i, o oVar, boolean z2, boolean z3, p1.k kVar) {
        e1.d.e(oVar, "connection");
        this.f4168a = i;
        this.f4169b = oVar;
        this.f4172f = oVar.f4136q.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f4173g = arrayDeque;
        this.i = new u(this, oVar.f4135p.c(), z3);
        this.f4174j = new t(this, z2);
        this.f4175k = new v(this);
        this.f4176l = new v(this);
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
        byte[] bArr = q1.b.f3491a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f4163b && uVar.f4165e) {
                    t tVar = this.f4174j;
                    if (tVar.f4159a || tVar.f4161c) {
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
            this.f4169b.i(this.f4168a);
        }
    }

    public final void b() {
        t tVar = this.f4174j;
        if (tVar.f4161c) {
            throw new IOException("stream closed");
        }
        if (tVar.f4159a) {
            throw new IOException("stream finished");
        }
        if (this.f4177m != 0) {
            IOException iOException = this.f4178n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f4177m;
            T0.c.f(i);
            throw new A(i);
        }
    }

    public final void c(int i, IOException iOException) {
        T0.c.g("rstStatusCode", i);
        if (d(i, iOException)) {
            o oVar = this.f4169b;
            oVar.getClass();
            T0.c.g("statusCode", i);
            oVar.f4142w.m(this.f4168a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = q1.b.f3491a;
        synchronized (this) {
            if (this.f4177m != 0) {
                return false;
            }
            this.f4177m = i;
            this.f4178n = iOException;
            notifyAll();
            if (this.i.f4163b) {
                if (this.f4174j.f4159a) {
                    return false;
                }
            }
            this.f4169b.i(this.f4168a);
            return true;
        }
    }

    public final void e(int i) {
        T0.c.g("errorCode", i);
        if (d(i, null)) {
            this.f4169b.m(this.f4168a, i);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f4174j;
    }

    public final boolean g() {
        boolean z2 = (this.f4168a & 1) == 1;
        this.f4169b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f4177m != 0) {
            return false;
        }
        u uVar = this.i;
        if (uVar.f4163b || uVar.f4165e) {
            t tVar = this.f4174j;
            if (tVar.f4159a || tVar.f4161c) {
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
    public final void i(p1.k kVar, boolean z2) {
        boolean h;
        e1.d.e(kVar, "headers");
        byte[] bArr = q1.b.f3491a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f4163b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.f4173g.add(kVar);
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
        this.f4169b.i(this.f4168a);
    }

    public final synchronized void j(int i) {
        T0.c.g("errorCode", i);
        if (this.f4177m == 0) {
            this.f4177m = i;
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
