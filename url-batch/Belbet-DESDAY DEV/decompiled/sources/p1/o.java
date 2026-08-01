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
    public static final H.j f3444z;

    /* renamed from: a, reason: collision with root package name */
    public final h f3445a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3446b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f3447c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3448e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3449f;

    /* renamed from: g, reason: collision with root package name */
    public final l1.d f3450g;
    public final l1.c h;
    public final l1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final l1.c f3451j;

    /* renamed from: k, reason: collision with root package name */
    public final A f3452k;

    /* renamed from: l, reason: collision with root package name */
    public long f3453l;

    /* renamed from: m, reason: collision with root package name */
    public long f3454m;

    /* renamed from: n, reason: collision with root package name */
    public long f3455n;

    /* renamed from: o, reason: collision with root package name */
    public long f3456o;

    /* renamed from: p, reason: collision with root package name */
    public final H.j f3457p;

    /* renamed from: q, reason: collision with root package name */
    public H.j f3458q;

    /* renamed from: r, reason: collision with root package name */
    public long f3459r;

    /* renamed from: s, reason: collision with root package name */
    public long f3460s;

    /* renamed from: t, reason: collision with root package name */
    public long f3461t;

    /* renamed from: u, reason: collision with root package name */
    public long f3462u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f3463v;

    /* renamed from: w, reason: collision with root package name */
    public final x f3464w;

    /* renamed from: x, reason: collision with root package name */
    public final k f3465x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f3466y;

    static {
        H.j jVar = new H.j();
        jVar.f(7, 65535);
        jVar.f(5, 16384);
        f3444z = jVar;
    }

    public o(C0262u c0262u) {
        this.f3445a = (h) c0262u.f3072f;
        String str = (String) c0262u.f3070c;
        if (str == null) {
            X0.d.h("connectionName");
            throw null;
        }
        this.f3447c = str;
        this.f3448e = 3;
        l1.d dVar = (l1.d) c0262u.f3068a;
        this.f3450g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f3451j = dVar.e();
        this.f3452k = A.f3401a;
        H.j jVar = new H.j();
        jVar.f(7, 16777216);
        this.f3457p = jVar;
        this.f3458q = f3444z;
        this.f3462u = r0.b();
        Socket socket = (Socket) c0262u.f3069b;
        if (socket == null) {
            X0.d.h("socket");
            throw null;
        }
        this.f3463v = socket;
        v1.o oVar = (v1.o) c0262u.f3071e;
        if (oVar == null) {
            X0.d.h("sink");
            throw null;
        }
        this.f3464w = new x(oVar);
        v1.p pVar = (v1.p) c0262u.d;
        if (pVar == null) {
            X0.d.h("source");
            throw null;
        }
        this.f3465x = new k(this, new s(pVar));
        this.f3466y = new LinkedHashSet();
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
        byte[] bArr = j1.b.f2604a;
        try {
            h(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f3446b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f3446b.values().toArray(new w[0]);
                this.f3446b.clear();
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
            this.f3464w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f3463v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f3451j.e();
    }

    public final synchronized w f(int i) {
        return (w) this.f3446b.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.f3464w.flush();
    }

    public final synchronized w g(int i) {
        w wVar;
        wVar = (w) this.f3446b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void h(int i) {
        V.g("statusCode", i);
        synchronized (this.f3464w) {
            synchronized (this) {
                if (this.f3449f) {
                    return;
                }
                this.f3449f = true;
                this.f3464w.h(this.d, i, j1.b.f2604a);
            }
        }
    }

    public final synchronized void i(long j2) {
        long j3 = this.f3459r + j2;
        this.f3459r = j3;
        long j4 = j3 - this.f3460s;
        if (j4 >= this.f3457p.b() / 2) {
            l(0, j4);
            this.f3460s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f3464w.f3504c);
        r6 = r2;
        r8.f3461t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i, boolean z2, v1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f3464w.f(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f3461t;
                            long j5 = this.f3462u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f3446b.containsKey(Integer.valueOf(i))) {
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
            this.f3464w.f(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void k(int i, int i2) {
        V.g("errorCode", i2);
        this.h.c(new j(this.f3447c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void l(int i, long j2) {
        this.h.c(new n(this.f3447c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
