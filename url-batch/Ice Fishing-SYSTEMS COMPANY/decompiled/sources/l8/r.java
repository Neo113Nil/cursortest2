package l8;

import B2.N;
import h.I;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class r implements Closeable {

    /* renamed from: S, reason: collision with root package name */
    public static final D f39157S;

    /* renamed from: A, reason: collision with root package name */
    public final h8.c f39158A;

    /* renamed from: B, reason: collision with root package name */
    public final h8.c f39159B;

    /* renamed from: C, reason: collision with root package name */
    public final h8.c f39160C;

    /* renamed from: D, reason: collision with root package name */
    public final C f39161D;

    /* renamed from: E, reason: collision with root package name */
    public long f39162E;

    /* renamed from: F, reason: collision with root package name */
    public long f39163F;

    /* renamed from: G, reason: collision with root package name */
    public long f39164G;

    /* renamed from: H, reason: collision with root package name */
    public long f39165H;

    /* renamed from: I, reason: collision with root package name */
    public final C4711c f39166I;
    public final D J;

    /* renamed from: K, reason: collision with root package name */
    public D f39167K;

    /* renamed from: L, reason: collision with root package name */
    public final I f39168L;

    /* renamed from: M, reason: collision with root package name */
    public long f39169M;

    /* renamed from: N, reason: collision with root package name */
    public long f39170N;

    /* renamed from: O, reason: collision with root package name */
    public final Y2.e f39171O;

    /* renamed from: P, reason: collision with root package name */
    public final A f39172P;

    /* renamed from: Q, reason: collision with root package name */
    public final q f39173Q;

    /* renamed from: R, reason: collision with root package name */
    public final LinkedHashSet f39174R;

    /* renamed from: n, reason: collision with root package name */
    public final n f39175n;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f39176u = new LinkedHashMap();

    /* renamed from: v, reason: collision with root package name */
    public final String f39177v;

    /* renamed from: w, reason: collision with root package name */
    public int f39178w;

    /* renamed from: x, reason: collision with root package name */
    public int f39179x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f39180y;

    /* renamed from: z, reason: collision with root package name */
    public final h8.e f39181z;

    static {
        D d2 = new D();
        d2.c(4, 65535);
        d2.c(5, 16384);
        f39157S = d2;
    }

    public r(N n9) {
        this.f39175n = (n) n9.f199x;
        String str = (String) n9.f198w;
        if (str == null) {
            kotlin.jvm.internal.h.k("connectionName");
            throw null;
        }
        this.f39177v = str;
        this.f39179x = 3;
        h8.e eVar = (h8.e) n9.f196u;
        this.f39181z = eVar;
        this.f39158A = eVar.d();
        this.f39159B = eVar.d();
        this.f39160C = eVar.d();
        this.f39161D = C.f39092a;
        this.f39166I = (C4711c) n9.f200y;
        D d2 = new D();
        d2.c(4, com.anythink.basead.exoplayer.b.bc);
        this.J = d2;
        this.f39167K = f39157S;
        this.f39168L = new I(0);
        this.f39170N = r0.a();
        Y2.e eVar2 = (Y2.e) n9.f197v;
        if (eVar2 == null) {
            kotlin.jvm.internal.h.k("socket");
            throw null;
        }
        this.f39171O = eVar2;
        this.f39172P = new A((u8.p) eVar2.f3965w);
        this.f39173Q = new q(this, new v((u8.r) eVar2.f3964v));
        this.f39174R = new LinkedHashSet();
    }

    public final void a(EnumC4710b enumC4710b, EnumC4710b enumC4710b2, IOException iOException) {
        int i;
        Object[] objArr;
        TimeZone timeZone = f8.d.f37815a;
        try {
            i(enumC4710b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f39176u.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f39176u.values().toArray(new z[0]);
                this.f39176u.clear();
            }
        }
        z[] zVarArr = (z[]) objArr;
        if (zVarArr != null) {
            for (z zVar : zVarArr) {
                try {
                    zVar.d(enumC4710b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f39172P.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((S0.i) this.f39171O.f3963u).f2901u).close();
        } catch (IOException unused4) {
        }
        this.f39158A.f();
        this.f39159B.f();
        this.f39160C.f();
    }

    public final z b(int i) {
        z zVar;
        synchronized (this) {
            zVar = (z) this.f39176u.get(Integer.valueOf(i));
        }
        return zVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC4710b.f39099v, EnumC4710b.f39096A, null);
    }

    public final void flush() {
        this.f39172P.flush();
    }

    public final z g(int i) {
        z zVar;
        synchronized (this) {
            zVar = (z) this.f39176u.remove(Integer.valueOf(i));
            notifyAll();
        }
        return zVar;
    }

    public final void i(EnumC4710b enumC4710b) {
        synchronized (this.f39172P) {
            synchronized (this) {
                if (this.f39180y) {
                    return;
                }
                this.f39180y = true;
                this.f39172P.i(this.f39178w, enumC4710b, f8.c.f37814a);
            }
        }
    }

    public final void j(long j9) {
        synchronized (this) {
            try {
                I.c(this.f39168L, j9, 0L, 2);
                long b9 = this.f39168L.b();
                if (b9 >= this.J.a() / 2) {
                    n(0, b9);
                    I.c(this.f39168L, 0L, b9, 1);
                }
                C4711c c4711c = this.f39166I;
                I windowCounter = this.f39168L;
                c4711c.getClass();
                kotlin.jvm.internal.h.e(windowCounter, "windowCounter");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f39172P.f39086v);
        r6 = r2;
        r8.f39169M += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i, boolean z8, u8.e eVar, long j9) {
        int min;
        long j10;
        if (j9 == 0) {
            this.f39172P.b(z8, i, eVar, 0);
            return;
        }
        while (j9 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j11 = this.f39169M;
                            long j12 = this.f39170N;
                            if (j11 < j12) {
                                break;
                            } else {
                                if (!this.f39176u.containsKey(Integer.valueOf(i))) {
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
            j9 -= j10;
            this.f39172P.b(z8 && j9 == 0, i, eVar, min);
        }
    }

    public final void m(final int i, final EnumC4710b enumC4710b) {
        h8.c.c(this.f39158A, this.f39177v + '[' + i + "] writeSynReset", new E7.a() { // from class: l8.j
            @Override // E7.a
            public final Object invoke() {
                r rVar = r.this;
                try {
                    rVar.f39172P.m(i, enumC4710b);
                } catch (IOException e6) {
                    rVar.getClass();
                    EnumC4710b enumC4710b2 = EnumC4710b.f39100w;
                    rVar.a(enumC4710b2, enumC4710b2, e6);
                }
                return q7.v.f40183a;
            }
        });
    }

    public final void n(final int i, final long j9) {
        h8.c.c(this.f39158A, this.f39177v + '[' + i + "] windowUpdate", new E7.a() { // from class: l8.i
            @Override // E7.a
            public final Object invoke() {
                r rVar = r.this;
                try {
                    rVar.f39172P.n(i, j9);
                } catch (IOException e6) {
                    rVar.getClass();
                    EnumC4710b enumC4710b = EnumC4710b.f39100w;
                    rVar.a(enumC4710b, enumC4710b, e6);
                }
                return q7.v.f40183a;
            }
        });
    }
}
