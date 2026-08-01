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
    public static final D f394z;

    /* renamed from: a, reason: collision with root package name */
    public final j f395a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f396b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f397c;

    /* renamed from: d, reason: collision with root package name */
    public int f398d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f399f;

    /* renamed from: g, reason: collision with root package name */
    public final C1.f f400g;

    /* renamed from: h, reason: collision with root package name */
    public final C1.c f401h;
    public final C1.c i;
    public final C1.c j;

    /* renamed from: k, reason: collision with root package name */
    public final C f402k;

    /* renamed from: l, reason: collision with root package name */
    public long f403l;

    /* renamed from: m, reason: collision with root package name */
    public long f404m;

    /* renamed from: n, reason: collision with root package name */
    public long f405n;

    /* renamed from: o, reason: collision with root package name */
    public long f406o;

    /* renamed from: p, reason: collision with root package name */
    public final D f407p;

    /* renamed from: q, reason: collision with root package name */
    public D f408q;

    /* renamed from: r, reason: collision with root package name */
    public long f409r;

    /* renamed from: s, reason: collision with root package name */
    public long f410s;

    /* renamed from: t, reason: collision with root package name */
    public long f411t;

    /* renamed from: u, reason: collision with root package name */
    public long f412u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f413v;

    /* renamed from: w, reason: collision with root package name */
    public final z f414w;

    /* renamed from: x, reason: collision with root package name */
    public final m f415x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f416y;

    static {
        D d2 = new D();
        d2.c(7, 65535);
        d2.c(5, 16384);
        f394z = d2;
    }

    public q(h hVar) {
        this.f395a = (j) hVar.f378f;
        String str = (String) hVar.f376c;
        if (str == null) {
            j1.h.h("connectionName");
            throw null;
        }
        this.f397c = str;
        this.e = 3;
        C1.f fVar = (C1.f) hVar.f374a;
        this.f400g = fVar;
        this.f401h = fVar.e();
        this.i = fVar.e();
        this.j = fVar.e();
        this.f402k = C.f344a;
        D d2 = new D();
        d2.c(7, 16777216);
        this.f407p = d2;
        this.f408q = f394z;
        this.f412u = r0.a();
        Socket socket = (Socket) hVar.f375b;
        if (socket == null) {
            j1.h.h("socket");
            throw null;
        }
        this.f413v = socket;
        M1.o oVar = (M1.o) hVar.e;
        if (oVar == null) {
            j1.h.h("sink");
            throw null;
        }
        this.f414w = new z(oVar);
        M1.p pVar = (M1.p) hVar.f377d;
        if (pVar == null) {
            j1.h.h("source");
            throw null;
        }
        this.f415x = new m(this, new u(pVar));
        this.f416y = new LinkedHashSet();
    }

    public final synchronized void B(long j) {
        long j2 = this.f409r + j;
        this.f409r = j2;
        long j3 = j2 - this.f410s;
        if (j3 >= this.f407p.a() / 2) {
            F(0, j3);
            this.f410s += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f414w.f457c);
        r6 = r2;
        r8.f411t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(int i, boolean z2, M1.f fVar, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.f414w.d(z2, i, fVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.f411t;
                            long j4 = this.f412u;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.f396b.containsKey(Integer.valueOf(i))) {
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
            j -= j2;
            this.f414w.d(z2 && j == 0, i, fVar, min);
        }
    }

    public final void E(int i, int i2) {
        AbstractC0001b.j("errorCode", i2);
        this.f401h.c(new l(this.f397c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void F(int i, long j) {
        this.f401h.c(new p(this.f397c + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    public final void a(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        AbstractC0001b.j("connectionCode", i);
        AbstractC0001b.j("streamCode", i2);
        byte[] bArr = A1.c.f19a;
        try {
            z(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f396b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f396b.values().toArray(new y[0]);
                this.f396b.clear();
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
            this.f414w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f413v.close();
        } catch (IOException unused4) {
        }
        this.f401h.e();
        this.i.e();
        this.j.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    public final synchronized y d(int i) {
        return (y) this.f396b.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.f414w.flush();
    }

    public final synchronized y q(int i) {
        y yVar;
        yVar = (y) this.f396b.remove(Integer.valueOf(i));
        notifyAll();
        return yVar;
    }

    public final void z(int i) {
        AbstractC0001b.j("statusCode", i);
        synchronized (this.f414w) {
            synchronized (this) {
                if (this.f399f) {
                    return;
                }
                this.f399f = true;
                this.f414w.z(this.f398d, i, A1.c.f19a);
            }
        }
    }
}
