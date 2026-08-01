package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ku {
    public final int a;
    public final du b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final iu i;
    public final hu j;
    public final ju k;
    public final ju l;
    public kn m;
    public IOException n;

    public ku(int i, du duVar, boolean z, boolean z2, bt btVar) {
        duVar.getClass();
        this.a = i;
        this.b = duVar;
        this.f = duVar.v.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new iu(this, duVar.u.a(), z2);
        this.j = new hu(this, z);
        this.k = new ju(this);
        this.l = new ju(this);
        if (btVar == null) {
            if (f()) {
                return;
            }
            s9.u("remotely-initiated streams should have headers");
            throw null;
        }
        if (f()) {
            s9.u("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(btVar);
    }

    public final void a() {
        boolean z;
        boolean g;
        byte[] bArr = zk0.a;
        synchronized (this) {
            try {
                iu iuVar = this.i;
                if (!iuVar.g && iuVar.j) {
                    hu huVar = this.j;
                    if (!huVar.f) {
                        if (huVar.h) {
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
            c(kn.CANCEL, null);
        } else {
            if (g) {
                return;
            }
            this.b.w(this.a);
        }
    }

    public final void b() {
        hu huVar = this.j;
        if (huVar.h) {
            s9.w("stream closed");
            return;
        }
        if (huVar.f) {
            s9.w("stream finished");
            return;
        }
        kn knVar = this.m;
        if (knVar != null) {
            IOException iOException = this.n;
            if (iOException == null) {
                throw new lf0(knVar);
            }
        }
    }

    public final void c(kn knVar, IOException iOException) {
        knVar.getClass();
        if (d(knVar, iOException)) {
            du duVar = this.b;
            duVar.getClass();
            duVar.B.P(this.a, knVar);
        }
    }

    public final boolean d(kn knVar, IOException iOException) {
        byte[] bArr = zk0.a;
        synchronized (this) {
            if (this.m != null) {
                return false;
            }
            this.m = knVar;
            this.n = iOException;
            notifyAll();
            if (this.i.g) {
                if (this.j.f) {
                    return false;
                }
            }
            this.b.w(this.a);
            return true;
        }
    }

    public final void e(kn knVar) {
        knVar.getClass();
        if (d(knVar, null)) {
            this.b.Q(this.a, knVar);
        }
    }

    public final boolean f() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean g() {
        try {
            if (this.m != null) {
                return false;
            }
            iu iuVar = this.i;
            if (!iuVar.g) {
                if (iuVar.j) {
                }
                return true;
            }
            hu huVar = this.j;
            if (huVar.f || huVar.h) {
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
    public final void h(bt btVar, boolean z) {
        boolean g;
        btVar.getClass();
        byte[] bArr = zk0.a;
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
                this.g.add(btVar);
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
        this.b.w(this.a);
    }
}
