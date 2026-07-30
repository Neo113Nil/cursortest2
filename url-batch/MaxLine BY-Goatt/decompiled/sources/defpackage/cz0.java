package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cz0 {
    public final int a;
    public final vy0 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final az0 i;
    public final zy0 j;
    public final bz0 k;
    public final bz0 l;
    public int m;
    public IOException n;

    public cz0(int i, vy0 vy0Var, boolean z, boolean z2, mx0 mx0Var) {
        vy0Var.getClass();
        this.a = i;
        this.b = vy0Var;
        this.f = vy0Var.C.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new az0(this, vy0Var.B.a(), z2);
        this.j = new zy0(this, z);
        this.k = new bz0(this);
        this.l = new bz0(this);
        if (mx0Var == null) {
            if (f()) {
                return;
            }
            lh.g("remotely-initiated streams should have headers");
            throw null;
        }
        if (f()) {
            lh.g("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(mx0Var);
    }

    public final void a() {
        boolean z;
        boolean g;
        byte[] bArr = n33.a;
        synchronized (this) {
            try {
                az0 az0Var = this.i;
                if (!az0Var.n && az0Var.q) {
                    zy0 zy0Var = this.j;
                    if (!zy0Var.m) {
                        if (zy0Var.o) {
                        }
                    }
                    z = true;
                    g = g();
                    Unit unit = Unit.a;
                }
                z = false;
                g = g();
                Unit unit2 = Unit.a;
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
            this.b.m(this.a);
        }
    }

    public final void b() {
        zy0 zy0Var = this.j;
        if (zy0Var.o) {
            dm0.j("stream closed");
            return;
        }
        if (zy0Var.m) {
            dm0.j("stream finished");
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
            throw new ip2(i);
        }
    }

    public final void c(int i, IOException iOException) {
        if (i == 0) {
            throw null;
        }
        if (d(i, iOException)) {
            vy0 vy0Var = this.b;
            if (i != 0) {
                vy0Var.I.q(this.a, i);
            } else {
                vy0Var.getClass();
                throw null;
            }
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = n33.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.n && this.j.m) {
                return false;
            }
            Unit unit = Unit.a;
            this.b.m(this.a);
            return true;
        }
    }

    public final void e(int i) {
        if (i == 0) {
            throw null;
        }
        if (d(i, null)) {
            this.b.q(this.a, i);
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
            az0 az0Var = this.i;
            if (!az0Var.n) {
                if (az0Var.q) {
                }
                return true;
            }
            zy0 zy0Var = this.j;
            if (zy0Var.m || zy0Var.o) {
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
    public final void h(mx0 mx0Var, boolean z) {
        boolean g;
        mx0Var.getClass();
        byte[] bArr = n33.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                    if (z) {
                        this.i.n = true;
                    }
                    g = g();
                    notifyAll();
                    Unit unit = Unit.a;
                }
                this.h = true;
                this.g.add(mx0Var);
                if (z) {
                }
                g = g();
                notifyAll();
                Unit unit2 = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g) {
            return;
        }
        this.b.m(this.a);
    }
}
