package y1;

import Y.V;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l.C0237t;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final H.j f4266z;

    /* renamed from: a, reason: collision with root package name */
    public final h f4267a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4268b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f4269c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4270e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4271f;

    /* renamed from: g, reason: collision with root package name */
    public final u1.d f4272g;
    public final u1.c h;
    public final u1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final u1.c f4273j;

    /* renamed from: k, reason: collision with root package name */
    public final z f4274k;

    /* renamed from: l, reason: collision with root package name */
    public long f4275l;

    /* renamed from: m, reason: collision with root package name */
    public long f4276m;

    /* renamed from: n, reason: collision with root package name */
    public long f4277n;

    /* renamed from: o, reason: collision with root package name */
    public long f4278o;

    /* renamed from: p, reason: collision with root package name */
    public final H.j f4279p;

    /* renamed from: q, reason: collision with root package name */
    public H.j f4280q;

    /* renamed from: r, reason: collision with root package name */
    public long f4281r;

    /* renamed from: s, reason: collision with root package name */
    public long f4282s;

    /* renamed from: t, reason: collision with root package name */
    public long f4283t;

    /* renamed from: u, reason: collision with root package name */
    public long f4284u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f4285v;

    /* renamed from: w, reason: collision with root package name */
    public final x f4286w;

    /* renamed from: x, reason: collision with root package name */
    public final k f4287x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f4288y;

    static {
        H.j jVar = new H.j();
        jVar.f(7, 65535);
        jVar.f(5, 16384);
        f4266z = jVar;
    }

    public o(C0237t c0237t) {
        this.f4267a = (h) c0237t.f3020f;
        String str = (String) c0237t.f3018c;
        if (str == null) {
            g1.d.h("connectionName");
            throw null;
        }
        this.f4269c = str;
        this.f4270e = 3;
        u1.d dVar = (u1.d) c0237t.f3016a;
        this.f4272g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f4273j = dVar.e();
        this.f4274k = z.f4331a;
        H.j jVar = new H.j();
        jVar.f(7, 16777216);
        this.f4279p = jVar;
        this.f4280q = f4266z;
        this.f4284u = r0.c();
        Socket socket = (Socket) c0237t.f3017b;
        if (socket == null) {
            g1.d.h("socket");
            throw null;
        }
        this.f4285v = socket;
        E1.o oVar = (E1.o) c0237t.f3019e;
        if (oVar == null) {
            g1.d.h("sink");
            throw null;
        }
        this.f4286w = new x(oVar);
        E1.p pVar = (E1.p) c0237t.d;
        if (pVar == null) {
            g1.d.h("source");
            throw null;
        }
        this.f4287x = new k(this, new s(pVar));
        this.f4288y = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g(1, 9, null);
    }

    public final void flush() {
        this.f4286w.flush();
    }

    public final void g(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        V.h("connectionCode", i);
        V.h("streamCode", i2);
        byte[] bArr = s1.b.f3721a;
        try {
            j(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f4268b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f4268b.values().toArray(new w[0]);
                this.f4268b.clear();
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
            this.f4286w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f4285v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f4273j.e();
    }

    public final synchronized w h(int i) {
        return (w) this.f4268b.get(Integer.valueOf(i));
    }

    public final synchronized w i(int i) {
        w wVar;
        wVar = (w) this.f4268b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void j(int i) {
        V.h("statusCode", i);
        synchronized (this.f4286w) {
            synchronized (this) {
                if (this.f4271f) {
                    return;
                }
                this.f4271f = true;
                this.f4286w.j(this.d, i, s1.b.f3721a);
            }
        }
    }

    public final synchronized void k(long j2) {
        long j3 = this.f4281r + j2;
        this.f4281r = j3;
        long j4 = j3 - this.f4282s;
        if (j4 >= this.f4279p.c() / 2) {
            n(0, j4);
            this.f4282s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f4286w.f4326c);
        r6 = r2;
        r8.f4283t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, boolean z2, E1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f4286w.h(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f4283t;
                            long j5 = this.f4284u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f4268b.containsKey(Integer.valueOf(i))) {
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
            this.f4286w.h(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void m(int i, int i2) {
        V.h("errorCode", i2);
        this.h.c(new j(this.f4269c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void n(int i, long j2) {
        this.h.c(new n(this.f4269c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
