package t1;

import X.V;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l.C0244t;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final H.j f3792z;

    /* renamed from: a, reason: collision with root package name */
    public final h f3793a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3794b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f3795c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3796e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3797f;

    /* renamed from: g, reason: collision with root package name */
    public final p1.d f3798g;
    public final p1.c h;
    public final p1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final p1.c f3799j;

    /* renamed from: k, reason: collision with root package name */
    public final A f3800k;

    /* renamed from: l, reason: collision with root package name */
    public long f3801l;

    /* renamed from: m, reason: collision with root package name */
    public long f3802m;

    /* renamed from: n, reason: collision with root package name */
    public long f3803n;

    /* renamed from: o, reason: collision with root package name */
    public long f3804o;

    /* renamed from: p, reason: collision with root package name */
    public final H.j f3805p;

    /* renamed from: q, reason: collision with root package name */
    public H.j f3806q;

    /* renamed from: r, reason: collision with root package name */
    public long f3807r;

    /* renamed from: s, reason: collision with root package name */
    public long f3808s;

    /* renamed from: t, reason: collision with root package name */
    public long f3809t;

    /* renamed from: u, reason: collision with root package name */
    public long f3810u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f3811v;

    /* renamed from: w, reason: collision with root package name */
    public final x f3812w;

    /* renamed from: x, reason: collision with root package name */
    public final k f3813x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f3814y;

    static {
        H.j jVar = new H.j();
        jVar.f(7, 65535);
        jVar.f(5, 16384);
        f3792z = jVar;
    }

    public o(C0244t c0244t) {
        this.f3793a = (h) c0244t.f2994f;
        String str = (String) c0244t.f2992c;
        if (str == null) {
            b1.d.h("connectionName");
            throw null;
        }
        this.f3795c = str;
        this.f3796e = 3;
        p1.d dVar = (p1.d) c0244t.f2990a;
        this.f3798g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f3799j = dVar.e();
        this.f3800k = A.f3749a;
        H.j jVar = new H.j();
        jVar.f(7, 16777216);
        this.f3805p = jVar;
        this.f3806q = f3792z;
        this.f3810u = r0.c();
        Socket socket = (Socket) c0244t.f2991b;
        if (socket == null) {
            b1.d.h("socket");
            throw null;
        }
        this.f3811v = socket;
        z1.o oVar = (z1.o) c0244t.f2993e;
        if (oVar == null) {
            b1.d.h("sink");
            throw null;
        }
        this.f3812w = new x(oVar);
        z1.p pVar = (z1.p) c0244t.d;
        if (pVar == null) {
            b1.d.h("source");
            throw null;
        }
        this.f3813x = new k(this, new s(pVar));
        this.f3814y = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g(1, 9, null);
    }

    public final void flush() {
        this.f3812w.flush();
    }

    public final void g(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        V.g("connectionCode", i);
        V.g("streamCode", i2);
        byte[] bArr = n1.b.f3286a;
        try {
            j(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f3794b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f3794b.values().toArray(new w[0]);
                this.f3794b.clear();
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
            this.f3812w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f3811v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f3799j.e();
    }

    public final synchronized w h(int i) {
        return (w) this.f3794b.get(Integer.valueOf(i));
    }

    public final synchronized w i(int i) {
        w wVar;
        wVar = (w) this.f3794b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void j(int i) {
        V.g("statusCode", i);
        synchronized (this.f3812w) {
            synchronized (this) {
                if (this.f3797f) {
                    return;
                }
                this.f3797f = true;
                this.f3812w.j(this.d, i, n1.b.f3286a);
            }
        }
    }

    public final synchronized void k(long j2) {
        long j3 = this.f3807r + j2;
        this.f3807r = j3;
        long j4 = j3 - this.f3808s;
        if (j4 >= this.f3805p.c() / 2) {
            n(0, j4);
            this.f3808s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f3812w.f3852c);
        r6 = r2;
        r8.f3809t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, boolean z2, z1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f3812w.h(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f3809t;
                            long j5 = this.f3810u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f3794b.containsKey(Integer.valueOf(i))) {
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
            this.f3812w.h(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void m(int i, int i2) {
        V.g("errorCode", i2);
        this.h.c(new j(this.f3795c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void n(int i, long j2) {
        this.h.c(new n(this.f3795c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
