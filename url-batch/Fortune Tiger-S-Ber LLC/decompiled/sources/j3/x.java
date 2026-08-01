package j3;

import androidx.fragment.app.w0;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f2479a;

    /* renamed from: b, reason: collision with root package name */
    public final p f2480b;
    public long c;

    /* renamed from: d, reason: collision with root package name */
    public long f2481d;

    /* renamed from: e, reason: collision with root package name */
    public long f2482e;

    /* renamed from: f, reason: collision with root package name */
    public long f2483f;
    public final ArrayDeque g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final v f2484i;

    /* renamed from: j, reason: collision with root package name */
    public final u f2485j;

    /* renamed from: k, reason: collision with root package name */
    public final w f2486k;

    /* renamed from: l, reason: collision with root package name */
    public final w f2487l;

    /* renamed from: m, reason: collision with root package name */
    public int f2488m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f2489n;

    public x(int i4, p pVar, boolean z3, boolean z4, c3.k kVar) {
        u2.c.e(pVar, "connection");
        this.f2479a = i4;
        this.f2480b = pVar;
        this.f2483f = pVar.f2456v.b();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.f2484i = new v(this, pVar.f2455u.b(), z4);
        this.f2485j = new u(this, z3);
        this.f2486k = new w(this);
        this.f2487l = new w(this);
        if (kVar == null) {
            if (!f()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (f()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(kVar);
        }
    }

    public final void a() {
        boolean z3;
        boolean g;
        byte[] bArr = d3.c.f1490a;
        synchronized (this) {
            try {
                v vVar = this.f2484i;
                if (!vVar.g && vVar.f2476j) {
                    u uVar = this.f2485j;
                    if (!uVar.f2472f) {
                        if (uVar.h) {
                        }
                    }
                    z3 = true;
                    g = g();
                }
                z3 = false;
                g = g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            c(9, null);
        } else {
            if (g) {
                return;
            }
            this.f2480b.o(this.f2479a);
        }
    }

    public final void b() {
        u uVar = this.f2485j;
        if (uVar.h) {
            throw new IOException("stream closed");
        }
        if (uVar.f2472f) {
            throw new IOException("stream finished");
        }
        if (this.f2488m != 0) {
            IOException iOException = this.f2489n;
            if (iOException != null) {
                throw iOException;
            }
            int i4 = this.f2488m;
            w0.g(i4);
            throw new c0(i4);
        }
    }

    public final void c(int i4, IOException iOException) {
        w0.h("rstStatusCode", i4);
        if (d(i4, iOException)) {
            p pVar = this.f2480b;
            pVar.getClass();
            w0.h("statusCode", i4);
            pVar.B.s(this.f2479a, i4);
        }
    }

    public final boolean d(int i4, IOException iOException) {
        byte[] bArr = d3.c.f1490a;
        synchronized (this) {
            if (this.f2488m != 0) {
                return false;
            }
            this.f2488m = i4;
            this.f2489n = iOException;
            notifyAll();
            if (this.f2484i.g) {
                if (this.f2485j.f2472f) {
                    return false;
                }
            }
            this.f2480b.o(this.f2479a);
            return true;
        }
    }

    public final void e(int i4) {
        w0.h("errorCode", i4);
        if (d(i4, null)) {
            this.f2480b.s(this.f2479a, i4);
        }
    }

    public final boolean f() {
        boolean z3 = (this.f2479a & 1) == 1;
        this.f2480b.getClass();
        return true == z3;
    }

    public final synchronized boolean g() {
        try {
            if (this.f2488m != 0) {
                return false;
            }
            v vVar = this.f2484i;
            if (!vVar.g) {
                if (vVar.f2476j) {
                }
                return true;
            }
            u uVar = this.f2485j;
            if (uVar.f2472f || uVar.h) {
                if (this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(c3.k kVar, boolean z3) {
        boolean g;
        u2.c.e(kVar, "headers");
        byte[] bArr = d3.c.f1490a;
        synchronized (this) {
            try {
                if (this.h && z3) {
                    this.f2484i.getClass();
                    if (z3) {
                        this.f2484i.g = true;
                    }
                    g = g();
                    notifyAll();
                }
                this.h = true;
                this.g.add(kVar);
                if (z3) {
                }
                g = g();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g) {
            return;
        }
        this.f2480b.o(this.f2479a);
    }

    public final synchronized void i(int i4) {
        w0.h("errorCode", i4);
        if (this.f2488m == 0) {
            this.f2488m = i4;
            notifyAll();
        }
    }
}
