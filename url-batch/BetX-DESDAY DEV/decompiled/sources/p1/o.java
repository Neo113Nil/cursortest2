package p1;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l.C0290u;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final H.j f3817z;

    /* renamed from: a, reason: collision with root package name */
    public final h f3818a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3819b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f3820c;

    /* renamed from: d, reason: collision with root package name */
    public int f3821d;

    /* renamed from: e, reason: collision with root package name */
    public int f3822e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3823f;

    /* renamed from: g, reason: collision with root package name */
    public final l1.e f3824g;
    public final l1.c h;
    public final l1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final l1.c f3825j;

    /* renamed from: k, reason: collision with root package name */
    public final A f3826k;

    /* renamed from: l, reason: collision with root package name */
    public long f3827l;

    /* renamed from: m, reason: collision with root package name */
    public long f3828m;

    /* renamed from: n, reason: collision with root package name */
    public long f3829n;

    /* renamed from: o, reason: collision with root package name */
    public long f3830o;

    /* renamed from: p, reason: collision with root package name */
    public final H.j f3831p;

    /* renamed from: q, reason: collision with root package name */
    public H.j f3832q;

    /* renamed from: r, reason: collision with root package name */
    public long f3833r;

    /* renamed from: s, reason: collision with root package name */
    public long f3834s;

    /* renamed from: t, reason: collision with root package name */
    public long f3835t;

    /* renamed from: u, reason: collision with root package name */
    public long f3836u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f3837v;

    /* renamed from: w, reason: collision with root package name */
    public final x f3838w;

    /* renamed from: x, reason: collision with root package name */
    public final k f3839x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f3840y;

    static {
        H.j jVar = new H.j();
        jVar.f(7, 65535);
        jVar.f(5, 16384);
        f3817z = jVar;
    }

    public o(C0290u c0290u) {
        this.f3818a = (h) c0290u.f3467f;
        String str = (String) c0290u.f3464c;
        if (str == null) {
            X0.f.h("connectionName");
            throw null;
        }
        this.f3820c = str;
        this.f3822e = 3;
        l1.e eVar = (l1.e) c0290u.f3462a;
        this.f3824g = eVar;
        this.h = eVar.e();
        this.i = eVar.e();
        this.f3825j = eVar.e();
        this.f3826k = A.f3770a;
        H.j jVar = new H.j();
        jVar.f(7, 16777216);
        this.f3831p = jVar;
        this.f3832q = f3817z;
        this.f3836u = r0.c();
        Socket socket = (Socket) c0290u.f3463b;
        if (socket == null) {
            X0.f.h("socket");
            throw null;
        }
        this.f3837v = socket;
        v1.p pVar = (v1.p) c0290u.f3466e;
        if (pVar == null) {
            X0.f.h("sink");
            throw null;
        }
        this.f3838w = new x(pVar);
        v1.q qVar = (v1.q) c0290u.f3465d;
        if (qVar == null) {
            X0.f.h("source");
            throw null;
        }
        this.f3839x = new k(this, new s(qVar));
        this.f3840y = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g(1, 9, null);
    }

    public final void flush() {
        this.f3838w.flush();
    }

    public final void g(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        X0.e.g("connectionCode", i);
        X0.e.g("streamCode", i2);
        byte[] bArr = j1.b.f2971a;
        try {
            j(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f3819b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f3819b.values().toArray(new w[0]);
                this.f3819b.clear();
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
            this.f3838w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f3837v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f3825j.e();
    }

    public final synchronized w h(int i) {
        return (w) this.f3819b.get(Integer.valueOf(i));
    }

    public final synchronized w i(int i) {
        w wVar;
        wVar = (w) this.f3819b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void j(int i) {
        X0.e.g("statusCode", i);
        synchronized (this.f3838w) {
            synchronized (this) {
                if (this.f3823f) {
                    return;
                }
                this.f3823f = true;
                this.f3838w.j(this.f3821d, i, j1.b.f2971a);
            }
        }
    }

    public final synchronized void k(long j2) {
        long j3 = this.f3833r + j2;
        this.f3833r = j3;
        long j4 = j3 - this.f3834s;
        if (j4 >= this.f3831p.c() / 2) {
            n(0, j4);
            this.f3834s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f3838w.f3884c);
        r6 = r2;
        r8.f3835t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, boolean z2, v1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f3838w.h(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f3835t;
                            long j5 = this.f3836u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f3819b.containsKey(Integer.valueOf(i))) {
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
            this.f3838w.h(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void m(int i, int i2) {
        X0.e.g("errorCode", i2);
        this.h.c(new j(this.f3820c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void n(int i, long j2) {
        this.h.c(new n(this.f3820c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
