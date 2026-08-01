package t1;

import X.V;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f3920a;

    /* renamed from: b, reason: collision with root package name */
    public final o f3921b;

    /* renamed from: c, reason: collision with root package name */
    public long f3922c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f3923e;

    /* renamed from: f, reason: collision with root package name */
    public long f3924f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f3925g;
    public boolean h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final t f3926j;

    /* renamed from: k, reason: collision with root package name */
    public final v f3927k;

    /* renamed from: l, reason: collision with root package name */
    public final v f3928l;

    /* renamed from: m, reason: collision with root package name */
    public int f3929m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f3930n;

    public w(int i, o oVar, boolean z2, boolean z3, m1.k kVar) {
        b1.d.e(oVar, "connection");
        this.f3920a = i;
        this.f3921b = oVar;
        this.f3924f = oVar.f3888q.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f3925g = arrayDeque;
        this.i = new u(this, oVar.f3887p.c(), z3);
        this.f3926j = new t(this, z2);
        this.f3927k = new v(this);
        this.f3928l = new v(this);
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
        byte[] bArr = n1.b.f3319a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (!uVar.f3915b && uVar.f3917e) {
                    t tVar = this.f3926j;
                    if (tVar.f3911a || tVar.f3913c) {
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
            this.f3921b.i(this.f3920a);
        }
    }

    public final void b() {
        t tVar = this.f3926j;
        if (tVar.f3913c) {
            throw new IOException("stream closed");
        }
        if (tVar.f3911a) {
            throw new IOException("stream finished");
        }
        if (this.f3929m != 0) {
            IOException iOException = this.f3930n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f3929m;
            V.f(i);
            throw new B(i);
        }
    }

    public final void c(int i, IOException iOException) {
        V.g("rstStatusCode", i);
        if (d(i, iOException)) {
            o oVar = this.f3921b;
            oVar.getClass();
            V.g("statusCode", i);
            oVar.f3894w.m(this.f3920a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = n1.b.f3319a;
        synchronized (this) {
            if (this.f3929m != 0) {
                return false;
            }
            this.f3929m = i;
            this.f3930n = iOException;
            notifyAll();
            if (this.i.f3915b) {
                if (this.f3926j.f3911a) {
                    return false;
                }
            }
            this.f3921b.i(this.f3920a);
            return true;
        }
    }

    public final void e(int i) {
        V.g("errorCode", i);
        if (d(i, null)) {
            this.f3921b.m(this.f3920a, i);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f3926j;
    }

    public final boolean g() {
        boolean z2 = (this.f3920a & 1) == 1;
        this.f3921b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f3929m != 0) {
            return false;
        }
        u uVar = this.i;
        if (uVar.f3915b || uVar.f3917e) {
            t tVar = this.f3926j;
            if (tVar.f3911a || tVar.f3913c) {
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
    public final void i(m1.k kVar, boolean z2) {
        boolean h;
        b1.d.e(kVar, "headers");
        byte[] bArr = n1.b.f3319a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f3915b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.f3925g.add(kVar);
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
        this.f3921b.i(this.f3920a);
    }

    public final synchronized void j(int i) {
        V.g("errorCode", i);
        if (this.f3929m == 0) {
            this.f3929m = i;
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
