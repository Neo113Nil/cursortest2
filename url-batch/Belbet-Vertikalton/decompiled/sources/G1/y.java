package G1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f443a;

    /* renamed from: b, reason: collision with root package name */
    public final q f444b;

    /* renamed from: c, reason: collision with root package name */
    public long f445c;

    /* renamed from: d, reason: collision with root package name */
    public long f446d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f447f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f448g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f449h;
    public final w i;
    public final v j;

    /* renamed from: k, reason: collision with root package name */
    public final x f450k;

    /* renamed from: l, reason: collision with root package name */
    public final x f451l;

    /* renamed from: m, reason: collision with root package name */
    public int f452m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f453n;

    public y(int i, q qVar, boolean z2, boolean z3, z1.m mVar) {
        j1.h.e(qVar, "connection");
        this.f443a = i;
        this.f444b = qVar;
        this.f447f = qVar.f408q.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f448g = arrayDeque;
        this.i = new w(this, qVar.f407p.a(), z3);
        this.j = new v(this, z2);
        this.f450k = new x(this);
        this.f451l = new x(this);
        if (mVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(mVar);
        }
    }

    public final void a() {
        boolean z2;
        boolean h2;
        byte[] bArr = A1.c.f19a;
        synchronized (this) {
            try {
                w wVar = this.i;
                if (!wVar.f438b && wVar.e) {
                    v vVar = this.j;
                    if (vVar.f433a || vVar.f435c) {
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
            this.f444b.q(this.f443a);
        }
    }

    public final void b() {
        v vVar = this.j;
        if (vVar.f435c) {
            throw new IOException("stream closed");
        }
        if (vVar.f433a) {
            throw new IOException("stream finished");
        }
        if (this.f452m != 0) {
            IOException iOException = this.f453n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f452m;
            AbstractC0001b.h(i);
            throw new E(i);
        }
    }

    public final void c(int i, IOException iOException) {
        AbstractC0001b.j("rstStatusCode", i);
        if (d(i, iOException)) {
            q qVar = this.f444b;
            qVar.getClass();
            AbstractC0001b.j("statusCode", i);
            qVar.f414w.E(this.f443a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = A1.c.f19a;
        synchronized (this) {
            if (this.f452m != 0) {
                return false;
            }
            this.f452m = i;
            this.f453n = iOException;
            notifyAll();
            if (this.i.f438b) {
                if (this.j.f433a) {
                    return false;
                }
            }
            this.f444b.q(this.f443a);
            return true;
        }
    }

    public final void e(int i) {
        AbstractC0001b.j("errorCode", i);
        if (d(i, null)) {
            this.f444b.E(this.f443a, i);
        }
    }

    public final v f() {
        synchronized (this) {
            if (!this.f449h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z2 = (this.f443a & 1) == 1;
        this.f444b.getClass();
        return true == z2;
    }

    public final synchronized boolean h() {
        if (this.f452m != 0) {
            return false;
        }
        w wVar = this.i;
        if (wVar.f438b || wVar.e) {
            v vVar = this.j;
            if (vVar.f433a || vVar.f435c) {
                if (this.f449h) {
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
    public final void i(z1.m mVar, boolean z2) {
        boolean h2;
        j1.h.e(mVar, "headers");
        byte[] bArr = A1.c.f19a;
        synchronized (this) {
            try {
                if (this.f449h && z2) {
                    this.i.getClass();
                    if (z2) {
                        this.i.f438b = true;
                    }
                    h2 = h();
                    notifyAll();
                }
                this.f449h = true;
                this.f448g.add(mVar);
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
        this.f444b.q(this.f443a);
    }

    public final synchronized void j(int i) {
        AbstractC0001b.j("errorCode", i);
        if (this.f452m == 0) {
            this.f452m = i;
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
