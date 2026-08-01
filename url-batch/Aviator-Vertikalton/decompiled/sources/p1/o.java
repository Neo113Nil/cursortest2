package p1;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l.C0290v;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final H.j f3813z;

    /* renamed from: a, reason: collision with root package name */
    public final h f3814a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3815b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f3816c;

    /* renamed from: d, reason: collision with root package name */
    public int f3817d;

    /* renamed from: e, reason: collision with root package name */
    public int f3818e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3819f;

    /* renamed from: g, reason: collision with root package name */
    public final l1.d f3820g;
    public final l1.c h;
    public final l1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final l1.c f3821j;

    /* renamed from: k, reason: collision with root package name */
    public final A f3822k;

    /* renamed from: l, reason: collision with root package name */
    public long f3823l;

    /* renamed from: m, reason: collision with root package name */
    public long f3824m;

    /* renamed from: n, reason: collision with root package name */
    public long f3825n;

    /* renamed from: o, reason: collision with root package name */
    public long f3826o;

    /* renamed from: p, reason: collision with root package name */
    public final H.j f3827p;

    /* renamed from: q, reason: collision with root package name */
    public H.j f3828q;

    /* renamed from: r, reason: collision with root package name */
    public long f3829r;

    /* renamed from: s, reason: collision with root package name */
    public long f3830s;

    /* renamed from: t, reason: collision with root package name */
    public long f3831t;

    /* renamed from: u, reason: collision with root package name */
    public long f3832u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f3833v;

    /* renamed from: w, reason: collision with root package name */
    public final x f3834w;

    /* renamed from: x, reason: collision with root package name */
    public final k f3835x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f3836y;

    static {
        H.j jVar = new H.j();
        jVar.f(7, 65535);
        jVar.f(5, 16384);
        f3813z = jVar;
    }

    public o(C0290v c0290v) {
        this.f3814a = (h) c0290v.f3468f;
        String str = (String) c0290v.f3465c;
        if (str == null) {
            X0.f.h("connectionName");
            throw null;
        }
        this.f3816c = str;
        this.f3818e = 3;
        l1.d dVar = (l1.d) c0290v.f3463a;
        this.f3820g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f3821j = dVar.e();
        this.f3822k = A.f3766a;
        H.j jVar = new H.j();
        jVar.f(7, 16777216);
        this.f3827p = jVar;
        this.f3828q = f3813z;
        this.f3832u = r0.c();
        Socket socket = (Socket) c0290v.f3464b;
        if (socket == null) {
            X0.f.h("socket");
            throw null;
        }
        this.f3833v = socket;
        v1.p pVar = (v1.p) c0290v.f3467e;
        if (pVar == null) {
            X0.f.h("sink");
            throw null;
        }
        this.f3834w = new x(pVar);
        v1.q qVar = (v1.q) c0290v.f3466d;
        if (qVar == null) {
            X0.f.h("source");
            throw null;
        }
        this.f3835x = new k(this, new s(qVar));
        this.f3836y = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g(1, 9, null);
    }

    public final void flush() {
        this.f3834w.flush();
    }

    public final void g(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        X0.e.g("connectionCode", i);
        X0.e.g("streamCode", i2);
        byte[] bArr = j1.b.f2967a;
        try {
            j(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f3815b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f3815b.values().toArray(new w[0]);
                this.f3815b.clear();
            }
        }
        w[] wVarArr = (w[]) objArr;
        if (wVarArr != null) {
            for (w wVar : wVarArr) {
                try {
                    wVar.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f3834w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f3833v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f3821j.e();
    }

    public final synchronized w h(int i) {
        return (w) this.f3815b.get(Integer.valueOf(i));
    }

    public final synchronized w i(int i) {
        w wVar;
        wVar = (w) this.f3815b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void j(int i) {
        X0.e.g("statusCode", i);
        synchronized (this.f3834w) {
            synchronized (this) {
                if (this.f3819f) {
                    return;
                }
                this.f3819f = true;
                this.f3834w.j(this.f3817d, i, j1.b.f2967a);
            }
        }
    }

    public final synchronized void k(long j2) {
        long j3 = this.f3829r + j2;
        this.f3829r = j3;
        long j4 = j3 - this.f3830s;
        if (j4 >= this.f3827p.c() / 2) {
            n(0, j4);
            this.f3830s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f3834w.f3880c);
        r6 = r2;
        r8.f3831t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, boolean z2, v1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f3834w.h(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f3831t;
                            long j5 = this.f3832u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f3815b.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j2 -= j3;
            this.f3834w.h(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void m(int i, int i2) {
        X0.e.g("errorCode", i2);
        this.h.c(new j(this.f3816c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void n(int i, long j2) {
        this.h.c(new n(this.f3816c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
