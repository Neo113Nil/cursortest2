package H2;

import N2.C0150f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class p implements Closeable {
    public static final C C;

    /* renamed from: A, reason: collision with root package name */
    public final H1.q f1983A;
    public final LinkedHashSet B;

    /* renamed from: d, reason: collision with root package name */
    public final j f1984d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1985e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final String f1986f;

    /* renamed from: g, reason: collision with root package name */
    public int f1987g;

    /* renamed from: h, reason: collision with root package name */
    public int f1988h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1989i;

    /* renamed from: j, reason: collision with root package name */
    public final D2.e f1990j;

    /* renamed from: k, reason: collision with root package name */
    public final D2.c f1991k;

    /* renamed from: l, reason: collision with root package name */
    public final D2.c f1992l;

    /* renamed from: m, reason: collision with root package name */
    public final D2.c f1993m;

    /* renamed from: n, reason: collision with root package name */
    public final B f1994n;

    /* renamed from: o, reason: collision with root package name */
    public long f1995o;
    public long p;

    /* renamed from: q, reason: collision with root package name */
    public long f1996q;

    /* renamed from: r, reason: collision with root package name */
    public long f1997r;

    /* renamed from: s, reason: collision with root package name */
    public final C f1998s;

    /* renamed from: t, reason: collision with root package name */
    public C f1999t;

    /* renamed from: u, reason: collision with root package name */
    public long f2000u;

    /* renamed from: v, reason: collision with root package name */
    public long f2001v;

    /* renamed from: w, reason: collision with root package name */
    public long f2002w;

    /* renamed from: x, reason: collision with root package name */
    public long f2003x;

    /* renamed from: y, reason: collision with root package name */
    public final Socket f2004y;

    /* renamed from: z, reason: collision with root package name */
    public final y f2005z;

    static {
        C c3 = new C();
        c3.c(7, 65535);
        c3.c(5, 16384);
        C = c3;
    }

    public p(h hVar) {
        this.f1984d = (j) hVar.f1964f;
        String str = (String) hVar.f1961c;
        if (str == null) {
            Z1.i.j("connectionName");
            throw null;
        }
        this.f1986f = str;
        this.f1988h = 3;
        D2.e eVar = (D2.e) hVar.f1959a;
        this.f1990j = eVar;
        this.f1991k = eVar.e();
        this.f1992l = eVar.e();
        this.f1993m = eVar.e();
        this.f1994n = B.f1924a;
        C c3 = new C();
        c3.c(7, 16777216);
        this.f1998s = c3;
        this.f1999t = C;
        this.f2003x = r0.a();
        Socket socket = (Socket) hVar.f1960b;
        if (socket == null) {
            Z1.i.j("socket");
            throw null;
        }
        this.f2004y = socket;
        N2.x xVar = (N2.x) hVar.f1963e;
        if (xVar == null) {
            Z1.i.j("sink");
            throw null;
        }
        this.f2005z = new y(xVar);
        N2.z zVar = (N2.z) hVar.f1962d;
        if (zVar == null) {
            Z1.i.j("source");
            throw null;
        }
        this.f1983A = new H1.q(this, new t(zVar));
        this.B = new LinkedHashSet();
    }

    public final void a(int i3, int i4, IOException iOException) {
        int i5;
        Object[] objArr;
        AbstractC0080b.s("connectionCode", i3);
        AbstractC0080b.s("streamCode", i4);
        byte[] bArr = B2.c.f415a;
        try {
            h(i3);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f1985e.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f1985e.values().toArray(new x[0]);
                this.f1985e.clear();
            }
        }
        x[] xVarArr = (x[]) objArr;
        if (xVarArr != null) {
            for (x xVar : xVarArr) {
                try {
                    xVar.c(i4, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f2005z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f2004y.close();
        } catch (IOException unused4) {
        }
        this.f1991k.e();
        this.f1992l.e();
        this.f1993m.e();
    }

    public final synchronized x b(int i3) {
        return (x) this.f1985e.get(Integer.valueOf(i3));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    public final synchronized x e(int i3) {
        x xVar;
        xVar = (x) this.f1985e.remove(Integer.valueOf(i3));
        notifyAll();
        return xVar;
    }

    public final void flush() {
        this.f2005z.flush();
    }

    public final void h(int i3) {
        AbstractC0080b.s("statusCode", i3);
        synchronized (this.f2005z) {
            synchronized (this) {
                if (this.f1989i) {
                    return;
                }
                this.f1989i = true;
                this.f2005z.h(B2.c.f415a, this.f1987g, i3);
            }
        }
    }

    public final synchronized void i(long j3) {
        long j4 = this.f2000u + j3;
        this.f2000u = j4;
        long j5 = j4 - this.f2001v;
        if (j5 >= this.f1998s.a() / 2) {
            m(j5, 0);
            this.f2001v += j5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f2005z.f2052f);
        r6 = r2;
        r8.f2002w += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i3, boolean z3, C0150f c0150f, long j3) {
        int min;
        long j4;
        if (j3 == 0) {
            this.f2005z.b(z3, i3, c0150f, 0);
            return;
        }
        while (j3 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j5 = this.f2002w;
                            long j6 = this.f2003x;
                            if (j5 < j6) {
                                break;
                            } else {
                                if (!this.f1985e.containsKey(Integer.valueOf(i3))) {
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
            j3 -= j4;
            this.f2005z.b(z3 && j3 == 0, i3, c0150f, min);
        }
    }

    public final void k(int i3, int i4) {
        AbstractC0080b.s("errorCode", i4);
        this.f1991k.c(new l(this.f1986f + '[' + i3 + "] writeSynReset", this, i3, i4, 2), 0L);
    }

    public final void m(long j3, int i3) {
        this.f1991k.c(new o(this.f1986f + '[' + i3 + "] windowUpdate", this, i3, j3), 0L);
    }
}
