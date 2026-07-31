package e6;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import u0.C0684n;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class r implements Closeable {

    /* renamed from: E, reason: collision with root package name */
    public static final D f4099E;

    /* renamed from: A, reason: collision with root package name */
    public final B0.c f4100A;

    /* renamed from: B, reason: collision with root package name */
    public final A f4101B;

    /* renamed from: C, reason: collision with root package name */
    public final q f4102C;

    /* renamed from: D, reason: collision with root package name */
    public final LinkedHashSet f4103D;

    /* renamed from: f, reason: collision with root package name */
    public final n f4104f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f4105g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final String f4106h;

    /* renamed from: i, reason: collision with root package name */
    public int f4107i;

    /* renamed from: j, reason: collision with root package name */
    public int f4108j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4109k;

    /* renamed from: l, reason: collision with root package name */
    public final a6.e f4110l;

    /* renamed from: m, reason: collision with root package name */
    public final a6.c f4111m;

    /* renamed from: n, reason: collision with root package name */
    public final a6.c f4112n;

    /* renamed from: o, reason: collision with root package name */
    public final a6.c f4113o;

    /* renamed from: p, reason: collision with root package name */
    public final C f4114p;

    /* renamed from: q, reason: collision with root package name */
    public long f4115q;

    /* renamed from: r, reason: collision with root package name */
    public long f4116r;

    /* renamed from: s, reason: collision with root package name */
    public long f4117s;

    /* renamed from: t, reason: collision with root package name */
    public long f4118t;

    /* renamed from: u, reason: collision with root package name */
    public final C0357c f4119u;

    /* renamed from: v, reason: collision with root package name */
    public final D f4120v;

    /* renamed from: w, reason: collision with root package name */
    public D f4121w;

    /* renamed from: x, reason: collision with root package name */
    public final f6.a f4122x;
    public long y;

    /* renamed from: z, reason: collision with root package name */
    public long f4123z;

    static {
        D d7 = new D();
        d7.c(4, 65535);
        d7.c(5, 16384);
        f4099E = d7;
    }

    public r(A.e eVar) {
        this.f4104f = (n) eVar.f10j;
        String str = (String) eVar.f7g;
        if (str == null) {
            kotlin.jvm.internal.i.l("connectionName");
            throw null;
        }
        this.f4106h = str;
        this.f4108j = 3;
        a6.e eVar2 = (a6.e) eVar.f8h;
        this.f4110l = eVar2;
        this.f4111m = eVar2.d();
        this.f4112n = eVar2.d();
        this.f4113o = eVar2.d();
        this.f4114p = C.f4033a;
        this.f4119u = (C0357c) eVar.f11k;
        D d7 = new D();
        d7.c(4, 16777216);
        this.f4120v = d7;
        this.f4121w = f4099E;
        this.f4122x = new f6.a(0);
        this.f4123z = r0.a();
        B0.c cVar = (B0.c) eVar.f9i;
        if (cVar == null) {
            kotlin.jvm.internal.i.l("socket");
            throw null;
        }
        this.f4100A = cVar;
        this.f4101B = new A((n6.p) cVar.f71g);
        this.f4102C = new q(this, new v((n6.q) cVar.f73i));
        this.f4103D = new LinkedHashSet();
    }

    public final void a(EnumC0356b enumC0356b, EnumC0356b enumC0356b2, IOException iOException) {
        int i7;
        Object[] objArr;
        TimeZone timeZone = Y5.e.f3102a;
        try {
            g(enumC0356b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f4105g.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f4105g.values().toArray(new z[0]);
                this.f4105g.clear();
            }
        }
        z[] zVarArr = (z[]) objArr;
        if (zVarArr != null) {
            for (z zVar : zVarArr) {
                try {
                    zVar.e(enumC0356b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f4101B.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((C0684n) this.f4100A.f72h).f5994g).close();
        } catch (IOException unused4) {
        }
        this.f4111m.f();
        this.f4112n.f();
        this.f4113o.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC0356b.f4038h, EnumC0356b.f4043m, null);
    }

    public final z d(int i7) {
        z zVar;
        synchronized (this) {
            zVar = (z) this.f4105g.get(Integer.valueOf(i7));
        }
        return zVar;
    }

    public final z e(int i7) {
        z zVar;
        synchronized (this) {
            zVar = (z) this.f4105g.remove(Integer.valueOf(i7));
            notifyAll();
        }
        return zVar;
    }

    public final void flush() {
        this.f4101B.flush();
    }

    public final void g(EnumC0356b enumC0356b) {
        synchronized (this.f4101B) {
            synchronized (this) {
                if (this.f4109k) {
                    return;
                }
                this.f4109k = true;
                this.f4101B.g(this.f4107i, enumC0356b, Y5.c.f3099a);
            }
        }
    }

    public final void h(long j4) {
        synchronized (this) {
            try {
                f6.a.b(this.f4122x, j4, 0L, 2);
                long a7 = this.f4122x.a();
                if (a7 >= this.f4120v.a() / 2) {
                    v(a7, 0);
                    f6.a.b(this.f4122x, 0L, a7, 1);
                }
                C0357c c0357c = this.f4119u;
                f6.a windowCounter = this.f4122x;
                c0357c.getClass();
                kotlin.jvm.internal.i.e(windowCounter, "windowCounter");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f4101B.f4027h);
        r6 = r2;
        r8.y += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i7, boolean z5, n6.f fVar, long j4) {
        int min;
        long j7;
        if (j4 == 0) {
            this.f4101B.d(z5, i7, fVar, 0);
            return;
        }
        while (j4 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j8 = this.y;
                            long j9 = this.f4123z;
                            if (j8 < j9) {
                                break;
                            } else {
                                if (!this.f4105g.containsKey(Integer.valueOf(i7))) {
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
            j4 -= j7;
            this.f4101B.d(z5 && j4 == 0, i7, fVar, min);
        }
    }

    public final void n(final int i7, final EnumC0356b enumC0356b) {
        a6.c.c(this.f4111m, this.f4106h + '[' + i7 + "] writeSynReset", new InterfaceC0732a() { // from class: e6.j
            @Override // x5.InterfaceC0732a
            public final Object invoke() {
                r rVar = r.this;
                try {
                    rVar.f4101B.n(i7, enumC0356b);
                } catch (IOException e4) {
                    EnumC0356b enumC0356b2 = EnumC0356b.f4039i;
                    rVar.a(enumC0356b2, enumC0356b2, e4);
                }
                return k5.v.f5219a;
            }
        });
    }

    public final void v(final long j4, final int i7) {
        a6.c.c(this.f4111m, this.f4106h + '[' + i7 + "] windowUpdate", new InterfaceC0732a() { // from class: e6.i
            @Override // x5.InterfaceC0732a
            public final Object invoke() {
                r rVar = r.this;
                int i8 = i7;
                try {
                    rVar.f4101B.v(j4, i8);
                } catch (IOException e4) {
                    EnumC0356b enumC0356b = EnumC0356b.f4039i;
                    rVar.a(enumC0356b, enumC0356b, e4);
                }
                return k5.v.f5219a;
            }
        });
    }
}
