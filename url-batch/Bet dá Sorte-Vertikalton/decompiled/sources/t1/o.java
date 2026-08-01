package t1;

import X.V;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l.C0235s;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final H.j f3874z;

    /* renamed from: a, reason: collision with root package name */
    public final h f3875a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3876b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f3877c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3878e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3879f;

    /* renamed from: g, reason: collision with root package name */
    public final p1.d f3880g;
    public final p1.c h;
    public final p1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final p1.c f3881j;

    /* renamed from: k, reason: collision with root package name */
    public final A f3882k;

    /* renamed from: l, reason: collision with root package name */
    public long f3883l;

    /* renamed from: m, reason: collision with root package name */
    public long f3884m;

    /* renamed from: n, reason: collision with root package name */
    public long f3885n;

    /* renamed from: o, reason: collision with root package name */
    public long f3886o;

    /* renamed from: p, reason: collision with root package name */
    public final H.j f3887p;

    /* renamed from: q, reason: collision with root package name */
    public H.j f3888q;

    /* renamed from: r, reason: collision with root package name */
    public long f3889r;

    /* renamed from: s, reason: collision with root package name */
    public long f3890s;

    /* renamed from: t, reason: collision with root package name */
    public long f3891t;

    /* renamed from: u, reason: collision with root package name */
    public long f3892u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f3893v;

    /* renamed from: w, reason: collision with root package name */
    public final x f3894w;

    /* renamed from: x, reason: collision with root package name */
    public final k f3895x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f3896y;

    static {
        H.j jVar = new H.j();
        jVar.f(7, 65535);
        jVar.f(5, 16384);
        f3874z = jVar;
    }

    public o(C0235s c0235s) {
        this.f3875a = (h) c0235s.f3032f;
        String str = (String) c0235s.f3030c;
        if (str == null) {
            b1.d.h("connectionName");
            throw null;
        }
        this.f3877c = str;
        this.f3878e = 3;
        p1.d dVar = (p1.d) c0235s.f3028a;
        this.f3880g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f3881j = dVar.e();
        this.f3882k = A.f3831a;
        H.j jVar = new H.j();
        jVar.f(7, 16777216);
        this.f3887p = jVar;
        this.f3888q = f3874z;
        this.f3892u = r0.c();
        Socket socket = (Socket) c0235s.f3029b;
        if (socket == null) {
            b1.d.h("socket");
            throw null;
        }
        this.f3893v = socket;
        z1.o oVar = (z1.o) c0235s.f3031e;
        if (oVar == null) {
            b1.d.h("sink");
            throw null;
        }
        this.f3894w = new x(oVar);
        z1.p pVar = (z1.p) c0235s.d;
        if (pVar == null) {
            b1.d.h("source");
            throw null;
        }
        this.f3895x = new k(this, new s(pVar));
        this.f3896y = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g(1, 9, null);
    }

    public final void flush() {
        this.f3894w.flush();
    }

    public final void g(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        V.g("connectionCode", i);
        V.g("streamCode", i2);
        byte[] bArr = n1.b.f3319a;
        try {
            j(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f3876b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f3876b.values().toArray(new w[0]);
                this.f3876b.clear();
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
            this.f3894w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f3893v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f3881j.e();
    }

    public final synchronized w h(int i) {
        return (w) this.f3876b.get(Integer.valueOf(i));
    }

    public final synchronized w i(int i) {
        w wVar;
        wVar = (w) this.f3876b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void j(int i) {
        V.g("statusCode", i);
        synchronized (this.f3894w) {
            synchronized (this) {
                if (this.f3879f) {
                    return;
                }
                this.f3879f = true;
                this.f3894w.j(this.d, i, n1.b.f3319a);
            }
        }
    }

    public final synchronized void k(long j2) {
        long j3 = this.f3889r + j2;
        this.f3889r = j3;
        long j4 = j3 - this.f3890s;
        if (j4 >= this.f3887p.c() / 2) {
            n(0, j4);
            this.f3890s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f3894w.f3934c);
        r6 = r2;
        r8.f3891t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, boolean z2, z1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f3894w.h(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f3891t;
                            long j5 = this.f3892u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f3876b.containsKey(Integer.valueOf(i))) {
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
            this.f3894w.h(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void m(int i, int i2) {
        V.g("errorCode", i2);
        this.h.c(new j(this.f3877c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void n(int i, long j2) {
        this.h.c(new n(this.f3877c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
