package K6;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r implements Closeable {

    /* renamed from: H, reason: collision with root package name */
    public static final E f1554H;

    /* renamed from: A, reason: collision with root package name */
    public final L6.a f1555A;

    /* renamed from: B, reason: collision with root package name */
    public long f1556B;

    /* renamed from: C, reason: collision with root package name */
    public long f1557C;

    /* renamed from: D, reason: collision with root package name */
    public final D0.j f1558D;

    /* renamed from: E, reason: collision with root package name */
    public final A f1559E;

    /* renamed from: F, reason: collision with root package name */
    public final q f1560F;

    /* renamed from: G, reason: collision with root package name */
    public final LinkedHashSet f1561G;

    /* renamed from: d, reason: collision with root package name */
    public final n f1562d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1563e;

    /* renamed from: i, reason: collision with root package name */
    public final String f1564i;

    /* renamed from: l, reason: collision with root package name */
    public int f1565l;

    /* renamed from: m, reason: collision with root package name */
    public int f1566m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1567n;

    /* renamed from: o, reason: collision with root package name */
    public final G6.d f1568o;

    /* renamed from: p, reason: collision with root package name */
    public final G6.c f1569p;

    /* renamed from: q, reason: collision with root package name */
    public final G6.c f1570q;

    /* renamed from: r, reason: collision with root package name */
    public final G6.c f1571r;

    /* renamed from: s, reason: collision with root package name */
    public final D f1572s;

    /* renamed from: t, reason: collision with root package name */
    public long f1573t;

    /* renamed from: u, reason: collision with root package name */
    public long f1574u;

    /* renamed from: v, reason: collision with root package name */
    public long f1575v;

    /* renamed from: w, reason: collision with root package name */
    public long f1576w;

    /* renamed from: x, reason: collision with root package name */
    public final C0132c f1577x;

    /* renamed from: y, reason: collision with root package name */
    public final E f1578y;

    /* renamed from: z, reason: collision with root package name */
    public E f1579z;

    static {
        E e7 = new E();
        e7.c(4, 65535);
        e7.c(5, 16384);
        f1554H = e7;
    }

    public r(D6.y builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f1562d = (n) builder.f636l;
        this.f1563e = new LinkedHashMap();
        String str = (String) builder.f633d;
        if (str == null) {
            Intrinsics.h("connectionName");
            throw null;
        }
        this.f1564i = str;
        this.f1566m = 3;
        G6.d dVar = (G6.d) builder.f634e;
        this.f1568o = dVar;
        this.f1569p = dVar.d();
        this.f1570q = dVar.d();
        this.f1571r = dVar.d();
        this.f1572s = D.f1486a;
        this.f1577x = (C0132c) builder.f637m;
        E e7 = new E();
        e7.c(4, 16777216);
        this.f1578y = e7;
        this.f1579z = f1554H;
        this.f1555A = new L6.a(0);
        this.f1557C = r0.a();
        D0.j jVar = (D0.j) builder.f635i;
        if (jVar == null) {
            Intrinsics.h("socket");
            throw null;
        }
        this.f1558D = jVar;
        this.f1559E = new A((T6.p) jVar.f332l);
        this.f1560F = new q(this, new v((T6.q) jVar.f331i));
        this.f1561G = new LinkedHashSet();
    }

    public final void B(final long j, final int i2) {
        G6.c.c(this.f1569p, this.f1564i + '[' + i2 + "] windowUpdate", new Function0() { // from class: K6.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                r rVar = r.this;
                int i5 = i2;
                try {
                    rVar.f1559E.B(j, i5);
                } catch (IOException e7) {
                    EnumC0131b enumC0131b = EnumC0131b.f1492l;
                    rVar.a(enumC0131b, enumC0131b, e7);
                }
                return Unit.f6114a;
            }
        });
    }

    public final void a(EnumC0131b connectionCode, EnumC0131b streamCode, IOException iOException) {
        int i2;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        TimeZone timeZone = E6.e.f712a;
        try {
            h(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f1563e.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.f1563e.values().toArray(new z[0]);
                    this.f1563e.clear();
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        z[] zVarArr = (z[]) objArr;
        if (zVarArr != null) {
            for (z zVar : zVarArr) {
                try {
                    zVar.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f1559E.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((P0.n) this.f1558D.f330e).f2214e).close();
        } catch (IOException unused4) {
        }
        this.f1569p.f();
        this.f1570q.f();
        this.f1571r.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC0131b.f1491i, EnumC0131b.f1496p, null);
    }

    public final z d(int i2) {
        z zVar;
        synchronized (this) {
            zVar = (z) this.f1563e.get(Integer.valueOf(i2));
        }
        return zVar;
    }

    public final void flush() {
        this.f1559E.flush();
    }

    public final z g(int i2) {
        z zVar;
        synchronized (this) {
            zVar = (z) this.f1563e.remove(Integer.valueOf(i2));
            notifyAll();
        }
        return zVar;
    }

    public final void h(EnumC0131b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f1559E) {
            synchronized (this) {
                if (this.f1567n) {
                    return;
                }
                this.f1567n = true;
                int i2 = this.f1565l;
                Unit unit = Unit.f6114a;
                this.f1559E.h(i2, statusCode, E6.c.f709a);
            }
        }
    }

    public final void j(long j) {
        synchronized (this) {
            try {
                L6.a.c(this.f1555A, j, 0L, 2);
                long b7 = this.f1555A.b();
                if (b7 >= this.f1578y.a() / 2) {
                    B(b7, 0);
                    L6.a.c(this.f1555A, 0L, b7, 1);
                }
                C0132c c0132c = this.f1577x;
                L6.a windowCounter = this.f1555A;
                c0132c.getClass();
                Intrinsics.checkNotNullParameter(windowCounter, "windowCounter");
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f1559E.f1477i);
        r6 = r2;
        r8.f1556B += r6;
        r4 = kotlin.Unit.f6114a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(int i2, boolean z7, T6.f fVar, long j) {
        int min;
        long j7;
        if (j == 0) {
            this.f1559E.d(z7, i2, fVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j8 = this.f1556B;
                            long j9 = this.f1557C;
                            if (j8 < j9) {
                                break;
                            } else {
                                if (!this.f1563e.containsKey(Integer.valueOf(i2))) {
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
            j -= j7;
            this.f1559E.d(z7 && j == 0, i2, fVar, min);
        }
    }

    public final void t(int i2, EnumC0131b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        G6.c.c(this.f1569p, this.f1564i + '[' + i2 + "] writeSynReset", new j(this, i2, errorCode, 0));
    }
}
