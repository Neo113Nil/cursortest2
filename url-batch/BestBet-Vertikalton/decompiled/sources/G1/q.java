package G1;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class q implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final D f412z;

    /* renamed from: a, reason: collision with root package name */
    public final j f413a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f414b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f415c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f416e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f417f;

    /* renamed from: g, reason: collision with root package name */
    public final C1.d f418g;
    public final C1.c h;
    public final C1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final C1.c f419j;

    /* renamed from: k, reason: collision with root package name */
    public final C f420k;

    /* renamed from: l, reason: collision with root package name */
    public long f421l;

    /* renamed from: m, reason: collision with root package name */
    public long f422m;

    /* renamed from: n, reason: collision with root package name */
    public long f423n;

    /* renamed from: o, reason: collision with root package name */
    public long f424o;

    /* renamed from: p, reason: collision with root package name */
    public final D f425p;

    /* renamed from: q, reason: collision with root package name */
    public D f426q;

    /* renamed from: r, reason: collision with root package name */
    public long f427r;

    /* renamed from: s, reason: collision with root package name */
    public long f428s;

    /* renamed from: t, reason: collision with root package name */
    public long f429t;

    /* renamed from: u, reason: collision with root package name */
    public long f430u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f431v;

    /* renamed from: w, reason: collision with root package name */
    public final z f432w;

    /* renamed from: x, reason: collision with root package name */
    public final m f433x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f434y;

    static {
        D d = new D();
        d.c(7, 65535);
        d.c(5, 16384);
        f412z = d;
    }

    public q(h hVar) {
        this.f413a = (j) hVar.f393f;
        String str = (String) hVar.f391c;
        if (str == null) {
            k1.e.h("connectionName");
            throw null;
        }
        this.f415c = str;
        this.f416e = 3;
        C1.d dVar = (C1.d) hVar.f389a;
        this.f418g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f419j = dVar.e();
        this.f420k = C.f362a;
        D d = new D();
        d.c(7, 16777216);
        this.f425p = d;
        this.f426q = f412z;
        this.f430u = r0.a();
        Socket socket = (Socket) hVar.f390b;
        if (socket == null) {
            k1.e.h("socket");
            throw null;
        }
        this.f431v = socket;
        M1.o oVar = (M1.o) hVar.f392e;
        if (oVar == null) {
            k1.e.h("sink");
            throw null;
        }
        this.f432w = new z(oVar);
        M1.p pVar = (M1.p) hVar.d;
        if (pVar == null) {
            k1.e.h("source");
            throw null;
        }
        this.f433x = new m(this, new u(pVar));
        this.f434y = new LinkedHashSet();
    }

    public final void a(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        AbstractC0001b.j("connectionCode", i);
        AbstractC0001b.j("streamCode", i2);
        byte[] bArr = A1.c.f13a;
        try {
            k(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f414b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f414b.values().toArray(new y[0]);
                this.f414b.clear();
            }
        }
        y[] yVarArr = (y[]) objArr;
        if (yVarArr != null) {
            for (y yVar : yVarArr) {
                try {
                    yVar.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f432w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f431v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f419j.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    public final synchronized y d(int i) {
        return (y) this.f414b.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.f432w.flush();
    }

    public final synchronized y j(int i) {
        y yVar;
        yVar = (y) this.f414b.remove(Integer.valueOf(i));
        notifyAll();
        return yVar;
    }

    public final void k(int i) {
        AbstractC0001b.j("statusCode", i);
        synchronized (this.f432w) {
            synchronized (this) {
                if (this.f417f) {
                    return;
                }
                this.f417f = true;
                this.f432w.k(this.d, i, A1.c.f13a);
            }
        }
    }

    public final synchronized void p(long j2) {
        long j3 = this.f427r + j2;
        this.f427r = j3;
        long j4 = j3 - this.f428s;
        if (j4 >= this.f425p.a() / 2) {
            t(0, j4);
            this.f428s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f432w.f472c);
        r6 = r2;
        r8.f429t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(int i, boolean z2, M1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f432w.d(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f429t;
                            long j5 = this.f430u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f414b.containsKey(Integer.valueOf(i))) {
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
            this.f432w.d(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void s(int i, int i2) {
        AbstractC0001b.j("errorCode", i2);
        this.h.c(new l(this.f415c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void t(int i, long j2) {
        this.h.c(new p(this.f415c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
