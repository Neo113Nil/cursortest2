package v1;

import Y.V;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l.C0232s;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final H.j f4094z;

    /* renamed from: a, reason: collision with root package name */
    public final h f4095a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4096b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f4097c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4098e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4099f;

    /* renamed from: g, reason: collision with root package name */
    public final r1.d f4100g;
    public final r1.c h;
    public final r1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final r1.c f4101j;

    /* renamed from: k, reason: collision with root package name */
    public final z f4102k;

    /* renamed from: l, reason: collision with root package name */
    public long f4103l;

    /* renamed from: m, reason: collision with root package name */
    public long f4104m;

    /* renamed from: n, reason: collision with root package name */
    public long f4105n;

    /* renamed from: o, reason: collision with root package name */
    public long f4106o;

    /* renamed from: p, reason: collision with root package name */
    public final H.j f4107p;

    /* renamed from: q, reason: collision with root package name */
    public H.j f4108q;

    /* renamed from: r, reason: collision with root package name */
    public long f4109r;

    /* renamed from: s, reason: collision with root package name */
    public long f4110s;

    /* renamed from: t, reason: collision with root package name */
    public long f4111t;

    /* renamed from: u, reason: collision with root package name */
    public long f4112u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f4113v;

    /* renamed from: w, reason: collision with root package name */
    public final x f4114w;

    /* renamed from: x, reason: collision with root package name */
    public final k f4115x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f4116y;

    static {
        H.j jVar = new H.j();
        jVar.f(7, 65535);
        jVar.f(5, 16384);
        f4094z = jVar;
    }

    public o(C0232s c0232s) {
        this.f4095a = (h) c0232s.f2981f;
        String str = (String) c0232s.f2979c;
        if (str == null) {
            d1.d.h("connectionName");
            throw null;
        }
        this.f4097c = str;
        this.f4098e = 3;
        r1.d dVar = (r1.d) c0232s.f2977a;
        this.f4100g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f4101j = dVar.e();
        this.f4102k = z.f4159a;
        H.j jVar = new H.j();
        jVar.f(7, 16777216);
        this.f4107p = jVar;
        this.f4108q = f4094z;
        this.f4112u = r0.c();
        Socket socket = (Socket) c0232s.f2978b;
        if (socket == null) {
            d1.d.h("socket");
            throw null;
        }
        this.f4113v = socket;
        B1.o oVar = (B1.o) c0232s.f2980e;
        if (oVar == null) {
            d1.d.h("sink");
            throw null;
        }
        this.f4114w = new x(oVar);
        B1.p pVar = (B1.p) c0232s.d;
        if (pVar == null) {
            d1.d.h("source");
            throw null;
        }
        this.f4115x = new k(this, new s(pVar));
        this.f4116y = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g(1, 9, null);
    }

    public final void flush() {
        this.f4114w.flush();
    }

    public final void g(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        V.h("connectionCode", i);
        V.h("streamCode", i2);
        byte[] bArr = p1.b.f3455a;
        try {
            j(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f4096b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f4096b.values().toArray(new w[0]);
                this.f4096b.clear();
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
            this.f4114w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f4113v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f4101j.e();
    }

    public final synchronized w h(int i) {
        return (w) this.f4096b.get(Integer.valueOf(i));
    }

    public final synchronized w i(int i) {
        w wVar;
        wVar = (w) this.f4096b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void j(int i) {
        V.h("statusCode", i);
        synchronized (this.f4114w) {
            synchronized (this) {
                if (this.f4099f) {
                    return;
                }
                this.f4099f = true;
                this.f4114w.j(this.d, i, p1.b.f3455a);
            }
        }
    }

    public final synchronized void k(long j2) {
        long j3 = this.f4109r + j2;
        this.f4109r = j3;
        long j4 = j3 - this.f4110s;
        if (j4 >= this.f4107p.c() / 2) {
            n(0, j4);
            this.f4110s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f4114w.f4154c);
        r6 = r2;
        r8.f4111t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, boolean z2, B1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f4114w.h(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f4111t;
                            long j5 = this.f4112u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f4096b.containsKey(Integer.valueOf(i))) {
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
            this.f4114w.h(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void m(int i, int i2) {
        V.h("errorCode", i2);
        this.h.c(new j(this.f4097c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void n(int i, long j2) {
        this.h.c(new n(this.f4097c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
