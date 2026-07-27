package t3;

import A1.L0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z3.C1448f;

/* loaded from: classes.dex */
public final class p implements Closeable {

    /* renamed from: F, reason: collision with root package name */
    public static final B f10809F;

    /* renamed from: A, reason: collision with root package name */
    public long f10810A;
    public final Socket B;

    /* renamed from: C, reason: collision with root package name */
    public final y f10811C;

    /* renamed from: D, reason: collision with root package name */
    public final L0 f10812D;

    /* renamed from: E, reason: collision with root package name */
    public final LinkedHashSet f10813E;

    /* renamed from: d, reason: collision with root package name */
    public final i f10814d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f10815e;

    /* renamed from: i, reason: collision with root package name */
    public final String f10816i;

    /* renamed from: j, reason: collision with root package name */
    public int f10817j;

    /* renamed from: k, reason: collision with root package name */
    public int f10818k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10819l;

    /* renamed from: m, reason: collision with root package name */
    public final p3.d f10820m;

    /* renamed from: n, reason: collision with root package name */
    public final p3.c f10821n;

    /* renamed from: o, reason: collision with root package name */
    public final p3.c f10822o;

    /* renamed from: p, reason: collision with root package name */
    public final p3.c f10823p;

    /* renamed from: q, reason: collision with root package name */
    public final A f10824q;

    /* renamed from: r, reason: collision with root package name */
    public long f10825r;

    /* renamed from: s, reason: collision with root package name */
    public long f10826s;

    /* renamed from: t, reason: collision with root package name */
    public long f10827t;

    /* renamed from: u, reason: collision with root package name */
    public long f10828u;

    /* renamed from: v, reason: collision with root package name */
    public final B f10829v;

    /* renamed from: w, reason: collision with root package name */
    public B f10830w;

    /* renamed from: x, reason: collision with root package name */
    public long f10831x;

    /* renamed from: y, reason: collision with root package name */
    public long f10832y;

    /* renamed from: z, reason: collision with root package name */
    public long f10833z;

    static {
        B b4 = new B();
        b4.c(7, 65535);
        b4.c(5, 16384);
        f10809F = b4;
    }

    public p(Z1.v builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f10814d = (i) builder.f4609f;
        this.f10815e = new LinkedHashMap();
        String str = (String) builder.f4606c;
        if (str == null) {
            Intrinsics.g("connectionName");
            throw null;
        }
        this.f10816i = str;
        this.f10818k = 3;
        p3.d dVar = (p3.d) builder.f4604a;
        this.f10820m = dVar;
        this.f10821n = dVar.e();
        this.f10822o = dVar.e();
        this.f10823p = dVar.e();
        this.f10824q = A.f10744a;
        B b4 = new B();
        b4.c(7, 16777216);
        this.f10829v = b4;
        this.f10830w = f10809F;
        this.f10810A = r0.a();
        Socket socket = (Socket) builder.f4605b;
        if (socket == null) {
            Intrinsics.g("socket");
            throw null;
        }
        this.B = socket;
        z3.x xVar = (z3.x) builder.f4608e;
        if (xVar == null) {
            Intrinsics.g("sink");
            throw null;
        }
        this.f10811C = new y(xVar);
        z3.z zVar = (z3.z) builder.f4607d;
        if (zVar == null) {
            Intrinsics.g("source");
            throw null;
        }
        this.f10812D = new L0(this, new t(zVar));
        this.f10813E = new LinkedHashSet();
    }

    public final void a(EnumC1211b connectionCode, EnumC1211b streamCode, IOException iOException) {
        int i2;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = n3.b.f8558a;
        try {
            g(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f10815e.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.f10815e.values().toArray(new x[0]);
                    this.f10815e.clear();
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
        x[] xVarArr = (x[]) objArr;
        if (xVarArr != null) {
            for (x xVar : xVarArr) {
                try {
                    xVar.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f10811C.close();
        } catch (IOException unused3) {
        }
        try {
            this.B.close();
        } catch (IOException unused4) {
        }
        this.f10821n.e();
        this.f10822o.e();
        this.f10823p.e();
    }

    public final void b(IOException iOException) {
        EnumC1211b enumC1211b = EnumC1211b.PROTOCOL_ERROR;
        a(enumC1211b, enumC1211b, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC1211b.NO_ERROR, EnumC1211b.CANCEL, null);
    }

    public final synchronized x d(int i2) {
        return (x) this.f10815e.get(Integer.valueOf(i2));
    }

    public final synchronized x f(int i2) {
        x xVar;
        xVar = (x) this.f10815e.remove(Integer.valueOf(i2));
        notifyAll();
        return xVar;
    }

    public final void flush() {
        this.f10811C.flush();
    }

    public final void g(EnumC1211b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f10811C) {
            M2.C c4 = new M2.C();
            synchronized (this) {
                if (this.f10819l) {
                    return;
                }
                this.f10819l = true;
                int i2 = this.f10817j;
                c4.f3578d = i2;
                Unit unit = Unit.f7487a;
                this.f10811C.f(i2, statusCode, n3.b.f8558a);
            }
        }
    }

    public final synchronized void h(long j4) {
        long j5 = this.f10831x + j4;
        this.f10831x = j5;
        long j6 = j5 - this.f10832y;
        if (j6 >= this.f10829v.a() / 2) {
            k(j6, 0);
            this.f10832y += j6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f10811C.f10880i);
        r6 = r2;
        r8.f10833z += r6;
        r4 = kotlin.Unit.f7487a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i2, boolean z4, C1448f c1448f, long j4) {
        int min;
        long j5;
        if (j4 == 0) {
            this.f10811C.b(z4, i2, c1448f, 0);
            return;
        }
        while (j4 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j6 = this.f10833z;
                            long j7 = this.f10810A;
                            if (j6 < j7) {
                                break;
                            } else {
                                if (!this.f10815e.containsKey(Integer.valueOf(i2))) {
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
            j4 -= j5;
            this.f10811C.b(z4 && j4 == 0, i2, c1448f, min);
        }
    }

    public final void j(int i2, EnumC1211b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f10821n.c(new n(this.f10816i + '[' + i2 + "] writeSynReset", this, i2, errorCode, 1), 0L);
    }

    public final void k(long j4, int i2) {
        this.f10821n.c(new o(this.f10816i + '[' + i2 + "] windowUpdate", this, i2, j4), 0L);
    }
}
