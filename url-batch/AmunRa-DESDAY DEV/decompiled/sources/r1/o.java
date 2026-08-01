package r1;

import X.V;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l.C0243u;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final H.j f3571z;

    /* renamed from: a, reason: collision with root package name */
    public final h f3572a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3573b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f3574c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3575e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3576f;

    /* renamed from: g, reason: collision with root package name */
    public final n1.d f3577g;
    public final n1.c h;
    public final n1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final n1.c f3578j;

    /* renamed from: k, reason: collision with root package name */
    public final A f3579k;

    /* renamed from: l, reason: collision with root package name */
    public long f3580l;

    /* renamed from: m, reason: collision with root package name */
    public long f3581m;

    /* renamed from: n, reason: collision with root package name */
    public long f3582n;

    /* renamed from: o, reason: collision with root package name */
    public long f3583o;

    /* renamed from: p, reason: collision with root package name */
    public final H.j f3584p;

    /* renamed from: q, reason: collision with root package name */
    public H.j f3585q;

    /* renamed from: r, reason: collision with root package name */
    public long f3586r;

    /* renamed from: s, reason: collision with root package name */
    public long f3587s;

    /* renamed from: t, reason: collision with root package name */
    public long f3588t;

    /* renamed from: u, reason: collision with root package name */
    public long f3589u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f3590v;

    /* renamed from: w, reason: collision with root package name */
    public final x f3591w;

    /* renamed from: x, reason: collision with root package name */
    public final k f3592x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f3593y;

    static {
        H.j jVar = new H.j();
        jVar.f(7, 65535);
        jVar.f(5, 16384);
        f3571z = jVar;
    }

    public o(C0243u c0243u) {
        this.f3572a = (h) c0243u.f3150f;
        String str = (String) c0243u.f3148c;
        if (str == null) {
            Z0.d.h("connectionName");
            throw null;
        }
        this.f3574c = str;
        this.f3575e = 3;
        n1.d dVar = (n1.d) c0243u.f3146a;
        this.f3577g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f3578j = dVar.e();
        this.f3579k = A.f3528a;
        H.j jVar = new H.j();
        jVar.f(7, 16777216);
        this.f3584p = jVar;
        this.f3585q = f3571z;
        this.f3589u = r0.c();
        Socket socket = (Socket) c0243u.f3147b;
        if (socket == null) {
            Z0.d.h("socket");
            throw null;
        }
        this.f3590v = socket;
        x1.o oVar = (x1.o) c0243u.f3149e;
        if (oVar == null) {
            Z0.d.h("sink");
            throw null;
        }
        this.f3591w = new x(oVar);
        x1.p pVar = (x1.p) c0243u.d;
        if (pVar == null) {
            Z0.d.h("source");
            throw null;
        }
        this.f3592x = new k(this, new s(pVar));
        this.f3593y = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f(1, 9, null);
    }

    public final void f(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        V.g("connectionCode", i);
        V.g("streamCode", i2);
        byte[] bArr = l1.b.f3252a;
        try {
            j(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f3573b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f3573b.values().toArray(new w[0]);
                this.f3573b.clear();
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
            this.f3591w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f3590v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f3578j.e();
    }

    public final void flush() {
        this.f3591w.flush();
    }

    public final synchronized w h(int i) {
        return (w) this.f3573b.get(Integer.valueOf(i));
    }

    public final synchronized w i(int i) {
        w wVar;
        wVar = (w) this.f3573b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void j(int i) {
        V.g("statusCode", i);
        synchronized (this.f3591w) {
            synchronized (this) {
                if (this.f3576f) {
                    return;
                }
                this.f3576f = true;
                this.f3591w.j(this.d, i, l1.b.f3252a);
            }
        }
    }

    public final synchronized void k(long j2) {
        long j3 = this.f3586r + j2;
        this.f3586r = j3;
        long j4 = j3 - this.f3587s;
        if (j4 >= this.f3584p.c() / 2) {
            n(0, j4);
            this.f3587s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f3591w.f3631c);
        r6 = r2;
        r8.f3588t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, boolean z2, x1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f3591w.h(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f3588t;
                            long j5 = this.f3589u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f3573b.containsKey(Integer.valueOf(i))) {
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
            this.f3591w.h(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void m(int i, int i2) {
        V.g("errorCode", i2);
        this.h.c(new j(this.f3574c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void n(int i, long j2) {
        this.h.c(new n(this.f3574c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
