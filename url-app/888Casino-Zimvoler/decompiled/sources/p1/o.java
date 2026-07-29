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
    public static final H.j f3422z;

    /* renamed from: a, reason: collision with root package name */
    public final h f3423a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3424b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f3425c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3426e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3427f;

    /* renamed from: g, reason: collision with root package name */
    public final l1.d f3428g;
    public final l1.c h;
    public final l1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final l1.c f3429j;

    /* renamed from: k, reason: collision with root package name */
    public final A f3430k;

    /* renamed from: l, reason: collision with root package name */
    public long f3431l;

    /* renamed from: m, reason: collision with root package name */
    public long f3432m;

    /* renamed from: n, reason: collision with root package name */
    public long f3433n;

    /* renamed from: o, reason: collision with root package name */
    public long f3434o;

    /* renamed from: p, reason: collision with root package name */
    public final H.j f3435p;

    /* renamed from: q, reason: collision with root package name */
    public H.j f3436q;

    /* renamed from: r, reason: collision with root package name */
    public long f3437r;

    /* renamed from: s, reason: collision with root package name */
    public long f3438s;

    /* renamed from: t, reason: collision with root package name */
    public long f3439t;

    /* renamed from: u, reason: collision with root package name */
    public long f3440u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f3441v;

    /* renamed from: w, reason: collision with root package name */
    public final x f3442w;

    /* renamed from: x, reason: collision with root package name */
    public final k f3443x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f3444y;

    static {
        H.j jVar = new H.j();
        jVar.f(7, 65535);
        jVar.f(5, 16384);
        f3422z = jVar;
    }

    public o(C0262u c0262u) {
        this.f3423a = (h) c0262u.f3050f;
        String str = (String) c0262u.f3048c;
        if (str == null) {
            X0.e.h("connectionName");
            throw null;
        }
        this.f3425c = str;
        this.f3426e = 3;
        l1.d dVar = (l1.d) c0262u.f3046a;
        this.f3428g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f3429j = dVar.e();
        this.f3430k = A.f3379a;
        H.j jVar = new H.j();
        jVar.f(7, 16777216);
        this.f3435p = jVar;
        this.f3436q = f3422z;
        this.f3440u = r0.b();
        Socket socket = (Socket) c0262u.f3047b;
        if (socket == null) {
            X0.e.h("socket");
            throw null;
        }
        this.f3441v = socket;
        v1.n nVar = (v1.n) c0262u.f3049e;
        if (nVar == null) {
            X0.e.h("sink");
            throw null;
        }
        this.f3442w = new x(nVar);
        v1.o oVar = (v1.o) c0262u.d;
        if (oVar == null) {
            X0.e.h("source");
            throw null;
        }
        this.f3443x = new k(this, new s(oVar));
        this.f3444y = new LinkedHashSet();
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
        byte[] bArr = j1.b.f2582a;
        try {
            h(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f3424b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f3424b.values().toArray(new w[0]);
                this.f3424b.clear();
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
            this.f3442w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f3441v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f3429j.e();
    }

    public final synchronized w f(int i) {
        return (w) this.f3424b.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.f3442w.flush();
    }

    public final synchronized w g(int i) {
        w wVar;
        wVar = (w) this.f3424b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void h(int i) {
        V.g("statusCode", i);
        synchronized (this.f3442w) {
            synchronized (this) {
                if (this.f3427f) {
                    return;
                }
                this.f3427f = true;
                this.f3442w.h(this.d, i, j1.b.f2582a);
            }
        }
    }

    public final synchronized void i(long j2) {
        long j3 = this.f3437r + j2;
        this.f3437r = j3;
        long j4 = j3 - this.f3438s;
        if (j4 >= this.f3435p.b() / 2) {
            l(0, j4);
            this.f3438s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f3442w.f3482c);
        r6 = r2;
        r8.f3439t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i, boolean z2, v1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f3442w.f(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f3439t;
                            long j5 = this.f3440u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f3424b.containsKey(Integer.valueOf(i))) {
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
            this.f3442w.f(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void k(int i, int i2) {
        V.g("errorCode", i2);
        this.h.c(new j(this.f3425c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void l(int i, long j2) {
        this.h.c(new n(this.f3425c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
