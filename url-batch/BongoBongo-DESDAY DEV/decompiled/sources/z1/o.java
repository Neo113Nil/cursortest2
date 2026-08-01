package z1;

import Z.V;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import m.C0239t;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final I.i f4465z;

    /* renamed from: a, reason: collision with root package name */
    public final h f4466a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4467b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f4468c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4469e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4470f;

    /* renamed from: g, reason: collision with root package name */
    public final v1.d f4471g;

    /* renamed from: h, reason: collision with root package name */
    public final v1.c f4472h;
    public final v1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final v1.c f4473j;

    /* renamed from: k, reason: collision with root package name */
    public final z f4474k;

    /* renamed from: l, reason: collision with root package name */
    public long f4475l;

    /* renamed from: m, reason: collision with root package name */
    public long f4476m;

    /* renamed from: n, reason: collision with root package name */
    public long f4477n;

    /* renamed from: o, reason: collision with root package name */
    public long f4478o;

    /* renamed from: p, reason: collision with root package name */
    public final I.i f4479p;

    /* renamed from: q, reason: collision with root package name */
    public I.i f4480q;

    /* renamed from: r, reason: collision with root package name */
    public long f4481r;

    /* renamed from: s, reason: collision with root package name */
    public long f4482s;

    /* renamed from: t, reason: collision with root package name */
    public long f4483t;

    /* renamed from: u, reason: collision with root package name */
    public long f4484u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f4485v;

    /* renamed from: w, reason: collision with root package name */
    public final x f4486w;

    /* renamed from: x, reason: collision with root package name */
    public final k f4487x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f4488y;

    static {
        I.i iVar = new I.i();
        iVar.f(7, 65535);
        iVar.f(5, 16384);
        f4465z = iVar;
    }

    public o(C0239t c0239t) {
        this.f4466a = (h) c0239t.f3185f;
        String str = (String) c0239t.f3183c;
        if (str == null) {
            h1.d.h("connectionName");
            throw null;
        }
        this.f4468c = str;
        this.f4469e = 3;
        v1.d dVar = (v1.d) c0239t.f3181a;
        this.f4471g = dVar;
        this.f4472h = dVar.e();
        this.i = dVar.e();
        this.f4473j = dVar.e();
        this.f4474k = z.f4533a;
        I.i iVar = new I.i();
        iVar.f(7, 16777216);
        this.f4479p = iVar;
        this.f4480q = f4465z;
        this.f4484u = r0.c();
        Socket socket = (Socket) c0239t.f3182b;
        if (socket == null) {
            h1.d.h("socket");
            throw null;
        }
        this.f4485v = socket;
        F1.o oVar = (F1.o) c0239t.f3184e;
        if (oVar == null) {
            h1.d.h("sink");
            throw null;
        }
        this.f4486w = new x(oVar);
        F1.p pVar = (F1.p) c0239t.d;
        if (pVar == null) {
            h1.d.h("source");
            throw null;
        }
        this.f4487x = new k(this, new s(pVar));
        this.f4488y = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g(1, 9, null);
    }

    public final void flush() {
        this.f4486w.flush();
    }

    public final void g(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        V.h("connectionCode", i);
        V.h("streamCode", i2);
        byte[] bArr = t1.b.f3898a;
        try {
            j(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f4467b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f4467b.values().toArray(new w[0]);
                this.f4467b.clear();
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
            this.f4486w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f4485v.close();
        } catch (IOException unused4) {
        }
        this.f4472h.e();
        this.i.e();
        this.f4473j.e();
    }

    public final synchronized w h(int i) {
        return (w) this.f4467b.get(Integer.valueOf(i));
    }

    public final synchronized w i(int i) {
        w wVar;
        wVar = (w) this.f4467b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void j(int i) {
        V.h("statusCode", i);
        synchronized (this.f4486w) {
            synchronized (this) {
                if (this.f4470f) {
                    return;
                }
                this.f4470f = true;
                this.f4486w.j(this.d, i, t1.b.f3898a);
            }
        }
    }

    public final synchronized void k(long j2) {
        long j3 = this.f4481r + j2;
        this.f4481r = j3;
        long j4 = j3 - this.f4482s;
        if (j4 >= this.f4479p.c() / 2) {
            n(0, j4);
            this.f4482s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f4486w.f4528c);
        r6 = r2;
        r8.f4483t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, boolean z2, F1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f4486w.h(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f4483t;
                            long j5 = this.f4484u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f4467b.containsKey(Integer.valueOf(i))) {
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
            this.f4486w.h(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void m(int i, int i2) {
        V.h("errorCode", i2);
        this.f4472h.c(new j(this.f4468c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void n(int i, long j2) {
        this.f4472h.c(new n(this.f4468c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
