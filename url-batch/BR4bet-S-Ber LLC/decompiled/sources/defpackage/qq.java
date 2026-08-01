package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class qq {
    public final int a;
    public final jq b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final oq i;
    public final nq j;
    public final pq k;
    public final pq l;
    public int m;
    public IOException n;

    public qq(int i, jq jqVar, boolean z, boolean z2, kp kpVar) {
        jqVar.getClass();
        this.a = i;
        this.b = jqVar;
        this.f = jqVar.v.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new oq(this, jqVar.u.a(), z2);
        this.j = new nq(this, z);
        this.k = new pq(this);
        this.l = new pq(this);
        if (kpVar == null) {
            if (f()) {
                return;
            }
            g9.s("remotely-initiated streams should have headers");
            throw null;
        }
        if (f()) {
            g9.s("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(kpVar);
    }

    public final void a() {
        boolean z;
        boolean g;
        byte[] bArr = cb0.a;
        synchronized (this) {
            try {
                oq oqVar = this.i;
                if (!oqVar.g && oqVar.j) {
                    nq nqVar = this.j;
                    if (!nqVar.f) {
                        if (nqVar.h) {
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
            this.b.h(this.a);
        }
    }

    public final void b() {
        nq nqVar = this.j;
        if (nqVar.h) {
            g9.w("stream closed");
            return;
        }
        if (nqVar.f) {
            g9.w("stream finished");
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
            throw new e70(i);
        }
    }

    public final void c(int i, IOException iOException) {
        if (i == 0) {
            throw null;
        }
        if (d(i, iOException)) {
            jq jqVar = this.b;
            jqVar.getClass();
            jqVar.B.s(this.a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = cb0.a;
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
            this.b.h(this.a);
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
            oq oqVar = this.i;
            if (!oqVar.g) {
                if (oqVar.j) {
                }
                return true;
            }
            nq nqVar = this.j;
            if (nqVar.f || nqVar.h) {
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
    public final void h(kp kpVar, boolean z) {
        boolean g;
        kpVar.getClass();
        byte[] bArr = cb0.a;
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
                this.g.add(kpVar);
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
        this.b.h(this.a);
    }
}
