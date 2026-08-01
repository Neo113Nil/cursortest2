package p1;

import X.V;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l.C0262u;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final H.j f3443z;

    /* renamed from: a, reason: collision with root package name */
    public final h f3444a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3445b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f3446c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3447e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3448f;

    /* renamed from: g, reason: collision with root package name */
    public final l1.d f3449g;
    public final l1.c h;
    public final l1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final l1.c f3450j;

    /* renamed from: k, reason: collision with root package name */
    public final A f3451k;

    /* renamed from: l, reason: collision with root package name */
    public long f3452l;

    /* renamed from: m, reason: collision with root package name */
    public long f3453m;

    /* renamed from: n, reason: collision with root package name */
    public long f3454n;

    /* renamed from: o, reason: collision with root package name */
    public long f3455o;

    /* renamed from: p, reason: collision with root package name */
    public final H.j f3456p;

    /* renamed from: q, reason: collision with root package name */
    public H.j f3457q;

    /* renamed from: r, reason: collision with root package name */
    public long f3458r;

    /* renamed from: s, reason: collision with root package name */
    public long f3459s;

    /* renamed from: t, reason: collision with root package name */
    public long f3460t;

    /* renamed from: u, reason: collision with root package name */
    public long f3461u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f3462v;

    /* renamed from: w, reason: collision with root package name */
    public final x f3463w;

    /* renamed from: x, reason: collision with root package name */
    public final k f3464x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f3465y;

    static {
        H.j jVar = new H.j();
        jVar.f(7, 65535);
        jVar.f(5, 16384);
        f3443z = jVar;
    }

    public o(C0262u c0262u) {
        this.f3444a = (h) c0262u.f3071f;
        String str = (String) c0262u.f3069c;
        if (str == null) {
            X0.d.h("connectionName");
            throw null;
        }
        this.f3446c = str;
        this.f3447e = 3;
        l1.d dVar = (l1.d) c0262u.f3067a;
        this.f3449g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f3450j = dVar.e();
        this.f3451k = A.f3400a;
        H.j jVar = new H.j();
        jVar.f(7, 16777216);
        this.f3456p = jVar;
        this.f3457q = f3443z;
        this.f3461u = r0.b();
        Socket socket = (Socket) c0262u.f3068b;
        if (socket == null) {
            X0.d.h("socket");
            throw null;
        }
        this.f3462v = socket;
        v1.o oVar = (v1.o) c0262u.f3070e;
        if (oVar == null) {
            X0.d.h("sink");
            throw null;
        }
        this.f3463w = new x(oVar);
        v1.p pVar = (v1.p) c0262u.d;
        if (pVar == null) {
            X0.d.h("source");
            throw null;
        }
        this.f3464x = new k(this, new s(pVar));
        this.f3465y = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e(1, 9, null);
    }

    public final void e(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        V.g("connectionCode", i);
        V.g("streamCode", i2);
        byte[] bArr = j1.b.f2603a;
        try {
            h(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f3445b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f3445b.values().toArray(new w[0]);
                this.f3445b.clear();
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
            this.f3463w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f3462v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f3450j.e();
    }

    public final synchronized w f(int i) {
        return (w) this.f3445b.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.f3463w.flush();
    }

    public final synchronized w g(int i) {
        w wVar;
        wVar = (w) this.f3445b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void h(int i) {
        V.g("statusCode", i);
        synchronized (this.f3463w) {
            synchronized (this) {
                if (this.f3448f) {
                    return;
                }
                this.f3448f = true;
                this.f3463w.h(this.d, i, j1.b.f2603a);
            }
        }
    }

    public final synchronized void i(long j2) {
        long j3 = this.f3458r + j2;
        this.f3458r = j3;
        long j4 = j3 - this.f3459s;
        if (j4 >= this.f3456p.b() / 2) {
            l(0, j4);
            this.f3459s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f3463w.f3503c);
        r6 = r2;
        r8.f3460t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i, boolean z2, v1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f3463w.f(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f3460t;
                            long j5 = this.f3461u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f3445b.containsKey(Integer.valueOf(i))) {
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
            this.f3463w.f(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void k(int i, int i2) {
        V.g("errorCode", i2);
        this.h.c(new j(this.f3446c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void l(int i, long j2) {
        this.h.c(new n(this.f3446c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
