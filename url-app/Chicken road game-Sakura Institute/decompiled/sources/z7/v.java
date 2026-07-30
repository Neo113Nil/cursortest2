package z7;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f10231a;

    /* renamed from: b, reason: collision with root package name */
    public final n f10232b;

    /* renamed from: c, reason: collision with root package name */
    public long f10233c;

    /* renamed from: d, reason: collision with root package name */
    public long f10234d;

    /* renamed from: e, reason: collision with root package name */
    public long f10235e;

    /* renamed from: f, reason: collision with root package name */
    public long f10236f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f10237g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10238h;

    /* renamed from: i, reason: collision with root package name */
    public final t f10239i;

    /* renamed from: j, reason: collision with root package name */
    public final s f10240j;

    /* renamed from: k, reason: collision with root package name */
    public final u f10241k;

    /* renamed from: l, reason: collision with root package name */
    public final u f10242l;

    /* renamed from: m, reason: collision with root package name */
    public int f10243m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f10244n;

    public v(int i7, n nVar, boolean z8, boolean z9, s7.k kVar) {
        r6.k.f(nVar, "connection");
        this.f10231a = i7;
        this.f10232b = nVar;
        this.f10236f = nVar.f10197v.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f10237g = arrayDeque;
        this.f10239i = new t(this, nVar.f10196u.a(), z9);
        this.f10240j = new s(this, z8);
        this.f10241k = new u(this);
        this.f10242l = new u(this);
        if (kVar == null) {
            if (!f()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (f()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(kVar);
        }
    }

    public final void a() {
        boolean z8;
        boolean g9;
        byte[] bArr = t7.b.f8932a;
        synchronized (this) {
            try {
                t tVar = this.f10239i;
                if (!tVar.f10225g && tVar.f10228j) {
                    s sVar = this.f10240j;
                    if (!sVar.f10220f) {
                        if (sVar.f10222h) {
                        }
                    }
                    z8 = true;
                    g9 = g();
                }
                z8 = false;
                g9 = g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            c(9, null);
        } else {
            if (g9) {
                return;
            }
            this.f10232b.k(this.f10231a);
        }
    }

    public final void b() {
        s sVar = this.f10240j;
        if (sVar.f10222h) {
            throw new IOException("stream closed");
        }
        if (sVar.f10220f) {
            throw new IOException("stream finished");
        }
        if (this.f10243m != 0) {
            IOException iOException = this.f10244n;
            if (iOException != null) {
                throw iOException;
            }
            int i7 = this.f10243m;
            r6.i.c(i7);
            throw new a0(i7);
        }
    }

    public final void c(int i7, IOException iOException) {
        r6.i.f("rstStatusCode", i7);
        if (d(i7, iOException)) {
            n nVar = this.f10232b;
            nVar.getClass();
            r6.i.f("statusCode", i7);
            nVar.B.w(this.f10231a, i7);
        }
    }

    public final boolean d(int i7, IOException iOException) {
        byte[] bArr = t7.b.f8932a;
        synchronized (this) {
            if (this.f10243m != 0) {
                return false;
            }
            this.f10243m = i7;
            this.f10244n = iOException;
            notifyAll();
            if (this.f10239i.f10225g) {
                if (this.f10240j.f10220f) {
                    return false;
                }
            }
            this.f10232b.k(this.f10231a);
            return true;
        }
    }

    public final void e(int i7) {
        r6.i.f("errorCode", i7);
        if (d(i7, null)) {
            this.f10232b.w(this.f10231a, i7);
        }
    }

    public final boolean f() {
        boolean z8 = (this.f10231a & 1) == 1;
        this.f10232b.getClass();
        return true == z8;
    }

    public final synchronized boolean g() {
        try {
            if (this.f10243m != 0) {
                return false;
            }
            t tVar = this.f10239i;
            if (!tVar.f10225g) {
                if (tVar.f10228j) {
                }
                return true;
            }
            s sVar = this.f10240j;
            if (sVar.f10220f || sVar.f10222h) {
                if (this.f10238h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(s7.k kVar, boolean z8) {
        boolean g9;
        r6.k.f(kVar, "headers");
        byte[] bArr = t7.b.f8932a;
        synchronized (this) {
            try {
                if (this.f10238h && z8) {
                    this.f10239i.getClass();
                    if (z8) {
                        this.f10239i.f10225g = true;
                    }
                    g9 = g();
                    notifyAll();
                }
                this.f10238h = true;
                this.f10237g.add(kVar);
                if (z8) {
                }
                g9 = g();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g9) {
            return;
        }
        this.f10232b.k(this.f10231a);
    }

    public final synchronized void i(int i7) {
        r6.i.f("errorCode", i7);
        if (this.f10243m == 0) {
            this.f10243m = i7;
            notifyAll();
        }
    }
}
