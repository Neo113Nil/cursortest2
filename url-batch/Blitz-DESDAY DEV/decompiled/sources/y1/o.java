package y1;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l.C0212t;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final J.i f4237z;

    /* renamed from: a, reason: collision with root package name */
    public final h f4238a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4239b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f4240c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4241e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4242f;

    /* renamed from: g, reason: collision with root package name */
    public final u1.d f4243g;
    public final u1.c h;
    public final u1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final u1.c f4244j;

    /* renamed from: k, reason: collision with root package name */
    public final z f4245k;

    /* renamed from: l, reason: collision with root package name */
    public long f4246l;

    /* renamed from: m, reason: collision with root package name */
    public long f4247m;

    /* renamed from: n, reason: collision with root package name */
    public long f4248n;

    /* renamed from: o, reason: collision with root package name */
    public long f4249o;

    /* renamed from: p, reason: collision with root package name */
    public final J.i f4250p;

    /* renamed from: q, reason: collision with root package name */
    public J.i f4251q;

    /* renamed from: r, reason: collision with root package name */
    public long f4252r;

    /* renamed from: s, reason: collision with root package name */
    public long f4253s;

    /* renamed from: t, reason: collision with root package name */
    public long f4254t;

    /* renamed from: u, reason: collision with root package name */
    public long f4255u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f4256v;

    /* renamed from: w, reason: collision with root package name */
    public final x f4257w;

    /* renamed from: x, reason: collision with root package name */
    public final k f4258x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f4259y;

    static {
        J.i iVar = new J.i();
        iVar.k(7, 65535);
        iVar.k(5, 16384);
        f4237z = iVar;
    }

    public o(C0212t c0212t) {
        this.f4238a = (h) c0212t.f3067f;
        String str = (String) c0212t.f3065c;
        if (str == null) {
            g1.d.h("connectionName");
            throw null;
        }
        this.f4240c = str;
        this.f4241e = 3;
        u1.d dVar = (u1.d) c0212t.f3063a;
        this.f4243g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f4244j = dVar.e();
        this.f4245k = z.f4302a;
        J.i iVar = new J.i();
        iVar.k(7, 16777216);
        this.f4250p = iVar;
        this.f4251q = f4237z;
        this.f4255u = r0.f();
        Socket socket = (Socket) c0212t.f3064b;
        if (socket == null) {
            g1.d.h("socket");
            throw null;
        }
        this.f4256v = socket;
        E1.o oVar = (E1.o) c0212t.f3066e;
        if (oVar == null) {
            g1.d.h("sink");
            throw null;
        }
        this.f4257w = new x(oVar);
        E1.p pVar = (E1.p) c0212t.d;
        if (pVar == null) {
            g1.d.h("source");
            throw null;
        }
        this.f4258x = new k(this, new s(pVar));
        this.f4259y = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g(1, 9, null);
    }

    public final void flush() {
        this.f4257w.flush();
    }

    public final void g(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        X0.a.h("connectionCode", i);
        X0.a.h("streamCode", i2);
        byte[] bArr = s1.b.f3607a;
        try {
            j(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f4239b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f4239b.values().toArray(new w[0]);
                this.f4239b.clear();
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
            this.f4257w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f4256v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f4244j.e();
    }

    public final synchronized w h(int i) {
        return (w) this.f4239b.get(Integer.valueOf(i));
    }

    public final synchronized w i(int i) {
        w wVar;
        wVar = (w) this.f4239b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void j(int i) {
        X0.a.h("statusCode", i);
        synchronized (this.f4257w) {
            synchronized (this) {
                if (this.f4242f) {
                    return;
                }
                this.f4242f = true;
                this.f4257w.j(this.d, i, s1.b.f3607a);
            }
        }
    }

    public final synchronized void k(long j2) {
        long j3 = this.f4252r + j2;
        this.f4252r = j3;
        long j4 = j3 - this.f4253s;
        if (j4 >= this.f4250p.f() / 2) {
            n(0, j4);
            this.f4253s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f4257w.f4297c);
        r6 = r2;
        r8.f4254t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, boolean z2, E1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f4257w.h(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f4254t;
                            long j5 = this.f4255u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f4239b.containsKey(Integer.valueOf(i))) {
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
            this.f4257w.h(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void m(int i, int i2) {
        X0.a.h("errorCode", i2);
        this.h.c(new j(this.f4240c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void n(int i, long j2) {
        this.h.c(new n(this.f4240c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
