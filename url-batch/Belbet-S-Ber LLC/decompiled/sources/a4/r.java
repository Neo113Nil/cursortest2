package a4;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r implements Closeable {
    public static final e0 E;
    public final Socket A;
    public final a0 B;
    public final m C;
    public final LinkedHashSet D;

    /* renamed from: f, reason: collision with root package name */
    public final j f200f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f201g = new LinkedHashMap();
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f202j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f203k;

    /* renamed from: l, reason: collision with root package name */
    public final w3.c f204l;

    /* renamed from: m, reason: collision with root package name */
    public final w3.b f205m;

    /* renamed from: n, reason: collision with root package name */
    public final w3.b f206n;

    /* renamed from: o, reason: collision with root package name */
    public final w3.b f207o;

    /* renamed from: p, reason: collision with root package name */
    public final d0 f208p;

    /* renamed from: q, reason: collision with root package name */
    public long f209q;

    /* renamed from: r, reason: collision with root package name */
    public long f210r;

    /* renamed from: s, reason: collision with root package name */
    public long f211s;

    /* renamed from: t, reason: collision with root package name */
    public long f212t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f213u;

    /* renamed from: v, reason: collision with root package name */
    public e0 f214v;

    /* renamed from: w, reason: collision with root package name */
    public long f215w;

    /* renamed from: x, reason: collision with root package name */
    public long f216x;

    /* renamed from: y, reason: collision with root package name */
    public long f217y;

    /* renamed from: z, reason: collision with root package name */
    public long f218z;

    static {
        e0 e0Var = new e0(0);
        e0Var.f(7, 65535);
        e0Var.f(5, 16384);
        E = e0Var;
    }

    public r(h hVar) {
        this.f200f = (j) hVar.f179f;
        String str = (String) hVar.f177c;
        if (str == null) {
            i3.d.h("connectionName");
            throw null;
        }
        this.h = str;
        this.f202j = 3;
        w3.c cVar = (w3.c) hVar.f175a;
        this.f204l = cVar;
        this.f205m = cVar.e();
        this.f206n = cVar.e();
        this.f207o = cVar.e();
        this.f208p = d0.f160a;
        e0 e0Var = new e0(0);
        e0Var.f(7, 16777216);
        this.f213u = e0Var;
        this.f214v = E;
        this.f218z = r0.c();
        Socket socket = (Socket) hVar.f176b;
        if (socket == null) {
            i3.d.h("socket");
            throw null;
        }
        this.A = socket;
        g4.o oVar = (g4.o) hVar.f178e;
        if (oVar == null) {
            i3.d.h("sink");
            throw null;
        }
        this.B = new a0(oVar);
        g4.p pVar = (g4.p) hVar.d;
        if (pVar == null) {
            i3.d.h("source");
            throw null;
        }
        this.C = new m(this, new v(pVar));
        this.D = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m(1, 9, null);
    }

    public final void flush() {
        this.B.flush();
    }

    public final void m(int i, int i4, IOException iOException) {
        int i5;
        Object[] objArr;
        b.i("connectionCode", i);
        b.i("streamCode", i4);
        byte[] bArr = u3.b.f3581a;
        try {
            p(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f201g.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f201g.values().toArray(new z[0]);
                this.f201g.clear();
            }
        }
        z[] zVarArr = (z[]) objArr;
        if (zVarArr != null) {
            for (z zVar : zVarArr) {
                try {
                    zVar.c(i4, iOException);
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
        this.f205m.e();
        this.f206n.e();
        this.f207o.e();
    }

    public final synchronized z n(int i) {
        return (z) this.f201g.get(Integer.valueOf(i));
    }

    public final synchronized z o(int i) {
        z zVar;
        zVar = (z) this.f201g.remove(Integer.valueOf(i));
        notifyAll();
        return zVar;
    }

    public final void p(int i) {
        b.i("statusCode", i);
        synchronized (this.B) {
            synchronized (this) {
                if (this.f203k) {
                    return;
                }
                this.f203k = true;
                this.B.p(this.i, i, u3.b.f3581a);
            }
        }
    }

    public final synchronized void q(long j2) {
        long j4 = this.f215w + j2;
        this.f215w = j4;
        long j5 = j4 - this.f216x;
        if (j5 >= this.f213u.c() / 2) {
            t(0, j5);
            this.f216x += j5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.B.h);
        r6 = r2;
        r8.f217y += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(int i, boolean z4, g4.f fVar, long j2) {
        int min;
        long j4;
        if (j2 == 0) {
            this.B.n(z4, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j5 = this.f217y;
                            long j6 = this.f218z;
                            if (j5 < j6) {
                                break;
                            } else {
                                if (!this.f201g.containsKey(Integer.valueOf(i))) {
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
            j2 -= j4;
            this.B.n(z4 && j2 == 0, i, fVar, min);
        }
    }

    public final void s(int i, int i4) {
        b.i("errorCode", i4);
        this.f205m.c(new l(this.h + '[' + i + "] writeSynReset", this, i, i4, 2), 0L);
    }

    public final void t(int i, long j2) {
        this.f205m.c(new q(this.h + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
