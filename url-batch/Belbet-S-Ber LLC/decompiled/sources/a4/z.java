package a4;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f238a;

    /* renamed from: b, reason: collision with root package name */
    public final r f239b;

    /* renamed from: c, reason: collision with root package name */
    public long f240c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f241e;

    /* renamed from: f, reason: collision with root package name */
    public long f242f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f243g;
    public boolean h;
    public final x i;

    /* renamed from: j, reason: collision with root package name */
    public final w f244j;

    /* renamed from: k, reason: collision with root package name */
    public final y f245k;

    /* renamed from: l, reason: collision with root package name */
    public final y f246l;

    /* renamed from: m, reason: collision with root package name */
    public int f247m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f248n;

    public z(int i, r rVar, boolean z4, boolean z5, t3.j jVar) {
        i3.d.e(rVar, "connection");
        this.f238a = i;
        this.f239b = rVar;
        this.f242f = rVar.f214v.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f243g = arrayDeque;
        this.i = new x(this, rVar.f213u.c(), z5);
        this.f244j = new w(this, z4);
        this.f245k = new y(this);
        this.f246l = new y(this);
        if (jVar == null) {
            if (!f()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (f()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(jVar);
        }
    }

    public final void a() {
        boolean z4;
        boolean g3;
        byte[] bArr = u3.b.f3581a;
        synchronized (this) {
            try {
                x xVar = this.i;
                if (!xVar.f234g && xVar.f235j) {
                    w wVar = this.f244j;
                    if (!wVar.f231f) {
                        if (wVar.h) {
                        }
                    }
                    z4 = true;
                    g3 = g();
                }
                z4 = false;
                g3 = g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            c(9, null);
        } else {
            if (g3) {
                return;
            }
            this.f239b.o(this.f238a);
        }
    }

    public final void b() {
        w wVar = this.f244j;
        if (wVar.h) {
            throw new IOException("stream closed");
        }
        if (wVar.f231f) {
            throw new IOException("stream finished");
        }
        if (this.f247m != 0) {
            IOException iOException = this.f248n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f247m;
            b.h(i);
            throw new f0(i);
        }
    }

    public final void c(int i, IOException iOException) {
        b.i("rstStatusCode", i);
        if (d(i, iOException)) {
            r rVar = this.f239b;
            rVar.getClass();
            b.i("statusCode", i);
            rVar.B.s(this.f238a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = u3.b.f3581a;
        synchronized (this) {
            if (this.f247m != 0) {
                return false;
            }
            this.f247m = i;
            this.f248n = iOException;
            notifyAll();
            if (this.i.f234g) {
                if (this.f244j.f231f) {
                    return false;
                }
            }
            this.f239b.o(this.f238a);
            return true;
        }
    }

    public final void e(int i) {
        b.i("errorCode", i);
        if (d(i, null)) {
            this.f239b.s(this.f238a, i);
        }
    }

    public final boolean f() {
        boolean z4 = (this.f238a & 1) == 1;
        this.f239b.getClass();
        return true == z4;
    }

    public final synchronized boolean g() {
        try {
            if (this.f247m != 0) {
                return false;
            }
            x xVar = this.i;
            if (!xVar.f234g) {
                if (xVar.f235j) {
                }
                return true;
            }
            w wVar = this.f244j;
            if (wVar.f231f || wVar.h) {
                if (this.h) {
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
    public final void h(t3.j jVar, boolean z4) {
        boolean g3;
        i3.d.e(jVar, "headers");
        byte[] bArr = u3.b.f3581a;
        synchronized (this) {
            try {
                if (this.h && z4) {
                    this.i.getClass();
                    if (z4) {
                        this.i.f234g = true;
                    }
                    g3 = g();
                    notifyAll();
                }
                this.h = true;
                this.f243g.add(jVar);
                if (z4) {
                }
                g3 = g();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g3) {
            return;
        }
        this.f239b.o(this.f238a);
    }

    public final synchronized void i(int i) {
        b.i("errorCode", i);
        if (this.f247m == 0) {
            this.f247m = i;
            notifyAll();
        }
    }
}
