package N2;

import T2.C0231f;
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
    public final l f3638A;

    /* renamed from: B, reason: collision with root package name */
    public final LinkedHashSet f3639B;

    /* renamed from: d, reason: collision with root package name */
    public final i f3640d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f3641e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final String f3642f;

    /* renamed from: g, reason: collision with root package name */
    public int f3643g;

    /* renamed from: h, reason: collision with root package name */
    public int f3644h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3645i;

    /* renamed from: j, reason: collision with root package name */
    public final J2.e f3646j;

    /* renamed from: k, reason: collision with root package name */
    public final J2.c f3647k;

    /* renamed from: l, reason: collision with root package name */
    public final J2.c f3648l;

    /* renamed from: m, reason: collision with root package name */
    public final J2.c f3649m;

    /* renamed from: n, reason: collision with root package name */
    public final B f3650n;

    /* renamed from: o, reason: collision with root package name */
    public long f3651o;

    /* renamed from: p, reason: collision with root package name */
    public long f3652p;

    /* renamed from: q, reason: collision with root package name */
    public long f3653q;

    /* renamed from: r, reason: collision with root package name */
    public long f3654r;

    /* renamed from: s, reason: collision with root package name */
    public final C f3655s;

    /* renamed from: t, reason: collision with root package name */
    public C f3656t;

    /* renamed from: u, reason: collision with root package name */
    public long f3657u;

    /* renamed from: v, reason: collision with root package name */
    public long f3658v;

    /* renamed from: w, reason: collision with root package name */
    public long f3659w;

    /* renamed from: x, reason: collision with root package name */
    public long f3660x;

    /* renamed from: y, reason: collision with root package name */
    public final Socket f3661y;

    /* renamed from: z, reason: collision with root package name */
    public final y f3662z;

    static {
        C c2 = new C();
        c2.c(7, 65535);
        c2.c(5, 16384);
        C = c2;
    }

    public p(g gVar) {
        this.f3640d = (i) gVar.f3616f;
        String str = (String) gVar.f3613c;
        if (str == null) {
            f2.j.j("connectionName");
            throw null;
        }
        this.f3642f = str;
        this.f3644h = 3;
        J2.e eVar = (J2.e) gVar.f3611a;
        this.f3646j = eVar;
        this.f3647k = eVar.e();
        this.f3648l = eVar.e();
        this.f3649m = eVar.e();
        this.f3650n = B.f3576a;
        C c2 = new C();
        c2.c(7, 16777216);
        this.f3655s = c2;
        this.f3656t = C;
        this.f3660x = r0.a();
        Socket socket = (Socket) gVar.f3612b;
        if (socket == null) {
            f2.j.j("socket");
            throw null;
        }
        this.f3661y = socket;
        T2.x xVar = (T2.x) gVar.f3615e;
        if (xVar == null) {
            f2.j.j("sink");
            throw null;
        }
        this.f3662z = new y(xVar);
        T2.z zVar = (T2.z) gVar.f3614d;
        if (zVar == null) {
            f2.j.j("source");
            throw null;
        }
        this.f3638A = new l(this, new t(zVar));
        this.f3639B = new LinkedHashSet();
    }

    public final void a(int i3, int i4, IOException iOException) {
        int i5;
        Object[] objArr;
        A.k.s("connectionCode", i3);
        A.k.s("streamCode", i4);
        byte[] bArr = H2.b.f2632a;
        try {
            e(i3);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f3641e.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f3641e.values().toArray(new x[0]);
                this.f3641e.clear();
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
            this.f3662z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f3661y.close();
        } catch (IOException unused4) {
        }
        this.f3647k.e();
        this.f3648l.e();
        this.f3649m.e();
    }

    public final synchronized x b(int i3) {
        return (x) this.f3641e.get(Integer.valueOf(i3));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    public final synchronized x d(int i3) {
        x xVar;
        xVar = (x) this.f3641e.remove(Integer.valueOf(i3));
        notifyAll();
        return xVar;
    }

    public final void e(int i3) {
        A.k.s("statusCode", i3);
        synchronized (this.f3662z) {
            synchronized (this) {
                if (this.f3645i) {
                    return;
                }
                this.f3645i = true;
                this.f3662z.e(H2.b.f2632a, this.f3643g, i3);
            }
        }
    }

    public final void flush() {
        this.f3662z.flush();
    }

    public final synchronized void g(long j3) {
        long j4 = this.f3657u + j3;
        this.f3657u = j4;
        long j5 = j4 - this.f3658v;
        if (j5 >= this.f3655s.a() / 2) {
            n(j5, 0);
            this.f3658v += j5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f3662z.f3709f);
        r6 = r2;
        r8.f3659w += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i3, boolean z3, C0231f c0231f, long j3) {
        int min;
        long j4;
        if (j3 == 0) {
            this.f3662z.b(z3, i3, c0231f, 0);
            return;
        }
        while (j3 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j5 = this.f3659w;
                            long j6 = this.f3660x;
                            if (j5 < j6) {
                                break;
                            } else {
                                if (!this.f3641e.containsKey(Integer.valueOf(i3))) {
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
            this.f3662z.b(z3 && j3 == 0, i3, c0231f, min);
        }
    }

    public final void l(int i3, int i4) {
        A.k.s("errorCode", i4);
        this.f3647k.c(new k(this.f3642f + '[' + i3 + "] writeSynReset", this, i3, i4, 2), 0L);
    }

    public final void n(long j3, int i3) {
        this.f3647k.c(new o(this.f3642f + '[' + i3 + "] windowUpdate", this, i3, j3), 0L);
    }
}
