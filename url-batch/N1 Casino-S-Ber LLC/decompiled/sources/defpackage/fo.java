package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class fo {
    public final int a;
    public final xn b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final co i;
    public final bo j;
    public final eo k;
    public final eo l;
    public int m;
    public IOException n;

    public fo(int i, xn xnVar, boolean z, boolean z2, ym ymVar) {
        xnVar.getClass();
        this.a = i;
        this.b = xnVar;
        this.f = xnVar.v.f();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new co(this, xnVar.u.f(), z2);
        this.j = new bo(this, z);
        this.k = new eo(this);
        this.l = new eo(this);
        if (ymVar == null) {
            if (f()) {
                return;
            }
            t8.t("remotely-initiated streams should have headers");
            throw null;
        }
        if (f()) {
            t8.t("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(ymVar);
    }

    public final void a() {
        boolean z;
        boolean g;
        byte[] bArr = r70.a;
        synchronized (this) {
            try {
                co coVar = this.i;
                if (!coVar.g && coVar.j) {
                    bo boVar = this.j;
                    if (!boVar.f) {
                        if (boVar.h) {
                        }
                    }
                    z = true;
                    g = g();
                }
                z = false;
                g = g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else {
            if (g) {
                return;
            }
            this.b.o(this.a);
        }
    }

    public final void b() {
        bo boVar = this.j;
        if (boVar.h) {
            t8.y("stream closed");
            return;
        }
        if (boVar.f) {
            t8.y("stream finished");
            return;
        }
        int i = this.m;
        if (i != 0) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            if (i == 0) {
                throw null;
            }
            throw new b40(i);
        }
    }

    public final void c(int i, IOException iOException) {
        if (i == 0) {
            throw null;
        }
        if (d(i, iOException)) {
            xn xnVar = this.b;
            xnVar.getClass();
            xnVar.B.s(this.a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = r70.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.g) {
                if (this.j.f) {
                    return false;
                }
            }
            this.b.o(this.a);
            return true;
        }
    }

    public final void e(int i) {
        if (i == 0) {
            throw null;
        }
        if (d(i, null)) {
            this.b.s(this.a, i);
        }
    }

    public final boolean f() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean g() {
        try {
            if (this.m != 0) {
                return false;
            }
            co coVar = this.i;
            if (!coVar.g) {
                if (coVar.j) {
                }
                return true;
            }
            bo boVar = this.j;
            if (boVar.f || boVar.h) {
                if (this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0006, B:8:0x000e, B:10:0x001f, B:11:0x0023, B:19:0x0016), top: B:3:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(ym ymVar, boolean z) {
        boolean g;
        ymVar.getClass();
        byte[] bArr = r70.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                    if (z) {
                        this.i.g = true;
                    }
                    g = g();
                    notifyAll();
                }
                this.h = true;
                this.g.add(ymVar);
                if (z) {
                }
                g = g();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g) {
            return;
        }
        this.b.o(this.a);
    }
}
