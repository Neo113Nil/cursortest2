package N3;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class q implements Closeable {
    public static final D z;

    /* renamed from: a, reason: collision with root package name */
    public final i f1880a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1881b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f1882c;

    /* renamed from: d, reason: collision with root package name */
    public int f1883d;

    /* renamed from: e, reason: collision with root package name */
    public int f1884e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1885f;

    /* renamed from: g, reason: collision with root package name */
    public final J3.d f1886g;

    /* renamed from: h, reason: collision with root package name */
    public final J3.c f1887h;

    /* renamed from: i, reason: collision with root package name */
    public final J3.c f1888i;

    /* renamed from: j, reason: collision with root package name */
    public final J3.c f1889j;

    /* renamed from: k, reason: collision with root package name */
    public final C f1890k;

    /* renamed from: l, reason: collision with root package name */
    public long f1891l;

    /* renamed from: m, reason: collision with root package name */
    public long f1892m;
    public long n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public final D f1893p;

    /* renamed from: q, reason: collision with root package name */
    public D f1894q;

    /* renamed from: r, reason: collision with root package name */
    public long f1895r;

    /* renamed from: s, reason: collision with root package name */
    public long f1896s;

    /* renamed from: t, reason: collision with root package name */
    public long f1897t;

    /* renamed from: u, reason: collision with root package name */
    public long f1898u;
    public final Socket v;

    /* renamed from: w, reason: collision with root package name */
    public final z f1899w;

    /* renamed from: x, reason: collision with root package name */
    public final l f1900x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f1901y;

    static {
        D d4 = new D();
        d4.c(7, 65535);
        d4.c(5, 16384);
        z = d4;
    }

    public q(L1.h hVar) {
        this.f1880a = (i) hVar.f1638f;
        String str = (String) hVar.f1633a;
        if (str == null) {
            kotlin.jvm.internal.i.i("connectionName");
            throw null;
        }
        this.f1882c = str;
        this.f1884e = 3;
        J3.d dVar = (J3.d) hVar.f1634b;
        this.f1886g = dVar;
        this.f1887h = dVar.e();
        this.f1888i = dVar.e();
        this.f1889j = dVar.e();
        this.f1890k = C.f1816a;
        D d4 = new D();
        d4.c(7, 16777216);
        this.f1893p = d4;
        this.f1894q = z;
        this.f1898u = r0.a();
        Socket socket = (Socket) hVar.f1635c;
        if (socket == null) {
            kotlin.jvm.internal.i.i("socket");
            throw null;
        }
        this.v = socket;
        T3.o oVar = (T3.o) hVar.f1637e;
        if (oVar == null) {
            kotlin.jvm.internal.i.i("sink");
            throw null;
        }
        this.f1899w = new z(oVar);
        T3.p pVar = (T3.p) hVar.f1636d;
        if (pVar == null) {
            kotlin.jvm.internal.i.i(AdRevenueConstants.SOURCE_KEY);
            throw null;
        }
        this.f1900x = new l(this, new u(pVar));
        this.f1901y = new LinkedHashSet();
    }

    public final void a(EnumC0078b enumC0078b, EnumC0078b enumC0078b2, IOException iOException) {
        int i4;
        Object[] objArr;
        byte[] bArr = H3.b.f1103a;
        try {
            k(enumC0078b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f1881b.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.f1881b.values().toArray(new y[0]);
                    if (objArr == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    this.f1881b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y[] yVarArr = (y[]) objArr;
        if (yVarArr != null) {
            for (y yVar : yVarArr) {
                try {
                    yVar.c(enumC0078b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f1899w.close();
        } catch (IOException unused3) {
        }
        try {
            this.v.close();
        } catch (IOException unused4) {
        }
        this.f1887h.e();
        this.f1888i.e();
        this.f1889j.e();
    }

    public final void b(IOException iOException) {
        EnumC0078b enumC0078b = EnumC0078b.PROTOCOL_ERROR;
        a(enumC0078b, enumC0078b, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC0078b.NO_ERROR, EnumC0078b.CANCEL, null);
    }

    public final synchronized y e(int i4) {
        return (y) this.f1881b.get(Integer.valueOf(i4));
    }

    public final synchronized y f(int i4) {
        y yVar;
        yVar = (y) this.f1881b.remove(Integer.valueOf(i4));
        notifyAll();
        return yVar;
    }

    public final void flush() {
        this.f1899w.flush();
    }

    public final void k(EnumC0078b enumC0078b) {
        synchronized (this.f1899w) {
            synchronized (this) {
                if (this.f1885f) {
                    return;
                }
                this.f1885f = true;
                this.f1899w.f(this.f1883d, enumC0078b, H3.b.f1103a);
            }
        }
    }

    public final synchronized void n(long j4) {
        long j5 = this.f1895r + j4;
        this.f1895r = j5;
        long j6 = j5 - this.f1896s;
        if (j6 >= this.f1893p.a() / 2) {
            u(0, j6);
            this.f1896s += j6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f1899w.f1947c);
        r6 = r2;
        r8.f1897t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(int i4, boolean z4, T3.g gVar, long j4) {
        int min;
        long j5;
        if (j4 == 0) {
            this.f1899w.b(z4, i4, gVar, 0);
            return;
        }
        while (j4 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j6 = this.f1897t;
                            long j7 = this.f1898u;
                            if (j6 < j7) {
                                break;
                            } else {
                                if (!this.f1881b.containsKey(Integer.valueOf(i4))) {
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
            this.f1899w.b(z4 && j4 == 0, i4, gVar, min);
        }
    }

    public final void t(int i4, EnumC0078b enumC0078b) {
        this.f1887h.c(new o(this.f1882c + '[' + i4 + "] writeSynReset", this, i4, enumC0078b), 0L);
    }

    public final void u(int i4, long j4) {
        this.f1887h.c(new p(this.f1882c + '[' + i4 + "] windowUpdate", this, i4, j4), 0L);
    }
}
