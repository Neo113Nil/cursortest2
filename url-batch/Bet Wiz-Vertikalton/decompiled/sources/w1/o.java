package w1;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l.C0243t;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final H.j f4122z;

    /* renamed from: a, reason: collision with root package name */
    public final h f4123a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4124b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f4125c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4126e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4127f;

    /* renamed from: g, reason: collision with root package name */
    public final s1.d f4128g;
    public final s1.c h;
    public final s1.c i;

    /* renamed from: j, reason: collision with root package name */
    public final s1.c f4129j;

    /* renamed from: k, reason: collision with root package name */
    public final z f4130k;

    /* renamed from: l, reason: collision with root package name */
    public long f4131l;

    /* renamed from: m, reason: collision with root package name */
    public long f4132m;

    /* renamed from: n, reason: collision with root package name */
    public long f4133n;

    /* renamed from: o, reason: collision with root package name */
    public long f4134o;

    /* renamed from: p, reason: collision with root package name */
    public final H.j f4135p;

    /* renamed from: q, reason: collision with root package name */
    public H.j f4136q;

    /* renamed from: r, reason: collision with root package name */
    public long f4137r;

    /* renamed from: s, reason: collision with root package name */
    public long f4138s;

    /* renamed from: t, reason: collision with root package name */
    public long f4139t;

    /* renamed from: u, reason: collision with root package name */
    public long f4140u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f4141v;

    /* renamed from: w, reason: collision with root package name */
    public final x f4142w;

    /* renamed from: x, reason: collision with root package name */
    public final k f4143x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f4144y;

    static {
        H.j jVar = new H.j();
        jVar.f(7, 65535);
        jVar.f(5, 16384);
        f4122z = jVar;
    }

    public o(C0243t c0243t) {
        this.f4123a = (h) c0243t.f3056f;
        String str = (String) c0243t.f3054c;
        if (str == null) {
            e1.d.h("connectionName");
            throw null;
        }
        this.f4125c = str;
        this.f4126e = 3;
        s1.d dVar = (s1.d) c0243t.f3052a;
        this.f4128g = dVar;
        this.h = dVar.e();
        this.i = dVar.e();
        this.f4129j = dVar.e();
        this.f4130k = z.f4187a;
        H.j jVar = new H.j();
        jVar.f(7, 16777216);
        this.f4135p = jVar;
        this.f4136q = f4122z;
        this.f4140u = r0.c();
        Socket socket = (Socket) c0243t.f3053b;
        if (socket == null) {
            e1.d.h("socket");
            throw null;
        }
        this.f4141v = socket;
        C1.o oVar = (C1.o) c0243t.f3055e;
        if (oVar == null) {
            e1.d.h("sink");
            throw null;
        }
        this.f4142w = new x(oVar);
        C1.p pVar = (C1.p) c0243t.d;
        if (pVar == null) {
            e1.d.h("source");
            throw null;
        }
        this.f4143x = new k(this, new s(pVar));
        this.f4144y = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g(1, 9, null);
    }

    public final void flush() {
        this.f4142w.flush();
    }

    public final void g(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        T0.c.g("connectionCode", i);
        T0.c.g("streamCode", i2);
        byte[] bArr = q1.b.f3491a;
        try {
            j(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f4124b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f4124b.values().toArray(new w[0]);
                this.f4124b.clear();
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
            this.f4142w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f4141v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.f4129j.e();
    }

    public final synchronized w h(int i) {
        return (w) this.f4124b.get(Integer.valueOf(i));
    }

    public final synchronized w i(int i) {
        w wVar;
        wVar = (w) this.f4124b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void j(int i) {
        T0.c.g("statusCode", i);
        synchronized (this.f4142w) {
            synchronized (this) {
                if (this.f4127f) {
                    return;
                }
                this.f4127f = true;
                this.f4142w.j(this.d, i, q1.b.f3491a);
            }
        }
    }

    public final synchronized void k(long j2) {
        long j3 = this.f4137r + j2;
        this.f4137r = j3;
        long j4 = j3 - this.f4138s;
        if (j4 >= this.f4135p.c() / 2) {
            n(0, j4);
            this.f4138s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f4142w.f4182c);
        r6 = r2;
        r8.f4139t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, boolean z2, C1.f fVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f4142w.h(z2, i, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f4139t;
                            long j5 = this.f4140u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f4124b.containsKey(Integer.valueOf(i))) {
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
            this.f4142w.h(z2 && j2 == 0, i, fVar, min);
        }
    }

    public final void m(int i, int i2) {
        T0.c.g("errorCode", i2);
        this.h.c(new j(this.f4125c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void n(int i, long j2) {
        this.h.c(new n(this.f4125c + '[' + i + "] windowUpdate", this, i, j2), 0L);
    }
}
