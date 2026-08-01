package j3;

import androidx.fragment.app.w0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class p implements Closeable {
    public static final f.f E;
    public final Socket A;
    public final y B;
    public final l C;
    public final LinkedHashSet D;

    /* renamed from: f, reason: collision with root package name */
    public final i f2442f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public int f2443i;

    /* renamed from: j, reason: collision with root package name */
    public int f2444j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2445k;

    /* renamed from: l, reason: collision with root package name */
    public final f3.d f2446l;

    /* renamed from: m, reason: collision with root package name */
    public final f3.c f2447m;

    /* renamed from: n, reason: collision with root package name */
    public final f3.c f2448n;

    /* renamed from: o, reason: collision with root package name */
    public final f3.c f2449o;

    /* renamed from: p, reason: collision with root package name */
    public final b0 f2450p;

    /* renamed from: q, reason: collision with root package name */
    public long f2451q;

    /* renamed from: r, reason: collision with root package name */
    public long f2452r;

    /* renamed from: s, reason: collision with root package name */
    public long f2453s;

    /* renamed from: t, reason: collision with root package name */
    public long f2454t;

    /* renamed from: u, reason: collision with root package name */
    public final f.f f2455u;

    /* renamed from: v, reason: collision with root package name */
    public f.f f2456v;

    /* renamed from: w, reason: collision with root package name */
    public long f2457w;

    /* renamed from: x, reason: collision with root package name */
    public long f2458x;

    /* renamed from: y, reason: collision with root package name */
    public long f2459y;

    /* renamed from: z, reason: collision with root package name */
    public long f2460z;

    static {
        f.f fVar = new f.f(3);
        fVar.f(7, 65535);
        fVar.f(5, 16384);
        E = fVar;
    }

    public p(g gVar) {
        this.f2442f = (i) gVar.f2429f;
        String str = (String) gVar.c;
        if (str == null) {
            u2.c.h("connectionName");
            throw null;
        }
        this.h = str;
        this.f2444j = 3;
        f3.d dVar = (f3.d) gVar.f2425a;
        this.f2446l = dVar;
        this.f2447m = dVar.e();
        this.f2448n = dVar.e();
        this.f2449o = dVar.e();
        this.f2450p = b0.f2408a;
        f.f fVar = new f.f(3);
        fVar.f(7, 16777216);
        this.f2455u = fVar;
        this.f2456v = E;
        this.f2460z = r0.b();
        Socket socket = (Socket) gVar.f2426b;
        if (socket == null) {
            u2.c.h("socket");
            throw null;
        }
        this.A = socket;
        p3.o oVar = (p3.o) gVar.f2428e;
        if (oVar == null) {
            u2.c.h("sink");
            throw null;
        }
        this.B = new y(oVar);
        p3.p pVar = (p3.p) gVar.f2427d;
        if (pVar == null) {
            u2.c.h("source");
            throw null;
        }
        this.C = new l(this, new t(pVar));
        this.D = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m(1, 9, null);
    }

    public final void flush() {
        this.B.flush();
    }

    public final void m(int i4, int i5, IOException iOException) {
        int i6;
        Object[] objArr;
        w0.h("connectionCode", i4);
        w0.h("streamCode", i5);
        byte[] bArr = d3.c.f1490a;
        try {
            p(i4);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.g.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.g.values().toArray(new x[0]);
                this.g.clear();
            }
        }
        x[] xVarArr = (x[]) objArr;
        if (xVarArr != null) {
            for (x xVar : xVarArr) {
                try {
                    xVar.c(i5, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.B.close();
        } catch (IOException unused3) {
        }
        try {
            this.A.close();
        } catch (IOException unused4) {
        }
        this.f2447m.e();
        this.f2448n.e();
        this.f2449o.e();
    }

    public final synchronized x n(int i4) {
        return (x) this.g.get(Integer.valueOf(i4));
    }

    public final synchronized x o(int i4) {
        x xVar;
        xVar = (x) this.g.remove(Integer.valueOf(i4));
        notifyAll();
        return xVar;
    }

    public final void p(int i4) {
        w0.h("statusCode", i4);
        synchronized (this.B) {
            synchronized (this) {
                if (this.f2445k) {
                    return;
                }
                this.f2445k = true;
                this.B.p(this.f2443i, i4, d3.c.f1490a);
            }
        }
    }

    public final synchronized void q(long j4) {
        long j5 = this.f2457w + j4;
        this.f2457w = j5;
        long j6 = j5 - this.f2458x;
        if (j6 >= this.f2455u.b() / 2) {
            t(0, j6);
            this.f2458x += j6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.B.h);
        r6 = r2;
        r8.f2459y += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(int i4, boolean z3, p3.f fVar, long j4) {
        int min;
        long j5;
        if (j4 == 0) {
            this.B.n(z3, i4, fVar, 0);
            return;
        }
        while (j4 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j6 = this.f2459y;
                            long j7 = this.f2460z;
                            if (j6 < j7) {
                                break;
                            } else {
                                if (!this.g.containsKey(Integer.valueOf(i4))) {
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
            j4 -= j5;
            this.B.n(z3 && j4 == 0, i4, fVar, min);
        }
    }

    public final void s(int i4, int i5) {
        w0.h("errorCode", i5);
        this.f2447m.c(new k(this.h + '[' + i4 + "] writeSynReset", this, i4, i5, 2), 0L);
    }

    public final void t(int i4, long j4) {
        this.f2447m.c(new o(this.h + '[' + i4 + "] windowUpdate", this, i4, j4), 0L);
    }
}
