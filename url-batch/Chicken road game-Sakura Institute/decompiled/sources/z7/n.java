package z7;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n implements Closeable {
    public static final z E;
    public final Socket A;
    public final w B;
    public final g4.o C;
    public final LinkedHashSet D;

    /* renamed from: f, reason: collision with root package name */
    public final h f10181f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f10182g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final String f10183h;

    /* renamed from: i, reason: collision with root package name */
    public int f10184i;

    /* renamed from: j, reason: collision with root package name */
    public int f10185j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10186k;

    /* renamed from: l, reason: collision with root package name */
    public final v7.d f10187l;

    /* renamed from: m, reason: collision with root package name */
    public final v7.c f10188m;

    /* renamed from: n, reason: collision with root package name */
    public final v7.c f10189n;

    /* renamed from: o, reason: collision with root package name */
    public final v7.c f10190o;

    /* renamed from: p, reason: collision with root package name */
    public final y f10191p;

    /* renamed from: q, reason: collision with root package name */
    public long f10192q;

    /* renamed from: r, reason: collision with root package name */
    public long f10193r;

    /* renamed from: s, reason: collision with root package name */
    public long f10194s;

    /* renamed from: t, reason: collision with root package name */
    public long f10195t;

    /* renamed from: u, reason: collision with root package name */
    public final z f10196u;

    /* renamed from: v, reason: collision with root package name */
    public z f10197v;

    /* renamed from: w, reason: collision with root package name */
    public long f10198w;

    /* renamed from: x, reason: collision with root package name */
    public long f10199x;

    /* renamed from: y, reason: collision with root package name */
    public long f10200y;

    /* renamed from: z, reason: collision with root package name */
    public long f10201z;

    static {
        z zVar = new z();
        zVar.c(7, 65535);
        zVar.c(5, 16384);
        E = zVar;
    }

    public n(e5.v vVar) {
        this.f10181f = (h) vVar.f2805f;
        String str = (String) vVar.f2802c;
        if (str == null) {
            r6.k.j("connectionName");
            throw null;
        }
        this.f10183h = str;
        this.f10185j = 3;
        v7.d dVar = (v7.d) vVar.f2800a;
        this.f10187l = dVar;
        this.f10188m = dVar.e();
        this.f10189n = dVar.e();
        this.f10190o = dVar.e();
        this.f10191p = y.f10254a;
        z zVar = new z();
        zVar.c(7, 16777216);
        this.f10196u = zVar;
        this.f10197v = E;
        this.f10201z = r0.a();
        Socket socket = (Socket) vVar.f2801b;
        if (socket == null) {
            r6.k.j("socket");
            throw null;
        }
        this.A = socket;
        f8.y yVar = (f8.y) vVar.f2804e;
        if (yVar == null) {
            r6.k.j("sink");
            throw null;
        }
        this.B = new w(yVar);
        f8.a0 a0Var = (f8.a0) vVar.f2803d;
        if (a0Var == null) {
            r6.k.j("source");
            throw null;
        }
        this.C = new g4.o(this, 3, new r(a0Var));
        this.D = new LinkedHashSet();
    }

    public final void b(int i7, int i8, IOException iOException) {
        int i9;
        Object[] objArr;
        r6.i.f("connectionCode", i7);
        r6.i.f("streamCode", i8);
        byte[] bArr = t7.b.f8932a;
        try {
            n(i7);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f10182g.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f10182g.values().toArray(new v[0]);
                this.f10182g.clear();
            }
        }
        v[] vVarArr = (v[]) objArr;
        if (vVarArr != null) {
            for (v vVar : vVarArr) {
                try {
                    vVar.c(i8, iOException);
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
        this.f10188m.e();
        this.f10189n.e();
        this.f10190o.e();
    }

    public final synchronized v c(int i7) {
        return (v) this.f10182g.get(Integer.valueOf(i7));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(1, 9, null);
    }

    public final void flush() {
        this.B.flush();
    }

    public final synchronized v k(int i7) {
        v vVar;
        vVar = (v) this.f10182g.remove(Integer.valueOf(i7));
        notifyAll();
        return vVar;
    }

    public final void n(int i7) {
        r6.i.f("statusCode", i7);
        synchronized (this.B) {
            synchronized (this) {
                if (this.f10186k) {
                    return;
                }
                this.f10186k = true;
                this.B.n(t7.b.f8932a, this.f10184i, i7);
            }
        }
    }

    public final synchronized void t(long j8) {
        long j9 = this.f10198w + j8;
        this.f10198w = j9;
        long j10 = j9 - this.f10199x;
        if (j10 >= this.f10196u.a() / 2) {
            z(j10, 0);
            this.f10199x += j10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.B.f10248h);
        r6 = r2;
        r8.f10200y += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(int i7, boolean z8, f8.f fVar, long j8) {
        int min;
        long j9;
        if (j8 == 0) {
            this.B.c(z8, i7, fVar, 0);
            return;
        }
        while (j8 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j10 = this.f10200y;
                            long j11 = this.f10201z;
                            if (j10 < j11) {
                                break;
                            } else {
                                if (!this.f10182g.containsKey(Integer.valueOf(i7))) {
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
            j8 -= j9;
            this.B.c(z8 && j8 == 0, i7, fVar, min);
        }
    }

    public final void w(int i7, int i8) {
        r6.i.f("errorCode", i8);
        this.f10188m.c(new j(this.f10183h + '[' + i7 + "] writeSynReset", this, i7, i8, 2), 0L);
    }

    public final void z(long j8, int i7) {
        this.f10188m.c(new m(this.f10183h + '[' + i7 + "] windowUpdate", this, i7, j8), 0L);
    }
}
