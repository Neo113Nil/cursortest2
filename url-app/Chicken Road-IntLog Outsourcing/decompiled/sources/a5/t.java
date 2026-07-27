package a5;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: A, reason: collision with root package name */
    public static final F f3987A;

    /* renamed from: a, reason: collision with root package name */
    public final p f3988a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3989b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f3990c;

    /* renamed from: d, reason: collision with root package name */
    public int f3991d;

    /* renamed from: e, reason: collision with root package name */
    public int f3992e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3993f;

    /* renamed from: g, reason: collision with root package name */
    public final W4.d f3994g;

    /* renamed from: h, reason: collision with root package name */
    public final W4.c f3995h;

    /* renamed from: i, reason: collision with root package name */
    public final W4.c f3996i;

    /* renamed from: j, reason: collision with root package name */
    public final W4.c f3997j;

    /* renamed from: k, reason: collision with root package name */
    public final E f3998k;

    /* renamed from: l, reason: collision with root package name */
    public long f3999l;

    /* renamed from: m, reason: collision with root package name */
    public long f4000m;

    /* renamed from: n, reason: collision with root package name */
    public long f4001n;

    /* renamed from: o, reason: collision with root package name */
    public long f4002o;

    /* renamed from: p, reason: collision with root package name */
    public long f4003p;

    /* renamed from: q, reason: collision with root package name */
    public final C0201c f4004q;

    /* renamed from: r, reason: collision with root package name */
    public final F f4005r;

    /* renamed from: s, reason: collision with root package name */
    public F f4006s;

    /* renamed from: t, reason: collision with root package name */
    public final b5.a f4007t;

    /* renamed from: u, reason: collision with root package name */
    public long f4008u;

    /* renamed from: v, reason: collision with root package name */
    public long f4009v;

    /* renamed from: w, reason: collision with root package name */
    public final B4.i f4010w;

    /* renamed from: x, reason: collision with root package name */
    public final C f4011x;

    /* renamed from: y, reason: collision with root package name */
    public final s f4012y;
    public final LinkedHashSet z;

    static {
        F f3 = new F();
        f3.c(4, 65535);
        f3.c(5, 16384);
        f3987A = f3;
    }

    public t(n nVar) {
        this.f3988a = (p) nVar.f3976e;
        String str = (String) nVar.f3975d;
        if (str == null) {
            kotlin.jvm.internal.i.l("connectionName");
            throw null;
        }
        this.f3990c = str;
        this.f3992e = 3;
        W4.d dVar = (W4.d) nVar.f3973b;
        this.f3994g = dVar;
        W4.c d6 = dVar.d();
        this.f3995h = d6;
        this.f3996i = dVar.d();
        this.f3997j = dVar.d();
        this.f3998k = E.f3912a;
        this.f4004q = (C0201c) nVar.f3977f;
        F f3 = new F();
        f3.c(4, 16777216);
        this.f4005r = f3;
        this.f4006s = f3987A;
        this.f4007t = new b5.a(0);
        this.f4009v = r2.a();
        B4.i iVar = (B4.i) nVar.f3974c;
        if (iVar == null) {
            kotlin.jvm.internal.i.l("socket");
            throw null;
        }
        this.f4010w = iVar;
        this.f4011x = new C((j5.p) iVar.f313d);
        this.f4012y = new s(this, new x((j5.q) iVar.f312c));
        this.z = new LinkedHashSet();
        int i2 = nVar.f3972a;
        if (i2 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
            String name = str.concat(" ping");
            i iVar2 = new i(this, nanos);
            kotlin.jvm.internal.i.e(name, "name");
            d6.d(new W4.b(name, iVar2), nanos);
        }
    }

    public final void a(EnumC0200b enumC0200b, EnumC0200b enumC0200b2, IOException iOException) {
        int i2;
        Object[] objArr;
        TimeZone timeZone = U4.e.f3179a;
        try {
            g(enumC0200b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f3989b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f3989b.values().toArray(new B[0]);
                this.f3989b.clear();
            }
        }
        B[] bArr = (B[]) objArr;
        if (bArr != null) {
            for (B b6 : bArr) {
                try {
                    b6.c(enumC0200b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f4011x.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((B0.i) this.f4010w.f311b).f153b).close();
        } catch (IOException unused4) {
        }
        this.f3995h.f();
        this.f3996i.f();
        this.f3997j.f();
    }

    public final B b(int i2) {
        B b6;
        synchronized (this) {
            b6 = (B) this.f3989b.get(Integer.valueOf(i2));
        }
        return b6;
    }

    public final B c(int i2) {
        B b6;
        synchronized (this) {
            b6 = (B) this.f3989b.remove(Integer.valueOf(i2));
            notifyAll();
        }
        return b6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC0200b.f3917c, EnumC0200b.f3922h, null);
    }

    public final void flush() {
        this.f4011x.flush();
    }

    public final void g(EnumC0200b enumC0200b) {
        synchronized (this.f4011x) {
            synchronized (this) {
                if (this.f3993f) {
                    return;
                }
                this.f3993f = true;
                this.f4011x.g(this.f3991d, enumC0200b, U4.c.f3176a);
            }
        }
    }

    public final void o(long j2) {
        synchronized (this) {
            try {
                b5.a.b(this.f4007t, j2, 0L, 2);
                long a6 = this.f4007t.a();
                if (a6 >= this.f4005r.a() / 2) {
                    y(0, a6);
                    b5.a.b(this.f4007t, 0L, a6, 1);
                }
                C0201c c0201c = this.f4004q;
                b5.a windowCounter = this.f4007t;
                c0201c.getClass();
                kotlin.jvm.internal.i.e(windowCounter, "windowCounter");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f4011x.f3906c);
        r6 = r2;
        r8.f4008u += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i2, boolean z, j5.f fVar, long j2) {
        int min;
        long j6;
        if (j2 == 0) {
            this.f4011x.b(z, i2, fVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j7 = this.f4008u;
                            long j8 = this.f4009v;
                            if (j7 < j8) {
                                break;
                            } else {
                                if (!this.f3989b.containsKey(Integer.valueOf(i2))) {
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
            j2 -= j6;
            this.f4011x.b(z && j2 == 0, i2, fVar, min);
        }
    }

    public final void q(final int i2, final EnumC0200b enumC0200b) {
        W4.c.c(this.f3995h, this.f3990c + '[' + i2 + "] writeSynReset", new InterfaceC1430a() { // from class: a5.k
            @Override // t4.InterfaceC1430a
            public final Object invoke() {
                t tVar = t.this;
                try {
                    tVar.f4011x.q(i2, enumC0200b);
                } catch (IOException e3) {
                    tVar.getClass();
                    EnumC0200b enumC0200b2 = EnumC0200b.f3918d;
                    tVar.a(enumC0200b2, enumC0200b2, e3);
                }
                return f4.v.f5689a;
            }
        });
    }

    public final void y(final int i2, final long j2) {
        W4.c.c(this.f3995h, this.f3990c + '[' + i2 + "] windowUpdate", new InterfaceC1430a() { // from class: a5.j
            @Override // t4.InterfaceC1430a
            public final Object invoke() {
                t tVar = t.this;
                try {
                    tVar.f4011x.y(i2, j2);
                } catch (IOException e3) {
                    tVar.getClass();
                    EnumC0200b enumC0200b = EnumC0200b.f3918d;
                    tVar.a(enumC0200b, enumC0200b, e3);
                }
                return f4.v.f5689a;
            }
        });
    }
}
