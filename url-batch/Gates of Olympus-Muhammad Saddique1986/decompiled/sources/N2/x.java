package N2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f3692a;

    /* renamed from: b, reason: collision with root package name */
    public final p f3693b;

    /* renamed from: c, reason: collision with root package name */
    public long f3694c;

    /* renamed from: d, reason: collision with root package name */
    public long f3695d;

    /* renamed from: e, reason: collision with root package name */
    public long f3696e;

    /* renamed from: f, reason: collision with root package name */
    public long f3697f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f3698g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3699h;

    /* renamed from: i, reason: collision with root package name */
    public final v f3700i;

    /* renamed from: j, reason: collision with root package name */
    public final u f3701j;

    /* renamed from: k, reason: collision with root package name */
    public final w f3702k;

    /* renamed from: l, reason: collision with root package name */
    public final w f3703l;

    /* renamed from: m, reason: collision with root package name */
    public int f3704m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f3705n;

    public x(int i3, p pVar, boolean z3, boolean z4, G2.l lVar) {
        f2.j.f(pVar, "connection");
        this.f3692a = i3;
        this.f3693b = pVar;
        this.f3697f = pVar.f3656t.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f3698g = arrayDeque;
        this.f3700i = new v(this, pVar.f3655s.a(), z4);
        this.f3701j = new u(this, z3);
        this.f3702k = new w(this);
        this.f3703l = new w(this);
        if (lVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(lVar);
        }
    }

    public final void a() {
        boolean z3;
        boolean h3;
        byte[] bArr = H2.b.f2632a;
        synchronized (this) {
            try {
                v vVar = this.f3700i;
                if (!vVar.f3686e && vVar.f3689h) {
                    u uVar = this.f3701j;
                    if (uVar.f3681d || uVar.f3683f) {
                        z3 = true;
                        h3 = h();
                    }
                }
                z3 = false;
                h3 = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            c(9, null);
        } else {
            if (h3) {
                return;
            }
            this.f3693b.d(this.f3692a);
        }
    }

    public final void b() {
        u uVar = this.f3701j;
        if (uVar.f3683f) {
            throw new IOException("stream closed");
        }
        if (uVar.f3681d) {
            throw new IOException("stream finished");
        }
        if (this.f3704m != 0) {
            IOException iOException = this.f3705n;
            if (iOException != null) {
                throw iOException;
            }
            int i3 = this.f3704m;
            A.k.m(i3);
            throw new D(i3);
        }
    }

    public final void c(int i3, IOException iOException) {
        A.k.s("rstStatusCode", i3);
        if (d(i3, iOException)) {
            p pVar = this.f3693b;
            pVar.getClass();
            A.k.s("statusCode", i3);
            pVar.f3662z.l(this.f3692a, i3);
        }
    }

    public final boolean d(int i3, IOException iOException) {
        byte[] bArr = H2.b.f2632a;
        synchronized (this) {
            if (this.f3704m != 0) {
                return false;
            }
            this.f3704m = i3;
            this.f3705n = iOException;
            notifyAll();
            if (this.f3700i.f3686e) {
                if (this.f3701j.f3681d) {
                    return false;
                }
            }
            this.f3693b.d(this.f3692a);
            return true;
        }
    }

    public final void e(int i3) {
        A.k.s("errorCode", i3);
        if (d(i3, null)) {
            this.f3693b.l(this.f3692a, i3);
        }
    }

    public final u f() {
        synchronized (this) {
            if (!this.f3699h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f3701j;
    }

    public final boolean g() {
        boolean z3 = (this.f3692a & 1) == 1;
        this.f3693b.getClass();
        return true == z3;
    }

    public final synchronized boolean h() {
        if (this.f3704m != 0) {
            return false;
        }
        v vVar = this.f3700i;
        if (vVar.f3686e || vVar.f3689h) {
            u uVar = this.f3701j;
            if (uVar.f3681d || uVar.f3683f) {
                if (this.f3699h) {
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
    public final void i(G2.l lVar, boolean z3) {
        boolean h3;
        f2.j.f(lVar, "headers");
        byte[] bArr = H2.b.f2632a;
        synchronized (this) {
            try {
                if (this.f3699h && z3) {
                    this.f3700i.getClass();
                    if (z3) {
                        this.f3700i.f3686e = true;
                    }
                    h3 = h();
                    notifyAll();
                }
                this.f3699h = true;
                this.f3698g.add(lVar);
                if (z3) {
                }
                h3 = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h3) {
            return;
        }
        this.f3693b.d(this.f3692a);
    }

    public final synchronized void j(int i3) {
        A.k.s("errorCode", i3);
        if (this.f3704m == 0) {
            this.f3704m = i3;
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
